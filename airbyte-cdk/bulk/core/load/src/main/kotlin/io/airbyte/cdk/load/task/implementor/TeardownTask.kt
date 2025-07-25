/*
 * Copyright (c) 2024 Airbyte, Inc., all rights reserved.
 */

package io.airbyte.cdk.load.task.implementor

import io.airbyte.cdk.load.state.CheckpointManager
import io.airbyte.cdk.load.state.SyncManager
import io.airbyte.cdk.load.task.DestinationTaskLauncher
import io.airbyte.cdk.load.task.SelfTerminating
import io.airbyte.cdk.load.task.Task
import io.airbyte.cdk.load.task.TerminalCondition
import io.airbyte.cdk.load.write.DestinationWriter
import io.github.oshai.kotlinlogging.KotlinLogging
import jakarta.inject.Singleton

/**
 * Wraps @[DestinationWriter.teardown] and stops the task launcher.
 *
 * TODO: Report teardown-complete and let the task launcher decide what to do next.
 */
class TeardownTask(
    private val checkpointManager: CheckpointManager,
    private val syncManager: SyncManager,
    private val destination: DestinationWriter,
    private val taskLauncher: DestinationTaskLauncher,
) : Task {
    val log = KotlinLogging.logger {}

    override val terminalCondition: TerminalCondition = SelfTerminating

    override suspend fun execute() {
        syncManager.awaitInputProcessingComplete()

        log.info { "Teardown task awaiting stream processing completion" }
        if (!syncManager.awaitAllStreamsProcessedSuccessfully()) {
            log.info { "Streams failed to be processed successfully, doing nothing." }
            return
        }

        log.info { "All streams processed successfully, awaiting all checkpoints flushed" }
        checkpointManager.awaitAllCheckpointsFlushed()
        log.info { "Starting teardown task" }
        destination.teardown()
        log.info { "Teardown task complete, marking sync succeeded." }
        syncManager.markDestinationSucceeded()
        taskLauncher.handleTeardownComplete()
    }
}

@Singleton
class TeardownTaskFactory(
    private val checkpointManager: CheckpointManager,
    private val syncManager: SyncManager,
    private val destination: DestinationWriter,
) {
    fun make(taskLauncher: DestinationTaskLauncher): TeardownTask {
        return TeardownTask(checkpointManager, syncManager, destination, taskLauncher)
    }
}

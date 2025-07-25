# Taboola
This is the Taboola source that ingests data from the Taboola API.

Taboola helps you reach customers that convert. Drive business results by reaching people genuinely, effectively at just the right moment https://www.taboola.com/

In order to use this source, you must first create an account. Once logged in you can contact Taboola support to provide you with a Client ID, Client Secret and Account ID. Once these credentials have been obtained, you can input them into the appropriate fields.

You can learn more about the API here https://developers.taboola.com/backstage-api/reference

## Configuration

| Input | Type | Description | Default Value |
|-------|------|-------------|---------------|
| `client_id` | `string` | Client ID.  |  |
| `account_id` | `string` | Account ID. The ID associated with your taboola account |  |
| `client_secret` | `string` | Client secret.  |  |

## Streams
| Stream Name | Primary Key | Pagination | Supports Full Sync | Supports Incremental |
|-------------|-------------|------------|---------------------|----------------------|
| account | id | No pagination | ✅ |  ❌  |
| campaigns | id | No pagination | ✅ |  ❌  |
| campaign_items | id | No pagination | ✅ |  ❌  |
| audience_rules | id | No pagination | ✅ |  ❌  |
| conversion_rules | id | No pagination | ✅ |  ❌  |
| motion_ads | id | No pagination | ✅ |  ❌  |
| audiences | id | No pagination | ✅ |  ❌  |

## Changelog

<details>
  <summary>Expand to review</summary>

| Version          | Date              | Pull Request | Subject        |
|------------------|-------------------|--------------|----------------|
| 0.0.25 | 2025-07-12 | [63051](https://github.com/airbytehq/airbyte/pull/63051) | Update dependencies |
| 0.0.24 | 2025-07-05 | [62747](https://github.com/airbytehq/airbyte/pull/62747) | Update dependencies |
| 0.0.23 | 2025-06-28 | [62292](https://github.com/airbytehq/airbyte/pull/62292) | Update dependencies |
| 0.0.22 | 2025-06-14 | [61469](https://github.com/airbytehq/airbyte/pull/61469) | Update dependencies |
| 0.0.21 | 2025-05-24 | [60450](https://github.com/airbytehq/airbyte/pull/60450) | Update dependencies |
| 0.0.20 | 2025-05-10 | [60184](https://github.com/airbytehq/airbyte/pull/60184) | Update dependencies |
| 0.0.19 | 2025-05-04 | [59572](https://github.com/airbytehq/airbyte/pull/59572) | Update dependencies |
| 0.0.18 | 2025-04-27 | [59016](https://github.com/airbytehq/airbyte/pull/59016) | Update dependencies |
| 0.0.17 | 2025-04-19 | [58430](https://github.com/airbytehq/airbyte/pull/58430) | Update dependencies |
| 0.0.16 | 2025-04-12 | [57963](https://github.com/airbytehq/airbyte/pull/57963) | Update dependencies |
| 0.0.15 | 2025-04-05 | [57466](https://github.com/airbytehq/airbyte/pull/57466) | Update dependencies |
| 0.0.14 | 2025-03-29 | [56829](https://github.com/airbytehq/airbyte/pull/56829) | Update dependencies |
| 0.0.13 | 2025-03-22 | [56261](https://github.com/airbytehq/airbyte/pull/56261) | Update dependencies |
| 0.0.12 | 2025-03-08 | [55604](https://github.com/airbytehq/airbyte/pull/55604) | Update dependencies |
| 0.0.11 | 2025-03-01 | [55149](https://github.com/airbytehq/airbyte/pull/55149) | Update dependencies |
| 0.0.10 | 2025-02-22 | [54463](https://github.com/airbytehq/airbyte/pull/54463) | Update dependencies |
| 0.0.9 | 2025-02-15 | [52407](https://github.com/airbytehq/airbyte/pull/52407) | Update dependencies |
| 0.0.8 | 2025-01-18 | [52000](https://github.com/airbytehq/airbyte/pull/52000) | Update dependencies |
| 0.0.7 | 2025-01-11 | [51453](https://github.com/airbytehq/airbyte/pull/51453) | Update dependencies |
| 0.0.6 | 2024-12-28 | [50826](https://github.com/airbytehq/airbyte/pull/50826) | Update dependencies |
| 0.0.5 | 2024-12-21 | [50356](https://github.com/airbytehq/airbyte/pull/50356) | Update dependencies |
| 0.0.4 | 2024-12-14 | [49754](https://github.com/airbytehq/airbyte/pull/49754) | Update dependencies |
| 0.0.3 | 2024-12-12 | [49409](https://github.com/airbytehq/airbyte/pull/49409) | Update dependencies |
| 0.0.2 | 2024-12-11 | [49114](https://github.com/airbytehq/airbyte/pull/49114) | Starting with this version, the Docker image is now rootless. Please note that this and future versions will not be compatible with Airbyte versions earlier than 0.64 |
| 0.0.1 | 2024-10-28 | | Initial release by [@aazam-gh](https://github.com/aazam-gh) via Connector Builder |

</details>

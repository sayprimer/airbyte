# Revolut Merchant
This is the Revolut Merchant source that ingests data from the Revolut Merchant API.

Revolut helps you spend, send, and save smarter https://www.revolut.com/

The Revolut Merchant account is a sub-account of your Revolut Business account. While a Business account is for managing your business finances, the Merchant account is dedicated to helping you accept online payments from your e-commerce customers.

This source uses the Merchant API and has the orders, customers and location endpoints. In order to use this API, you must first create a Revolut account. 
Log in to your Revolut Business account: Access the Revolut Business log in page and enter your credentials.
Navigate to Merchant API settings: Once logged in, access the Merchant API settings page by clicking your profile icon in the top left corner, then selecting APIs &gt; Merchant API. 
Here you can access your Production API keys (Public, Secret) specific to your Merchant account.
Get API keys: If you&#39;re visiting this page for the first time, you&#39;ll need to initiate the process by clicking the Get started button. To generate your Production API Secret key, click the Generate button.
You can find more about the API here https://developer.revolut.com/docs/merchant/merchant-api

## Configuration

| Input | Type | Description | Default Value |
|-------|------|-------------|---------------|
| `secret_api_key` | `string` | Secret API Key. Secret API key to use for authenticating with the Revolut Merchant API. Find it in your Revolut Business account under APIs > Merchant API. |  |
| `start_date` | `string` | Start date.  |  |
| `environment` | `string` | environment. The base url of your environment. Either sandbox or production |  |

## Streams
| Stream Name | Primary Key | Pagination | Supports Full Sync | Supports Incremental |
|-------------|-------------|------------|---------------------|----------------------|
| orders | id | DefaultPaginator | ✅ |  ✅  |
| customers | id | No pagination | ✅ |  ❌  |
| locations | id | No pagination | ✅ |  ❌  |

## Changelog

<details>
  <summary>Expand to review</summary>

| Version          | Date              | Pull Request | Subject        |
|------------------|-------------------|--------------|----------------|
| 0.0.28 | 2025-07-05 | [62722](https://github.com/airbytehq/airbyte/pull/62722) | Update dependencies |
| 0.0.27 | 2025-06-28 | [62219](https://github.com/airbytehq/airbyte/pull/62219) | Update dependencies |
| 0.0.26 | 2025-06-21 | [61816](https://github.com/airbytehq/airbyte/pull/61816) | Update dependencies |
| 0.0.25 | 2025-06-14 | [61611](https://github.com/airbytehq/airbyte/pull/61611) | Update dependencies |
| 0.0.24 | 2025-05-25 | [60480](https://github.com/airbytehq/airbyte/pull/60480) | Update dependencies |
| 0.0.23 | 2025-05-10 | [60055](https://github.com/airbytehq/airbyte/pull/60055) | Update dependencies |
| 0.0.22 | 2025-05-04 | [59610](https://github.com/airbytehq/airbyte/pull/59610) | Update dependencies |
| 0.0.21 | 2025-04-27 | [59005](https://github.com/airbytehq/airbyte/pull/59005) | Update dependencies |
| 0.0.20 | 2025-04-19 | [58394](https://github.com/airbytehq/airbyte/pull/58394) | Update dependencies |
| 0.0.19 | 2025-04-12 | [57932](https://github.com/airbytehq/airbyte/pull/57932) | Update dependencies |
| 0.0.18 | 2025-04-05 | [57336](https://github.com/airbytehq/airbyte/pull/57336) | Update dependencies |
| 0.0.17 | 2025-03-29 | [56795](https://github.com/airbytehq/airbyte/pull/56795) | Update dependencies |
| 0.0.16 | 2025-03-22 | [56198](https://github.com/airbytehq/airbyte/pull/56198) | Update dependencies |
| 0.0.15 | 2025-03-08 | [55522](https://github.com/airbytehq/airbyte/pull/55522) | Update dependencies |
| 0.0.14 | 2025-03-01 | [55020](https://github.com/airbytehq/airbyte/pull/55020) | Update dependencies |
| 0.0.13 | 2025-02-23 | [54589](https://github.com/airbytehq/airbyte/pull/54589) | Update dependencies |
| 0.0.12 | 2025-02-15 | [53981](https://github.com/airbytehq/airbyte/pull/53981) | Update dependencies |
| 0.0.11 | 2025-02-08 | [53453](https://github.com/airbytehq/airbyte/pull/53453) | Update dependencies |
| 0.0.10 | 2025-02-01 | [52956](https://github.com/airbytehq/airbyte/pull/52956) | Update dependencies |
| 0.0.9 | 2025-01-25 | [52474](https://github.com/airbytehq/airbyte/pull/52474) | Update dependencies |
| 0.0.8 | 2025-01-18 | [51894](https://github.com/airbytehq/airbyte/pull/51894) | Update dependencies |
| 0.0.7 | 2025-01-11 | [51304](https://github.com/airbytehq/airbyte/pull/51304) | Update dependencies |
| 0.0.6 | 2024-12-28 | [50679](https://github.com/airbytehq/airbyte/pull/50679) | Update dependencies |
| 0.0.5 | 2024-12-21 | [50256](https://github.com/airbytehq/airbyte/pull/50256) | Update dependencies |
| 0.0.4 | 2024-12-14 | [49704](https://github.com/airbytehq/airbyte/pull/49704) | Update dependencies |
| 0.0.3 | 2024-12-12 | [49326](https://github.com/airbytehq/airbyte/pull/49326) | Update dependencies |
| 0.0.2 | 2024-12-11 | [49052](https://github.com/airbytehq/airbyte/pull/49052) | Starting with this version, the Docker image is now rootless. Please note that this and future versions will not be compatible with Airbyte versions earlier than 0.64 |
| 0.0.1 | 2024-10-27 | | Initial release by [@aazam-gh](https://github.com/aazam-gh) via Connector Builder |

</details>

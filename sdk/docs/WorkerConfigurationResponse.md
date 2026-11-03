# com.finbourne.workflow.model.WorkerConfigurationResponse
Readonly information about how the worker should be executed

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | **String** | The type of worker | [default to String]
**url** | **String** | The URL to check, eg: https://www.google.com/ | [optional] [default to String]
**integrationInstanceId** | **String** | The id of the Horizon integration instance the worker executes. Null on the library worker. | [optional] [default to String]
**workspaceKey** | **String** | The Workspaces key of the multi-query the worker runs | [optional] [default to String]
**driveLocationAndFileName** | **String** | Where in Drive the results are saved, which may contain placeholders | [optional] [default to String]
**format** | **String** | The format the results are saved in, csv when not given | [optional] [default to String]
**mayOverwrite** | **Boolean** | Whether an existing file of the same name may be overwritten | [optional] [default to Boolean]
**driveTemplateLocation** | **String** | The Drive path of the template the results are saved with | [optional] [default to String]
**dateTimeFormat** | **String** | The format DateTime values are written in | [optional] [default to String]
**whenSomeFail** | **Boolean** | Whether the results of the queries that succeeded are still saved when others did not | [optional] [default to Boolean]
**keepForSeconds** | **Integer** | How long Luminesce keeps the results once done, in seconds | [optional] [default to Integer]
**name** | **String** | Name of the view in Luminesce | [optional] [default to String]
**jobId** | [**ResourceId**](ResourceId.md) |  | [optional] [default to ResourceId]

```java
import com.finbourne.workflow.model.WorkerConfigurationResponse;
import java.util.*;
import java.lang.System;
import java.net.URI;

// Example with FailResponse WorkerConfigurationResponse
FailResponse workerConfigurationResponse = new FailResponse();
workerConfigurationResponse.setType(FailResponse.TypeEnum.FAILRESPONSE);
WorkerConfigurationResponse config = new WorkerConfigurationResponse(workerConfigurationResponse);

```
 See all compatible oneOf types with WorkerConfigurationResponse
* [FailResponse](./FailResponse.md)

* [GroupReconciliationResponse](./GroupReconciliationResponse.md)

* [HealthCheckResponse](./HealthCheckResponse.md)

* [HorizonIntegrationResponse](./HorizonIntegrationResponse.md)

* [InstantiateRecResponse](./InstantiateRecResponse.md)

* [LibraryResponse](./LibraryResponse.md)

* [LuminesceMultiQueryResponse](./LuminesceMultiQueryResponse.md)

* [LuminesceViewResponse](./LuminesceViewResponse.md)

* [LusidEntityDataQualityCheckResponse](./LusidEntityDataQualityCheckResponse.md)

* [PortfolioHoldingDataQualityCheckResponse](./PortfolioHoldingDataQualityCheckResponse.md)

* [PortfolioTransactionDataQualityCheckResponse](./PortfolioTransactionDataQualityCheckResponse.md)

* [SchedulerJobResponse](./SchedulerJobResponse.md)

* [SleepResponse](./SleepResponse.md)

* [StructuredResultDataQualityCheckResponse](./StructuredResultDataQualityCheckResponse.md)


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)

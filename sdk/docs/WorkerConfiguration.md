# com.finbourne.workflow.model.WorkerConfiguration
Information about how the worker should be executed

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | **String** | The type of worker | [default to String]
**url** | [**URI**](URI.md) | The URL to check, eg: https://www.google.com/ | [default to URI]
**integrationInstanceId** | **String** | The id of the Horizon integration instance the worker executes. | [default to String]
**workspaceKey** | **String** | The Workspaces key of the multi-query, e.g. &#x60;shared/SomeWorkspace/items/sets/SomeSet&#x60;, read as each run starts. An item of a personal workspace can only be read by the user who saved it, so only runs as that user can use it. | [default to String]
**driveLocationAndFileName** | **String** | Where in Drive to save the results. May contain the placeholders &#x60;{executionId}&#x60;, &#x60;{date:format}&#x60; (when the queries started, UTC) and &#x60;{param:name}&#x60; (a scalar parameter&#39;s value); the extension comes from the format. | [default to String]
**format** | **String** | The format to save in: csv (the default), pipe, excel, json, jsonProper, jsonProperWithLineage, jsonProperByTable, xml, parquet, sqlite or pdf. Several results are one worksheet each for excel, one table each for sqlite, one key each for jsonProperByTable, and otherwise one file each within a zip. | [optional] [default to String]
**mayOverwrite** | **Boolean** | Whether an existing file of the same name may be overwritten, rather than the run failing. False by default. | [optional] [default to Boolean]
**driveTemplateLocation** | **String** | The Drive path and file name of a template to save with. Only excel and pdf support templates. | [optional] [default to String]
**dateTimeFormat** | **String** | The format to write DateTime values in, Luminesce&#39;s default (&#x60;yyyy-MM-dd HH:mm:ss.fff&#x60;) when not given. | [optional] [default to String]
**whenSomeFail** | **Boolean** | Whether the results of the queries that succeeded are still saved when others did not, the worker then completing with the status PartiallyCompleted. False by default, the worker then failing with nothing saved. | [optional] [default to Boolean]
**keepForSeconds** | **Integer** | How long Luminesce keeps the results once done, e.g. to look into a run or save them again: 2 hours by default, at most 31 days. | [optional] [default to Integer]
**name** | **String** | Name of the view in Luminesce | [default to String]
**jobId** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]

```java
import com.finbourne.workflow.model.WorkerConfiguration;
import java.util.*;
import java.lang.System;
import java.net.URI;

// Example with Fail WorkerConfiguration
Fail workerConfiguration = new Fail();
workerConfiguration.setType(Fail.TypeEnum.FAIL);
WorkerConfiguration config = new WorkerConfiguration(workerConfiguration);

```
 See all compatible oneOf types with WorkerConfiguration
* [Fail](./Fail.md)

* [GroupReconciliation](./GroupReconciliation.md)

* [HealthCheck](./HealthCheck.md)

* [HorizonIntegration](./HorizonIntegration.md)

* [InstantiateRec](./InstantiateRec.md)

* [LuminesceMultiQuery](./LuminesceMultiQuery.md)

* [LuminesceView](./LuminesceView.md)

* [LusidEntityDataQualityCheck](./LusidEntityDataQualityCheck.md)

* [PortfolioHoldingDataQualityCheck](./PortfolioHoldingDataQualityCheck.md)

* [PortfolioTransactionDataQualityCheck](./PortfolioTransactionDataQualityCheck.md)

* [SchedulerJob](./SchedulerJob.md)

* [Sleep](./Sleep.md)

* [StructuredResultDataQualityCheck](./StructuredResultDataQualityCheck.md)


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)

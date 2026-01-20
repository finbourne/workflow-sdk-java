# com.finbourne.workflow.model.WorkerConfigurationResponse
Readonly information about how the worker should be executed

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | **String** | The type of worker | [default to String]
**url** | **String** | The URL to check, eg: https://www.google.com/ | [optional] [default to String]
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

* [LibraryResponse](./LibraryResponse.md)

* [LuminesceViewResponse](./LuminesceViewResponse.md)

* [LusidEntityDataQualityCheckResponse](./LusidEntityDataQualityCheckResponse.md)

* [SchedulerJobResponse](./SchedulerJobResponse.md)

* [SleepResponse](./SleepResponse.md)


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)

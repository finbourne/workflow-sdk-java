# com.finbourne.workflow.model.RunWorkerActionResponse
Defines a read-only Run Worker Action

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | **String** | Type name for this Action | [optional] [default to String]
**workerId** | [**ResourceId**](ResourceId.md) |  | [optional] [default to ResourceId]
**workerAsAt** | [**OffsetDateTime**](OffsetDateTime.md) | Worker AsAt | [optional] [default to OffsetDateTime]
**workerParameters** | [**Map&lt;String, FieldMapping&gt;**](FieldMapping.md) | Parameters for this Worker | [optional] [default to Map<String, FieldMapping>]
**workerStatusTriggers** | [**WorkerStatusTriggers**](WorkerStatusTriggers.md) |  | [optional] [default to WorkerStatusTriggers]
**childTaskConfigurations** | [**List&lt;ResultantChildTaskConfiguration&gt;**](ResultantChildTaskConfiguration.md) | Tasks can be generated from run worker results; this is the configuration | [optional] [default to List<ResultantChildTaskConfiguration>]
**workerTimeout** | **Integer** | Worker timeout in seconds | [optional] [default to Integer]

```java
import com.finbourne.workflow.model.RunWorkerActionResponse;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable String Type = "example Type";
ResourceId WorkerId = new ResourceId();
@jakarta.annotation.Nullable OffsetDateTime WorkerAsAt = OffsetDateTime.now();
@jakarta.annotation.Nullable Map<String, FieldMapping> WorkerParameters = new Map<String, FieldMapping>();
WorkerStatusTriggers WorkerStatusTriggers = new WorkerStatusTriggers();
@jakarta.annotation.Nullable List<ResultantChildTaskConfiguration> ChildTaskConfigurations = new List<ResultantChildTaskConfiguration>();
@jakarta.annotation.Nullable Integer WorkerTimeout = new Integer("100.00");


RunWorkerActionResponse runWorkerActionResponseInstance = new RunWorkerActionResponse()
    .Type(Type)
    .WorkerId(WorkerId)
    .WorkerAsAt(WorkerAsAt)
    .WorkerParameters(WorkerParameters)
    .WorkerStatusTriggers(WorkerStatusTriggers)
    .ChildTaskConfigurations(ChildTaskConfigurations)
    .WorkerTimeout(WorkerTimeout);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)

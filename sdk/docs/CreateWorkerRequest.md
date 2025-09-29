# com.finbourne.workflow.model.CreateWorkerRequest
Request to Create a new worker

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**displayName** | **String** | Human readable name | [default to String]
**description** | **String** | Human readable description | [optional] [default to String]
**workerConfiguration** | [**WorkerConfiguration**](WorkerConfiguration.md) |  | [default to WorkerConfiguration]

```java
import com.finbourne.workflow.model.CreateWorkerRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

ResourceId Id = new ResourceId();
String DisplayName = "example DisplayName";
@jakarta.annotation.Nullable String Description = "example Description";
WorkerConfiguration WorkerConfiguration = new WorkerConfiguration();


CreateWorkerRequest createWorkerRequestInstance = new CreateWorkerRequest()
    .Id(Id)
    .DisplayName(DisplayName)
    .Description(Description)
    .WorkerConfiguration(WorkerConfiguration);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)

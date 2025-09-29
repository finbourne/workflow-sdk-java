# com.finbourne.workflow.model.UpdateWorkerRequest
Request to Update a new worker

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**displayName** | **String** | Human readable name | [default to String]
**description** | **String** | Human readable description | [optional] [default to String]
**workerConfiguration** | **Object** | Information about how the worker should be executed | [default to Object]

```java
import com.finbourne.workflow.model.UpdateWorkerRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

String DisplayName = "example DisplayName";
@jakarta.annotation.Nullable String Description = "example Description";
@jakarta.annotation.Nullable Object 

UpdateWorkerRequest updateWorkerRequestInstance = new UpdateWorkerRequest()
    .DisplayName(DisplayName)
    .Description(Description)
    .WorkerConfiguration(WorkerConfiguration);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)

# com.finbourne.workflow.model.SchedulerJobResponse
Readonly configuration for a Worker that calls a Scheduler job

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | **String** | The type of worker | [optional] [default to String]
**jobId** | [**ResourceId**](ResourceId.md) |  | [optional] [default to ResourceId]

```java
import com.finbourne.workflow.model.SchedulerJobResponse;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable String Type = "example Type";
ResourceId JobId = new ResourceId();


SchedulerJobResponse schedulerJobResponseInstance = new SchedulerJobResponse()
    .Type(Type)
    .JobId(JobId);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)

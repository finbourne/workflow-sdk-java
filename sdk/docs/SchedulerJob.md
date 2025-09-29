# com.finbourne.workflow.model.SchedulerJob
Configuration for a Worker that calls a Scheduler Job

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | **String** | The type of worker | [default to String]
**jobId** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]

```java
import com.finbourne.workflow.model.SchedulerJob;
import java.util.*;
import java.lang.System;
import java.net.URI;

String Type = "example Type";
ResourceId JobId = new ResourceId();


SchedulerJob schedulerJobInstance = new SchedulerJob()
    .Type(Type)
    .JobId(JobId);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)

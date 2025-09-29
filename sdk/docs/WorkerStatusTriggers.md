# com.finbourne.workflow.model.WorkerStatusTriggers
Defines triggers that will be invoked per Worker outcome

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**started** | **String** | Trigger to invoke when the Worker has Started | [optional] [default to String]
**completedWithResults** | **String** | Trigger to invoke when the Worker has Completed (with results) | [optional] [default to String]
**completedNoResults** | **String** | Trigger to invoke when the Worker has Completed (no results) | [optional] [default to String]
**failedToStart** | **String** | Trigger to invoke when the Worker has Failed to Start | [optional] [default to String]
**failedToComplete** | **String** | Trigger to invoke when the Worker has Failed to Complete | [optional] [default to String]

```java
import com.finbourne.workflow.model.WorkerStatusTriggers;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable String Started = "example Started";
@jakarta.annotation.Nullable String CompletedWithResults = "example CompletedWithResults";
@jakarta.annotation.Nullable String CompletedNoResults = "example CompletedNoResults";
@jakarta.annotation.Nullable String FailedToStart = "example FailedToStart";
@jakarta.annotation.Nullable String FailedToComplete = "example FailedToComplete";


WorkerStatusTriggers workerStatusTriggersInstance = new WorkerStatusTriggers()
    .Started(Started)
    .CompletedWithResults(CompletedWithResults)
    .CompletedNoResults(CompletedNoResults)
    .FailedToStart(FailedToStart)
    .FailedToComplete(FailedToComplete);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)

# com.finbourne.workflow.model.BatchUpdateTasksRequest
A request to update multiple Tasks

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**updateTasks** | [**List&lt;UpdateTaskWithIdAndTriggerRequest&gt;**](UpdateTaskWithIdAndTriggerRequest.md) | A Dictionary of task IDs to UpdateTaskRequest | [optional] [default to List<UpdateTaskWithIdAndTriggerRequest>]

```java
import com.finbourne.workflow.model.BatchUpdateTasksRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable List<UpdateTaskWithIdAndTriggerRequest> UpdateTasks = new List<UpdateTaskWithIdAndTriggerRequest>();


BatchUpdateTasksRequest batchUpdateTasksRequestInstance = new BatchUpdateTasksRequest()
    .UpdateTasks(UpdateTasks);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)

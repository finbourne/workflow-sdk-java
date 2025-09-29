# com.finbourne.workflow.model.DeleteTasksRequest
Contains required info to delete Tasks

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**taskIds** | **List&lt;String&gt;** | The Ids of the Tasks to delete | [optional] [default to List<String>]

```java
import com.finbourne.workflow.model.DeleteTasksRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable List<String> TaskIds = new List<String>();


DeleteTasksRequest deleteTasksRequestInstance = new DeleteTasksRequest()
    .TaskIds(TaskIds);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)

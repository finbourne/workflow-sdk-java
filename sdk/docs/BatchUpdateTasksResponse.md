# com.finbourne.workflow.model.BatchUpdateTasksResponse
Defines a representation of tasks that have been updated

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**values** | [**List&lt;Task&gt;**](Task.md) | Successful tasks brought back from the BatchUpdate call | [optional] [readonly] [default to List<Task>]
**failed** | [**List&lt;ErrorDetail&gt;**](ErrorDetail.md) | Individual failures for each task returned from the BatchUpdate call | [optional] [readonly] [default to List<ErrorDetail>]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.workflow.model.BatchUpdateTasksResponse;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable List<Task> Values = new List<Task>();
@jakarta.annotation.Nullable List<ErrorDetail> Failed = new List<ErrorDetail>();
@jakarta.annotation.Nullable List<Link> Links = new List<Link>();


BatchUpdateTasksResponse batchUpdateTasksResponseInstance = new BatchUpdateTasksResponse()
    .Values(Values)
    .Failed(Failed)
    .Links(Links);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)

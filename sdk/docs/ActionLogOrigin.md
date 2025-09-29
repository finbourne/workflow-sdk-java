# com.finbourne.workflow.model.ActionLogOrigin
The Action Log Origin contains information about how the Action was created

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**taskId** | [**UUID**](UUID.md) | The Id of the Task that created this Action | [optional] [default to UUID]
**requestId** | **String** | The request Id of the request that caused this Action to be triggered. This could be the original request that caused a sequence of Actions that resulted in this Action | [default to String]

```java
import com.finbourne.workflow.model.ActionLogOrigin;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable UUID TaskId = "example TaskId";
String RequestId = "example RequestId";


ActionLogOrigin actionLogOriginInstance = new ActionLogOrigin()
    .TaskId(TaskId)
    .RequestId(RequestId);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)

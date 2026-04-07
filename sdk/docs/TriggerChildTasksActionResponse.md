# com.finbourne.workflow.model.TriggerChildTasksActionResponse
Defines a read-only Trigger Child Tasks Action

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | **String** | Type name for this Action | [optional] [default to String]
**trigger** | **String** | Trigger on child tasks to be invoked | [optional] [default to String]

```java
import com.finbourne.workflow.model.TriggerChildTasksActionResponse;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable String Type = "example Type";
@jakarta.annotation.Nullable String Trigger = "example Trigger";


TriggerChildTasksActionResponse triggerChildTasksActionResponseInstance = new TriggerChildTasksActionResponse()
    .Type(Type)
    .Trigger(Trigger);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)

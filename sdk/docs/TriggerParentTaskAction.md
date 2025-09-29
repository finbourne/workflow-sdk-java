# com.finbourne.workflow.model.TriggerParentTaskAction
Defines a Trigger Parent Task Action

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | **String** | Type name for this Action | [default to String]
**trigger** | **String** | Trigger on parent task to be invoked | [default to String]

```java
import com.finbourne.workflow.model.TriggerParentTaskAction;
import java.util.*;
import java.lang.System;
import java.net.URI;

String Type = "example Type";
String Trigger = "example Trigger";


TriggerParentTaskAction triggerParentTaskActionInstance = new TriggerParentTaskAction()
    .Type(Type)
    .Trigger(Trigger);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)

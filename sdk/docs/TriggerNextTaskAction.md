# com.finbourne.workflow.model.TriggerNextTaskAction
Defines a Trigger Next Task Action

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | **String** | Type name for this Action | [default to String]
**defaultTrigger** | **String** | Trigger sent to the next task when this task has no nextTaskInitialTrigger of its own | [optional] [default to String]
**fallbackActions** | [**TriggerNextTaskFallbackActions**](TriggerNextTaskFallbackActions.md) |  | [optional] [default to TriggerNextTaskFallbackActions]

```java
import com.finbourne.workflow.model.TriggerNextTaskAction;
import java.util.*;
import java.lang.System;
import java.net.URI;

String Type = "example Type";
@jakarta.annotation.Nullable String DefaultTrigger = "example DefaultTrigger";
TriggerNextTaskFallbackActions FallbackActions = new TriggerNextTaskFallbackActions();


TriggerNextTaskAction triggerNextTaskActionInstance = new TriggerNextTaskAction()
    .Type(Type)
    .DefaultTrigger(DefaultTrigger)
    .FallbackActions(FallbackActions);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)

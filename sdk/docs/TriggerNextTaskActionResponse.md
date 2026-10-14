# com.finbourne.workflow.model.TriggerNextTaskActionResponse
Trigger Next Task Action Response

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | **String** | Type name for this Action | [optional] [default to String]
**defaultTrigger** | **String** | Trigger sent to the next task when this task has no nextTaskInitialTrigger of its own | [optional] [default to String]
**fallbackActions** | [**TriggerNextTaskFallbackActionsResponse**](TriggerNextTaskFallbackActionsResponse.md) |  | [optional] [default to TriggerNextTaskFallbackActionsResponse]

```java
import com.finbourne.workflow.model.TriggerNextTaskActionResponse;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable String Type = "example Type";
@jakarta.annotation.Nullable String DefaultTrigger = "example DefaultTrigger";
TriggerNextTaskFallbackActionsResponse FallbackActions = new TriggerNextTaskFallbackActionsResponse();


TriggerNextTaskActionResponse triggerNextTaskActionResponseInstance = new TriggerNextTaskActionResponse()
    .Type(Type)
    .DefaultTrigger(DefaultTrigger)
    .FallbackActions(FallbackActions);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)

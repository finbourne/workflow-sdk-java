# com.finbourne.workflow.model.TriggerNextTaskFallbackActionsResponse
Actions on the same task definition that a Trigger Next Task action runs instead of triggering the next task

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**endOfSequence** | **String** | Run when this task has no next task to trigger | [optional] [default to String]
**nextTaskError** | **String** | Run when the next task cannot be triggered, e.g. it was deleted or is not in its initial state | [optional] [default to String]

```java
import com.finbourne.workflow.model.TriggerNextTaskFallbackActionsResponse;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable String EndOfSequence = "example EndOfSequence";
@jakarta.annotation.Nullable String NextTaskError = "example NextTaskError";


TriggerNextTaskFallbackActionsResponse triggerNextTaskFallbackActionsResponseInstance = new TriggerNextTaskFallbackActionsResponse()
    .EndOfSequence(EndOfSequence)
    .NextTaskError(NextTaskError);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)

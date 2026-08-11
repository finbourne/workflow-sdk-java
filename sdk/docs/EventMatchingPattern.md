# com.finbourne.workflow.model.EventMatchingPattern
The matching event pattern object

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**eventType** | **String** | The type of event to subscribe to. The list of available event types can be discovered by calling the ListEventTypes API endpoint in the Notifications service. Note that event types published by the Workflow service itself (such as TaskCreated, TaskUpdated, TaskDeleted, TaskDefinitionCreated, TaskDefinitionUpdated and TaskDefinitionDeleted) are not supported as Event Handler triggers, and specifying one will be rejected. | [default to String]
**filter** | **String** | A filter on the event. See https://support.lusid.com/filtering-results-from-lusid for more information. If not provided, all events will be matched. | [optional] [default to String]

```java
import com.finbourne.workflow.model.EventMatchingPattern;
import java.util.*;
import java.lang.System;
import java.net.URI;

String EventType = "example EventType";
@jakarta.annotation.Nullable String Filter = "example Filter";


EventMatchingPattern eventMatchingPatternInstance = new EventMatchingPattern()
    .EventType(EventType)
    .Filter(Filter);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)

# com.finbourne.workflow.model.LauncherEventMatchingPattern
Which events make an Event Launcher start a run of its Workflow

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**eventType** | **String** | The type of event to listen for. The list of available event types can be discovered by calling the ListEventTypes API endpoint in the Notifications service. Note that event types published by the Workflow service itself are not supported as Launcher triggers, and giving one will be rejected. | [default to String]
**filter** | **String** | A filter on the event. See https://support.lusid.com/filtering-results-from-lusid for more information. An empty filter matches every event of the type | [optional] [default to String]

```java
import com.finbourne.workflow.model.LauncherEventMatchingPattern;
import java.util.*;
import java.lang.System;
import java.net.URI;

String EventType = "example EventType";
@jakarta.annotation.Nullable String Filter = "example Filter";


LauncherEventMatchingPattern launcherEventMatchingPatternInstance = new LauncherEventMatchingPattern()
    .EventType(EventType)
    .Filter(Filter);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)

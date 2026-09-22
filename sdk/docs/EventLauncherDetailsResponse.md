# com.finbourne.workflow.model.EventLauncherDetailsResponse
A read only Event Launcher, which starts a run of its Workflow when a matching platform event arrives

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**launcherType** | **String** |  | [optional] [default to String]
**eventMatchingPattern** | [**LauncherEventMatchingPattern**](LauncherEventMatchingPattern.md) |  | [optional] [default to LauncherEventMatchingPattern]
**mapTaskFields** | [**Map&lt;String, EventTaskFieldMapping&gt;**](EventTaskFieldMapping.md) | Fields of the root task filled from the event, keyed by the field name on the root task definition | [optional] [default to Map<String, EventTaskFieldMapping>]
**mapCorrelationIds** | [**List&lt;CorrelationIdMapping&gt;**](CorrelationIdMapping.md) | Correlation IDs of the root task filled from the event | [optional] [default to List<CorrelationIdMapping>]
**runAsUserId** | [**LauncherMapping**](LauncherMapping.md) |  | [optional] [default to LauncherMapping]
**setTaskFields** | **Map&lt;String, Object&gt;** | Fields of the root task set to a fixed value, keyed by the field name on the root task definition | [optional] [default to Map<String, Object>]
**setCorrelationIds** | **List&lt;String&gt;** | Correlation IDs put on the root task as given | [optional] [default to List<String>]
**initialTrigger** | **String** | The trigger given to the root task once it is made and all of its fields are filled, or null when the root task is left in its initial state | [optional] [default to String]

```java
import com.finbourne.workflow.model.EventLauncherDetailsResponse;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable String LauncherType = "example LauncherType";
LauncherEventMatchingPattern EventMatchingPattern = new LauncherEventMatchingPattern();
@jakarta.annotation.Nullable Map<String, EventTaskFieldMapping> MapTaskFields = new Map<String, EventTaskFieldMapping>();
@jakarta.annotation.Nullable List<CorrelationIdMapping> MapCorrelationIds = new List<CorrelationIdMapping>();
LauncherMapping RunAsUserId = new LauncherMapping();
@jakarta.annotation.Nullable Map<String, Object> SetTaskFields = new Map<String, Object>();
@jakarta.annotation.Nullable List<String> SetCorrelationIds = new List<String>();
@jakarta.annotation.Nullable String InitialTrigger = "example InitialTrigger";


EventLauncherDetailsResponse eventLauncherDetailsResponseInstance = new EventLauncherDetailsResponse()
    .LauncherType(LauncherType)
    .EventMatchingPattern(EventMatchingPattern)
    .MapTaskFields(MapTaskFields)
    .MapCorrelationIds(MapCorrelationIds)
    .RunAsUserId(RunAsUserId)
    .SetTaskFields(SetTaskFields)
    .SetCorrelationIds(SetCorrelationIds)
    .InitialTrigger(InitialTrigger);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)

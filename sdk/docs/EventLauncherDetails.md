# com.finbourne.workflow.model.EventLauncherDetails
A Launcher that starts a run of its Workflow when a matching platform event arrives, and can fill fields and correlation IDs of the root task from that event

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**launcherType** | **String** |  | [default to String]
**eventMatchingPattern** | [**LauncherEventMatchingPattern**](LauncherEventMatchingPattern.md) |  | [default to LauncherEventMatchingPattern]
**mapTaskFields** | [**Map&lt;String, EventTaskFieldMapping&gt;**](EventTaskFieldMapping.md) | Fields of the root task filled from the event, keyed by the field name on the root task definition | [optional] [default to Map<String, EventTaskFieldMapping>]
**mapCorrelationIds** | [**List&lt;CorrelationIdMapping&gt;**](CorrelationIdMapping.md) | Correlation IDs of the root task filled from the event | [optional] [default to List<CorrelationIdMapping>]
**runAsUserId** | [**LauncherMapping**](LauncherMapping.md) |  | [default to LauncherMapping]
**setTaskFields** | **Map&lt;String, Object&gt;** | Fields of the root task set to a fixed value, keyed by the field name on the root task definition | [optional] [default to Map<String, Object>]
**setCorrelationIds** | **List&lt;String&gt;** | Correlation IDs put on the root task as given | [optional] [default to List<String>]
**initialTrigger** | **String** | The trigger given to the root task once it is made and all of its fields are filled. When it is left out the root task is left in its initial state | [optional] [default to String]

```java
import com.finbourne.workflow.model.EventLauncherDetails;
import java.util.*;
import java.lang.System;
import java.net.URI;

String LauncherType = "example LauncherType";
LauncherEventMatchingPattern EventMatchingPattern = new LauncherEventMatchingPattern();
@jakarta.annotation.Nullable Map<String, EventTaskFieldMapping> MapTaskFields = new Map<String, EventTaskFieldMapping>();
@jakarta.annotation.Nullable List<CorrelationIdMapping> MapCorrelationIds = new List<CorrelationIdMapping>();
LauncherMapping RunAsUserId = new LauncherMapping();
@jakarta.annotation.Nullable Map<String, Object> SetTaskFields = new Map<String, Object>();
@jakarta.annotation.Nullable List<String> SetCorrelationIds = new List<String>();
@jakarta.annotation.Nullable String InitialTrigger = "example InitialTrigger";


EventLauncherDetails eventLauncherDetailsInstance = new EventLauncherDetails()
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

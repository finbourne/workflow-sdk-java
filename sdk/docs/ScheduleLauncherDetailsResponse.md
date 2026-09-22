# com.finbourne.workflow.model.ScheduleLauncherDetailsResponse
A Schedule Launcher, which starts a run of its Workflow at the times a recurrence pattern gives

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**launcherType** | **String** |  | [optional] [default to String]
**schedule** | [**LauncherSchedule**](LauncherSchedule.md) |  | [optional] [default to LauncherSchedule]
**calendarContexts** | [**List&lt;CalendarContext&gt;**](CalendarContext.md) | The named time zones and holiday calendars this Launcher works in.   Only a Schedule Launcher works in a calendar context | [optional] [default to List<CalendarContext>]
**mapTaskFields** | [**Map&lt;String, ScheduleTaskFieldMapping&gt;**](ScheduleTaskFieldMapping.md) | Fields of the root task filled from the instant the schedule fired, keyed by the field name on the root task definition | [optional] [default to Map<String, ScheduleTaskFieldMapping>]
**runAsUserId** | [**LauncherMapping**](LauncherMapping.md) |  | [optional] [default to LauncherMapping]
**setTaskFields** | **Map&lt;String, Object&gt;** | Fields of the root task set to a fixed value, keyed by the field name on the root task definition | [optional] [default to Map<String, Object>]
**setCorrelationIds** | **List&lt;String&gt;** | Correlation IDs put on the root task as given | [optional] [default to List<String>]
**initialTrigger** | **String** | The trigger given to the root task once it is made and all of its fields are filled, or null when the root task is left in its initial state | [optional] [default to String]

```java
import com.finbourne.workflow.model.ScheduleLauncherDetailsResponse;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable String LauncherType = "example LauncherType";
LauncherSchedule Schedule = new LauncherSchedule();
@jakarta.annotation.Nullable List<CalendarContext> CalendarContexts = new List<CalendarContext>();
@jakarta.annotation.Nullable Map<String, ScheduleTaskFieldMapping> MapTaskFields = new Map<String, ScheduleTaskFieldMapping>();
LauncherMapping RunAsUserId = new LauncherMapping();
@jakarta.annotation.Nullable Map<String, Object> SetTaskFields = new Map<String, Object>();
@jakarta.annotation.Nullable List<String> SetCorrelationIds = new List<String>();
@jakarta.annotation.Nullable String InitialTrigger = "example InitialTrigger";


ScheduleLauncherDetailsResponse scheduleLauncherDetailsResponseInstance = new ScheduleLauncherDetailsResponse()
    .LauncherType(LauncherType)
    .Schedule(Schedule)
    .CalendarContexts(CalendarContexts)
    .MapTaskFields(MapTaskFields)
    .RunAsUserId(RunAsUserId)
    .SetTaskFields(SetTaskFields)
    .SetCorrelationIds(SetCorrelationIds)
    .InitialTrigger(InitialTrigger);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)

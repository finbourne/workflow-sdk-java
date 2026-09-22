# com.finbourne.workflow.model.LauncherDetailsResponse
What makes a Launcher start a run of its Workflow, and what it puts on the root task when it does, in a read only form.   The members here belong to every Launcher. Finbourne.Workflow.WebApi.Common.Dto.Json.Launchers.ScheduleLauncherDetailsResponse and Finbourne.Workflow.WebApi.Common.Dto.Json.Launchers.EventLauncherDetailsResponse add what only a schedule or only an event needs

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**launcherType** | **String** | The type of Launcher. One of - Schedule, Event | [optional] [default to String]
**runAsUserId** | [**LauncherMapping**](LauncherMapping.md) |  | [optional] [default to LauncherMapping]
**setTaskFields** | **Map&lt;String, Object&gt;** | Fields of the root task set to a fixed value, keyed by the field name on the root task definition | [optional] [default to Map<String, Object>]
**setCorrelationIds** | **List&lt;String&gt;** | Correlation IDs put on the root task as given | [optional] [default to List<String>]
**initialTrigger** | **String** | The trigger given to the root task once it is made and all of its fields are filled, or null when the root task is left in its initial state | [optional] [default to String]
**eventMatchingPattern** | [**LauncherEventMatchingPattern**](LauncherEventMatchingPattern.md) |  | [optional] [default to LauncherEventMatchingPattern]
**mapTaskFields** | [**Map&lt;String, ScheduleTaskFieldMapping&gt;**](ScheduleTaskFieldMapping.md) | Fields of the root task filled from the instant the schedule fired, keyed by the field name on the root task definition | [optional] [default to Map<String, ScheduleTaskFieldMapping>]
**mapCorrelationIds** | [**List&lt;CorrelationIdMapping&gt;**](CorrelationIdMapping.md) | Correlation IDs of the root task filled from the event | [optional] [default to List<CorrelationIdMapping>]
**schedule** | [**LauncherSchedule**](LauncherSchedule.md) |  | [optional] [default to LauncherSchedule]
**calendarContexts** | [**List&lt;CalendarContext&gt;**](CalendarContext.md) | The named time zones and holiday calendars this Launcher works in.   Only a Schedule Launcher works in a calendar context | [optional] [default to List<CalendarContext>]

```java
import com.finbourne.workflow.model.LauncherDetailsResponse;
import java.util.*;
import java.lang.System;
import java.net.URI;

// Example with EventLauncherDetailsResponse LauncherDetailsResponse
EventLauncherDetailsResponse launcherDetailsResponse = new EventLauncherDetailsResponse();
launcherDetailsResponse.setType(EventLauncherDetailsResponse.TypeEnum.EVENTLAUNCHERDETAILSRESPONSE);
LauncherDetailsResponse config = new LauncherDetailsResponse(launcherDetailsResponse);

```
 See all compatible oneOf types with LauncherDetailsResponse
* [EventLauncherDetailsResponse](./EventLauncherDetailsResponse.md)

* [ScheduleLauncherDetailsResponse](./ScheduleLauncherDetailsResponse.md)


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)

# com.finbourne.workflow.model.CreateEventHandlerRequest
Contains information for creating an Event Handler

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**displayName** | **String** | Human readable name | [default to String]
**description** | **String** | Human readable description | [optional] [default to String]
**status** | **String** | The current status of the event handler | [default to String]
**eventMatchingPattern** | [**EventMatchingPattern**](EventMatchingPattern.md) |  | [optional] [default to EventMatchingPattern]
**scheduleMatchingPattern** | [**ScheduleMatchingPattern**](ScheduleMatchingPattern.md) |  | [optional] [default to ScheduleMatchingPattern]
**runAsUserId** | [**EventHandlerMapping**](EventHandlerMapping.md) |  | [default to EventHandlerMapping]
**taskDefinitionId** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**taskDefinitionAsAt** | [**OffsetDateTime**](OffsetDateTime.md) | AsAt of the required task definition | [optional] [default to OffsetDateTime]
**taskActivity** | [**TaskActivity**](TaskActivity.md) |  | [default to TaskActivity]

```java
import com.finbourne.workflow.model.CreateEventHandlerRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

ResourceId Id = new ResourceId();
String DisplayName = "example DisplayName";
@jakarta.annotation.Nullable String Description = "example Description";
String Status = "example Status";
EventMatchingPattern EventMatchingPattern = new EventMatchingPattern();
ScheduleMatchingPattern ScheduleMatchingPattern = new ScheduleMatchingPattern();
EventHandlerMapping RunAsUserId = new EventHandlerMapping();
ResourceId TaskDefinitionId = new ResourceId();
@jakarta.annotation.Nullable OffsetDateTime TaskDefinitionAsAt = OffsetDateTime.now();
TaskActivity TaskActivity = new TaskActivity();


CreateEventHandlerRequest createEventHandlerRequestInstance = new CreateEventHandlerRequest()
    .Id(Id)
    .DisplayName(DisplayName)
    .Description(Description)
    .Status(Status)
    .EventMatchingPattern(EventMatchingPattern)
    .ScheduleMatchingPattern(ScheduleMatchingPattern)
    .RunAsUserId(RunAsUserId)
    .TaskDefinitionId(TaskDefinitionId)
    .TaskDefinitionAsAt(TaskDefinitionAsAt)
    .TaskActivity(TaskActivity);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)

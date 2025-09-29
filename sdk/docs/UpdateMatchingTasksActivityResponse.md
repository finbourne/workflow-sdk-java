# com.finbourne.workflow.model.UpdateMatchingTasksActivityResponse
Readonly TaskActivity response

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | **String** | The type of task activity | [optional] [default to String]
**filter** | **String** | The filter that matches on existing tasks | [optional] [default to String]
**trigger** | **String** | Trigger to supply to all tasks that have been matched | [optional] [default to String]
**correlationIds** | [**List&lt;EventHandlerMapping&gt;**](EventHandlerMapping.md) | The event to correlation ID mappings | [optional] [default to List<EventHandlerMapping>]
**taskFields** | [**Map&lt;String, FieldMapping&gt;**](FieldMapping.md) | The event to task field mappings | [optional] [default to Map<String, FieldMapping>]
**scheduleDependentTaskFields** | [**Map&lt;String, ScheduledTimeAdjustment&gt;**](ScheduledTimeAdjustment.md) | The Schedule dependent task field mappings. Only relevant if a Finbourne.Workflow.WebApi.Common.Dto.Json.EventHandlers.ScheduleMatchingPattern is specified | [optional] [default to Map<String, ScheduledTimeAdjustment>]

```java
import com.finbourne.workflow.model.UpdateMatchingTasksActivityResponse;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable String Type = "example Type";
@jakarta.annotation.Nullable String Filter = "example Filter";
@jakarta.annotation.Nullable String Trigger = "example Trigger";
@jakarta.annotation.Nullable List<EventHandlerMapping> CorrelationIds = new List<EventHandlerMapping>();
@jakarta.annotation.Nullable Map<String, FieldMapping> TaskFields = new Map<String, FieldMapping>();
@jakarta.annotation.Nullable Map<String, ScheduledTimeAdjustment> ScheduleDependentTaskFields = new Map<String, ScheduledTimeAdjustment>();


UpdateMatchingTasksActivityResponse updateMatchingTasksActivityResponseInstance = new UpdateMatchingTasksActivityResponse()
    .Type(Type)
    .Filter(Filter)
    .Trigger(Trigger)
    .CorrelationIds(CorrelationIds)
    .TaskFields(TaskFields)
    .ScheduleDependentTaskFields(ScheduleDependentTaskFields);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)

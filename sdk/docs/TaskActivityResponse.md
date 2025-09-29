# com.finbourne.workflow.model.TaskActivityResponse
Readonly information about how the worker should be executed

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | **String** | The type of task activity | [optional] [default to String]
**correlationIds** | [**List&lt;EventHandlerMapping&gt;**](EventHandlerMapping.md) | The event to correlation ID mappings | [optional] [default to List<EventHandlerMapping>]
**taskFields** | [**Map&lt;String, FieldMapping&gt;**](FieldMapping.md) | The event to task field mappings | [optional] [default to Map<String, FieldMapping>]
**scheduleDependentTaskFields** | [**Map&lt;String, ScheduledTimeAdjustment&gt;**](ScheduledTimeAdjustment.md) | The Schedule dependent task field mappings. Only relevant if a Finbourne.Workflow.WebApi.Common.Dto.Json.EventHandlers.ScheduleMatchingPattern is specified | [optional] [default to Map<String, ScheduledTimeAdjustment>]
**initialTrigger** | **String** | Trigger to supply to all tasks to be made | [optional] [default to String]
**filter** | **String** | The filter that matches on existing tasks | [optional] [default to String]
**trigger** | **String** | Trigger to supply to all tasks that have been matched | [optional] [default to String]

```java
import com.finbourne.workflow.model.TaskActivityResponse;
import java.util.*;
import java.lang.System;
import java.net.URI;

// Example with CreateNewTaskActivityResponse TaskActivityResponse
CreateNewTaskActivityResponse taskActivityResponse = new CreateNewTaskActivityResponse();
taskActivityResponse.setType(CreateNewTaskActivityResponse.TypeEnum.CREATENEWTASKACTIVITYRESPONSE);
TaskActivityResponse config = new TaskActivityResponse(taskActivityResponse);

```
 See all compatible oneOf types with TaskActivityResponse
* [CreateNewTaskActivityResponse](./CreateNewTaskActivityResponse.md)

* [UpdateMatchingTasksActivityResponse](./UpdateMatchingTasksActivityResponse.md)


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)

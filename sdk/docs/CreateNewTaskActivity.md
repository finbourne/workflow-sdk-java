

# CreateNewTaskActivity

Define a Task Activity that creates a new task

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**initialTrigger** | **String** | Trigger to supply to all tasks to be made |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) | The type of task activity |  |
|**correlationIds** | [**List&lt;EventHandlerMapping&gt;**](EventHandlerMapping.md) | The event to correlation ID mappings |  [optional] |
|**taskFields** | [**Map&lt;String, FieldMapping&gt;**](FieldMapping.md) | The event to task field mappings |  [optional] |
|**scheduleDependentTaskFields** | [**Map&lt;String, ScheduledTimeAdjustment&gt;**](ScheduledTimeAdjustment.md) | The Schedule dependent task field mappings. Only relevant if a Finbourne.Workflow.WebApi.Common.Dto.Json.EventHandlers.ScheduleMatchingPattern is specified |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| CREATENEWTASK | &quot;CreateNewTask&quot; |



[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)



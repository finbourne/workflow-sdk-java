

# UpdateMatchingTasksActivity

Update all matching tasks based on filter matches

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**type** | [**TypeEnum**](#TypeEnum) | The type of task activity |  |
|**filter** | **String** | The filter that matches on existing tasks |  [optional] |
|**trigger** | **String** | Trigger to supply to all tasks that have been matched |  |
|**correlationIds** | [**List&lt;EventHandlerMapping&gt;**](EventHandlerMapping.md) | The event to correlation ID mappings |  [optional] |
|**taskFields** | [**Map&lt;String, FieldMapping&gt;**](FieldMapping.md) | The event to task field mappings |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| UPDATEMATCHINGTASKS | &quot;UpdateMatchingTasks&quot; |




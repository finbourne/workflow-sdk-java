

# CreateNewTaskActivityResponse

Read only Create new task response

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**type** | [**TypeEnum**](#TypeEnum) | Type of task activity |  [optional] |
|**initialTrigger** | **String** | Trigger to supply to all tasks to be made |  [optional] |
|**correlationIds** | [**List&lt;EventHandlerMapping&gt;**](EventHandlerMapping.md) | The event to correlation ID mappings |  [optional] |
|**taskFields** | [**Map&lt;String, FieldMapping&gt;**](FieldMapping.md) | The event to task field mappings |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| CREATENEWTASK | &quot;CreateNewTask&quot; |



[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)



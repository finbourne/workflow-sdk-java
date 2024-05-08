

# TaskActivityResponse

Readonly information about how the worker should be executed

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**type** | **String** | The type of task activity |  [optional] |
|**correlationIds** | [**List&lt;EventHandlerMapping&gt;**](EventHandlerMapping.md) | The event to correlation ID mappings |  [optional] |
|**taskFields** | [**Map&lt;String, FieldMapping&gt;**](FieldMapping.md) | The event to task field mappings |  [optional] |
|**initialTrigger** | **String** | Trigger to supply to all tasks to be made |  [optional] |
|**filter** | **String** | The filter that matches on existing tasks |  [optional] |
|**trigger** | **String** | Trigger to supply to all tasks that have been matched |  [optional] |




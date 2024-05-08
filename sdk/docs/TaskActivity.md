

# TaskActivity

Information about what tasks to create/update when receiving events

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**type** | **String** | The type of task activity |  |
|**correlationIds** | [**List&lt;EventHandlerMapping&gt;**](EventHandlerMapping.md) | The event to correlation ID mappings |  [optional] |
|**taskFields** | [**Map&lt;String, FieldMapping&gt;**](FieldMapping.md) | The event to task field mappings |  [optional] |
|**initialTrigger** | **String** | Trigger to supply to all tasks to be made |  |
|**filter** | **String** | The filter that matches on existing tasks |  [optional] |
|**trigger** | **String** | Trigger to supply to all tasks that have been matched |  |




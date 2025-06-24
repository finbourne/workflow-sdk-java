

# CreateEventHandlerRequest

Contains information for creating an Event Handler

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | [**ResourceId**](ResourceId.md) |  |  |
|**displayName** | **String** | Human readable name |  |
|**description** | **String** | Human readable description |  [optional] |
|**status** | **String** | The current status of the event handler |  |
|**eventMatchingPattern** | [**EventMatchingPattern**](EventMatchingPattern.md) |  |  [optional] |
|**scheduleMatchingPattern** | [**ScheduleMatchingPattern**](ScheduleMatchingPattern.md) |  |  [optional] |
|**runAsUserId** | [**EventHandlerMapping**](EventHandlerMapping.md) |  |  |
|**taskDefinitionId** | [**ResourceId**](ResourceId.md) |  |  |
|**taskDefinitionAsAt** | **OffsetDateTime** | AsAt of the required task definition |  [optional] |
|**taskActivity** | [**TaskActivity**](TaskActivity.md) |  |  |



[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)



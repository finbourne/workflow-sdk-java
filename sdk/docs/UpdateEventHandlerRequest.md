

# UpdateEventHandlerRequest

Contains information for updating an Event Handler

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**displayName** | **String** | Human readable name |  |
|**description** | **String** | Human readable description |  [optional] |
|**status** | **String** | The current status of the event handler |  |
|**eventMatchingPattern** | [**EventMatchingPattern**](EventMatchingPattern.md) |  |  |
|**runAsUserId** | [**EventHandlerMapping**](EventHandlerMapping.md) |  |  |
|**taskDefinitionId** | [**ResourceId**](ResourceId.md) |  |  |
|**taskDefinitionAsAt** | **OffsetDateTime** | AsAt of the required task definition |  [optional] |
|**taskActivity** | [**TaskActivity**](TaskActivity.md) |  |  |




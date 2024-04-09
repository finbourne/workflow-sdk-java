

# EventHandler

Information about an Event Handler

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | [**ResourceId**](ResourceId.md) |  |  |
|**version** | [**VersionInfo**](VersionInfo.md) |  |  [optional] |
|**displayName** | **String** | Human readable name |  |
|**description** | **String** | Human readable description |  [optional] |
|**status** | **String** | The current status of the event handler |  |
|**eventMatchingPattern** | [**EventMatchingPattern**](EventMatchingPattern.md) |  |  |
|**runAsUserId** | [**EventHandlerMapping**](EventHandlerMapping.md) |  |  |
|**taskDefinitionId** | [**ResourceId**](ResourceId.md) |  |  |
|**taskDefinitionAsAt** | **OffsetDateTime** | AsAt of the required task definition |  [optional] |
|**taskActivity** | **Object** | Defines what the event handler should do after being triggered |  |




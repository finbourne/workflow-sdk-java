

# TaskDefinition

Task Definition

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | [**ResourceId**](ResourceId.md) |  |  |
|**version** | [**VersionInfo**](VersionInfo.md) |  |  [optional] |
|**displayName** | **String** | Human readable name |  |
|**description** | **String** | Human readable description |  [optional] |
|**states** | [**List&lt;TaskStateDefinition&gt;**](TaskStateDefinition.md) | The states this Task Definition operates over |  |
|**fieldSchema** | [**List&lt;TaskFieldDefinition&gt;**](TaskFieldDefinition.md) | The Fields that this Task Definition operates on |  [optional] |
|**initialState** | [**InitialState**](InitialState.md) |  |  |
|**triggers** | [**List&lt;TransitionTriggerDefinition&gt;**](TransitionTriggerDefinition.md) | The Triggers for State transition |  [optional] |
|**actions** | [**List&lt;ActionDefinitionResponse&gt;**](ActionDefinitionResponse.md) | The Actions of this Task - executed after a Transition completion |  [optional] |
|**transitions** | [**List&lt;TaskTransitionDefinition&gt;**](TaskTransitionDefinition.md) | The Transitions between States |  [optional] |



[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)



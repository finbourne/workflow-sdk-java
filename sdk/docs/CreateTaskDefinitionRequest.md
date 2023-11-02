

# CreateTaskDefinitionRequest

Contains required info to create a new Task Definition

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | [**ResourceId**](ResourceId.md) |  |  |
|**displayName** | **String** | Human readable name |  |
|**description** | **String** | Human readable description |  [optional] |
|**states** | [**List&lt;TaskStateDefinition&gt;**](TaskStateDefinition.md) | The states this Task Definition operates over |  |
|**fieldSchema** | [**List&lt;TaskFieldDefinition&gt;**](TaskFieldDefinition.md) | Defines the fields associated with this Task |  [optional] |
|**initialState** | [**InitialState**](InitialState.md) |  |  |
|**triggers** | [**List&lt;TransitionTriggerDefinition&gt;**](TransitionTriggerDefinition.md) | Triggers |  [optional] |
|**transitions** | [**List&lt;TaskTransitionDefinition&gt;**](TaskTransitionDefinition.md) | Transitions |  [optional] |
|**actions** | [**List&lt;ActionDefinition&gt;**](ActionDefinition.md) | Actions |  [optional] |




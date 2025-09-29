# com.finbourne.workflow.model.CreateTaskDefinitionRequest
Contains required info to create a new Task Definition

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**displayName** | **String** | Human readable name | [default to String]
**description** | **String** | Human readable description | [optional] [default to String]
**states** | [**List&lt;TaskStateDefinition&gt;**](TaskStateDefinition.md) | The states this Task Definition operates over | [default to List<TaskStateDefinition>]
**fieldSchema** | [**List&lt;TaskFieldDefinition&gt;**](TaskFieldDefinition.md) | Defines the fields associated with this Task | [optional] [default to List<TaskFieldDefinition>]
**initialState** | [**InitialState**](InitialState.md) |  | [default to InitialState]
**triggers** | [**List&lt;TransitionTriggerDefinition&gt;**](TransitionTriggerDefinition.md) | Triggers | [optional] [default to List<TransitionTriggerDefinition>]
**transitions** | [**List&lt;TaskTransitionDefinition&gt;**](TaskTransitionDefinition.md) | Transitions | [optional] [default to List<TaskTransitionDefinition>]
**actions** | [**List&lt;ActionDefinition&gt;**](ActionDefinition.md) | Actions | [optional] [default to List<ActionDefinition>]

```java
import com.finbourne.workflow.model.CreateTaskDefinitionRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

ResourceId Id = new ResourceId();
String DisplayName = "example DisplayName";
@jakarta.annotation.Nullable String Description = "example Description";
List<TaskStateDefinition> States = new List<TaskStateDefinition>();
@jakarta.annotation.Nullable List<TaskFieldDefinition> FieldSchema = new List<TaskFieldDefinition>();
InitialState InitialState = new InitialState();
@jakarta.annotation.Nullable List<TransitionTriggerDefinition> Triggers = new List<TransitionTriggerDefinition>();
@jakarta.annotation.Nullable List<TaskTransitionDefinition> Transitions = new List<TaskTransitionDefinition>();
@jakarta.annotation.Nullable List<ActionDefinition> Actions = new List<ActionDefinition>();


CreateTaskDefinitionRequest createTaskDefinitionRequestInstance = new CreateTaskDefinitionRequest()
    .Id(Id)
    .DisplayName(DisplayName)
    .Description(Description)
    .States(States)
    .FieldSchema(FieldSchema)
    .InitialState(InitialState)
    .Triggers(Triggers)
    .Transitions(Transitions)
    .Actions(Actions);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)

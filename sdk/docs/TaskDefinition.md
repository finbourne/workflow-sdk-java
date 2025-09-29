# com.finbourne.workflow.model.TaskDefinition
Task Definition

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**version** | [**VersionInfo**](VersionInfo.md) |  | [optional] [default to VersionInfo]
**displayName** | **String** | Human readable name | [default to String]
**description** | **String** | Human readable description | [optional] [default to String]
**states** | [**List&lt;TaskStateDefinition&gt;**](TaskStateDefinition.md) | The states this Task Definition operates over | [default to List<TaskStateDefinition>]
**fieldSchema** | [**List&lt;TaskFieldDefinition&gt;**](TaskFieldDefinition.md) | The Fields that this Task Definition operates on | [optional] [default to List<TaskFieldDefinition>]
**initialState** | [**InitialState**](InitialState.md) |  | [default to InitialState]
**triggers** | [**List&lt;TransitionTriggerDefinition&gt;**](TransitionTriggerDefinition.md) | The Triggers for State transition | [optional] [default to List<TransitionTriggerDefinition>]
**actions** | [**List&lt;ActionDefinitionResponse&gt;**](ActionDefinitionResponse.md) | The Actions of this Task - executed after a Transition completion | [optional] [default to List<ActionDefinitionResponse>]
**transitions** | [**List&lt;TaskTransitionDefinition&gt;**](TaskTransitionDefinition.md) | The Transitions between States | [optional] [default to List<TaskTransitionDefinition>]

```java
import com.finbourne.workflow.model.TaskDefinition;
import java.util.*;
import java.lang.System;
import java.net.URI;

ResourceId Id = new ResourceId();
VersionInfo Version = new VersionInfo();
String DisplayName = "example DisplayName";
@jakarta.annotation.Nullable String Description = "example Description";
List<TaskStateDefinition> States = new List<TaskStateDefinition>();
@jakarta.annotation.Nullable List<TaskFieldDefinition> FieldSchema = new List<TaskFieldDefinition>();
InitialState InitialState = new InitialState();
@jakarta.annotation.Nullable List<TransitionTriggerDefinition> Triggers = new List<TransitionTriggerDefinition>();
@jakarta.annotation.Nullable List<ActionDefinitionResponse> Actions = new List<ActionDefinitionResponse>();
@jakarta.annotation.Nullable List<TaskTransitionDefinition> Transitions = new List<TaskTransitionDefinition>();


TaskDefinition taskDefinitionInstance = new TaskDefinition()
    .Id(Id)
    .Version(Version)
    .DisplayName(DisplayName)
    .Description(Description)
    .States(States)
    .FieldSchema(FieldSchema)
    .InitialState(InitialState)
    .Triggers(Triggers)
    .Actions(Actions)
    .Transitions(Transitions);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)

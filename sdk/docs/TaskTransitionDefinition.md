# com.finbourne.workflow.model.TaskTransitionDefinition
Defines a State change

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**fromState** | **String** | The State this Transition if coming From | [default to String]
**toState** | **String** | The State this Transition is going To | [default to String]
**trigger** | **String** | The Trigger for this Transition | [default to String]
**guard** | **String** | The Guard for this Transition, if any | [optional] [default to String]
**action** | **String** | The Action to invoke on successful Transition | [optional] [default to String]
**displayName** | **String** | Display name for transition | [optional] [default to String]
**description** | **String** | Description for transition | [optional] [default to String]
**guardDescription** | **String** | Guard description for transition | [optional] [default to String]
**guardConditionNotMetMessage** | **String** | Message when guard has not been met | [optional] [default to String]

```java
import com.finbourne.workflow.model.TaskTransitionDefinition;
import java.util.*;
import java.lang.System;
import java.net.URI;

String FromState = "example FromState";
String ToState = "example ToState";
String Trigger = "example Trigger";
@jakarta.annotation.Nullable String Guard = "example Guard";
@jakarta.annotation.Nullable String Action = "example Action";
@jakarta.annotation.Nullable String DisplayName = "example DisplayName";
@jakarta.annotation.Nullable String Description = "example Description";
@jakarta.annotation.Nullable String GuardDescription = "example GuardDescription";
@jakarta.annotation.Nullable String GuardConditionNotMetMessage = "example GuardConditionNotMetMessage";


TaskTransitionDefinition taskTransitionDefinitionInstance = new TaskTransitionDefinition()
    .FromState(FromState)
    .ToState(ToState)
    .Trigger(Trigger)
    .Guard(Guard)
    .Action(Action)
    .DisplayName(DisplayName)
    .Description(Description)
    .GuardDescription(GuardDescription)
    .GuardConditionNotMetMessage(GuardConditionNotMetMessage);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)

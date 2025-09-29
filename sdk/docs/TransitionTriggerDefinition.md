# com.finbourne.workflow.model.TransitionTriggerDefinition
State changes happen in response to Triggers

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** | The key/Name of this Trigger | [default to String]
**trigger** | [**TriggerSchema**](TriggerSchema.md) |  | [default to TriggerSchema]
**displayName** | **String** | Display name for trigger | [optional] [default to String]
**description** | **String** | Description of trigger | [optional] [default to String]

```java
import com.finbourne.workflow.model.TransitionTriggerDefinition;
import java.util.*;
import java.lang.System;
import java.net.URI;

String Name = "example Name";
TriggerSchema Trigger = new TriggerSchema();
@jakarta.annotation.Nullable String DisplayName = "example DisplayName";
@jakarta.annotation.Nullable String Description = "example Description";


TransitionTriggerDefinition transitionTriggerDefinitionInstance = new TransitionTriggerDefinition()
    .Name(Name)
    .Trigger(Trigger)
    .DisplayName(DisplayName)
    .Description(Description);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)

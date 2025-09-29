# com.finbourne.workflow.model.ActionDefinition
Defines the Actions for a Task

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** | The Name of this Action | [default to String]
**runAsUserId** | **String** | The ID of the user that this action will be performed by. If not specified, the actions will be performed by the \&quot;current user\&quot;. | [optional] [default to String]
**actionDetails** | [**ActionDetails**](ActionDetails.md) |  | [default to ActionDetails]
**displayName** | **String** | The display name of this Action | [optional] [default to String]
**description** | **String** | The description of this Action | [optional] [default to String]

```java
import com.finbourne.workflow.model.ActionDefinition;
import java.util.*;
import java.lang.System;
import java.net.URI;

String Name = "example Name";
@jakarta.annotation.Nullable String RunAsUserId = "example RunAsUserId";
ActionDetails ActionDetails = new ActionDetails();
@jakarta.annotation.Nullable String DisplayName = "example DisplayName";
@jakarta.annotation.Nullable String Description = "example Description";


ActionDefinition actionDefinitionInstance = new ActionDefinition()
    .Name(Name)
    .RunAsUserId(RunAsUserId)
    .ActionDetails(ActionDetails)
    .DisplayName(DisplayName)
    .Description(Description);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)

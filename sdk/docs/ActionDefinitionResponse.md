# com.finbourne.workflow.model.ActionDefinitionResponse
Defines the Actions for a Task in a read-only form

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** | The Name of this Action | [optional] [default to String]
**runAsUserId** | **String** | The ID of the user that this action will be performed by. If not specified, the actions will be performed by the \&quot;current user\&quot;. | [optional] [default to String]
**actionDetails** | [**ActionDetailsResponse**](ActionDetailsResponse.md) |  | [optional] [default to ActionDetailsResponse]
**displayName** | **String** | Schema for the Action | [optional] [default to String]
**description** | **String** | Schema for the Action | [optional] [default to String]
**category** | **String** | Schema for the Action | [optional] [default to String]

```java
import com.finbourne.workflow.model.ActionDefinitionResponse;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable String Name = "example Name";
@jakarta.annotation.Nullable String RunAsUserId = "example RunAsUserId";
ActionDetailsResponse ActionDetails = new ActionDetailsResponse();
@jakarta.annotation.Nullable String DisplayName = "example DisplayName";
@jakarta.annotation.Nullable String Description = "example Description";
@jakarta.annotation.Nullable String Category = "example Category";


ActionDefinitionResponse actionDefinitionResponseInstance = new ActionDefinitionResponse()
    .Name(Name)
    .RunAsUserId(RunAsUserId)
    .ActionDetails(ActionDetails)
    .DisplayName(DisplayName)
    .Description(Description)
    .Category(Category);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)

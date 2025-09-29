# com.finbourne.workflow.model.ActionLog
An Action Log contains the processing history of an Action

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**UUID**](UUID.md) | Unique identifier of the Action | [default to UUID]
**origin** | [**ActionLogOrigin**](ActionLogOrigin.md) |  | [default to ActionLogOrigin]
**actionType** | **String** | The type of the Action | [default to String]
**runAsUserId** | **String** | The ID of the user that the Action was performed by. If not specified, the actions were performed by the \&quot;current user\&quot;. | [optional] [default to String]
**loggedItems** | [**List&lt;ActionLogItem&gt;**](ActionLogItem.md) | The logged items for this Action | [default to List<ActionLogItem>]

```java
import com.finbourne.workflow.model.ActionLog;
import java.util.*;
import java.lang.System;
import java.net.URI;

UUID Id = "example Id";
ActionLogOrigin Origin = new ActionLogOrigin();
String ActionType = "example ActionType";
@jakarta.annotation.Nullable String RunAsUserId = "example RunAsUserId";
List<ActionLogItem> LoggedItems = new List<ActionLogItem>();


ActionLog actionLogInstance = new ActionLog()
    .Id(Id)
    .Origin(Origin)
    .ActionType(ActionType)
    .RunAsUserId(RunAsUserId)
    .LoggedItems(LoggedItems);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)

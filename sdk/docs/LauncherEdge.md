# com.finbourne.workflow.model.LauncherEdge
Represents the relationship between a Launcher of a Workflow and the Task Definition it starts a run of

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**launcherId** | **String** | The identifier of the Launcher inside its Workflow | [optional] [default to String]
**targetTaskDefinition** | [**VersionedTaskDefinitionId**](VersionedTaskDefinitionId.md) |  | [optional] [default to VersionedTaskDefinitionId]

```java
import com.finbourne.workflow.model.LauncherEdge;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable String LauncherId = "example LauncherId";
VersionedTaskDefinitionId TargetTaskDefinition = new VersionedTaskDefinitionId();


LauncherEdge launcherEdgeInstance = new LauncherEdge()
    .LauncherId(LauncherId)
    .TargetTaskDefinition(TargetTaskDefinition);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)

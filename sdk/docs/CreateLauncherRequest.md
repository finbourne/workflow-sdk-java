# com.finbourne.workflow.model.CreateLauncherRequest
Contains information for creating a Launcher on a Workflow.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**launcherId** | **String** | The identifier of the Launcher inside its Workflow | [default to String]
**displayName** | **String** | Human-readable name | [default to String]
**description** | **String** | Human-readable description | [optional] [default to String]
**status** | **String** | The current status of the Launcher. One of - Active, Inactive | [default to String]
**launcherDetails** | [**LauncherDetails**](LauncherDetails.md) |  | [default to LauncherDetails]

```java
import com.finbourne.workflow.model.CreateLauncherRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

String LauncherId = "example LauncherId";
String DisplayName = "example DisplayName";
@jakarta.annotation.Nullable String Description = "example Description";
String Status = "example Status";
LauncherDetails LauncherDetails = new LauncherDetails();


CreateLauncherRequest createLauncherRequestInstance = new CreateLauncherRequest()
    .LauncherId(LauncherId)
    .DisplayName(DisplayName)
    .Description(Description)
    .Status(Status)
    .LauncherDetails(LauncherDetails);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)

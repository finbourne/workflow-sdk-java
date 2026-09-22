# com.finbourne.workflow.model.UpdateLauncherRequest
Contains information for updating a Launcher on a Workflow.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**displayName** | **String** | Human-readable name | [default to String]
**description** | **String** | Human-readable description | [optional] [default to String]
**status** | **String** | The current status of the Launcher. One of - Active, Inactive | [default to String]
**launcherDetails** | [**LauncherDetails**](LauncherDetails.md) |  | [default to LauncherDetails]

```java
import com.finbourne.workflow.model.UpdateLauncherRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

String DisplayName = "example DisplayName";
@jakarta.annotation.Nullable String Description = "example Description";
String Status = "example Status";
LauncherDetails LauncherDetails = new LauncherDetails();


UpdateLauncherRequest updateLauncherRequestInstance = new UpdateLauncherRequest()
    .DisplayName(DisplayName)
    .Description(Description)
    .Status(Status)
    .LauncherDetails(LauncherDetails);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)

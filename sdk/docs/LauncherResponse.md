# com.finbourne.workflow.model.LauncherResponse
A Launcher, which starts a run of one Workflow either at the times a schedule gives or when a matching event arrives

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**workflowId** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**launcherId** | **String** | The identifier of this Launcher inside its Workflow | [default to String]
**displayName** | **String** | Human-readable name | [default to String]
**description** | **String** | Human-readable description | [optional] [default to String]
**status** | **String** | The current status of the Launcher. One of - Active, Inactive | [default to String]
**launcherDetails** | [**LauncherDetailsResponse**](LauncherDetailsResponse.md) |  | [default to LauncherDetailsResponse]
**summaries** | [**LauncherSummaries**](LauncherSummaries.md) |  | [optional] [default to LauncherSummaries]
**version** | [**VersionInfo**](VersionInfo.md) |  | [optional] [default to VersionInfo]

```java
import com.finbourne.workflow.model.LauncherResponse;
import java.util.*;
import java.lang.System;
import java.net.URI;

ResourceId WorkflowId = new ResourceId();
String LauncherId = "example LauncherId";
String DisplayName = "example DisplayName";
@jakarta.annotation.Nullable String Description = "example Description";
String Status = "example Status";
LauncherDetailsResponse LauncherDetails = new LauncherDetailsResponse();
LauncherSummaries Summaries = new LauncherSummaries();
VersionInfo Version = new VersionInfo();


LauncherResponse launcherResponseInstance = new LauncherResponse()
    .WorkflowId(WorkflowId)
    .LauncherId(LauncherId)
    .DisplayName(DisplayName)
    .Description(Description)
    .Status(Status)
    .LauncherDetails(LauncherDetails)
    .Summaries(Summaries)
    .Version(Version);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)

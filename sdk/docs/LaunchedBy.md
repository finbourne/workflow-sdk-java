# com.finbourne.workflow.model.LaunchedBy
The Launcher that started a run of a Workflow

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**launcherId** | **String** | The ID of the Launcher inside its Workflow | [default to String]
**launcherType** | **String** | The type of Launcher. One of - Schedule, Event | [default to String]
**launcherAsAt** | [**OffsetDateTime**](OffsetDateTime.md) | The version.asAtModified of the Launcher definition that fired | [default to OffsetDateTime]
**firedAt** | [**OffsetDateTime**](OffsetDateTime.md) | When the Launcher fired. For a Schedule Launcher this is the scheduled trigger time, and for an Event Launcher it is the timestamp of the event | [default to OffsetDateTime]

```java
import com.finbourne.workflow.model.LaunchedBy;
import java.util.*;
import java.lang.System;
import java.net.URI;

String LauncherId = "example LauncherId";
String LauncherType = "example LauncherType";
OffsetDateTime LauncherAsAt = OffsetDateTime.now();
OffsetDateTime FiredAt = OffsetDateTime.now();


LaunchedBy launchedByInstance = new LaunchedBy()
    .LauncherId(LauncherId)
    .LauncherType(LauncherType)
    .LauncherAsAt(LauncherAsAt)
    .FiredAt(FiredAt);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)

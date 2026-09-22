# com.finbourne.workflow.model.LauncherMapping
A value a Launcher either gives as it is or takes from somewhere.   Exactly one of Finbourne.Workflow.WebApi.Common.Dto.Json.Launchers.LauncherMapping.SetTo or Finbourne.Workflow.WebApi.Common.Dto.Json.Launchers.LauncherMapping.MapFrom must be given. Only an Event Launcher has an event to take a value from, so a Schedule Launcher can only use Finbourne.Workflow.WebApi.Common.Dto.Json.Launchers.LauncherMapping.SetTo

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**setTo** | **String** | The value to use, given as it is | [optional] [default to String]
**mapFrom** | **String** | The path the value is taken from, for example header.userId | [optional] [default to String]

```java
import com.finbourne.workflow.model.LauncherMapping;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable String SetTo = "example SetTo";
@jakarta.annotation.Nullable String MapFrom = "example MapFrom";


LauncherMapping launcherMappingInstance = new LauncherMapping()
    .SetTo(SetTo)
    .MapFrom(MapFrom);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)

# com.finbourne.workflow.model.CreateChildTasksActionResponse
Defines a read-only Create Child Tasks Action

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | **String** | Type name for this Action | [optional] [default to String]
**childTaskConfigurations** | [**List&lt;CreateChildTaskConfiguration&gt;**](CreateChildTaskConfiguration.md) | The Child Task Configurations | [optional] [default to List<CreateChildTaskConfiguration>]
**ordering** | **String** | How the created child tasks are ordered for execution: Parallel (default) or Series. In Series the child tasks form a chain and only the first is started; each later one is started by its predecessor&#39;s TriggerNextTask action, or by another trigger such as a TriggerChildTasks filter on previousTask. Without one, the chain stops after the first child. | [optional] [default to String]

```java
import com.finbourne.workflow.model.CreateChildTasksActionResponse;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable String Type = "example Type";
@jakarta.annotation.Nullable List<CreateChildTaskConfiguration> ChildTaskConfigurations = new List<CreateChildTaskConfiguration>();
@jakarta.annotation.Nullable String Ordering = "example Ordering";


CreateChildTasksActionResponse createChildTasksActionResponseInstance = new CreateChildTasksActionResponse()
    .Type(Type)
    .ChildTaskConfigurations(ChildTaskConfigurations)
    .Ordering(Ordering);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)

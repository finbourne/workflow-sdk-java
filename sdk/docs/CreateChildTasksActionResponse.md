# com.finbourne.workflow.model.CreateChildTasksActionResponse
Defines a read-only Create Child Tasks Action

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | **String** | Type name for this Action | [optional] [default to String]
**childTaskConfigurations** | [**List&lt;CreateChildTaskConfiguration&gt;**](CreateChildTaskConfiguration.md) | The Child Task Configurations | [optional] [default to List<CreateChildTaskConfiguration>]

```java
import com.finbourne.workflow.model.CreateChildTasksActionResponse;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable String Type = "example Type";
@jakarta.annotation.Nullable List<CreateChildTaskConfiguration> ChildTaskConfigurations = new List<CreateChildTaskConfiguration>();


CreateChildTasksActionResponse createChildTasksActionResponseInstance = new CreateChildTasksActionResponse()
    .Type(Type)
    .ChildTaskConfigurations(ChildTaskConfigurations);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)

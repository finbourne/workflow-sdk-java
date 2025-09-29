# com.finbourne.workflow.model.CreateChildTasksAction
Defines a Create Child Tasks Action

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | **String** | Type name for this Action | [default to String]
**childTaskConfigurations** | [**List&lt;CreateChildTaskConfiguration&gt;**](CreateChildTaskConfiguration.md) | The Child Task Configurations | [default to List<CreateChildTaskConfiguration>]

```java
import com.finbourne.workflow.model.CreateChildTasksAction;
import java.util.*;
import java.lang.System;
import java.net.URI;

String Type = "example Type";
List<CreateChildTaskConfiguration> ChildTaskConfigurations = new List<CreateChildTaskConfiguration>();


CreateChildTasksAction createChildTasksActionInstance = new CreateChildTasksAction()
    .Type(Type)
    .ChildTaskConfigurations(ChildTaskConfigurations);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)

# com.finbourne.workflow.model.WorkflowStructureEdges
The edges of a Workflow structure graph — the parent-child relationships between Task Definitions and the relationships between Launchers and the Task Definitions they start

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**childTaskDefinitions** | [**List&lt;ChildTaskDefinitionEdge&gt;**](ChildTaskDefinitionEdge.md) | The child Task Definition relationships | [optional] [default to List<ChildTaskDefinitionEdge>]
**launchers** | [**List&lt;LauncherEdge&gt;**](LauncherEdge.md) | The Launcher relationships. There is one entry per Launcher in nodes.launchers, in the same order | [optional] [default to List<LauncherEdge>]

```java
import com.finbourne.workflow.model.WorkflowStructureEdges;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable List<ChildTaskDefinitionEdge> ChildTaskDefinitions = new List<ChildTaskDefinitionEdge>();
@jakarta.annotation.Nullable List<LauncherEdge> Launchers = new List<LauncherEdge>();


WorkflowStructureEdges workflowStructureEdgesInstance = new WorkflowStructureEdges()
    .ChildTaskDefinitions(ChildTaskDefinitions)
    .Launchers(Launchers);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)

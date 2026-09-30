# com.finbourne.workflow.model.WorkflowStructure
Describes the structure of a Workflow as a graph of its Task Definitions and its Launchers

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**nodes** | [**WorkflowStructureNodes**](WorkflowStructureNodes.md) |  | [optional] [default to WorkflowStructureNodes]
**edges** | [**WorkflowStructureEdges**](WorkflowStructureEdges.md) |  | [optional] [default to WorkflowStructureEdges]
**launchersTruncated** | **Boolean** | True when the Workflow has more Launchers than were returned inline in nodes.launchers. Call ListLaunchers for the full set | [optional] [default to Boolean]

```java
import com.finbourne.workflow.model.WorkflowStructure;
import java.util.*;
import java.lang.System;
import java.net.URI;

WorkflowStructureNodes Nodes = new WorkflowStructureNodes();
WorkflowStructureEdges Edges = new WorkflowStructureEdges();
Boolean LaunchersTruncated = true;


WorkflowStructure workflowStructureInstance = new WorkflowStructure()
    .Nodes(Nodes)
    .Edges(Edges)
    .LaunchersTruncated(LaunchersTruncated);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)

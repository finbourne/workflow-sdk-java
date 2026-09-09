# com.finbourne.workflow.model.WorkflowStructure
Describes the structure of a Workflow as a graph of Task Definitions

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**nodes** | [**WorkflowStructureNodes**](WorkflowStructureNodes.md) |  | [optional] [default to WorkflowStructureNodes]
**edges** | [**WorkflowStructureEdges**](WorkflowStructureEdges.md) |  | [optional] [default to WorkflowStructureEdges]

```java
import com.finbourne.workflow.model.WorkflowStructure;
import java.util.*;
import java.lang.System;
import java.net.URI;

WorkflowStructureNodes Nodes = new WorkflowStructureNodes();
WorkflowStructureEdges Edges = new WorkflowStructureEdges();


WorkflowStructure workflowStructureInstance = new WorkflowStructure()
    .Nodes(Nodes)
    .Edges(Edges);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)

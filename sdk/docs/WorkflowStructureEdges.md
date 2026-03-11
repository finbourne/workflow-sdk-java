# com.finbourne.workflow.model.WorkflowStructureEdges
The edges of a Workflow structure graph — the parent-child relationships between Task Definitions

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**childTaskDefinitions** | [**List&lt;ChildTaskDefinitionEdge&gt;**](ChildTaskDefinitionEdge.md) | The child Task Definition relationships | [optional] [default to List<ChildTaskDefinitionEdge>]

```java
import com.finbourne.workflow.model.WorkflowStructureEdges;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable List<ChildTaskDefinitionEdge> ChildTaskDefinitions = new List<ChildTaskDefinitionEdge>();


WorkflowStructureEdges workflowStructureEdgesInstance = new WorkflowStructureEdges()
    .ChildTaskDefinitions(ChildTaskDefinitions);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)

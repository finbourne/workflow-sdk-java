# com.finbourne.workflow.model.WorkflowStructureNodes
The nodes of a Workflow structure graph — the Task Definitions involved

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**taskDefinitions** | [**List&lt;TaskDefinition&gt;**](TaskDefinition.md) | The Task Definitions that make up the nodes of this Workflow | [optional] [default to List<TaskDefinition>]

```java
import com.finbourne.workflow.model.WorkflowStructureNodes;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable List<TaskDefinition> TaskDefinitions = new List<TaskDefinition>();


WorkflowStructureNodes workflowStructureNodesInstance = new WorkflowStructureNodes()
    .TaskDefinitions(TaskDefinitions);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)

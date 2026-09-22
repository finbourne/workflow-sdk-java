# com.finbourne.workflow.model.WorkflowRun
Information about the run of the Workflow that created this Task, inherited from the root/ultimate parent Task.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Integer** | The id of this run of the Workflow. Assigned once, when the run is instantiated. | [default to Integer]
**asAtCreated** | [**OffsetDateTime**](OffsetDateTime.md) | The version.asAtCreated of the root/ultimate parent Task of this run. | [default to OffsetDateTime]
**completionStatus** | **String** | The completion status of the root/ultimate parent Task of this run: NotStarted, InProgress, or Completed. | [default to String]

```java
import com.finbourne.workflow.model.WorkflowRun;
import java.util.*;
import java.lang.System;
import java.net.URI;

Integer Id = new Integer("100.00");
OffsetDateTime AsAtCreated = OffsetDateTime.now();
String CompletionStatus = "example CompletionStatus";


WorkflowRun workflowRunInstance = new WorkflowRun()
    .Id(Id)
    .AsAtCreated(AsAtCreated)
    .CompletionStatus(CompletionStatus);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)

# com.finbourne.workflow.model.Task
Defines a Task created based on a Task Definition

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**UUID**](UUID.md) | The unique id for this Task | [default to UUID]
**taskDefinitionId** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**taskDefinitionVersion** | [**TaskDefinitionVersion**](TaskDefinitionVersion.md) |  | [default to TaskDefinitionVersion]
**taskDefinitionDisplayName** | **String** | The display name of the Task Definition used by this Task | [default to String]
**workflowId** | [**ResourceId**](ResourceId.md) |  | [optional] [default to ResourceId]
**workflowDisplayName** | **String** | The display name of the Workflow that this Task is a member of, if any | [optional] [default to String]
**state** | **String** | Current State | [default to String]
**ultimateParentTask** | [**TaskSummary**](TaskSummary.md) |  | [default to TaskSummary]
**parentTask** | [**TaskSummary**](TaskSummary.md) |  | [optional] [default to TaskSummary]
**childTasks** | [**List&lt;TaskSummary&gt;**](TaskSummary.md) | This Task&#39;s child tasks | [optional] [default to List<TaskSummary>]
**correlationIds** | **List&lt;String&gt;** | User-provided ID used to link entities and tasks | [optional] [default to List<String>]
**version** | [**VersionInfo**](VersionInfo.md) |  | [optional] [default to VersionInfo]
**terminalState** | **Boolean** | True if no onward transitions are possible | [default to Boolean]
**asAtLastTransition** | [**OffsetDateTime**](OffsetDateTime.md) | Last Transition timestamp | [optional] [default to OffsetDateTime]
**fields** | [**List&lt;TaskInstanceField&gt;**](TaskInstanceField.md) | Fields and their latest values - should correspond with the Task Definition field schema | [optional] [default to List<TaskInstanceField>]
**stackingKey** | **String** | The key used to determine which stack to add the Task to | [optional] [default to String]
**stack** | [**Stack**](Stack.md) |  | [optional] [default to Stack]
**actionLogIdCreated** | [**UUID**](UUID.md) | The Id of the Action that created this Task | [optional] [default to UUID]
**actionLogIdModified** | [**UUID**](UUID.md) | The Id of the Action that last modified this Task | [optional] [default to UUID]
**actionLogIdSubmitted** | [**UUID**](UUID.md) | The Id of the last Action submitted by this Task | [optional] [default to UUID]
**hierarchicalPosition** | **String** | The hierarchical position of this Task: UltimateParent, IntermediateParent, Child, or Standalone | [optional] [default to String]
**completionStatus** | **String** | The completion status of this Task: NotStarted, InProgress, or Completed | [optional] [default to String]
**openDuration** | **Long** | Duration in seconds since the Task was created. If the Task is Completed, this is the duration from creation to the last transition. | [optional] [default to Long]
**openDurationSinceLastUpdate** | **Long** | Duration in seconds since the Task was last updated. 0 if the Task is Completed. | [optional] [default to Long]
**openDurationSinceLastTransition** | **Long** | Duration in seconds since the Task last transitioned. 0 if the Task is Completed. | [optional] [default to Long]

```java
import com.finbourne.workflow.model.Task;
import java.util.*;
import java.lang.System;
import java.net.URI;

UUID Id = "example Id";
ResourceId TaskDefinitionId = new ResourceId();
TaskDefinitionVersion TaskDefinitionVersion = new TaskDefinitionVersion();
String TaskDefinitionDisplayName = "example TaskDefinitionDisplayName";
ResourceId WorkflowId = new ResourceId();
@jakarta.annotation.Nullable String WorkflowDisplayName = "example WorkflowDisplayName";
String State = "example State";
TaskSummary UltimateParentTask = new TaskSummary();
TaskSummary ParentTask = new TaskSummary();
@jakarta.annotation.Nullable List<TaskSummary> ChildTasks = new List<TaskSummary>();
@jakarta.annotation.Nullable List<String> CorrelationIds = new List<String>();
VersionInfo Version = new VersionInfo();
Boolean TerminalState = true;
@jakarta.annotation.Nullable OffsetDateTime AsAtLastTransition = OffsetDateTime.now();
@jakarta.annotation.Nullable List<TaskInstanceField> Fields = new List<TaskInstanceField>();
@jakarta.annotation.Nullable String StackingKey = "example StackingKey";
Stack Stack = new Stack();
@jakarta.annotation.Nullable UUID ActionLogIdCreated = "example ActionLogIdCreated";
@jakarta.annotation.Nullable UUID ActionLogIdModified = "example ActionLogIdModified";
@jakarta.annotation.Nullable UUID ActionLogIdSubmitted = "example ActionLogIdSubmitted";
@jakarta.annotation.Nullable String HierarchicalPosition = "example HierarchicalPosition";
@jakarta.annotation.Nullable String CompletionStatus = "example CompletionStatus";
@jakarta.annotation.Nullable Long OpenDuration = new Long("100.00");
@jakarta.annotation.Nullable Long OpenDurationSinceLastUpdate = new Long("100.00");
@jakarta.annotation.Nullable Long OpenDurationSinceLastTransition = new Long("100.00");


Task taskInstance = new Task()
    .Id(Id)
    .TaskDefinitionId(TaskDefinitionId)
    .TaskDefinitionVersion(TaskDefinitionVersion)
    .TaskDefinitionDisplayName(TaskDefinitionDisplayName)
    .WorkflowId(WorkflowId)
    .WorkflowDisplayName(WorkflowDisplayName)
    .State(State)
    .UltimateParentTask(UltimateParentTask)
    .ParentTask(ParentTask)
    .ChildTasks(ChildTasks)
    .CorrelationIds(CorrelationIds)
    .Version(Version)
    .TerminalState(TerminalState)
    .AsAtLastTransition(AsAtLastTransition)
    .Fields(Fields)
    .StackingKey(StackingKey)
    .Stack(Stack)
    .ActionLogIdCreated(ActionLogIdCreated)
    .ActionLogIdModified(ActionLogIdModified)
    .ActionLogIdSubmitted(ActionLogIdSubmitted)
    .HierarchicalPosition(HierarchicalPosition)
    .CompletionStatus(CompletionStatus)
    .OpenDuration(OpenDuration)
    .OpenDurationSinceLastUpdate(OpenDurationSinceLastUpdate)
    .OpenDurationSinceLastTransition(OpenDurationSinceLastTransition);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)

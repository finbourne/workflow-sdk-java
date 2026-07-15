# com.finbourne.workflow.model.TaskSummary
Summary of a Task created based on a Task Definition

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**UUID**](UUID.md) | The unique id for this Task | [default to UUID]
**taskDefinitionId** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**taskDefinitionVersion** | [**TaskDefinitionVersion**](TaskDefinitionVersion.md) |  | [default to TaskDefinitionVersion]
**taskDefinitionDisplayName** | **String** | The display name of the Task Definition used by this Task | [default to String]
**state** | **String** | Current State | [default to String]
**stateDisplayName** | **String** | The display name of the current State, from the Task Definition, if one is provided | [optional] [default to String]
**correlationIds** | **List&lt;String&gt;** | User-provided ID used to link entities and tasks | [optional] [default to List<String>]

```java
import com.finbourne.workflow.model.TaskSummary;
import java.util.*;
import java.lang.System;
import java.net.URI;

UUID Id = "example Id";
ResourceId TaskDefinitionId = new ResourceId();
TaskDefinitionVersion TaskDefinitionVersion = new TaskDefinitionVersion();
String TaskDefinitionDisplayName = "example TaskDefinitionDisplayName";
String State = "example State";
@jakarta.annotation.Nullable String StateDisplayName = "example StateDisplayName";
@jakarta.annotation.Nullable List<String> CorrelationIds = new List<String>();


TaskSummary taskSummaryInstance = new TaskSummary()
    .Id(Id)
    .TaskDefinitionId(TaskDefinitionId)
    .TaskDefinitionVersion(TaskDefinitionVersion)
    .TaskDefinitionDisplayName(TaskDefinitionDisplayName)
    .State(State)
    .StateDisplayName(StateDisplayName)
    .CorrelationIds(CorrelationIds);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)

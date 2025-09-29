# com.finbourne.workflow.model.ActionDetails
Abstracts the kinds of Actions available

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | **String** | Type name for this Action | [default to String]
**childTaskConfigurations** | [**List&lt;ResultantChildTaskConfiguration&gt;**](ResultantChildTaskConfiguration.md) | Tasks can be generated from run worker results; this is the configuration | [default to List<ResultantChildTaskConfiguration>]
**workerId** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**workerAsAt** | [**OffsetDateTime**](OffsetDateTime.md) | Worker AsAt | [optional] [default to OffsetDateTime]
**workerParameters** | [**Map&lt;String, FieldMapping&gt;**](FieldMapping.md) | Parameters for this Worker | [optional] [default to Map<String, FieldMapping>]
**workerStatusTriggers** | [**WorkerStatusTriggers**](WorkerStatusTriggers.md) |  | [optional] [default to WorkerStatusTriggers]
**workerTimeout** | **Integer** | Worker WorkerTimeout in seconds | [optional] [default to Integer]
**trigger** | **String** | Trigger on parent task to be invoked | [default to String]

```java
import com.finbourne.workflow.model.ActionDetails;
import java.util.*;
import java.lang.System;
import java.net.URI;

// Example with CreateChildTasksAction ActionDetails
CreateChildTasksAction actionDetails = new CreateChildTasksAction();
actionDetails.setType(CreateChildTasksAction.TypeEnum.CREATECHILDTASKSACTION);
ActionDetails config = new ActionDetails(actionDetails);

```
 See all compatible oneOf types with ActionDetails
* [CreateChildTasksAction](./CreateChildTasksAction.md)

* [RunWorkerAction](./RunWorkerAction.md)

* [TriggerParentTaskAction](./TriggerParentTaskAction.md)


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)

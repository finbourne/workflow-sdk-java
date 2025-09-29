# com.finbourne.workflow.model.ActionDetailsResponse
Abstracts the kinds of Actions available in a read-only form

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | **String** | Type name for this Action | [optional] [default to String]
**childTaskConfigurations** | [**List&lt;ResultantChildTaskConfiguration&gt;**](ResultantChildTaskConfiguration.md) | Tasks can be generated from run worker results; this is the configuration | [optional] [default to List<ResultantChildTaskConfiguration>]
**workerId** | [**ResourceId**](ResourceId.md) |  | [optional] [default to ResourceId]
**workerAsAt** | [**OffsetDateTime**](OffsetDateTime.md) | Worker AsAt | [optional] [default to OffsetDateTime]
**workerParameters** | [**Map&lt;String, FieldMapping&gt;**](FieldMapping.md) | Parameters for this Worker | [optional] [default to Map<String, FieldMapping>]
**workerStatusTriggers** | [**WorkerStatusTriggers**](WorkerStatusTriggers.md) |  | [optional] [default to WorkerStatusTriggers]
**workerTimeout** | **Integer** | Worker timeout in seconds | [optional] [default to Integer]
**trigger** | **String** | Trigger on parent task to be invoked | [optional] [default to String]

```java
import com.finbourne.workflow.model.ActionDetailsResponse;
import java.util.*;
import java.lang.System;
import java.net.URI;

// Example with CreateChildTasksActionResponse ActionDetailsResponse
CreateChildTasksActionResponse actionDetailsResponse = new CreateChildTasksActionResponse();
actionDetailsResponse.setType(CreateChildTasksActionResponse.TypeEnum.CREATECHILDTASKSACTIONRESPONSE);
ActionDetailsResponse config = new ActionDetailsResponse(actionDetailsResponse);

```
 See all compatible oneOf types with ActionDetailsResponse
* [CreateChildTasksActionResponse](./CreateChildTasksActionResponse.md)

* [RunWorkerActionResponse](./RunWorkerActionResponse.md)

* [TriggerParentTaskActionResponse](./TriggerParentTaskActionResponse.md)


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)

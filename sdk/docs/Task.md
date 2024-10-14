

# Task

Defines a Task created based on a Task Definition

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **UUID** | The unique id for this Task |  |
|**taskDefinitionId** | [**ResourceId**](ResourceId.md) |  |  |
|**taskDefinitionVersion** | [**TaskDefinitionVersion**](TaskDefinitionVersion.md) |  |  |
|**taskDefinitionDisplayName** | **String** | The display name of the Task Definition used by this Task |  |
|**state** | **String** | Current State |  |
|**ultimateParentTask** | [**TaskSummary**](TaskSummary.md) |  |  |
|**parentTask** | [**TaskSummary**](TaskSummary.md) |  |  [optional] |
|**childTasks** | [**List&lt;TaskSummary&gt;**](TaskSummary.md) | This Task&#39;s child tasks |  [optional] |
|**correlationIds** | **List&lt;String&gt;** | User-provided ID used to link entities and tasks |  [optional] |
|**version** | [**VersionInfo**](VersionInfo.md) |  |  [optional] |
|**terminalState** | **Boolean** | True if no onward transitions are possible |  |
|**asAtLastTransition** | **OffsetDateTime** | Last Transition timestamp |  [optional] |
|**fields** | [**List&lt;TaskInstanceField&gt;**](TaskInstanceField.md) | Fields and their latest values - should correspond with the Task Definition field schema |  [optional] |
|**stackingKey** | **String** | The key used to determine which stack to add the Task to |  [optional] |
|**stack** | [**Stack**](Stack.md) |  |  [optional] |
|**actionLogIdCreated** | **UUID** | The Id of the Action that created this Task |  [optional] |
|**actionLogIdModified** | **UUID** | The Id of the Action that last modified this Task |  [optional] |
|**actionLogIdSubmitted** | **UUID** | The Id of the last Action submitted by this Task |  [optional] |



[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)



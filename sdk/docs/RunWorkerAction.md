

# RunWorkerAction

Defines a Run Worker Action

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**type** | [**TypeEnum**](#TypeEnum) | Type name for this Action |  |
|**workerId** | [**ResourceId**](ResourceId.md) |  |  |
|**workerAsAt** | **OffsetDateTime** | Worker AsAt |  [optional] |
|**workerParameters** | [**Map&lt;String, FieldMapping&gt;**](FieldMapping.md) | Parameters for this Worker |  [optional] |
|**workerStatusTriggers** | [**WorkerStatusTriggers**](WorkerStatusTriggers.md) |  |  [optional] |
|**childTaskConfigurations** | [**List&lt;ResultantChildTaskConfiguration&gt;**](ResultantChildTaskConfiguration.md) | Tasks can be generated from run worker results; this is the configuration |  [optional] |
|**workerTimeout** | **Integer** | Worker WorkerTimeout in seconds |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| RUNWORKER | &quot;RunWorker&quot; |



[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)



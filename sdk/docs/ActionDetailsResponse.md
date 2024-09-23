

# ActionDetailsResponse

Abstracts the kinds of Actions available in a read-only form

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**type** | **String** | Type name for this Action |  [optional] |
|**childTaskConfigurations** | [**List&lt;ResultantChildTaskConfiguration&gt;**](ResultantChildTaskConfiguration.md) | Tasks can be generated from run worker results; this is the configuration |  [optional] |
|**workerId** | [**ResourceId**](ResourceId.md) |  |  [optional] |
|**workerAsAt** | **OffsetDateTime** | Worker AsAt |  [optional] |
|**workerParameters** | [**Map&lt;String, FieldMapping&gt;**](FieldMapping.md) | Parameters for this Worker |  [optional] |
|**workerStatusTriggers** | [**WorkerStatusTriggers**](WorkerStatusTriggers.md) |  |  [optional] |
|**workerTimeout** | **Integer** | Worker timeout in seconds |  [optional] |
|**trigger** | **String** | Trigger on parent task to be invoked |  [optional] |



[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)





# ActionDetails

Abstracts the kinds of Actions available

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**type** | **String** | Type name for this Action |  |
|**childTaskConfigurations** | [**List&lt;ResultantChildTaskConfiguration&gt;**](ResultantChildTaskConfiguration.md) | Tasks can be generated from run worker results; this is the configuration |  |
|**workerId** | [**ResourceId**](ResourceId.md) |  |  |
|**workerAsAt** | **OffsetDateTime** | Worker AsAt |  [optional] |
|**workerParameters** | [**Map&lt;String, FieldMapping&gt;**](FieldMapping.md) | Parameters for this Worker |  [optional] |
|**workerStatusTriggers** | [**WorkerStatusTriggers**](WorkerStatusTriggers.md) |  |  [optional] |
|**trigger** | **String** | Trigger on parent task to be invoked |  |




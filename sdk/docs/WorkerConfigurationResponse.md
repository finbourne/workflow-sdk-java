

# WorkerConfigurationResponse

Readonly information about how the worker should be executed

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**type** | [**TypeEnum**](#TypeEnum) | The type of worker |  |
|**url** | **String** | The URL to check, eg: https://www.google.com/ |  [optional] |
|**name** | **String** | Name of the view in Luminesce |  [optional] |
|**jobId** | [**ResourceId**](ResourceId.md) |  |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| FAIL | &quot;Fail&quot; |
| GROUPRECONCILIATION | &quot;GroupReconciliation&quot; |
| HEALTHCHECK | &quot;HealthCheck&quot; |
| LUMINESCEVIEW | &quot;LuminesceView&quot; |
| SCHEDULERJOB | &quot;SchedulerJob&quot; |
| SLEEP | &quot;Sleep&quot; |



[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)



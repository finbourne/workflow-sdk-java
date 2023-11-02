

# WorkerConfigurationResponse

Readonly information about how the worker should be executed

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**type** | [**TypeEnum**](#TypeEnum) | The type of worker |  |
|**url** | **String** | The URL to check, eg: https://www.google.com/ |  [optional] |
|**name** | **String** | Name of the view in Luminesce |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| FAIL | &quot;Fail&quot; |
| HEALTHCHECK | &quot;HealthCheck&quot; |
| LUMINESCEVIEW | &quot;LuminesceView&quot; |
| SLEEP | &quot;Sleep&quot; |




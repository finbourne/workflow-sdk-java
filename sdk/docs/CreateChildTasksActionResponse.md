

# CreateChildTasksActionResponse

Defines a read-only Create Child Tasks Action

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**type** | [**TypeEnum**](#TypeEnum) | Type name for this Action |  [optional] |
|**childTaskConfigurations** | [**List&lt;CreateChildTaskConfiguration&gt;**](CreateChildTaskConfiguration.md) | The Child Task Configurations |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| CREATECHILDTASKS | &quot;CreateChildTasks&quot; |
| RUNWORKER | &quot;RunWorker&quot; |
| TRIGGERPARENTTASK | &quot;TriggerParentTask&quot; |




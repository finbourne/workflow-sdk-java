

# CreateTaskRequest

Contains required info to create a new Task

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**taskDefinitionId** | [**ResourceId**](ResourceId.md) |  |  |
|**correlationIds** | **List&lt;String&gt;** | A set of guid identifiers that allow correlation across the application tier |  [optional] |
|**fields** | [**List&lt;TaskInstanceField&gt;**](TaskInstanceField.md) | Fields and their initial values - should correspond with the Task Definition field schema |  [optional] |
|**stackingKey** | **String** | The key for the Stack that this Task should be added to |  [optional] |




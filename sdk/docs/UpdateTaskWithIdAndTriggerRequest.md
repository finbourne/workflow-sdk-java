

# UpdateTaskWithIdAndTriggerRequest

A request to update multiple Tasks Includes a trigger which is supplied from route in single update request

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**taskInstanceId** | **String** | The ID of the task instance |  [optional] |
|**correlationIds** | **List&lt;String&gt;** | A set of guid identifiers that allow correlation across the application tier |  [optional] |
|**fields** | [**List&lt;TaskInstanceField&gt;**](TaskInstanceField.md) | Defines the fields associated with the update |  [optional] |
|**stackingKey** | **String** | The key for the Stack that this Task should be added to |  [optional] |
|**triggerName** | **String** | The trigger we want to update the task with |  [optional] |



[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)



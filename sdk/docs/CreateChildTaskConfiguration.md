

# CreateChildTaskConfiguration

Create Child Task Configuration

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**taskDefinitionId** | [**ResourceId**](ResourceId.md) |  |  |
|**taskDefinitionAsAt** | **OffsetDateTime** | TaskDefinition AsAt timestamp |  [optional] |
|**initialTrigger** | **String** | The Initial Trigger for automatic start |  [optional] |
|**childTaskFields** | [**Map&lt;String, FieldMapping&gt;**](FieldMapping.md) | Field Mappings |  [optional] |
|**mapStackingKeyFrom** | **String** | If present, the value of this field on the parent task will be the Stacking Key on any created child tasks |  [optional] |



[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)



# com.finbourne.workflow.model.CreateChildTaskConfiguration
Create Child Task Configuration

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**taskDefinitionId** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**taskDefinitionAsAt** | [**OffsetDateTime**](OffsetDateTime.md) | TaskDefinition AsAt timestamp | [optional] [default to OffsetDateTime]
**initialTrigger** | **String** | The Initial Trigger for automatic start | [optional] [default to String]
**childTaskFields** | [**Map&lt;String, FieldMapping&gt;**](FieldMapping.md) | Field Mappings | [optional] [default to Map<String, FieldMapping>]
**mapStackingKeyFrom** | **String** | If present, the value of this field on the parent task will be the Stacking Key on any created child tasks | [optional] [default to String]

```java
import com.finbourne.workflow.model.CreateChildTaskConfiguration;
import java.util.*;
import java.lang.System;
import java.net.URI;

ResourceId TaskDefinitionId = new ResourceId();
@jakarta.annotation.Nullable OffsetDateTime TaskDefinitionAsAt = OffsetDateTime.now();
@jakarta.annotation.Nullable String InitialTrigger = "example InitialTrigger";
@jakarta.annotation.Nullable Map<String, FieldMapping> ChildTaskFields = new Map<String, FieldMapping>();
@jakarta.annotation.Nullable String MapStackingKeyFrom = "example MapStackingKeyFrom";


CreateChildTaskConfiguration createChildTaskConfigurationInstance = new CreateChildTaskConfiguration()
    .TaskDefinitionId(TaskDefinitionId)
    .TaskDefinitionAsAt(TaskDefinitionAsAt)
    .InitialTrigger(InitialTrigger)
    .ChildTaskFields(ChildTaskFields)
    .MapStackingKeyFrom(MapStackingKeyFrom);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)

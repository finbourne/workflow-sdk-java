# com.finbourne.workflow.model.ResultantChildTaskConfiguration
Child Task Configuration

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**resultMatchingPattern** | [**ResultMatchingPattern**](ResultMatchingPattern.md) |  | [optional] [default to ResultMatchingPattern]
**taskDefinitionId** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**taskDefinitionAsAt** | [**OffsetDateTime**](OffsetDateTime.md) | TaskDefinition AsAt timestamp | [optional] [default to OffsetDateTime]
**initialTrigger** | **String** | The Initial Trigger for automatic start | [optional] [default to String]
**childTaskFields** | [**Map&lt;String, FieldMapping&gt;**](FieldMapping.md) | Field Mappings | [default to Map<String, FieldMapping>]
**mapStackingKeyFrom** | **String** | The field to be mapped as the ChildTasks Stacking Key | [optional] [default to String]

```java
import com.finbourne.workflow.model.ResultantChildTaskConfiguration;
import java.util.*;
import java.lang.System;
import java.net.URI;

ResultMatchingPattern ResultMatchingPattern = new ResultMatchingPattern();
ResourceId TaskDefinitionId = new ResourceId();
@jakarta.annotation.Nullable OffsetDateTime TaskDefinitionAsAt = OffsetDateTime.now();
@jakarta.annotation.Nullable String InitialTrigger = "example InitialTrigger";
Map<String, FieldMapping> ChildTaskFields = new Map<String, FieldMapping>();
@jakarta.annotation.Nullable String MapStackingKeyFrom = "example MapStackingKeyFrom";


ResultantChildTaskConfiguration resultantChildTaskConfigurationInstance = new ResultantChildTaskConfiguration()
    .ResultMatchingPattern(ResultMatchingPattern)
    .TaskDefinitionId(TaskDefinitionId)
    .TaskDefinitionAsAt(TaskDefinitionAsAt)
    .InitialTrigger(InitialTrigger)
    .ChildTaskFields(ChildTaskFields)
    .MapStackingKeyFrom(MapStackingKeyFrom);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)

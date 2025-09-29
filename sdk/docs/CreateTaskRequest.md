# com.finbourne.workflow.model.CreateTaskRequest
Contains required info to create a new Task

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**taskDefinitionId** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**correlationIds** | **List&lt;String&gt;** | A set of guid identifiers that allow correlation across the application tier | [optional] [default to List<String>]
**fields** | [**List&lt;TaskInstanceField&gt;**](TaskInstanceField.md) | Fields and their initial values - should correspond with the Task Definition field schema | [optional] [default to List<TaskInstanceField>]
**stackingKey** | **String** | The key for the Stack that this Task should be added to | [optional] [default to String]

```java
import com.finbourne.workflow.model.CreateTaskRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

ResourceId TaskDefinitionId = new ResourceId();
@jakarta.annotation.Nullable List<String> CorrelationIds = new List<String>();
@jakarta.annotation.Nullable List<TaskInstanceField> Fields = new List<TaskInstanceField>();
@jakarta.annotation.Nullable String StackingKey = "example StackingKey";


CreateTaskRequest createTaskRequestInstance = new CreateTaskRequest()
    .TaskDefinitionId(TaskDefinitionId)
    .CorrelationIds(CorrelationIds)
    .Fields(Fields)
    .StackingKey(StackingKey);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)

# com.finbourne.workflow.model.UpdateTaskRequest
A request to update a Task

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**correlationIds** | **List&lt;String&gt;** | A set of guid identifiers that allow correlation across the application tier | [optional] [default to List<String>]
**fields** | [**List&lt;TaskInstanceField&gt;**](TaskInstanceField.md) | Defines the fields associated with the update | [optional] [default to List<TaskInstanceField>]
**stackingKey** | **String** | The key for the Stack that this Task should be added to | [optional] [default to String]

```java
import com.finbourne.workflow.model.UpdateTaskRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable List<String> CorrelationIds = new List<String>();
@jakarta.annotation.Nullable List<TaskInstanceField> Fields = new List<TaskInstanceField>();
@jakarta.annotation.Nullable String StackingKey = "example StackingKey";


UpdateTaskRequest updateTaskRequestInstance = new UpdateTaskRequest()
    .CorrelationIds(CorrelationIds)
    .Fields(Fields)
    .StackingKey(StackingKey);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)

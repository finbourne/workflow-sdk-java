# com.finbourne.workflow.model.UpdateTaskWithIdAndTriggerRequest
A request to update multiple Tasks Includes a trigger which is supplied from route in single update request

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**taskInstanceId** | **String** | The ID of the task instance | [optional] [default to String]
**correlationIds** | **List&lt;String&gt;** | A set of guid identifiers that allow correlation across the application tier | [optional] [default to List<String>]
**fields** | [**List&lt;TaskInstanceField&gt;**](TaskInstanceField.md) | Defines the fields associated with the update | [optional] [default to List<TaskInstanceField>]
**stackingKey** | **String** | The key for the Stack that this Task should be added to | [optional] [default to String]
**triggerName** | **String** | The trigger we want to update the task with | [optional] [default to String]

```java
import com.finbourne.workflow.model.UpdateTaskWithIdAndTriggerRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable String TaskInstanceId = "example TaskInstanceId";
@jakarta.annotation.Nullable List<String> CorrelationIds = new List<String>();
@jakarta.annotation.Nullable List<TaskInstanceField> Fields = new List<TaskInstanceField>();
@jakarta.annotation.Nullable String StackingKey = "example StackingKey";
@jakarta.annotation.Nullable String TriggerName = "example TriggerName";


UpdateTaskWithIdAndTriggerRequest updateTaskWithIdAndTriggerRequestInstance = new UpdateTaskWithIdAndTriggerRequest()
    .TaskInstanceId(TaskInstanceId)
    .CorrelationIds(CorrelationIds)
    .Fields(Fields)
    .StackingKey(StackingKey)
    .TriggerName(TriggerName);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)

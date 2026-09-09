# com.finbourne.workflow.model.ExistingTasksRecurringConfiguration
Behaviour applied to an existing (non-terminal) child task whose stacking key matches one or more new child task candidates

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**incrementAsAtModified** | **Boolean** | When true, the existing task&#39;s asAtModified is incremented even if no other change (Trigger or MergeFields) is applied | [optional] [default to Boolean]
**trigger** | **String** | The existing task receives this trigger | [optional] [default to String]
**mergeFields** | **List&lt;String&gt;** | The named fields on the existing task are updated with the values from the latest run. Only applies where the new-to-existing stacking key cardinality is one-to-one or one-to-many; unspecified fields are untouched. Data will be merged in even if these fields are in a read-only state. | [optional] [default to List<String>]

```java
import com.finbourne.workflow.model.ExistingTasksRecurringConfiguration;
import java.util.*;
import java.lang.System;
import java.net.URI;

Boolean IncrementAsAtModified = true;
@jakarta.annotation.Nullable String Trigger = "example Trigger";
@jakarta.annotation.Nullable List<String> MergeFields = new List<String>();


ExistingTasksRecurringConfiguration existingTasksRecurringConfigurationInstance = new ExistingTasksRecurringConfiguration()
    .IncrementAsAtModified(IncrementAsAtModified)
    .Trigger(Trigger)
    .MergeFields(MergeFields);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)

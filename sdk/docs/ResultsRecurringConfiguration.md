# com.finbourne.workflow.model.ResultsRecurringConfiguration
Behaviour applied to new child task candidates, and to existing child tasks, when their stacking keys match one another

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**newTasks** | [**NewTasksRecurringConfiguration**](NewTasksRecurringConfiguration.md) |  | [default to NewTasksRecurringConfiguration]
**existingTasks** | [**ExistingTasksRecurringConfiguration**](ExistingTasksRecurringConfiguration.md) |  | [default to ExistingTasksRecurringConfiguration]

```java
import com.finbourne.workflow.model.ResultsRecurringConfiguration;
import java.util.*;
import java.lang.System;
import java.net.URI;

NewTasksRecurringConfiguration NewTasks = new NewTasksRecurringConfiguration();
ExistingTasksRecurringConfiguration ExistingTasks = new ExistingTasksRecurringConfiguration();


ResultsRecurringConfiguration resultsRecurringConfigurationInstance = new ResultsRecurringConfiguration()
    .NewTasks(NewTasks)
    .ExistingTasks(ExistingTasks);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)

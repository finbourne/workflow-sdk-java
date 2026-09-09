# com.finbourne.workflow.model.ResultsNotRecurringConfiguration
Behaviour applied when a new child task candidate's stacking key does not match any existing (non-terminal) child task, and to an existing child task whose stacking key is not matched by any new candidate

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**existingTasks** | [**ExistingTasksNotRecurringConfiguration**](ExistingTasksNotRecurringConfiguration.md) |  | [default to ExistingTasksNotRecurringConfiguration]

```java
import com.finbourne.workflow.model.ResultsNotRecurringConfiguration;
import java.util.*;
import java.lang.System;
import java.net.URI;

ExistingTasksNotRecurringConfiguration ExistingTasks = new ExistingTasksNotRecurringConfiguration();


ResultsNotRecurringConfiguration resultsNotRecurringConfigurationInstance = new ResultsNotRecurringConfiguration()
    .ExistingTasks(ExistingTasks);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)

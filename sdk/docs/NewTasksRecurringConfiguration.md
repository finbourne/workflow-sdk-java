# com.finbourne.workflow.model.NewTasksRecurringConfiguration
Behaviour applied to a new child task candidate whose stacking key matches an existing (non-terminal) child task

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**doNotCreate** | **Boolean** | When true, the new child task will not be created | [optional] [default to Boolean]
**initialTriggerOverride** | **String** | When DoNotCreate is false, the new child task will be created with this trigger instead of the ChildTaskConfiguration&#39;s InitialTrigger | [optional] [default to String]

```java
import com.finbourne.workflow.model.NewTasksRecurringConfiguration;
import java.util.*;
import java.lang.System;
import java.net.URI;

Boolean DoNotCreate = true;
@jakarta.annotation.Nullable String InitialTriggerOverride = "example InitialTriggerOverride";


NewTasksRecurringConfiguration newTasksRecurringConfigurationInstance = new NewTasksRecurringConfiguration()
    .DoNotCreate(DoNotCreate)
    .InitialTriggerOverride(InitialTriggerOverride);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)

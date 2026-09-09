# com.finbourne.workflow.model.ExistingTasksNotRecurringConfiguration
Behaviour applied to an existing (non-terminal) child task whose stacking key is not matched by any new child task candidate (i.e. it did not recur on this run)

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**trigger** | **String** | The existing task receives this trigger | [optional] [default to String]

```java
import com.finbourne.workflow.model.ExistingTasksNotRecurringConfiguration;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable String Trigger = "example Trigger";


ExistingTasksNotRecurringConfiguration existingTasksNotRecurringConfigurationInstance = new ExistingTasksNotRecurringConfiguration()
    .Trigger(Trigger);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)

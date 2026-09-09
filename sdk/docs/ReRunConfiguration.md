# com.finbourne.workflow.model.ReRunConfiguration
Defines how re-run results for a given (child) TaskDefinitionId should be reconciled against existing (non-terminal) child tasks of the same parent Task instance.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**taskDefinitionId** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**resultsRecurring** | [**ResultsRecurringConfiguration**](ResultsRecurringConfiguration.md) |  | [default to ResultsRecurringConfiguration]
**resultsNotRecurring** | [**ResultsNotRecurringConfiguration**](ResultsNotRecurringConfiguration.md) |  | [default to ResultsNotRecurringConfiguration]

```java
import com.finbourne.workflow.model.ReRunConfiguration;
import java.util.*;
import java.lang.System;
import java.net.URI;

ResourceId TaskDefinitionId = new ResourceId();
ResultsRecurringConfiguration ResultsRecurring = new ResultsRecurringConfiguration();
ResultsNotRecurringConfiguration ResultsNotRecurring = new ResultsNotRecurringConfiguration();


ReRunConfiguration reRunConfigurationInstance = new ReRunConfiguration()
    .TaskDefinitionId(TaskDefinitionId)
    .ResultsRecurring(ResultsRecurring)
    .ResultsNotRecurring(ResultsNotRecurring);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)

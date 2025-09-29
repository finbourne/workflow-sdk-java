# com.finbourne.workflow.model.TaskDefinitionVersion
The version of the Task Definition used by this Task

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**asAtModified** | [**OffsetDateTime**](OffsetDateTime.md) | The asAt datetime of the Task Definition used by this Task | [optional] [default to OffsetDateTime]

```java
import com.finbourne.workflow.model.TaskDefinitionVersion;
import java.util.*;
import java.lang.System;
import java.net.URI;

OffsetDateTime AsAtModified = OffsetDateTime.now();


TaskDefinitionVersion taskDefinitionVersionInstance = new TaskDefinitionVersion()
    .AsAtModified(AsAtModified);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)

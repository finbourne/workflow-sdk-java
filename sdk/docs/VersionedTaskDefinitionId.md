# com.finbourne.workflow.model.VersionedTaskDefinitionId
A Task Definition Id with an optional asAt timestamp identifying a specific version

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**taskDefinitionId** | [**ResourceId**](ResourceId.md) |  | [optional] [default to ResourceId]
**taskDefinitionAsAt** | [**OffsetDateTime**](OffsetDateTime.md) | The asAt time of this version of the Task Definition. Null means the latest version. | [optional] [default to OffsetDateTime]

```java
import com.finbourne.workflow.model.VersionedTaskDefinitionId;
import java.util.*;
import java.lang.System;
import java.net.URI;

ResourceId TaskDefinitionId = new ResourceId();
@jakarta.annotation.Nullable OffsetDateTime TaskDefinitionAsAt = OffsetDateTime.now();


VersionedTaskDefinitionId versionedTaskDefinitionIdInstance = new VersionedTaskDefinitionId()
    .TaskDefinitionId(TaskDefinitionId)
    .TaskDefinitionAsAt(TaskDefinitionAsAt);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)

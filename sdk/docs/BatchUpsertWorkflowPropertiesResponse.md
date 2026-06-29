# com.finbourne.workflow.model.BatchUpsertWorkflowPropertiesResponse
The result of a batch upsert of properties on a Workflow.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**values** | [**Map&lt;String, PerpetualProperty&gt;**](PerpetualProperty.md) | The properties that were successfully upserted or deleted, keyed by property key. | [optional] [default to Map<String, PerpetualProperty>]
**failed** | [**Map&lt;String, ErrorDetail&gt;**](ErrorDetail.md) | The properties that could not be upserted or deleted, keyed by property key. | [optional] [default to Map<String, ErrorDetail>]
**asAtDate** | [**OffsetDateTime**](OffsetDateTime.md) | The asAt datetime at which the properties were updated or created. | [optional] [default to OffsetDateTime]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.workflow.model.BatchUpsertWorkflowPropertiesResponse;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable Map<String, PerpetualProperty> Values = new Map<String, PerpetualProperty>();
@jakarta.annotation.Nullable Map<String, ErrorDetail> Failed = new Map<String, ErrorDetail>();
OffsetDateTime AsAtDate = OffsetDateTime.now();
@jakarta.annotation.Nullable List<Link> Links = new List<Link>();


BatchUpsertWorkflowPropertiesResponse batchUpsertWorkflowPropertiesResponseInstance = new BatchUpsertWorkflowPropertiesResponse()
    .Values(Values)
    .Failed(Failed)
    .AsAtDate(AsAtDate)
    .Links(Links);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)

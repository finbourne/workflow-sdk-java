# com.finbourne.workflow.model.DeletedEntityResponse

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**href** | [**URI**](URI.md) | The Uri related to this Entity | [optional] [default to URI]
**effectiveFrom** | [**OffsetDateTime**](OffsetDateTime.md) | The EffectiveFrom for this response | [optional] [default to OffsetDateTime]
**asAt** | [**OffsetDateTime**](OffsetDateTime.md) | The AsAt for this response | [default to OffsetDateTime]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.workflow.model.DeletedEntityResponse;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable URI Href = URI.create("http://example.com/Href");
@jakarta.annotation.Nullable OffsetDateTime EffectiveFrom = OffsetDateTime.now();
OffsetDateTime AsAt = OffsetDateTime.now();
@jakarta.annotation.Nullable List<Link> Links = new List<Link>();


DeletedEntityResponse deletedEntityResponseInstance = new DeletedEntityResponse()
    .Href(Href)
    .EffectiveFrom(EffectiveFrom)
    .AsAt(AsAt)
    .Links(Links);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)

# com.finbourne.workflow.model.CorrelationIdMapping
How an Event Launcher fills one correlation ID of the root task from the event that arrived.   A mapped correlation ID joins the fixed correlation IDs of the Launcher

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**mapFrom** | **String** | The path into the event the correlation ID is taken from, for example body.fileId | [default to String]

```java
import com.finbourne.workflow.model.CorrelationIdMapping;
import java.util.*;
import java.lang.System;
import java.net.URI;

String MapFrom = "example MapFrom";


CorrelationIdMapping correlationIdMappingInstance = new CorrelationIdMapping()
    .MapFrom(MapFrom);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)

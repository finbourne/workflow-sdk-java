# com.finbourne.workflow.model.EventHandlerMapping
Defines a mapping for event handler properties

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**mapFrom** | **String** | The field to map from | [optional] [default to String]
**setTo** | **String** | The (constant) value to set | [optional] [default to String]

```java
import com.finbourne.workflow.model.EventHandlerMapping;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable String MapFrom = "example MapFrom";
@jakarta.annotation.Nullable String SetTo = "example SetTo";


EventHandlerMapping eventHandlerMappingInstance = new EventHandlerMapping()
    .MapFrom(MapFrom)
    .SetTo(SetTo);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)

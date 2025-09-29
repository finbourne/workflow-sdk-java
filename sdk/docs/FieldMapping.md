# com.finbourne.workflow.model.FieldMapping
Defines a single Field map

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**mapFrom** | **String** | The field to map from | [optional] [default to String]
**setTo** | **Object** | The (constant) value to set | [optional] [default to Object]

```java
import com.finbourne.workflow.model.FieldMapping;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable String MapFrom = "example MapFrom";
@jakarta.annotation.Nullable Object 

FieldMapping fieldMappingInstance = new FieldMapping()
    .MapFrom(MapFrom)
    .SetTo(SetTo);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)

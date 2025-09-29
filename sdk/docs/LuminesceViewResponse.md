# com.finbourne.workflow.model.LuminesceViewResponse
Readonly configuration for a Worker that calls a Luminesce view

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | **String** | The type of worker | [optional] [default to String]
**name** | **String** | Name of the view in Luminesce | [optional] [default to String]

```java
import com.finbourne.workflow.model.LuminesceViewResponse;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable String Type = "example Type";
@jakarta.annotation.Nullable String Name = "example Name";


LuminesceViewResponse luminesceViewResponseInstance = new LuminesceViewResponse()
    .Type(Type)
    .Name(Name);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)

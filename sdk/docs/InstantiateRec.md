# com.finbourne.workflow.model.InstantiateRec
Configuration for a Worker that requests the instantiation of a rec definition in LUSID

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | **String** | The type of worker | [default to String]

```java
import com.finbourne.workflow.model.InstantiateRec;
import java.util.*;
import java.lang.System;
import java.net.URI;

String Type = "example Type";


InstantiateRec instantiateRecInstance = new InstantiateRec()
    .Type(Type);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)

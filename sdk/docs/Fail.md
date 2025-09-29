# com.finbourne.workflow.model.Fail
Configuration for a Worker that always Fails

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | **String** | The type of worker | [default to String]

```java
import com.finbourne.workflow.model.Fail;
import java.util.*;
import java.lang.System;
import java.net.URI;

String Type = "example Type";


Fail failInstance = new Fail()
    .Type(Type);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)

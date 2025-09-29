# com.finbourne.workflow.model.CutLabelReference
A reference to a Cut Label in LUSID

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**code** | **String** | Code of the Cut Label | [default to String]
**type** | **String** | The type of Time of Day | [default to String]

```java
import com.finbourne.workflow.model.CutLabelReference;
import java.util.*;
import java.lang.System;
import java.net.URI;

String Code = "example Code";
String Type = "example Type";


CutLabelReference cutLabelReferenceInstance = new CutLabelReference()
    .Code(Code)
    .Type(Type);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)

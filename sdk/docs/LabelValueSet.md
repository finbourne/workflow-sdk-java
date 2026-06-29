# com.finbourne.workflow.model.LabelValueSet
The set of string labels that make up a multi-value property.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**values** | **List&lt;String&gt;** | The distinct string values of the multi-value property. | [default to List<String>]

```java
import com.finbourne.workflow.model.LabelValueSet;
import java.util.*;
import java.lang.System;
import java.net.URI;

List<String> Values = new List<String>();


LabelValueSet labelValueSetInstance = new LabelValueSet()
    .Values(Values);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)

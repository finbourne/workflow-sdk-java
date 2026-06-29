# com.finbourne.workflow.model.PerpetualProperty
A perpetual property (i.e. without effective dates) on a Workflow. A property is deleted by supplying a null Finbourne.Workflow.WebApi.Common.Dto.Json.Properties.PerpetualProperty.Value.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**key** | **String** | The property key in the form {domain}/{scope}/{code}. The domain must be &#39;Workflow&#39;. | [default to String]
**value** | [**PropertyValue**](PropertyValue.md) |  | [optional] [default to PropertyValue]

```java
import com.finbourne.workflow.model.PerpetualProperty;
import java.util.*;
import java.lang.System;
import java.net.URI;

String Key = "example Key";
PropertyValue Value = new PropertyValue();


PerpetualProperty perpetualPropertyInstance = new PerpetualProperty()
    .Key(Key)
    .Value(Value);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)

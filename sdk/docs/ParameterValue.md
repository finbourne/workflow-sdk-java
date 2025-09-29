# com.finbourne.workflow.model.ParameterValue
Defines a Parameter Value

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** | Name | [default to String]
**value** | **Object** | Value which can be a String, Boolean, Decimal or DateTime (ISO 8601) | [optional] [default to Object]

```java
import com.finbourne.workflow.model.ParameterValue;
import java.util.*;
import java.lang.System;
import java.net.URI;

String Name = "example Name";
@jakarta.annotation.Nullable Object 

ParameterValue parameterValueInstance = new ParameterValue()
    .Name(Name)
    .Value(Value);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)

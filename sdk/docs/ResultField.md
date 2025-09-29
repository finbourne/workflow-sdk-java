# com.finbourne.workflow.model.ResultField
Defines a Worker Result Field

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** | Name | [default to String]
**type** | **String** | The type of this Parameter | [default to String]
**displayName** | **String** | DisplayName | [optional] [default to String]
**description** | **String** | Description | [optional] [default to String]

```java
import com.finbourne.workflow.model.ResultField;
import java.util.*;
import java.lang.System;
import java.net.URI;

String Name = "example Name";
String Type = "example Type";
@jakarta.annotation.Nullable String DisplayName = "example DisplayName";
@jakarta.annotation.Nullable String Description = "example Description";


ResultField resultFieldInstance = new ResultField()
    .Name(Name)
    .Type(Type)
    .DisplayName(DisplayName)
    .Description(Description);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)

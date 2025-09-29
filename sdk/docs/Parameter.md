# com.finbourne.workflow.model.Parameter
Defines a Worker Parameter

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | **String** | The type of this Parameter | [default to String]
**name** | **String** | Name | [default to String]
**displayName** | **String** | DisplayName | [optional] [default to String]
**description** | **String** | Description | [optional] [default to String]
**required** | **Boolean** | Required or not | [default to Boolean]
**defaultValue** | **String** | DefaultValue | [optional] [default to String]

```java
import com.finbourne.workflow.model.Parameter;
import java.util.*;
import java.lang.System;
import java.net.URI;

String Type = "example Type";
String Name = "example Name";
@jakarta.annotation.Nullable String DisplayName = "example DisplayName";
@jakarta.annotation.Nullable String Description = "example Description";
Boolean Required = true;
@jakarta.annotation.Nullable String DefaultValue = "example DefaultValue";


Parameter parameterInstance = new Parameter()
    .Type(Type)
    .Name(Name)
    .DisplayName(DisplayName)
    .Description(Description)
    .Required(Required)
    .DefaultValue(DefaultValue);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)

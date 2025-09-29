# com.finbourne.workflow.model.TaskFieldDefinition
Defines a Task Definition Field

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** | The name of this Field | [default to String]
**type** | **String** | The value type for the field. Available values are: \&quot;String\&quot;, \&quot;Decimal\&quot;, \&quot;DateTime\&quot;, \&quot;Boolean\&quot;) | [default to String]
**readOnlyStates** | [**ReadOnlyStates**](ReadOnlyStates.md) |  | [optional] [default to ReadOnlyStates]
**valueConstraints** | [**ValueConstraints**](ValueConstraints.md) |  | [optional] [default to ValueConstraints]
**displayName** | **String** | Display name for field definition | [optional] [default to String]
**description** | **String** | Description for field definition | [optional] [default to String]
**category** | **String** | Category for field definition | [optional] [default to String]
**containsUrl** | **Boolean** | Field contains url | [optional] [default to Boolean]

```java
import com.finbourne.workflow.model.TaskFieldDefinition;
import java.util.*;
import java.lang.System;
import java.net.URI;

String Name = "example Name";
String Type = "example Type";
ReadOnlyStates ReadOnlyStates = new ReadOnlyStates();
ValueConstraints ValueConstraints = new ValueConstraints();
@jakarta.annotation.Nullable String DisplayName = "example DisplayName";
@jakarta.annotation.Nullable String Description = "example Description";
@jakarta.annotation.Nullable String Category = "example Category";
@jakarta.annotation.Nullable Boolean ContainsUrl = true;


TaskFieldDefinition taskFieldDefinitionInstance = new TaskFieldDefinition()
    .Name(Name)
    .Type(Type)
    .ReadOnlyStates(ReadOnlyStates)
    .ValueConstraints(ValueConstraints)
    .DisplayName(DisplayName)
    .Description(Description)
    .Category(Category)
    .ContainsUrl(ContainsUrl);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)

# com.finbourne.workflow.model.TaskStateDefinition
A Task Definition/Task has a given set of States

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** | The Name of this State | [default to String]
**displayName** | **String** | The display name of this State | [optional] [default to String]
**description** | **String** | The description of this State | [optional] [default to String]
**category** | **String** | The category of this State | [optional] [default to String]

```java
import com.finbourne.workflow.model.TaskStateDefinition;
import java.util.*;
import java.lang.System;
import java.net.URI;

String Name = "example Name";
@jakarta.annotation.Nullable String DisplayName = "example DisplayName";
@jakarta.annotation.Nullable String Description = "example Description";
@jakarta.annotation.Nullable String Category = "example Category";


TaskStateDefinition taskStateDefinitionInstance = new TaskStateDefinition()
    .Name(Name)
    .DisplayName(DisplayName)
    .Description(Description)
    .Category(Category);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)

# com.finbourne.workflow.model.InitialState
Defines the Initial State of the Task

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** | The Initial State of the Task | [default to String]
**requiredFields** | **List&lt;String&gt;** | Required input Fields for the Initial State | [optional] [default to List<String>]

```java
import com.finbourne.workflow.model.InitialState;
import java.util.*;
import java.lang.System;
import java.net.URI;

String Name = "example Name";
@jakarta.annotation.Nullable List<String> RequiredFields = new List<String>();


InitialState initialStateInstance = new InitialState()
    .Name(Name)
    .RequiredFields(RequiredFields);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)

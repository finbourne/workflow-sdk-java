# com.finbourne.workflow.model.LuminesceView
Configuration for a Worker that calls a Luminesce view

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | **String** | The type of worker | [default to String]
**name** | **String** | Name of the view in Luminesce | [default to String]

```java
import com.finbourne.workflow.model.LuminesceView;
import java.util.*;
import java.lang.System;
import java.net.URI;

String Type = "example Type";
String Name = "example Name";


LuminesceView luminesceViewInstance = new LuminesceView()
    .Type(Type)
    .Name(Name);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)

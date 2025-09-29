# com.finbourne.workflow.model.ReadOnlyStates
Information about which states the field can be edited in

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**stateType** | **String** | The State Type (e.g. InitialState, AllStates, TerminalState, SelectedStates) | [default to String]
**selectedStates** | **List&lt;String&gt;** | Named states for which the field will be readonly - This field can only be populated if StateType &#x3D; SelectedStates | [optional] [default to List<String>]

```java
import com.finbourne.workflow.model.ReadOnlyStates;
import java.util.*;
import java.lang.System;
import java.net.URI;

String StateType = "example StateType";
@jakarta.annotation.Nullable List<String> SelectedStates = new List<String>();


ReadOnlyStates readOnlyStatesInstance = new ReadOnlyStates()
    .StateType(StateType)
    .SelectedStates(SelectedStates);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)

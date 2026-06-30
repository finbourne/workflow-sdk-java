# com.finbourne.workflow.model.UpdateWorkflowRequest
Contains required info to update an existing Workflow

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**displayName** | **String** | Human readable name | [default to String]
**description** | **String** | Human readable description | [optional] [default to String]
**rootTaskDefinitionId** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**properties** | [**Map&lt;String, PerpetualProperty&gt;**](PerpetualProperty.md) | The properties to set on the Workflow, keyed by property key. Optional. A null property value deletes the property. | [optional] [default to Map<String, PerpetualProperty>]

```java
import com.finbourne.workflow.model.UpdateWorkflowRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

String DisplayName = "example DisplayName";
@jakarta.annotation.Nullable String Description = "example Description";
ResourceId RootTaskDefinitionId = new ResourceId();
@jakarta.annotation.Nullable Map<String, PerpetualProperty> Properties = new Map<String, PerpetualProperty>();


UpdateWorkflowRequest updateWorkflowRequestInstance = new UpdateWorkflowRequest()
    .DisplayName(DisplayName)
    .Description(Description)
    .RootTaskDefinitionId(RootTaskDefinitionId)
    .Properties(Properties);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)

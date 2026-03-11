# com.finbourne.workflow.model.CreateWorkflowRequest
Contains required info to create a new Workflow

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**displayName** | **String** | Human readable name | [default to String]
**description** | **String** | Human readable description | [optional] [default to String]
**rootTaskDefinitionId** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]

```java
import com.finbourne.workflow.model.CreateWorkflowRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

ResourceId Id = new ResourceId();
String DisplayName = "example DisplayName";
@jakarta.annotation.Nullable String Description = "example Description";
ResourceId RootTaskDefinitionId = new ResourceId();


CreateWorkflowRequest createWorkflowRequestInstance = new CreateWorkflowRequest()
    .Id(Id)
    .DisplayName(DisplayName)
    .Description(Description)
    .RootTaskDefinitionId(RootTaskDefinitionId);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)

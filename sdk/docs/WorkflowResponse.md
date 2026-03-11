# com.finbourne.workflow.model.WorkflowResponse
A Workflow

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**version** | [**VersionInfo**](VersionInfo.md) |  | [optional] [default to VersionInfo]
**displayName** | **String** | Human readable name | [default to String]
**description** | **String** | Human readable description | [optional] [default to String]
**rootTaskDefinitionId** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**workflowStructure** | [**WorkflowStructure**](WorkflowStructure.md) |  | [optional] [default to WorkflowStructure]

```java
import com.finbourne.workflow.model.WorkflowResponse;
import java.util.*;
import java.lang.System;
import java.net.URI;

ResourceId Id = new ResourceId();
VersionInfo Version = new VersionInfo();
String DisplayName = "example DisplayName";
@jakarta.annotation.Nullable String Description = "example Description";
ResourceId RootTaskDefinitionId = new ResourceId();
WorkflowStructure WorkflowStructure = new WorkflowStructure();


WorkflowResponse workflowResponseInstance = new WorkflowResponse()
    .Id(Id)
    .Version(Version)
    .DisplayName(DisplayName)
    .Description(Description)
    .RootTaskDefinitionId(RootTaskDefinitionId)
    .WorkflowStructure(WorkflowStructure);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)

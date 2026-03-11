# com.finbourne.workflow.model.ChildTaskDefinitionEdge
Represents a parent-child relationship between two Task Definitions in a Workflow

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**parent** | [**VersionedTaskDefinitionId**](VersionedTaskDefinitionId.md) |  | [optional] [default to VersionedTaskDefinitionId]
**child** | [**VersionedTaskDefinitionId**](VersionedTaskDefinitionId.md) |  | [optional] [default to VersionedTaskDefinitionId]

```java
import com.finbourne.workflow.model.ChildTaskDefinitionEdge;
import java.util.*;
import java.lang.System;
import java.net.URI;

VersionedTaskDefinitionId Parent = new VersionedTaskDefinitionId();
VersionedTaskDefinitionId Child = new VersionedTaskDefinitionId();


ChildTaskDefinitionEdge childTaskDefinitionEdgeInstance = new ChildTaskDefinitionEdge()
    .Parent(Parent)
    .Child(Child);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)

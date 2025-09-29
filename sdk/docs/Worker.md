# com.finbourne.workflow.model.Worker
Information about the Worker

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**displayName** | **String** | Human readable name | [default to String]
**description** | **String** | Human readable description | [optional] [default to String]
**workerConfiguration** | [**WorkerConfigurationResponse**](WorkerConfigurationResponse.md) |  | [default to WorkerConfigurationResponse]
**version** | [**VersionInfo**](VersionInfo.md) |  | [optional] [default to VersionInfo]
**parameters** | [**List&lt;Parameter&gt;**](Parameter.md) | The Parameters this Worker accepts or requires. | [optional] [default to List<Parameter>]
**resultFields** | [**List&lt;ResultField&gt;**](ResultField.md) | The Fields that the Worker results will come back with. | [optional] [default to List<ResultField>]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.workflow.model.Worker;
import java.util.*;
import java.lang.System;
import java.net.URI;

ResourceId Id = new ResourceId();
String DisplayName = "example DisplayName";
@jakarta.annotation.Nullable String Description = "example Description";
WorkerConfigurationResponse WorkerConfiguration = new WorkerConfigurationResponse();
VersionInfo Version = new VersionInfo();
@jakarta.annotation.Nullable List<Parameter> Parameters = new List<Parameter>();
@jakarta.annotation.Nullable List<ResultField> ResultFields = new List<ResultField>();
@jakarta.annotation.Nullable List<Link> Links = new List<Link>();


Worker workerInstance = new Worker()
    .Id(Id)
    .DisplayName(DisplayName)
    .Description(Description)
    .WorkerConfiguration(WorkerConfiguration)
    .Version(Version)
    .Parameters(Parameters)
    .ResultFields(ResultFields)
    .Links(Links);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)

# com.finbourne.workflow.model.WorkerConfiguration
Information about how the worker should be executed

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | **String** | The type of worker | [default to String]
**url** | [**URI**](URI.md) | The URL to check, eg: https://www.google.com/ | [default to URI]
**name** | **String** | Name of the view in Luminesce | [default to String]
**jobId** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]

```java
import com.finbourne.workflow.model.WorkerConfiguration;
import java.util.*;
import java.lang.System;
import java.net.URI;

// Example with Fail WorkerConfiguration
Fail workerConfiguration = new Fail();
workerConfiguration.setType(Fail.TypeEnum.FAIL);
WorkerConfiguration config = new WorkerConfiguration(workerConfiguration);

```
 See all compatible oneOf types with WorkerConfiguration
* [Fail](./Fail.md)

* [GroupReconciliation](./GroupReconciliation.md)

* [HealthCheck](./HealthCheck.md)

* [LuminesceView](./LuminesceView.md)

* [SchedulerJob](./SchedulerJob.md)

* [Sleep](./Sleep.md)


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)

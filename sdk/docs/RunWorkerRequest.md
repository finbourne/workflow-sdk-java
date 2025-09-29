# com.finbourne.workflow.model.RunWorkerRequest
Request to Create a new worker

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**parameters** | [**List&lt;ParameterValue&gt;**](ParameterValue.md) | The Parameter and their values. | [default to List<ParameterValue>]
**workerTimeout** | **Integer** | The timeout in seconds for the worker | [optional] [default to Integer]

```java
import com.finbourne.workflow.model.RunWorkerRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

List<ParameterValue> Parameters = new List<ParameterValue>();
@jakarta.annotation.Nullable Integer WorkerTimeout = new Integer("100.00");


RunWorkerRequest runWorkerRequestInstance = new RunWorkerRequest()
    .Parameters(Parameters)
    .WorkerTimeout(WorkerTimeout);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)

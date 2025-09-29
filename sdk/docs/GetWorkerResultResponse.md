# com.finbourne.workflow.model.GetWorkerResultResponse
The RunWorker response

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**workerStatus** | **String** | The final status of the Worker | [default to String]
**results** | [**List&lt;Map&lt;String, Object&gt;&gt;**](Map.md) | Results | [default to List<Map<String, Object>>]
**statusDetail** | **String** | Detail on the final status | [optional] [default to String]

```java
import com.finbourne.workflow.model.GetWorkerResultResponse;
import java.util.*;
import java.lang.System;
import java.net.URI;

String WorkerStatus = "example WorkerStatus";
List<Map<String, Object>> Results = new List<Map<String, Object>>();
@jakarta.annotation.Nullable String StatusDetail = "example StatusDetail";


GetWorkerResultResponse getWorkerResultResponseInstance = new GetWorkerResultResponse()
    .WorkerStatus(WorkerStatus)
    .Results(Results)
    .StatusDetail(StatusDetail);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)

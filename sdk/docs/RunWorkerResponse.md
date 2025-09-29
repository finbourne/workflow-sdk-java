# com.finbourne.workflow.model.RunWorkerResponse
The RunWorker response

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**runId** | [**UUID**](UUID.md) | Identifies a Worker run | [default to UUID]
**statusDetail** | **String** | Detail on the final status | [optional] [default to String]

```java
import com.finbourne.workflow.model.RunWorkerResponse;
import java.util.*;
import java.lang.System;
import java.net.URI;

UUID RunId = "example RunId";
@jakarta.annotation.Nullable String StatusDetail = "example StatusDetail";


RunWorkerResponse runWorkerResponseInstance = new RunWorkerResponse()
    .RunId(RunId)
    .StatusDetail(StatusDetail);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)

# com.finbourne.workflow.model.HorizonIntegrationResponse
Readonly configuration for the Horizon Integration Worker

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | **String** | The type of worker | [optional] [default to String]
**integrationInstanceId** | **String** | The id of the Horizon integration instance the worker executes. Null on the library worker. | [optional] [default to String]

```java
import com.finbourne.workflow.model.HorizonIntegrationResponse;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable String Type = "example Type";
@jakarta.annotation.Nullable String IntegrationInstanceId = "example IntegrationInstanceId";


HorizonIntegrationResponse horizonIntegrationResponseInstance = new HorizonIntegrationResponse()
    .Type(Type)
    .IntegrationInstanceId(IntegrationInstanceId);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)

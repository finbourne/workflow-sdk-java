# com.finbourne.workflow.model.HorizonIntegration
Configuration for a Worker that executes a Horizon integration instance

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | **String** | The type of worker | [default to String]
**integrationInstanceId** | **String** | The id of the Horizon integration instance the worker executes. | [default to String]

```java
import com.finbourne.workflow.model.HorizonIntegration;
import java.util.*;
import java.lang.System;
import java.net.URI;

String Type = "example Type";
String IntegrationInstanceId = "example IntegrationInstanceId";


HorizonIntegration horizonIntegrationInstance = new HorizonIntegration()
    .Type(Type)
    .IntegrationInstanceId(IntegrationInstanceId);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)

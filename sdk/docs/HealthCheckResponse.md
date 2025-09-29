# com.finbourne.workflow.model.HealthCheckResponse
Readonly configuration for a Worker that performs a GET against a given Url.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | **String** | The type of worker | [optional] [default to String]
**url** | **String** | The URL to check, eg: https://www.google.com/ | [optional] [default to String]

```java
import com.finbourne.workflow.model.HealthCheckResponse;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable String Type = "example Type";
@jakarta.annotation.Nullable String Url = "example Url";


HealthCheckResponse healthCheckResponseInstance = new HealthCheckResponse()
    .Type(Type)
    .Url(Url);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)

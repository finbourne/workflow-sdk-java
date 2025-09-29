# com.finbourne.workflow.model.HealthCheck
Configuration for a Worker that performs a GET against a given Url.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | **String** | The type of worker | [default to String]
**url** | [**URI**](URI.md) | The URL to check, eg: https://www.google.com/ | [default to URI]

```java
import com.finbourne.workflow.model.HealthCheck;
import java.util.*;
import java.lang.System;
import java.net.URI;

String Type = "example Type";
URI Url = URI.create("http://example.com/Url");


HealthCheck healthCheckInstance = new HealthCheck()
    .Type(Type)
    .Url(Url);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)

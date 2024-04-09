# EventHandlersApi

All URIs are relative to *https://fbn-prd.lusid.com/workflow*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createEventHandler**](EventHandlersApi.md#createEventHandler) | **POST** /api/eventhandlers | [EXPERIMENTAL] CreateEventHandler: Create a new Event Handler |


<a id="createEventHandler"></a>
# **createEventHandler**
> EventHandler createEventHandler(createEventHandlerRequest).execute();

[EXPERIMENTAL] CreateEventHandler: Create a new Event Handler

### Example
```java
// Import classes:
import com.finbourne.workflow.ApiClient;
import com.finbourne.workflow.ApiException;
import com.finbourne.workflow.Configuration;
import com.finbourne.workflow.auth.*;
import com.finbourne.workflow.models.*;
import com.finbourne.workflow.api.EventHandlersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://fbn-prd.lusid.com/workflow");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    EventHandlersApi apiInstance = new EventHandlersApi(defaultClient);
    CreateEventHandlerRequest createEventHandlerRequest = new CreateEventHandlerRequest(); // CreateEventHandlerRequest | The data to create an Event Handler
    try {
      EventHandler result = apiInstance.createEventHandler(createEventHandlerRequest)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EventHandlersApi#createEventHandler");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **createEventHandlerRequest** | [**CreateEventHandlerRequest**](CreateEventHandlerRequest.md)| The data to create an Event Handler | |

### Return type

[**EventHandler**](EventHandler.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |


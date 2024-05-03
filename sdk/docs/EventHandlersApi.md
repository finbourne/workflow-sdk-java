# EventHandlersApi

All URIs are relative to *https://fbn-prd.lusid.com/workflow*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createEventHandler**](EventHandlersApi.md#createEventHandler) | **POST** /api/eventhandlers | [EXPERIMENTAL] CreateEventHandler: Create a new Event Handler |
| [**deleteEventHandler**](EventHandlersApi.md#deleteEventHandler) | **DELETE** /api/eventhandlers/{scope}/{code} | [EXPERIMENTAL] DeleteEventHandler: Delete an Event Handler |
| [**getEventHandler**](EventHandlersApi.md#getEventHandler) | **GET** /api/eventhandlers/{scope}/{code} | [EXPERIMENTAL] GetEventHandler: Get an Event Handler |
| [**listEventHandlers**](EventHandlersApi.md#listEventHandlers) | **GET** /api/eventhandlers | [EXPERIMENTAL] ListEventHandlers: List Event Handlers |
| [**updateEventHandler**](EventHandlersApi.md#updateEventHandler) | **PUT** /api/eventhandlers/{scope}/{code} | [EXPERIMENTAL] UpdateEventHandler: Update an existing Task Definition |


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

<a id="deleteEventHandler"></a>
# **deleteEventHandler**
> DeletedEntityResponse deleteEventHandler(scope, code).execute();

[EXPERIMENTAL] DeleteEventHandler: Delete an Event Handler

If the Event Handler does not exist a failure will be returned

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
    String scope = "scope_example"; // String | Scope of the event handler to be deleted
    String code = "code_example"; // String | Code of the event handler to be deleted
    try {
      DeletedEntityResponse result = apiInstance.deleteEventHandler(scope, code)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EventHandlersApi#deleteEventHandler");
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
| **scope** | **String**| Scope of the event handler to be deleted | |
| **code** | **String**| Code of the event handler to be deleted | |

### Return type

[**DeletedEntityResponse**](DeletedEntityResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | The details of the input related failure |  -  |
| **404** | Event Handler not found. |  -  |
| **0** | Error response |  -  |

<a id="getEventHandler"></a>
# **getEventHandler**
> EventHandler getEventHandler(scope, code).asAt(asAt).execute();

[EXPERIMENTAL] GetEventHandler: Get an Event Handler

Will return a NotFound failure if the event handler does not exist

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
    String scope = "scope_example"; // String | Scope of the event handler
    String code = "code_example"; // String | Code of the event handler
    OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | The asAt datetime at which to retrieve the event handler. Defaults to returning the latest version of the event handler if not specified.
    try {
      EventHandler result = apiInstance.getEventHandler(scope, code)
            .asAt(asAt)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EventHandlersApi#getEventHandler");
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
| **scope** | **String**| Scope of the event handler | |
| **code** | **String**| Code of the event handler | |
| **asAt** | **OffsetDateTime**| The asAt datetime at which to retrieve the event handler. Defaults to returning the latest version of the event handler if not specified. | [optional] |

### Return type

[**EventHandler**](EventHandler.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

<a id="listEventHandlers"></a>
# **listEventHandlers**
> PagedResourceListOfEventHandler listEventHandlers().asAt(asAt).filter(filter).limit(limit).page(page).execute();

[EXPERIMENTAL] ListEventHandlers: List Event Handlers

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
    OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | The asAt datetime at which to list the Event Handlers. Defaults to return the latest version of each Event Handler if not specified.
    String filter = "filter_example"; // String | Expression to filter the result set. Read more about filtering results from LUSID here: https://support.lusid.com/filtering-results-from-lusid.
    Integer limit = 10; // Integer | When paginating, limit the number of returned results to this many.
    String page = "page_example"; // String | The pagination token to use to continue listing event handlers from a previous call to list event handlers. This value is returned from the previous call. If a pagination token is provided the sortBy, filter, effectiveAt, and asAt fields must not have changed since the original request.
    try {
      PagedResourceListOfEventHandler result = apiInstance.listEventHandlers()
            .asAt(asAt)
            .filter(filter)
            .limit(limit)
            .page(page)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EventHandlersApi#listEventHandlers");
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
| **asAt** | **OffsetDateTime**| The asAt datetime at which to list the Event Handlers. Defaults to return the latest version of each Event Handler if not specified. | [optional] |
| **filter** | **String**| Expression to filter the result set. Read more about filtering results from LUSID here: https://support.lusid.com/filtering-results-from-lusid. | [optional] |
| **limit** | **Integer**| When paginating, limit the number of returned results to this many. | [optional] [default to 10] |
| **page** | **String**| The pagination token to use to continue listing event handlers from a previous call to list event handlers. This value is returned from the previous call. If a pagination token is provided the sortBy, filter, effectiveAt, and asAt fields must not have changed since the original request. | [optional] |

### Return type

[**PagedResourceListOfEventHandler**](PagedResourceListOfEventHandler.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List of Event Handlers |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

<a id="updateEventHandler"></a>
# **updateEventHandler**
> EventHandler updateEventHandler(scope, code, updateEventHandlerRequest).execute();

[EXPERIMENTAL] UpdateEventHandler: Update an existing Task Definition

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
    String scope = "scope_example"; // String | The scope that identifies a Task Definition
    String code = "code_example"; // String | The code that identifies a Task Definition
    UpdateEventHandlerRequest updateEventHandlerRequest = new UpdateEventHandlerRequest(); // UpdateEventHandlerRequest | The data to update a Task Definition
    try {
      EventHandler result = apiInstance.updateEventHandler(scope, code, updateEventHandlerRequest)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EventHandlersApi#updateEventHandler");
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
| **scope** | **String**| The scope that identifies a Task Definition | |
| **code** | **String**| The code that identifies a Task Definition | |
| **updateEventHandlerRequest** | [**UpdateEventHandlerRequest**](UpdateEventHandlerRequest.md)| The data to update a Task Definition | |

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
| **200** | Success |  -  |
| **400** | The details of the input related failure |  -  |
| **404** | Task Definition not found. |  -  |
| **0** | Error response |  -  |


# EventHandlersApi

All URIs are relative to *https://fbn-prd.lusid.com/workflow*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createEventHandler**](EventHandlersApi.md#createEventHandler) | **POST** /api/eventhandlers | CreateEventHandler: Create a new Event Handler |
| [**deleteEventHandler**](EventHandlersApi.md#deleteEventHandler) | **DELETE** /api/eventhandlers/{scope}/{code} | DeleteEventHandler: Delete an Event Handler |
| [**getEventHandler**](EventHandlersApi.md#getEventHandler) | **GET** /api/eventhandlers/{scope}/{code} | GetEventHandler: Get an Event Handler |
| [**listEventHandlers**](EventHandlersApi.md#listEventHandlers) | **GET** /api/eventhandlers | ListEventHandlers: List Event Handlers |
| [**updateEventHandler**](EventHandlersApi.md#updateEventHandler) | **PUT** /api/eventhandlers/{scope}/{code} | UpdateEventHandler: Update an existing Event handler |



## createEventHandler

> EventHandler createEventHandler(createEventHandlerRequest)

CreateEventHandler: Create a new Event Handler

### Example

```java
import com.finbourne.workflow.model.*;
import com.finbourne.workflow.api.EventHandlersApi;
import com.finbourne.workflow.extensions.ApiConfigurationException;
import com.finbourne.workflow.extensions.ApiFactoryBuilder;
import com.finbourne.workflow.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class EventHandlersApiExample {

    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException, ApiConfigurationException, FinbourneTokenException {
        String fileName = "secrets.json";
        try(PrintWriter writer = new PrintWriter(fileName, "UTF-8")) {
          writer.write("{" +
            "\"api\": {" +
            "    \"tokenUrl\": \"<your-token-url>\"," +
            "    \"workflowUrl\": \"https://<your-domain>.lusid.com/workflow\"," +
            "    \"username\": \"<your-username>\"," +
            "    \"password\": \"<your-password>\"," +
            "    \"clientId\": \"<your-client-id>\"," +
            "    \"clientSecret\": \"<your-client-secret>\"" +
            "  }" +
            "}");
        }

        // uncomment the below to use configuration overrides
        // ConfigurationOptions opts = new ConfigurationOptions();
        // opts.setTotalTimeoutMs(2000);
        
        // uncomment the below to use an api factory with overrides
        // ApiFactory apiFactory = ApiFactoryBuilder.build(fileName, opts);
        // EventHandlersApi apiInstance = apiFactory.build(EventHandlersApi.class);

        EventHandlersApi apiInstance = ApiFactoryBuilder.build(fileName).build(EventHandlersApi.class);
        CreateEventHandlerRequest createEventHandlerRequest = new CreateEventHandlerRequest(); // CreateEventHandlerRequest | The data to create an Event Handler
        try {
            // uncomment the below to set overrides at the request level
            // EventHandler result = apiInstance.createEventHandler(createEventHandlerRequest).execute(opts);

            EventHandler result = apiInstance.createEventHandler(createEventHandlerRequest).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling EventHandlersApi#createEventHandler");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
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

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## deleteEventHandler

> DeletedEntityResponse deleteEventHandler(scope, code)

DeleteEventHandler: Delete an Event Handler

If the Event Handler does not exist a failure will be returned

### Example

```java
import com.finbourne.workflow.model.*;
import com.finbourne.workflow.api.EventHandlersApi;
import com.finbourne.workflow.extensions.ApiConfigurationException;
import com.finbourne.workflow.extensions.ApiFactoryBuilder;
import com.finbourne.workflow.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class EventHandlersApiExample {

    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException, ApiConfigurationException, FinbourneTokenException {
        String fileName = "secrets.json";
        try(PrintWriter writer = new PrintWriter(fileName, "UTF-8")) {
          writer.write("{" +
            "\"api\": {" +
            "    \"tokenUrl\": \"<your-token-url>\"," +
            "    \"workflowUrl\": \"https://<your-domain>.lusid.com/workflow\"," +
            "    \"username\": \"<your-username>\"," +
            "    \"password\": \"<your-password>\"," +
            "    \"clientId\": \"<your-client-id>\"," +
            "    \"clientSecret\": \"<your-client-secret>\"" +
            "  }" +
            "}");
        }

        // uncomment the below to use configuration overrides
        // ConfigurationOptions opts = new ConfigurationOptions();
        // opts.setTotalTimeoutMs(2000);
        
        // uncomment the below to use an api factory with overrides
        // ApiFactory apiFactory = ApiFactoryBuilder.build(fileName, opts);
        // EventHandlersApi apiInstance = apiFactory.build(EventHandlersApi.class);

        EventHandlersApi apiInstance = ApiFactoryBuilder.build(fileName).build(EventHandlersApi.class);
        String scope = "scope_example"; // String | Scope of the event handler to be deleted
        String code = "code_example"; // String | Code of the event handler to be deleted
        try {
            // uncomment the below to set overrides at the request level
            // DeletedEntityResponse result = apiInstance.deleteEventHandler(scope, code).execute(opts);

            DeletedEntityResponse result = apiInstance.deleteEventHandler(scope, code).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling EventHandlersApi#deleteEventHandler");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
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

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | The details of the input related failure |  -  |
| **404** | Event Handler not found. |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## getEventHandler

> EventHandler getEventHandler(scope, code, asAt)

GetEventHandler: Get an Event Handler

Will return a NotFound failure if the event handler does not exist

### Example

```java
import com.finbourne.workflow.model.*;
import com.finbourne.workflow.api.EventHandlersApi;
import com.finbourne.workflow.extensions.ApiConfigurationException;
import com.finbourne.workflow.extensions.ApiFactoryBuilder;
import com.finbourne.workflow.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class EventHandlersApiExample {

    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException, ApiConfigurationException, FinbourneTokenException {
        String fileName = "secrets.json";
        try(PrintWriter writer = new PrintWriter(fileName, "UTF-8")) {
          writer.write("{" +
            "\"api\": {" +
            "    \"tokenUrl\": \"<your-token-url>\"," +
            "    \"workflowUrl\": \"https://<your-domain>.lusid.com/workflow\"," +
            "    \"username\": \"<your-username>\"," +
            "    \"password\": \"<your-password>\"," +
            "    \"clientId\": \"<your-client-id>\"," +
            "    \"clientSecret\": \"<your-client-secret>\"" +
            "  }" +
            "}");
        }

        // uncomment the below to use configuration overrides
        // ConfigurationOptions opts = new ConfigurationOptions();
        // opts.setTotalTimeoutMs(2000);
        
        // uncomment the below to use an api factory with overrides
        // ApiFactory apiFactory = ApiFactoryBuilder.build(fileName, opts);
        // EventHandlersApi apiInstance = apiFactory.build(EventHandlersApi.class);

        EventHandlersApi apiInstance = ApiFactoryBuilder.build(fileName).build(EventHandlersApi.class);
        String scope = "scope_example"; // String | Scope of the event handler
        String code = "code_example"; // String | Code of the event handler
        OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | The asAt datetime at which to retrieve the event handler. Defaults to returning the latest version of the event handler if not specified.
        try {
            // uncomment the below to set overrides at the request level
            // EventHandler result = apiInstance.getEventHandler(scope, code, asAt).execute(opts);

            EventHandler result = apiInstance.getEventHandler(scope, code, asAt).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling EventHandlersApi#getEventHandler");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
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

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## listEventHandlers

> PagedResourceListOfEventHandler listEventHandlers(asAt, filter, limit, page)

ListEventHandlers: List Event Handlers

### Example

```java
import com.finbourne.workflow.model.*;
import com.finbourne.workflow.api.EventHandlersApi;
import com.finbourne.workflow.extensions.ApiConfigurationException;
import com.finbourne.workflow.extensions.ApiFactoryBuilder;
import com.finbourne.workflow.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class EventHandlersApiExample {

    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException, ApiConfigurationException, FinbourneTokenException {
        String fileName = "secrets.json";
        try(PrintWriter writer = new PrintWriter(fileName, "UTF-8")) {
          writer.write("{" +
            "\"api\": {" +
            "    \"tokenUrl\": \"<your-token-url>\"," +
            "    \"workflowUrl\": \"https://<your-domain>.lusid.com/workflow\"," +
            "    \"username\": \"<your-username>\"," +
            "    \"password\": \"<your-password>\"," +
            "    \"clientId\": \"<your-client-id>\"," +
            "    \"clientSecret\": \"<your-client-secret>\"" +
            "  }" +
            "}");
        }

        // uncomment the below to use configuration overrides
        // ConfigurationOptions opts = new ConfigurationOptions();
        // opts.setTotalTimeoutMs(2000);
        
        // uncomment the below to use an api factory with overrides
        // ApiFactory apiFactory = ApiFactoryBuilder.build(fileName, opts);
        // EventHandlersApi apiInstance = apiFactory.build(EventHandlersApi.class);

        EventHandlersApi apiInstance = ApiFactoryBuilder.build(fileName).build(EventHandlersApi.class);
        OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | The asAt datetime at which to list the Event Handlers. Defaults to return the latest version of each Event Handler if not specified.
        String filter = "filter_example"; // String | Expression to filter the result set. Read more about filtering results from LUSID here: https://support.lusid.com/filtering-results-from-lusid.
        Integer limit = 10; // Integer | When paginating, limit the number of returned results to this many.
        String page = "page_example"; // String | The pagination token to use to continue listing event handlers from a previous call to list event handlers. This value is returned from the previous call. If a pagination token is provided the sortBy, filter, effectiveAt, and asAt fields must not have changed since the original request.
        try {
            // uncomment the below to set overrides at the request level
            // PagedResourceListOfEventHandler result = apiInstance.listEventHandlers(asAt, filter, limit, page).execute(opts);

            PagedResourceListOfEventHandler result = apiInstance.listEventHandlers(asAt, filter, limit, page).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling EventHandlersApi#listEventHandlers");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
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

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List of Event Handlers |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## updateEventHandler

> EventHandler updateEventHandler(scope, code, updateEventHandlerRequest)

UpdateEventHandler: Update an existing Event handler

### Example

```java
import com.finbourne.workflow.model.*;
import com.finbourne.workflow.api.EventHandlersApi;
import com.finbourne.workflow.extensions.ApiConfigurationException;
import com.finbourne.workflow.extensions.ApiFactoryBuilder;
import com.finbourne.workflow.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class EventHandlersApiExample {

    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException, ApiConfigurationException, FinbourneTokenException {
        String fileName = "secrets.json";
        try(PrintWriter writer = new PrintWriter(fileName, "UTF-8")) {
          writer.write("{" +
            "\"api\": {" +
            "    \"tokenUrl\": \"<your-token-url>\"," +
            "    \"workflowUrl\": \"https://<your-domain>.lusid.com/workflow\"," +
            "    \"username\": \"<your-username>\"," +
            "    \"password\": \"<your-password>\"," +
            "    \"clientId\": \"<your-client-id>\"," +
            "    \"clientSecret\": \"<your-client-secret>\"" +
            "  }" +
            "}");
        }

        // uncomment the below to use configuration overrides
        // ConfigurationOptions opts = new ConfigurationOptions();
        // opts.setTotalTimeoutMs(2000);
        
        // uncomment the below to use an api factory with overrides
        // ApiFactory apiFactory = ApiFactoryBuilder.build(fileName, opts);
        // EventHandlersApi apiInstance = apiFactory.build(EventHandlersApi.class);

        EventHandlersApi apiInstance = ApiFactoryBuilder.build(fileName).build(EventHandlersApi.class);
        String scope = "scope_example"; // String | The scope that identifies an Event Handler
        String code = "code_example"; // String | The code that identifies an Event Handler
        UpdateEventHandlerRequest updateEventHandlerRequest = new UpdateEventHandlerRequest(); // UpdateEventHandlerRequest | The data to update an Event Handler
        try {
            // uncomment the below to set overrides at the request level
            // EventHandler result = apiInstance.updateEventHandler(scope, code, updateEventHandlerRequest).execute(opts);

            EventHandler result = apiInstance.updateEventHandler(scope, code, updateEventHandlerRequest).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling EventHandlersApi#updateEventHandler");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **scope** | **String**| The scope that identifies an Event Handler | |
| **code** | **String**| The code that identifies an Event Handler | |
| **updateEventHandlerRequest** | [**UpdateEventHandlerRequest**](UpdateEventHandlerRequest.md)| The data to update an Event Handler | |

### Return type

[**EventHandler**](EventHandler.md)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | The details of the input related failure |  -  |
| **404** | Event Handler not found. |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


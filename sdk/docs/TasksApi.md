# TasksApi

All URIs are relative to *https://fbn-prd.lusid.com/workflow*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createTask**](TasksApi.md#createTask) | **POST** /api/tasks | [EXPERIMENTAL] CreateTask: Create a new Task |
| [**deleteTask**](TasksApi.md#deleteTask) | **DELETE** /api/tasks/{id} | [EXPERIMENTAL] DeleteTask: Delete a Task |
| [**getTask**](TasksApi.md#getTask) | **GET** /api/tasks/{id} | [EXPERIMENTAL] GetTask: Get a Task |
| [**listTasks**](TasksApi.md#listTasks) | **GET** /api/tasks | [EXPERIMENTAL] ListTasks: List Tasks |
| [**updateTask**](TasksApi.md#updateTask) | **POST** /api/tasks/{id} | [EXPERIMENTAL] UpdateTask: Update a Task |


<a id="createTask"></a>
# **createTask**
> Task createTask(createTaskRequest).trigger(trigger).execute();

[EXPERIMENTAL] CreateTask: Create a new Task

### Example
```java
// Import classes:
import com.finbourne.workflow.ApiClient;
import com.finbourne.workflow.ApiException;
import com.finbourne.workflow.Configuration;
import com.finbourne.workflow.auth.*;
import com.finbourne.workflow.models.*;
import com.finbourne.workflow.api.TasksApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://fbn-prd.lusid.com/workflow");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    TasksApi apiInstance = new TasksApi(defaultClient);
    CreateTaskRequest createTaskRequest = new CreateTaskRequest(); // CreateTaskRequest | Request to create Task
    String trigger = "trigger_example"; // String | The name of the Trigger to invoke
    try {
      Task result = apiInstance.createTask(createTaskRequest)
            .trigger(trigger)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TasksApi#createTask");
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
| **createTaskRequest** | [**CreateTaskRequest**](CreateTaskRequest.md)| Request to create Task | |
| **trigger** | **String**| The name of the Trigger to invoke | [optional] |

### Return type

[**Task**](Task.md)

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

<a id="deleteTask"></a>
# **deleteTask**
> DeletedEntityResponse deleteTask(id).execute();

[EXPERIMENTAL] DeleteTask: Delete a Task

### Example
```java
// Import classes:
import com.finbourne.workflow.ApiClient;
import com.finbourne.workflow.ApiException;
import com.finbourne.workflow.Configuration;
import com.finbourne.workflow.auth.*;
import com.finbourne.workflow.models.*;
import com.finbourne.workflow.api.TasksApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://fbn-prd.lusid.com/workflow");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    TasksApi apiInstance = new TasksApi(defaultClient);
    String id = "id_example"; // String | The identifier for the Task to be deleted.
    try {
      DeletedEntityResponse result = apiInstance.deleteTask(id)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TasksApi#deleteTask");
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
| **id** | **String**| The identifier for the Task to be deleted. | |

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
| **404** | Task not found. |  -  |
| **0** | Error response |  -  |

<a id="getTask"></a>
# **getTask**
> Task getTask(id).asAt(asAt).execute();

[EXPERIMENTAL] GetTask: Get a Task

### Example
```java
// Import classes:
import com.finbourne.workflow.ApiClient;
import com.finbourne.workflow.ApiException;
import com.finbourne.workflow.Configuration;
import com.finbourne.workflow.auth.*;
import com.finbourne.workflow.models.*;
import com.finbourne.workflow.api.TasksApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://fbn-prd.lusid.com/workflow");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    TasksApi apiInstance = new TasksApi(defaultClient);
    String id = "id_example"; // String | Id of the Task to retrieve
    OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | The asAt datetime at which to retrieve the Task. Defaults to returning the latest version of the Task if not specified.
    try {
      Task result = apiInstance.getTask(id)
            .asAt(asAt)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TasksApi#getTask");
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
| **id** | **String**| Id of the Task to retrieve | |
| **asAt** | **OffsetDateTime**| The asAt datetime at which to retrieve the Task. Defaults to returning the latest version of the Task if not specified. | [optional] |

### Return type

[**Task**](Task.md)

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
| **404** | Task not found. |  -  |
| **0** | Error response |  -  |

<a id="listTasks"></a>
# **listTasks**
> PagedResourceListOfTask listTasks().asAt(asAt).filter(filter).sortBy(sortBy).limit(limit).page(page).execute();

[EXPERIMENTAL] ListTasks: List Tasks

### Example
```java
// Import classes:
import com.finbourne.workflow.ApiClient;
import com.finbourne.workflow.ApiException;
import com.finbourne.workflow.Configuration;
import com.finbourne.workflow.auth.*;
import com.finbourne.workflow.models.*;
import com.finbourne.workflow.api.TasksApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://fbn-prd.lusid.com/workflow");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    TasksApi apiInstance = new TasksApi(defaultClient);
    OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | The asAt datetime at which to list the Tasks. Defaults to return the latest version of each Task if not specified.
    String filter = "filter_example"; // String | Expression to filter the result set. Read more about filtering results from LUSID here: https://support.lusid.com/filtering-results-from-lusid.
    List<String> sortBy = Arrays.asList(); // List<String> | A list of field names or properties to sort by, each optionally suffixed by \" ASC\" or \" DESC\"
    Integer limit = 10; // Integer | When paginating, limit the number of returned results to this many.
    String page = "page_example"; // String | The pagination token to use to continue listing tasks from a previous call to list tasks. This value is returned from the previous call. If a pagination token is provided the sortBy, filter, effectiveAt, and asAt fields must not have changed since the original request.
    try {
      PagedResourceListOfTask result = apiInstance.listTasks()
            .asAt(asAt)
            .filter(filter)
            .sortBy(sortBy)
            .limit(limit)
            .page(page)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TasksApi#listTasks");
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
| **asAt** | **OffsetDateTime**| The asAt datetime at which to list the Tasks. Defaults to return the latest version of each Task if not specified. | [optional] |
| **filter** | **String**| Expression to filter the result set. Read more about filtering results from LUSID here: https://support.lusid.com/filtering-results-from-lusid. | [optional] |
| **sortBy** | [**List&lt;String&gt;**](String.md)| A list of field names or properties to sort by, each optionally suffixed by \&quot; ASC\&quot; or \&quot; DESC\&quot; | [optional] |
| **limit** | **Integer**| When paginating, limit the number of returned results to this many. | [optional] [default to 10] |
| **page** | **String**| The pagination token to use to continue listing tasks from a previous call to list tasks. This value is returned from the previous call. If a pagination token is provided the sortBy, filter, effectiveAt, and asAt fields must not have changed since the original request. | [optional] |

### Return type

[**PagedResourceListOfTask**](PagedResourceListOfTask.md)

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
| **404** | No Tasks found. |  -  |
| **0** | Error response |  -  |

<a id="updateTask"></a>
# **updateTask**
> Task updateTask(id).trigger(trigger).updateTaskRequest(updateTaskRequest).execute();

[EXPERIMENTAL] UpdateTask: Update a Task

### Example
```java
// Import classes:
import com.finbourne.workflow.ApiClient;
import com.finbourne.workflow.ApiException;
import com.finbourne.workflow.Configuration;
import com.finbourne.workflow.auth.*;
import com.finbourne.workflow.models.*;
import com.finbourne.workflow.api.TasksApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://fbn-prd.lusid.com/workflow");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    TasksApi apiInstance = new TasksApi(defaultClient);
    String id = "id_example"; // String | Id of the Task to act upon
    String trigger = "trigger_example"; // String | 
    UpdateTaskRequest updateTaskRequest = new UpdateTaskRequest(); // UpdateTaskRequest | The details of the request
    try {
      Task result = apiInstance.updateTask(id)
            .trigger(trigger)
            .updateTaskRequest(updateTaskRequest)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TasksApi#updateTask");
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
| **id** | **String**| Id of the Task to act upon | |
| **trigger** | **String**|  | [optional] |
| **updateTaskRequest** | [**UpdateTaskRequest**](UpdateTaskRequest.md)| The details of the request | [optional] |

### Return type

[**Task**](Task.md)

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
| **404** | Task not found. |  -  |
| **0** | Error response |  -  |


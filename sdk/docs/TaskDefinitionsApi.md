# TaskDefinitionsApi

All URIs are relative to *https://fbn-prd.lusid.com/workflow*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createTaskDefinition**](TaskDefinitionsApi.md#createTaskDefinition) | **POST** /api/taskdefinitions | [EXPERIMENTAL] CreateTaskDefinition: Create a new Task Definition |
| [**deleteTaskDefinition**](TaskDefinitionsApi.md#deleteTaskDefinition) | **DELETE** /api/taskdefinitions/{scope}/{code} | [EXPERIMENTAL] DeleteTaskDefinition: Delete a Task Definition |
| [**getTaskDefinition**](TaskDefinitionsApi.md#getTaskDefinition) | **GET** /api/taskdefinitions/{scope}/{code} | [EXPERIMENTAL] GetTaskDefinition: Get a Task Definition |
| [**listTaskDefinitions**](TaskDefinitionsApi.md#listTaskDefinitions) | **GET** /api/taskdefinitions | [EXPERIMENTAL] ListTaskDefinitions: List Task Definitions |
| [**listTasksForTaskDefinition**](TaskDefinitionsApi.md#listTasksForTaskDefinition) | **GET** /api/taskdefinitions/{scope}/{code}/tasks | [EXPERIMENTAL] ListTasksForTaskDefinition: List Tasks for a Task Definition |
| [**updateTaskDefinition**](TaskDefinitionsApi.md#updateTaskDefinition) | **PUT** /api/taskdefinitions/{scope}/{code} | [EXPERIMENTAL] UpdateTaskDefinition: Update an existing Task Definition |


<a id="createTaskDefinition"></a>
# **createTaskDefinition**
> TaskDefinition createTaskDefinition(createTaskDefinitionRequest).execute();

[EXPERIMENTAL] CreateTaskDefinition: Create a new Task Definition

### Example
```java
// Import classes:
import com.finbourne.workflow.ApiClient;
import com.finbourne.workflow.ApiException;
import com.finbourne.workflow.Configuration;
import com.finbourne.workflow.auth.*;
import com.finbourne.workflow.models.*;
import com.finbourne.workflow.api.TaskDefinitionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://fbn-prd.lusid.com/workflow");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    TaskDefinitionsApi apiInstance = new TaskDefinitionsApi(defaultClient);
    CreateTaskDefinitionRequest createTaskDefinitionRequest = new CreateTaskDefinitionRequest(); // CreateTaskDefinitionRequest | The data to create a Task Definition
    try {
      TaskDefinition result = apiInstance.createTaskDefinition(createTaskDefinitionRequest)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TaskDefinitionsApi#createTaskDefinition");
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
| **createTaskDefinitionRequest** | [**CreateTaskDefinitionRequest**](CreateTaskDefinitionRequest.md)| The data to create a Task Definition | |

### Return type

[**TaskDefinition**](TaskDefinition.md)

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

<a id="deleteTaskDefinition"></a>
# **deleteTaskDefinition**
> DeletedEntityResponse deleteTaskDefinition(scope, code).execute();

[EXPERIMENTAL] DeleteTaskDefinition: Delete a Task Definition

### Example
```java
// Import classes:
import com.finbourne.workflow.ApiClient;
import com.finbourne.workflow.ApiException;
import com.finbourne.workflow.Configuration;
import com.finbourne.workflow.auth.*;
import com.finbourne.workflow.models.*;
import com.finbourne.workflow.api.TaskDefinitionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://fbn-prd.lusid.com/workflow");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    TaskDefinitionsApi apiInstance = new TaskDefinitionsApi(defaultClient);
    String scope = "scope_example"; // String | The scope that identifies a Task Definition
    String code = "code_example"; // String | The code that identifies a Task Definition
    try {
      DeletedEntityResponse result = apiInstance.deleteTaskDefinition(scope, code)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TaskDefinitionsApi#deleteTaskDefinition");
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
| **404** | Task Definition not found. |  -  |
| **0** | Error response |  -  |

<a id="getTaskDefinition"></a>
# **getTaskDefinition**
> TaskDefinition getTaskDefinition(scope, code).asAt(asAt).execute();

[EXPERIMENTAL] GetTaskDefinition: Get a Task Definition

### Example
```java
// Import classes:
import com.finbourne.workflow.ApiClient;
import com.finbourne.workflow.ApiException;
import com.finbourne.workflow.Configuration;
import com.finbourne.workflow.auth.*;
import com.finbourne.workflow.models.*;
import com.finbourne.workflow.api.TaskDefinitionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://fbn-prd.lusid.com/workflow");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    TaskDefinitionsApi apiInstance = new TaskDefinitionsApi(defaultClient);
    String scope = "scope_example"; // String | The scope that identifies a Task Definition
    String code = "code_example"; // String | The code that identifies a Task Definition
    OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | The asAt datetime at which to retrieve the Task Definition. Defaults to returning the latest version of the Task Definition if not specified.
    try {
      TaskDefinition result = apiInstance.getTaskDefinition(scope, code)
            .asAt(asAt)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TaskDefinitionsApi#getTaskDefinition");
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
| **asAt** | **OffsetDateTime**| The asAt datetime at which to retrieve the Task Definition. Defaults to returning the latest version of the Task Definition if not specified. | [optional] |

### Return type

[**TaskDefinition**](TaskDefinition.md)

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
| **404** | Task Definition not found. |  -  |
| **0** | Error response |  -  |

<a id="listTaskDefinitions"></a>
# **listTaskDefinitions**
> PagedResourceListOfTaskDefinition listTaskDefinitions().asAt(asAt).filter(filter).sortBy(sortBy).limit(limit).page(page).execute();

[EXPERIMENTAL] ListTaskDefinitions: List Task Definitions

### Example
```java
// Import classes:
import com.finbourne.workflow.ApiClient;
import com.finbourne.workflow.ApiException;
import com.finbourne.workflow.Configuration;
import com.finbourne.workflow.auth.*;
import com.finbourne.workflow.models.*;
import com.finbourne.workflow.api.TaskDefinitionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://fbn-prd.lusid.com/workflow");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    TaskDefinitionsApi apiInstance = new TaskDefinitionsApi(defaultClient);
    OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | The asAt datetime at which to list the Task Definitions. Defaults to return the latest version of each Task Definition if not specified.
    String filter = "filter_example"; // String | Expression to filter the result set. Read more about filtering results from LUSID here: https://support.lusid.com/filtering-results-from-lusid.
    List<String> sortBy = Arrays.asList(); // List<String> | A list of field names or properties to sort by, each suffixed by \" ASC\" or \" DESC\"
    Integer limit = 10; // Integer | When paginating, limit the number of returned results to this many.
    String page = "page_example"; // String | The pagination token to use to continue listing task definitions from a previous call to list task definitions. This value is returned from the previous call. If a pagination token is provided the sortBy, filter, effectiveAt, and asAt fields must not have changed since the original request.
    try {
      PagedResourceListOfTaskDefinition result = apiInstance.listTaskDefinitions()
            .asAt(asAt)
            .filter(filter)
            .sortBy(sortBy)
            .limit(limit)
            .page(page)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TaskDefinitionsApi#listTaskDefinitions");
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
| **asAt** | **OffsetDateTime**| The asAt datetime at which to list the Task Definitions. Defaults to return the latest version of each Task Definition if not specified. | [optional] |
| **filter** | **String**| Expression to filter the result set. Read more about filtering results from LUSID here: https://support.lusid.com/filtering-results-from-lusid. | [optional] |
| **sortBy** | [**List&lt;String&gt;**](String.md)| A list of field names or properties to sort by, each suffixed by \&quot; ASC\&quot; or \&quot; DESC\&quot; | [optional] |
| **limit** | **Integer**| When paginating, limit the number of returned results to this many. | [optional] [default to 10] |
| **page** | **String**| The pagination token to use to continue listing task definitions from a previous call to list task definitions. This value is returned from the previous call. If a pagination token is provided the sortBy, filter, effectiveAt, and asAt fields must not have changed since the original request. | [optional] |

### Return type

[**PagedResourceListOfTaskDefinition**](PagedResourceListOfTaskDefinition.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List of Task Definitions |  -  |
| **400** | The details of the input related failure |  -  |
| **404** | No Task Definitions found. |  -  |
| **0** | Error response |  -  |

<a id="listTasksForTaskDefinition"></a>
# **listTasksForTaskDefinition**
> ResourceListOfTask listTasksForTaskDefinition(scope, code).asAt(asAt).execute();

[EXPERIMENTAL] ListTasksForTaskDefinition: List Tasks for a Task Definition

### Example
```java
// Import classes:
import com.finbourne.workflow.ApiClient;
import com.finbourne.workflow.ApiException;
import com.finbourne.workflow.Configuration;
import com.finbourne.workflow.auth.*;
import com.finbourne.workflow.models.*;
import com.finbourne.workflow.api.TaskDefinitionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://fbn-prd.lusid.com/workflow");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    TaskDefinitionsApi apiInstance = new TaskDefinitionsApi(defaultClient);
    String scope = "scope_example"; // String | The scope that identifies a Task Definition
    String code = "code_example"; // String | The code that identifies a Task Definition
    OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | The asAt datetime at which to list the Tasks. Defaults to return the latest version of each Task if not specified.
    try {
      ResourceListOfTask result = apiInstance.listTasksForTaskDefinition(scope, code)
            .asAt(asAt)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TaskDefinitionsApi#listTasksForTaskDefinition");
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
| **asAt** | **OffsetDateTime**| The asAt datetime at which to list the Tasks. Defaults to return the latest version of each Task if not specified. | [optional] |

### Return type

[**ResourceListOfTask**](ResourceListOfTask.md)

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
| **404** | No tasks found for this Task Definition. |  -  |
| **0** | Error response |  -  |

<a id="updateTaskDefinition"></a>
# **updateTaskDefinition**
> TaskDefinition updateTaskDefinition(scope, code, updateTaskDefinitionRequest).execute();

[EXPERIMENTAL] UpdateTaskDefinition: Update an existing Task Definition

### Example
```java
// Import classes:
import com.finbourne.workflow.ApiClient;
import com.finbourne.workflow.ApiException;
import com.finbourne.workflow.Configuration;
import com.finbourne.workflow.auth.*;
import com.finbourne.workflow.models.*;
import com.finbourne.workflow.api.TaskDefinitionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://fbn-prd.lusid.com/workflow");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    TaskDefinitionsApi apiInstance = new TaskDefinitionsApi(defaultClient);
    String scope = "scope_example"; // String | The scope that identifies a Task Definition
    String code = "code_example"; // String | The code that identifies a Task Definition
    UpdateTaskDefinitionRequest updateTaskDefinitionRequest = new UpdateTaskDefinitionRequest(); // UpdateTaskDefinitionRequest | The data to update a Task Definition
    try {
      TaskDefinition result = apiInstance.updateTaskDefinition(scope, code, updateTaskDefinitionRequest)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TaskDefinitionsApi#updateTaskDefinition");
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
| **updateTaskDefinitionRequest** | [**UpdateTaskDefinitionRequest**](UpdateTaskDefinitionRequest.md)| The data to update a Task Definition | |

### Return type

[**TaskDefinition**](TaskDefinition.md)

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


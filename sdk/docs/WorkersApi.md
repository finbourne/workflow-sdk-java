# WorkersApi

All URIs are relative to *https://fbn-prd.lusid.com/workflow*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createWorker**](WorkersApi.md#createWorker) | **POST** /api/workers | [EXPERIMENTAL] CreateWorker: Create a new Worker |
| [**deleteWorker**](WorkersApi.md#deleteWorker) | **DELETE** /api/workers/{scope}/{code} | [EXPERIMENTAL] DeleteWorker: Delete a Worker |
| [**getWorker**](WorkersApi.md#getWorker) | **GET** /api/workers/{scope}/{code} | [EXPERIMENTAL] GetWorker: Get a Worker |
| [**getWorkerResult**](WorkersApi.md#getWorkerResult) | **GET** /api/workers/{runId}/$result | [EXPERIMENTAL] GetWorkerResult: Get the status of a specific run of a worker with any relevant results |
| [**listWorkers**](WorkersApi.md#listWorkers) | **GET** /api/workers | [EXPERIMENTAL] ListWorkers: List Workers |
| [**runWorker**](WorkersApi.md#runWorker) | **POST** /api/workers/{scope}/{code}/$run | [EXPERIMENTAL] RunWorker: Run a Worker |
| [**updateWorker**](WorkersApi.md#updateWorker) | **PUT** /api/workers/{scope}/{code} | [EXPERIMENTAL] UpdateWorker: Update a Worker |


<a id="createWorker"></a>
# **createWorker**
> Worker createWorker(createWorkerRequest).execute();

[EXPERIMENTAL] CreateWorker: Create a new Worker

If the Worker already exists a failure will be returned

### Example
```java
// Import classes:
import com.finbourne.workflow.ApiClient;
import com.finbourne.workflow.ApiException;
import com.finbourne.workflow.Configuration;
import com.finbourne.workflow.auth.*;
import com.finbourne.workflow.models.*;
import com.finbourne.workflow.api.WorkersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://fbn-prd.lusid.com/workflow");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    WorkersApi apiInstance = new WorkersApi(defaultClient);
    CreateWorkerRequest createWorkerRequest = new CreateWorkerRequest(); // CreateWorkerRequest | Worker to be created
    try {
      Worker result = apiInstance.createWorker(createWorkerRequest)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkersApi#createWorker");
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
| **createWorkerRequest** | [**CreateWorkerRequest**](CreateWorkerRequest.md)| Worker to be created | |

### Return type

[**Worker**](Worker.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

<a id="deleteWorker"></a>
# **deleteWorker**
> DeletedEntityResponse deleteWorker(scope, code).execute();

[EXPERIMENTAL] DeleteWorker: Delete a Worker

If the Worker does not exist a failure will be returned

### Example
```java
// Import classes:
import com.finbourne.workflow.ApiClient;
import com.finbourne.workflow.ApiException;
import com.finbourne.workflow.Configuration;
import com.finbourne.workflow.auth.*;
import com.finbourne.workflow.models.*;
import com.finbourne.workflow.api.WorkersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://fbn-prd.lusid.com/workflow");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    WorkersApi apiInstance = new WorkersApi(defaultClient);
    String scope = "scope_example"; // String | Scope of the worker to be deleted
    String code = "code_example"; // String | Code of the worker to be deleted
    try {
      DeletedEntityResponse result = apiInstance.deleteWorker(scope, code)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkersApi#deleteWorker");
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
| **scope** | **String**| Scope of the worker to be deleted | |
| **code** | **String**| Code of the worker to be deleted | |

### Return type

[**DeletedEntityResponse**](DeletedEntityResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | The details of the input related failure |  -  |
| **404** | Worker not found. |  -  |
| **0** | Error response |  -  |

<a id="getWorker"></a>
# **getWorker**
> Worker getWorker(scope, code).asAt(asAt).execute();

[EXPERIMENTAL] GetWorker: Get a Worker

Will return a NotFound failure if the Worker does not exist

### Example
```java
// Import classes:
import com.finbourne.workflow.ApiClient;
import com.finbourne.workflow.ApiException;
import com.finbourne.workflow.Configuration;
import com.finbourne.workflow.auth.*;
import com.finbourne.workflow.models.*;
import com.finbourne.workflow.api.WorkersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://fbn-prd.lusid.com/workflow");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    WorkersApi apiInstance = new WorkersApi(defaultClient);
    String scope = "scope_example"; // String | Scope of the worker
    String code = "code_example"; // String | Code of the worker
    OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | The asAt datetime at which to retrieve the Worker. Defaults to returning the latest version of the Worker if not specified.
    try {
      Worker result = apiInstance.getWorker(scope, code)
            .asAt(asAt)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkersApi#getWorker");
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
| **scope** | **String**| Scope of the worker | |
| **code** | **String**| Code of the worker | |
| **asAt** | **OffsetDateTime**| The asAt datetime at which to retrieve the Worker. Defaults to returning the latest version of the Worker if not specified. | [optional] |

### Return type

[**Worker**](Worker.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

<a id="getWorkerResult"></a>
# **getWorkerResult**
> GetWorkerResultResponse getWorkerResult(runId).execute();

[EXPERIMENTAL] GetWorkerResult: Get the status of a specific run of a worker with any relevant results

### Example
```java
// Import classes:
import com.finbourne.workflow.ApiClient;
import com.finbourne.workflow.ApiException;
import com.finbourne.workflow.Configuration;
import com.finbourne.workflow.auth.*;
import com.finbourne.workflow.models.*;
import com.finbourne.workflow.api.WorkersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://fbn-prd.lusid.com/workflow");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    WorkersApi apiInstance = new WorkersApi(defaultClient);
    Long runId = 56L; // Long | The ID returned when calling Run Worker
    try {
      GetWorkerResultResponse result = apiInstance.getWorkerResult(runId)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkersApi#getWorkerResult");
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
| **runId** | **Long**| The ID returned when calling Run Worker | |

### Return type

[**GetWorkerResultResponse**](GetWorkerResultResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

<a id="listWorkers"></a>
# **listWorkers**
> PagedResourceListOfWorker listWorkers().asAt(asAt).filter(filter).sortBy(sortBy).limit(limit).page(page).execute();

[EXPERIMENTAL] ListWorkers: List Workers

### Example
```java
// Import classes:
import com.finbourne.workflow.ApiClient;
import com.finbourne.workflow.ApiException;
import com.finbourne.workflow.Configuration;
import com.finbourne.workflow.auth.*;
import com.finbourne.workflow.models.*;
import com.finbourne.workflow.api.WorkersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://fbn-prd.lusid.com/workflow");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    WorkersApi apiInstance = new WorkersApi(defaultClient);
    OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | The asAt datetime at which to list the Workers. Defaults to return the latest version of each Worker if not specified.
    String filter = "filter_example"; // String | Expression to filter the result set. Read more about filtering results from LUSID here: https://support.lusid.com/filtering-results-from-lusid.
    List<String> sortBy = Arrays.asList(); // List<String> | A list of field names or properties to sort by, each optionally suffixed by \" ASC\" or \" DESC\"
    Integer limit = 10; // Integer | When paginating, limit the number of returned results to this many.
    String page = "page_example"; // String | The pagination token to use to continue listing workers from a previous call to list workers. This value is returned from the previous call. If a pagination token is provided the sortBy, filter, effectiveAt, and asAt fields must not have changed since the original request.
    try {
      PagedResourceListOfWorker result = apiInstance.listWorkers()
            .asAt(asAt)
            .filter(filter)
            .sortBy(sortBy)
            .limit(limit)
            .page(page)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkersApi#listWorkers");
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
| **asAt** | **OffsetDateTime**| The asAt datetime at which to list the Workers. Defaults to return the latest version of each Worker if not specified. | [optional] |
| **filter** | **String**| Expression to filter the result set. Read more about filtering results from LUSID here: https://support.lusid.com/filtering-results-from-lusid. | [optional] |
| **sortBy** | [**List&lt;String&gt;**](String.md)| A list of field names or properties to sort by, each optionally suffixed by \&quot; ASC\&quot; or \&quot; DESC\&quot; | [optional] |
| **limit** | **Integer**| When paginating, limit the number of returned results to this many. | [optional] [default to 10] |
| **page** | **String**| The pagination token to use to continue listing workers from a previous call to list workers. This value is returned from the previous call. If a pagination token is provided the sortBy, filter, effectiveAt, and asAt fields must not have changed since the original request. | [optional] |

### Return type

[**PagedResourceListOfWorker**](PagedResourceListOfWorker.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

<a id="runWorker"></a>
# **runWorker**
> RunWorkerResponse runWorker(scope, code, runWorkerRequest).asAt(asAt).execute();

[EXPERIMENTAL] RunWorker: Run a Worker

### Example
```java
// Import classes:
import com.finbourne.workflow.ApiClient;
import com.finbourne.workflow.ApiException;
import com.finbourne.workflow.Configuration;
import com.finbourne.workflow.auth.*;
import com.finbourne.workflow.models.*;
import com.finbourne.workflow.api.WorkersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://fbn-prd.lusid.com/workflow");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    WorkersApi apiInstance = new WorkersApi(defaultClient);
    String scope = "scope_example"; // String | Scope of the worker
    String code = "code_example"; // String | Code of the worker
    RunWorkerRequest runWorkerRequest = new RunWorkerRequest(); // RunWorkerRequest | 
    OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | The asAt datetime at which to retrieve the Worker. Defaults to returning the latest version of the Worker if not specified.
    try {
      RunWorkerResponse result = apiInstance.runWorker(scope, code, runWorkerRequest)
            .asAt(asAt)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkersApi#runWorker");
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
| **scope** | **String**| Scope of the worker | |
| **code** | **String**| Code of the worker | |
| **runWorkerRequest** | [**RunWorkerRequest**](RunWorkerRequest.md)|  | |
| **asAt** | **OffsetDateTime**| The asAt datetime at which to retrieve the Worker. Defaults to returning the latest version of the Worker if not specified. | [optional] |

### Return type

[**RunWorkerResponse**](RunWorkerResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

<a id="updateWorker"></a>
# **updateWorker**
> Worker updateWorker(scope, code, updateWorkerRequest).execute();

[EXPERIMENTAL] UpdateWorker: Update a Worker

If the Worker does not exist a failure will be returned

### Example
```java
// Import classes:
import com.finbourne.workflow.ApiClient;
import com.finbourne.workflow.ApiException;
import com.finbourne.workflow.Configuration;
import com.finbourne.workflow.auth.*;
import com.finbourne.workflow.models.*;
import com.finbourne.workflow.api.WorkersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://fbn-prd.lusid.com/workflow");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    WorkersApi apiInstance = new WorkersApi(defaultClient);
    String scope = "scope_example"; // String | Scope of the worker to be updated
    String code = "code_example"; // String | Code of the worker to be updated
    UpdateWorkerRequest updateWorkerRequest = new UpdateWorkerRequest(); // UpdateWorkerRequest | State of the updated worker
    try {
      Worker result = apiInstance.updateWorker(scope, code, updateWorkerRequest)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkersApi#updateWorker");
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
| **scope** | **String**| Scope of the worker to be updated | |
| **code** | **String**| Code of the worker to be updated | |
| **updateWorkerRequest** | [**UpdateWorkerRequest**](UpdateWorkerRequest.md)| State of the updated worker | |

### Return type

[**Worker**](Worker.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | The details of the input related failure |  -  |
| **404** | Worker not found. |  -  |
| **0** | Error response |  -  |


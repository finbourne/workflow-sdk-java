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



## createWorker

> Worker createWorker(createWorkerRequest)

[EXPERIMENTAL] CreateWorker: Create a new Worker

If the Worker already exists a failure will be returned

### Example

```java
import com.finbourne.workflow.model.*;
import com.finbourne.workflow.api.WorkersApi;
import com.finbourne.workflow.extensions.ApiConfigurationException;
import com.finbourne.workflow.extensions.ApiFactoryBuilder;
import com.finbourne.workflow.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class WorkersApiExample {

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
        // WorkersApi apiInstance = apiFactory.build(WorkersApi.class);

        WorkersApi apiInstance = ApiFactoryBuilder.build(fileName).build(WorkersApi.class);
        CreateWorkerRequest createWorkerRequest = new CreateWorkerRequest(); // CreateWorkerRequest | Worker to be created
        try {
            // uncomment the below to set overrides at the request level
            // Worker result = apiInstance.createWorker(createWorkerRequest).execute(opts);

            Worker result = apiInstance.createWorker(createWorkerRequest).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling WorkersApi#createWorker");
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
| **createWorkerRequest** | [**CreateWorkerRequest**](CreateWorkerRequest.md)| Worker to be created | |

### Return type

[**Worker**](Worker.md)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## deleteWorker

> DeletedEntityResponse deleteWorker(scope, code)

[EXPERIMENTAL] DeleteWorker: Delete a Worker

If the Worker does not exist a failure will be returned

### Example

```java
import com.finbourne.workflow.model.*;
import com.finbourne.workflow.api.WorkersApi;
import com.finbourne.workflow.extensions.ApiConfigurationException;
import com.finbourne.workflow.extensions.ApiFactoryBuilder;
import com.finbourne.workflow.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class WorkersApiExample {

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
        // WorkersApi apiInstance = apiFactory.build(WorkersApi.class);

        WorkersApi apiInstance = ApiFactoryBuilder.build(fileName).build(WorkersApi.class);
        String scope = "scope_example"; // String | Scope of the worker to be deleted
        String code = "code_example"; // String | Code of the worker to be deleted
        try {
            // uncomment the below to set overrides at the request level
            // DeletedEntityResponse result = apiInstance.deleteWorker(scope, code).execute(opts);

            DeletedEntityResponse result = apiInstance.deleteWorker(scope, code).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling WorkersApi#deleteWorker");
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
| **scope** | **String**| Scope of the worker to be deleted | |
| **code** | **String**| Code of the worker to be deleted | |

### Return type

[**DeletedEntityResponse**](DeletedEntityResponse.md)

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

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## getWorker

> Worker getWorker(scope, code, asAt)

[EXPERIMENTAL] GetWorker: Get a Worker

Will return a NotFound failure if the Worker does not exist

### Example

```java
import com.finbourne.workflow.model.*;
import com.finbourne.workflow.api.WorkersApi;
import com.finbourne.workflow.extensions.ApiConfigurationException;
import com.finbourne.workflow.extensions.ApiFactoryBuilder;
import com.finbourne.workflow.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class WorkersApiExample {

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
        // WorkersApi apiInstance = apiFactory.build(WorkersApi.class);

        WorkersApi apiInstance = ApiFactoryBuilder.build(fileName).build(WorkersApi.class);
        String scope = "scope_example"; // String | Scope of the worker
        String code = "code_example"; // String | Code of the worker
        OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | The asAt datetime at which to retrieve the Worker. Defaults to returning the latest version of the Worker if not specified.
        try {
            // uncomment the below to set overrides at the request level
            // Worker result = apiInstance.getWorker(scope, code, asAt).execute(opts);

            Worker result = apiInstance.getWorker(scope, code, asAt).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling WorkersApi#getWorker");
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
| **scope** | **String**| Scope of the worker | |
| **code** | **String**| Code of the worker | |
| **asAt** | **OffsetDateTime**| The asAt datetime at which to retrieve the Worker. Defaults to returning the latest version of the Worker if not specified. | [optional] |

### Return type

[**Worker**](Worker.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## getWorkerResult

> GetWorkerResultResponse getWorkerResult(runId)

[EXPERIMENTAL] GetWorkerResult: Get the status of a specific run of a worker with any relevant results

### Example

```java
import com.finbourne.workflow.model.*;
import com.finbourne.workflow.api.WorkersApi;
import com.finbourne.workflow.extensions.ApiConfigurationException;
import com.finbourne.workflow.extensions.ApiFactoryBuilder;
import com.finbourne.workflow.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class WorkersApiExample {

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
        // WorkersApi apiInstance = apiFactory.build(WorkersApi.class);

        WorkersApi apiInstance = ApiFactoryBuilder.build(fileName).build(WorkersApi.class);
        UUID runId = UUID.randomUUID(); // UUID | The ID returned when calling Run Worker
        try {
            // uncomment the below to set overrides at the request level
            // GetWorkerResultResponse result = apiInstance.getWorkerResult(runId).execute(opts);

            GetWorkerResultResponse result = apiInstance.getWorkerResult(runId).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling WorkersApi#getWorkerResult");
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
| **runId** | **UUID**| The ID returned when calling Run Worker | |

### Return type

[**GetWorkerResultResponse**](GetWorkerResultResponse.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## listWorkers

> PagedResourceListOfWorker listWorkers(asAt, filter, sortBy, limit, page)

[EXPERIMENTAL] ListWorkers: List Workers

### Example

```java
import com.finbourne.workflow.model.*;
import com.finbourne.workflow.api.WorkersApi;
import com.finbourne.workflow.extensions.ApiConfigurationException;
import com.finbourne.workflow.extensions.ApiFactoryBuilder;
import com.finbourne.workflow.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class WorkersApiExample {

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
        // WorkersApi apiInstance = apiFactory.build(WorkersApi.class);

        WorkersApi apiInstance = ApiFactoryBuilder.build(fileName).build(WorkersApi.class);
        OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | The asAt datetime at which to list the Workers. Defaults to return the latest version of each Worker if not specified.
        String filter = "filter_example"; // String | Expression to filter the result set. Read more about filtering results from LUSID here: https://support.lusid.com/filtering-results-from-lusid.
        List<String> sortBy = Arrays.asList(); // List<String> | A list of field names or properties to sort by, each optionally suffixed by \" ASC\" or \" DESC\"
        Integer limit = 10; // Integer | When paginating, limit the number of returned results to this many.
        String page = "page_example"; // String | The pagination token to use to continue listing workers from a previous call to list workers. This value is returned from the previous call. If a pagination token is provided the sortBy, filter, effectiveAt, and asAt fields must not have changed since the original request.
        try {
            // uncomment the below to set overrides at the request level
            // PagedResourceListOfWorker result = apiInstance.listWorkers(asAt, filter, sortBy, limit, page).execute(opts);

            PagedResourceListOfWorker result = apiInstance.listWorkers(asAt, filter, sortBy, limit, page).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling WorkersApi#listWorkers");
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
| **asAt** | **OffsetDateTime**| The asAt datetime at which to list the Workers. Defaults to return the latest version of each Worker if not specified. | [optional] |
| **filter** | **String**| Expression to filter the result set. Read more about filtering results from LUSID here: https://support.lusid.com/filtering-results-from-lusid. | [optional] |
| **sortBy** | [**List&lt;String&gt;**](String.md)| A list of field names or properties to sort by, each optionally suffixed by \&quot; ASC\&quot; or \&quot; DESC\&quot; | [optional] |
| **limit** | **Integer**| When paginating, limit the number of returned results to this many. | [optional] [default to 10] |
| **page** | **String**| The pagination token to use to continue listing workers from a previous call to list workers. This value is returned from the previous call. If a pagination token is provided the sortBy, filter, effectiveAt, and asAt fields must not have changed since the original request. | [optional] |

### Return type

[**PagedResourceListOfWorker**](PagedResourceListOfWorker.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## runWorker

> RunWorkerResponse runWorker(scope, code, runWorkerRequest, asAt)

[EXPERIMENTAL] RunWorker: Run a Worker

### Example

```java
import com.finbourne.workflow.model.*;
import com.finbourne.workflow.api.WorkersApi;
import com.finbourne.workflow.extensions.ApiConfigurationException;
import com.finbourne.workflow.extensions.ApiFactoryBuilder;
import com.finbourne.workflow.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class WorkersApiExample {

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
        // WorkersApi apiInstance = apiFactory.build(WorkersApi.class);

        WorkersApi apiInstance = ApiFactoryBuilder.build(fileName).build(WorkersApi.class);
        String scope = "scope_example"; // String | Scope of the worker
        String code = "code_example"; // String | Code of the worker
        RunWorkerRequest runWorkerRequest = new RunWorkerRequest(); // RunWorkerRequest | 
        OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | The asAt datetime at which to retrieve the Worker. Defaults to returning the latest version of the Worker if not specified.
        try {
            // uncomment the below to set overrides at the request level
            // RunWorkerResponse result = apiInstance.runWorker(scope, code, runWorkerRequest, asAt).execute(opts);

            RunWorkerResponse result = apiInstance.runWorker(scope, code, runWorkerRequest, asAt).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling WorkersApi#runWorker");
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
| **scope** | **String**| Scope of the worker | |
| **code** | **String**| Code of the worker | |
| **runWorkerRequest** | [**RunWorkerRequest**](RunWorkerRequest.md)|  | |
| **asAt** | **OffsetDateTime**| The asAt datetime at which to retrieve the Worker. Defaults to returning the latest version of the Worker if not specified. | [optional] |

### Return type

[**RunWorkerResponse**](RunWorkerResponse.md)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## updateWorker

> Worker updateWorker(scope, code, updateWorkerRequest)

[EXPERIMENTAL] UpdateWorker: Update a Worker

If the Worker does not exist a failure will be returned

### Example

```java
import com.finbourne.workflow.model.*;
import com.finbourne.workflow.api.WorkersApi;
import com.finbourne.workflow.extensions.ApiConfigurationException;
import com.finbourne.workflow.extensions.ApiFactoryBuilder;
import com.finbourne.workflow.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class WorkersApiExample {

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
        // WorkersApi apiInstance = apiFactory.build(WorkersApi.class);

        WorkersApi apiInstance = ApiFactoryBuilder.build(fileName).build(WorkersApi.class);
        String scope = "scope_example"; // String | Scope of the worker to be updated
        String code = "code_example"; // String | Code of the worker to be updated
        UpdateWorkerRequest updateWorkerRequest = new UpdateWorkerRequest(); // UpdateWorkerRequest | State of the updated worker
        try {
            // uncomment the below to set overrides at the request level
            // Worker result = apiInstance.updateWorker(scope, code, updateWorkerRequest).execute(opts);

            Worker result = apiInstance.updateWorker(scope, code, updateWorkerRequest).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling WorkersApi#updateWorker");
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
| **scope** | **String**| Scope of the worker to be updated | |
| **code** | **String**| Code of the worker to be updated | |
| **updateWorkerRequest** | [**UpdateWorkerRequest**](UpdateWorkerRequest.md)| State of the updated worker | |

### Return type

[**Worker**](Worker.md)

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

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


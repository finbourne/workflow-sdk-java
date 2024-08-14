# TasksApi

All URIs are relative to *https://fbn-prd.lusid.com/workflow*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createTask**](TasksApi.md#createTask) | **POST** /api/tasks | [EXPERIMENTAL] CreateTask: Create a new Task |
| [**deleteTask**](TasksApi.md#deleteTask) | **DELETE** /api/tasks/{id} | [EXPERIMENTAL] DeleteTask: Delete a Task |
| [**getTask**](TasksApi.md#getTask) | **GET** /api/tasks/{id} | [EXPERIMENTAL] GetTask: Get a Task |
| [**listTasks**](TasksApi.md#listTasks) | **GET** /api/tasks | ListTasks: List Tasks |
| [**updateTask**](TasksApi.md#updateTask) | **POST** /api/tasks/{id} | [EXPERIMENTAL] UpdateTask: Update a Task |



## createTask

> Task createTask(createTaskRequest, trigger)

[EXPERIMENTAL] CreateTask: Create a new Task

### Example

```java
import com.finbourne.workflow.model.*;
import com.finbourne.workflow.api.TasksApi;
import com.finbourne.workflow.extensions.ApiConfigurationException;
import com.finbourne.workflow.extensions.ApiFactoryBuilder;
import com.finbourne.workflow.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class TasksApiExample {

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

        TasksApi apiInstance = ApiFactoryBuilder.build(fileName).build(TasksApi.class);
        CreateTaskRequest createTaskRequest = new CreateTaskRequest(); // CreateTaskRequest | Request to create Task
        String trigger = "trigger_example"; // String | The name of the Trigger to invoke
        try {
            Task result = apiInstance.createTask(createTaskRequest, trigger).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling TasksApi#createTask");
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
| **createTaskRequest** | [**CreateTaskRequest**](CreateTaskRequest.md)| Request to create Task | |
| **trigger** | **String**| The name of the Trigger to invoke | [optional] |

### Return type

[**Task**](Task.md)

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


## deleteTask

> DeletedEntityResponse deleteTask(id)

[EXPERIMENTAL] DeleteTask: Delete a Task

### Example

```java
import com.finbourne.workflow.model.*;
import com.finbourne.workflow.api.TasksApi;
import com.finbourne.workflow.extensions.ApiConfigurationException;
import com.finbourne.workflow.extensions.ApiFactoryBuilder;
import com.finbourne.workflow.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class TasksApiExample {

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

        TasksApi apiInstance = ApiFactoryBuilder.build(fileName).build(TasksApi.class);
        String id = "id_example"; // String | The identifier for the Task to be deleted.
        try {
            DeletedEntityResponse result = apiInstance.deleteTask(id).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling TasksApi#deleteTask");
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
| **id** | **String**| The identifier for the Task to be deleted. | |

### Return type

[**DeletedEntityResponse**](DeletedEntityResponse.md)

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

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## getTask

> Task getTask(id, asAt)

[EXPERIMENTAL] GetTask: Get a Task

### Example

```java
import com.finbourne.workflow.model.*;
import com.finbourne.workflow.api.TasksApi;
import com.finbourne.workflow.extensions.ApiConfigurationException;
import com.finbourne.workflow.extensions.ApiFactoryBuilder;
import com.finbourne.workflow.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class TasksApiExample {

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

        TasksApi apiInstance = ApiFactoryBuilder.build(fileName).build(TasksApi.class);
        String id = "id_example"; // String | Id of the Task to retrieve
        OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | The asAt datetime at which to retrieve the Task. Defaults to returning the latest version of the Task if not specified.
        try {
            Task result = apiInstance.getTask(id, asAt).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling TasksApi#getTask");
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
| **id** | **String**| Id of the Task to retrieve | |
| **asAt** | **OffsetDateTime**| The asAt datetime at which to retrieve the Task. Defaults to returning the latest version of the Task if not specified. | [optional] |

### Return type

[**Task**](Task.md)

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

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## listTasks

> PagedResourceListOfTask listTasks(asAt, filter, sortBy, limit, page)

ListTasks: List Tasks

### Example

```java
import com.finbourne.workflow.model.*;
import com.finbourne.workflow.api.TasksApi;
import com.finbourne.workflow.extensions.ApiConfigurationException;
import com.finbourne.workflow.extensions.ApiFactoryBuilder;
import com.finbourne.workflow.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class TasksApiExample {

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

        TasksApi apiInstance = ApiFactoryBuilder.build(fileName).build(TasksApi.class);
        OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | The asAt datetime at which to list the Tasks. Defaults to return the latest version of each Task if not specified.
        String filter = "filter_example"; // String | Expression to filter the result set. Read more about filtering results from LUSID here: https://support.lusid.com/filtering-results-from-lusid.
        List<String> sortBy = Arrays.asList(); // List<String> | A list of field names or properties to sort by, each optionally suffixed by \" ASC\" or \" DESC\"
        Integer limit = 10; // Integer | When paginating, limit the number of returned results to this many.
        String page = "page_example"; // String | The pagination token to use to continue listing tasks from a previous call to list tasks. This value is returned from the previous call. If a pagination token is provided the sortBy, filter, effectiveAt, and asAt fields must not have changed since the original request.
        try {
            PagedResourceListOfTask result = apiInstance.listTasks(asAt, filter, sortBy, limit, page).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling TasksApi#listTasks");
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
| **asAt** | **OffsetDateTime**| The asAt datetime at which to list the Tasks. Defaults to return the latest version of each Task if not specified. | [optional] |
| **filter** | **String**| Expression to filter the result set. Read more about filtering results from LUSID here: https://support.lusid.com/filtering-results-from-lusid. | [optional] |
| **sortBy** | [**List&lt;String&gt;**](String.md)| A list of field names or properties to sort by, each optionally suffixed by \&quot; ASC\&quot; or \&quot; DESC\&quot; | [optional] |
| **limit** | **Integer**| When paginating, limit the number of returned results to this many. | [optional] [default to 10] |
| **page** | **String**| The pagination token to use to continue listing tasks from a previous call to list tasks. This value is returned from the previous call. If a pagination token is provided the sortBy, filter, effectiveAt, and asAt fields must not have changed since the original request. | [optional] |

### Return type

[**PagedResourceListOfTask**](PagedResourceListOfTask.md)

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

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## updateTask

> Task updateTask(id, trigger, updateTaskRequest)

[EXPERIMENTAL] UpdateTask: Update a Task

### Example

```java
import com.finbourne.workflow.model.*;
import com.finbourne.workflow.api.TasksApi;
import com.finbourne.workflow.extensions.ApiConfigurationException;
import com.finbourne.workflow.extensions.ApiFactoryBuilder;
import com.finbourne.workflow.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class TasksApiExample {

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

        TasksApi apiInstance = ApiFactoryBuilder.build(fileName).build(TasksApi.class);
        String id = "id_example"; // String | Id of the Task to act upon
        String trigger = "trigger_example"; // String | 
        UpdateTaskRequest updateTaskRequest = new UpdateTaskRequest(); // UpdateTaskRequest | The details of the request
        try {
            Task result = apiInstance.updateTask(id, trigger, updateTaskRequest).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling TasksApi#updateTask");
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
| **id** | **String**| Id of the Task to act upon | |
| **trigger** | **String**|  | [optional] |
| **updateTaskRequest** | [**UpdateTaskRequest**](UpdateTaskRequest.md)| The details of the request | [optional] |

### Return type

[**Task**](Task.md)

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

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


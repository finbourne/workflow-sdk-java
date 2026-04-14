# WorkflowsApi

All URIs are relative to *https://fbn-prd.lusid.com/workflow*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createWorkflow**](WorkflowsApi.md#createWorkflow) | **POST** /api/workflows | CreateWorkflow: Create a new Workflow |
| [**deleteWorkflow**](WorkflowsApi.md#deleteWorkflow) | **DELETE** /api/workflows/{scope}/{code} | [EXPERIMENTAL] DeleteWorkflow: Delete a Workflow |
| [**getWorkflow**](WorkflowsApi.md#getWorkflow) | **GET** /api/workflows/{scope}/{code} | GetWorkflow: Get a Workflow |
| [**listWorkflows**](WorkflowsApi.md#listWorkflows) | **GET** /api/workflows | ListWorkflows: List Workflows |



## createWorkflow

> WorkflowResponse createWorkflow(createWorkflowRequest)

CreateWorkflow: Create a new Workflow

### Example

```java
import com.finbourne.workflow.model.*;
import com.finbourne.workflow.api.WorkflowsApi;
import com.finbourne.workflow.extensions.ApiConfigurationException;
import com.finbourne.workflow.extensions.ApiFactoryBuilder;
import com.finbourne.workflow.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class WorkflowsApiExample {

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
        // WorkflowsApi apiInstance = apiFactory.build(WorkflowsApi.class);

        WorkflowsApi apiInstance = ApiFactoryBuilder.build(fileName).build(WorkflowsApi.class);
        CreateWorkflowRequest createWorkflowRequest = new CreateWorkflowRequest(); // CreateWorkflowRequest | The data to create a Workflow
        try {
            // uncomment the below to set overrides at the request level
            // WorkflowResponse result = apiInstance.createWorkflow(createWorkflowRequest).execute(opts);

            WorkflowResponse result = apiInstance.createWorkflow(createWorkflowRequest).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling WorkflowsApi#createWorkflow");
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
| **createWorkflowRequest** | [**CreateWorkflowRequest**](CreateWorkflowRequest.md)| The data to create a Workflow | |

### Return type

[**WorkflowResponse**](WorkflowResponse.md)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  -  |
| **400** | The details of the input related failure |  -  |
| **409** | Workflow already exists. |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## deleteWorkflow

> DeletedEntityResponse deleteWorkflow(scope, code)

[EXPERIMENTAL] DeleteWorkflow: Delete a Workflow

### Example

```java
import com.finbourne.workflow.model.*;
import com.finbourne.workflow.api.WorkflowsApi;
import com.finbourne.workflow.extensions.ApiConfigurationException;
import com.finbourne.workflow.extensions.ApiFactoryBuilder;
import com.finbourne.workflow.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class WorkflowsApiExample {

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
        // WorkflowsApi apiInstance = apiFactory.build(WorkflowsApi.class);

        WorkflowsApi apiInstance = ApiFactoryBuilder.build(fileName).build(WorkflowsApi.class);
        String scope = "scope_example"; // String | The scope that identifies a Workflow
        String code = "code_example"; // String | The code that identifies a Workflow
        try {
            // uncomment the below to set overrides at the request level
            // DeletedEntityResponse result = apiInstance.deleteWorkflow(scope, code).execute(opts);

            DeletedEntityResponse result = apiInstance.deleteWorkflow(scope, code).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling WorkflowsApi#deleteWorkflow");
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
| **scope** | **String**| The scope that identifies a Workflow | |
| **code** | **String**| The code that identifies a Workflow | |

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
| **404** | Workflow not found. |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## getWorkflow

> WorkflowResponse getWorkflow(scope, code, asAt)

GetWorkflow: Get a Workflow

### Example

```java
import com.finbourne.workflow.model.*;
import com.finbourne.workflow.api.WorkflowsApi;
import com.finbourne.workflow.extensions.ApiConfigurationException;
import com.finbourne.workflow.extensions.ApiFactoryBuilder;
import com.finbourne.workflow.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class WorkflowsApiExample {

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
        // WorkflowsApi apiInstance = apiFactory.build(WorkflowsApi.class);

        WorkflowsApi apiInstance = ApiFactoryBuilder.build(fileName).build(WorkflowsApi.class);
        String scope = "scope_example"; // String | The scope that identifies a Workflow
        String code = "code_example"; // String | The code that identifies a Workflow
        OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | The asAt datetime at which to retrieve the Workflow. Defaults to returning the latest version if not specified.
        try {
            // uncomment the below to set overrides at the request level
            // WorkflowResponse result = apiInstance.getWorkflow(scope, code, asAt).execute(opts);

            WorkflowResponse result = apiInstance.getWorkflow(scope, code, asAt).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling WorkflowsApi#getWorkflow");
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
| **scope** | **String**| The scope that identifies a Workflow | |
| **code** | **String**| The code that identifies a Workflow | |
| **asAt** | **OffsetDateTime**| The asAt datetime at which to retrieve the Workflow. Defaults to returning the latest version if not specified. | [optional] |

### Return type

[**WorkflowResponse**](WorkflowResponse.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | The details of the input related failure |  -  |
| **404** | Workflow not found. |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## listWorkflows

> PagedResourceListOfWorkflowResponse listWorkflows(asAt, filter, sortBy, limit, page)

ListWorkflows: List Workflows

### Example

```java
import com.finbourne.workflow.model.*;
import com.finbourne.workflow.api.WorkflowsApi;
import com.finbourne.workflow.extensions.ApiConfigurationException;
import com.finbourne.workflow.extensions.ApiFactoryBuilder;
import com.finbourne.workflow.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class WorkflowsApiExample {

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
        // WorkflowsApi apiInstance = apiFactory.build(WorkflowsApi.class);

        WorkflowsApi apiInstance = ApiFactoryBuilder.build(fileName).build(WorkflowsApi.class);
        OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | The asAt datetime at which to list the Workflows. Defaults to return the latest version of each Workflow if not specified.
        String filter = "filter_example"; // String | Expression to filter the result set. Read more about filtering results from LUSID here: https://support.lusid.com/filtering-results-from-lusid.
        List<String> sortBy = Arrays.asList(); // List<String> | A list of field names or properties to sort by, each suffixed by \" ASC\" or \" DESC\"
        Integer limit = 10; // Integer | When paginating, limit the number of returned results to this many.
        String page = "page_example"; // String | The pagination token to use to continue listing workflows from a previous call to list workflows. This value is returned from the previous call. If a pagination token is provided the sortBy, filter, effectiveAt, and asAt fields must not have changed since the original request.
        try {
            // uncomment the below to set overrides at the request level
            // PagedResourceListOfWorkflowResponse result = apiInstance.listWorkflows(asAt, filter, sortBy, limit, page).execute(opts);

            PagedResourceListOfWorkflowResponse result = apiInstance.listWorkflows(asAt, filter, sortBy, limit, page).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling WorkflowsApi#listWorkflows");
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
| **asAt** | **OffsetDateTime**| The asAt datetime at which to list the Workflows. Defaults to return the latest version of each Workflow if not specified. | [optional] |
| **filter** | **String**| Expression to filter the result set. Read more about filtering results from LUSID here: https://support.lusid.com/filtering-results-from-lusid. | [optional] |
| **sortBy** | [**List&lt;String&gt;**](String.md)| A list of field names or properties to sort by, each suffixed by \&quot; ASC\&quot; or \&quot; DESC\&quot; | [optional] |
| **limit** | **Integer**| When paginating, limit the number of returned results to this many. | [optional] [default to 10] |
| **page** | **String**| The pagination token to use to continue listing workflows from a previous call to list workflows. This value is returned from the previous call. If a pagination token is provided the sortBy, filter, effectiveAt, and asAt fields must not have changed since the original request. | [optional] |

### Return type

[**PagedResourceListOfWorkflowResponse**](PagedResourceListOfWorkflowResponse.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | The details of the input related failure |  -  |
| **404** | No Workflows found. |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


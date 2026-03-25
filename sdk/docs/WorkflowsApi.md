# WorkflowsApi

All URIs are relative to *https://fbn-prd.lusid.com/workflow*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createWorkflow**](WorkflowsApi.md#createWorkflow) | **POST** /api/workflows | CreateWorkflow: Create a new Workflow |
| [**getWorkflow**](WorkflowsApi.md#getWorkflow) | **GET** /api/workflows/{scope}/{code} | GetWorkflow: Get a Workflow |



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


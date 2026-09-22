# LaunchersApi

All URIs are relative to *https://fbn-prd.lusid.com/workflow*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createLauncher**](LaunchersApi.md#createLauncher) | **POST** /api/workflows/{scope}/{code}/launchers | [EXPERIMENTAL] CreateLauncher: Create a new Launcher on a Workflow |
| [**deleteLauncher**](LaunchersApi.md#deleteLauncher) | **DELETE** /api/workflows/{scope}/{code}/launchers/{launcherId} | [EXPERIMENTAL] DeleteLauncher: Delete a Launcher of a Workflow |
| [**updateLauncher**](LaunchersApi.md#updateLauncher) | **PUT** /api/workflows/{scope}/{code}/launchers/{launcherId} | [EXPERIMENTAL] UpdateLauncher: Update an existing Launcher of a Workflow |



## createLauncher

> LauncherResponse createLauncher(scope, code, createLauncherRequest)

[EXPERIMENTAL] CreateLauncher: Create a new Launcher on a Workflow

### Example

```java
import com.finbourne.workflow.model.*;
import com.finbourne.workflow.api.LaunchersApi;
import com.finbourne.workflow.extensions.ApiConfigurationException;
import com.finbourne.workflow.extensions.ApiFactoryBuilder;
import com.finbourne.workflow.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class LaunchersApiExample {

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
        // LaunchersApi apiInstance = apiFactory.build(LaunchersApi.class);

        LaunchersApi apiInstance = ApiFactoryBuilder.build(fileName).build(LaunchersApi.class);
        String scope = "scope_example"; // String | The scope that identifies the Workflow that owns the Launcher
        String code = "code_example"; // String | The code that identifies the Workflow that owns the Launcher
        CreateLauncherRequest createLauncherRequest = new CreateLauncherRequest(); // CreateLauncherRequest | The data to create a Launcher
        try {
            // uncomment the below to set overrides at the request level
            // LauncherResponse result = apiInstance.createLauncher(scope, code, createLauncherRequest).execute(opts);

            LauncherResponse result = apiInstance.createLauncher(scope, code, createLauncherRequest).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling LaunchersApi#createLauncher");
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
| **scope** | **String**| The scope that identifies the Workflow that owns the Launcher | |
| **code** | **String**| The code that identifies the Workflow that owns the Launcher | |
| **createLauncherRequest** | [**CreateLauncherRequest**](CreateLauncherRequest.md)| The data to create a Launcher | |

### Return type

[**LauncherResponse**](LauncherResponse.md)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  -  |
| **400** | The details of the input related failure |  -  |
| **404** | Workflow not found. |  -  |
| **409** | Launcher already exists. |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## deleteLauncher

> DeletedEntityResponse deleteLauncher(scope, code, launcherId)

[EXPERIMENTAL] DeleteLauncher: Delete a Launcher of a Workflow

If the Launcher does not exist a failure will be returned

### Example

```java
import com.finbourne.workflow.model.*;
import com.finbourne.workflow.api.LaunchersApi;
import com.finbourne.workflow.extensions.ApiConfigurationException;
import com.finbourne.workflow.extensions.ApiFactoryBuilder;
import com.finbourne.workflow.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class LaunchersApiExample {

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
        // LaunchersApi apiInstance = apiFactory.build(LaunchersApi.class);

        LaunchersApi apiInstance = ApiFactoryBuilder.build(fileName).build(LaunchersApi.class);
        String scope = "scope_example"; // String | The scope that identifies the Workflow that owns the Launcher
        String code = "code_example"; // String | The code that identifies the Workflow that owns the Launcher
        String launcherId = "launcherId_example"; // String | The identifier of the Launcher inside its Workflow
        try {
            // uncomment the below to set overrides at the request level
            // DeletedEntityResponse result = apiInstance.deleteLauncher(scope, code, launcherId).execute(opts);

            DeletedEntityResponse result = apiInstance.deleteLauncher(scope, code, launcherId).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling LaunchersApi#deleteLauncher");
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
| **scope** | **String**| The scope that identifies the Workflow that owns the Launcher | |
| **code** | **String**| The code that identifies the Workflow that owns the Launcher | |
| **launcherId** | **String**| The identifier of the Launcher inside its Workflow | |

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
| **404** | Launcher not found. |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## updateLauncher

> LauncherResponse updateLauncher(scope, code, launcherId, updateLauncherRequest)

[EXPERIMENTAL] UpdateLauncher: Update an existing Launcher of a Workflow

The type of a Launcher cannot be changed

### Example

```java
import com.finbourne.workflow.model.*;
import com.finbourne.workflow.api.LaunchersApi;
import com.finbourne.workflow.extensions.ApiConfigurationException;
import com.finbourne.workflow.extensions.ApiFactoryBuilder;
import com.finbourne.workflow.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class LaunchersApiExample {

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
        // LaunchersApi apiInstance = apiFactory.build(LaunchersApi.class);

        LaunchersApi apiInstance = ApiFactoryBuilder.build(fileName).build(LaunchersApi.class);
        String scope = "scope_example"; // String | The scope that identifies the Workflow that owns the Launcher
        String code = "code_example"; // String | The code that identifies the Workflow that owns the Launcher
        String launcherId = "launcherId_example"; // String | The identifier of the Launcher inside its Workflow
        UpdateLauncherRequest updateLauncherRequest = new UpdateLauncherRequest(); // UpdateLauncherRequest | The data to update a Launcher
        try {
            // uncomment the below to set overrides at the request level
            // LauncherResponse result = apiInstance.updateLauncher(scope, code, launcherId, updateLauncherRequest).execute(opts);

            LauncherResponse result = apiInstance.updateLauncher(scope, code, launcherId, updateLauncherRequest).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling LaunchersApi#updateLauncher");
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
| **scope** | **String**| The scope that identifies the Workflow that owns the Launcher | |
| **code** | **String**| The code that identifies the Workflow that owns the Launcher | |
| **launcherId** | **String**| The identifier of the Launcher inside its Workflow | |
| **updateLauncherRequest** | [**UpdateLauncherRequest**](UpdateLauncherRequest.md)| The data to update a Launcher | |

### Return type

[**LauncherResponse**](LauncherResponse.md)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | The details of the input related failure |  -  |
| **404** | Launcher not found. |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


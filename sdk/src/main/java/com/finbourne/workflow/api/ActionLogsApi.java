/*
 * FINBOURNE Workflow API
 *
 * Contact: info@finbourne.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.finbourne.workflow.api;

import com.finbourne.workflow.ApiCallback;
import com.finbourne.workflow.ApiClient;
import com.finbourne.workflow.ApiException;
import com.finbourne.workflow.ApiResponse;
import com.finbourne.workflow.Configuration;
import com.finbourne.workflow.Pair;
import com.finbourne.workflow.ProgressRequestBody;
import com.finbourne.workflow.ProgressResponseBody;
import com.finbourne.workflow.extensions.ConfigurationOptions;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import com.finbourne.workflow.model.ActionLog;
import com.finbourne.workflow.model.LusidProblemDetails;
import com.finbourne.workflow.model.LusidValidationProblemDetails;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ActionLogsApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public ActionLogsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public ActionLogsApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public int getHostIndex() {
        return localHostIndex;
    }

    public void setHostIndex(int hostIndex) {
        this.localHostIndex = hostIndex;
    }

    public String getCustomBaseUrl() {
        return localCustomBaseUrl;
    }

    public void setCustomBaseUrl(String customBaseUrl) {
        this.localCustomBaseUrl = customBaseUrl;
    }

    private okhttp3.Call getActionLogsCall(String id, final ApiCallback _callback) throws ApiException {
        return getActionLogsCall(id,  _callback, new ConfigurationOptions());
    }

    private okhttp3.Call getActionLogsCall(String id, final ApiCallback _callback, ConfigurationOptions opts) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/api/actionlogs/{id}"
            .replace("{" + "id" + "}", localVarApiClient.escapeString(id.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "text/plain",
            "application/json",
            "text/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "oauth2" };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback, opts);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getActionLogsValidateBeforeCall(String id, final ApiCallback _callback, ConfigurationOptions opts) throws ApiException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling getActionLogs(Async)");
        }

        return getActionLogsCall(id, _callback, opts);

    }


    private ApiResponse<ActionLog> getActionLogsWithHttpInfo(String id) throws ApiException {
        okhttp3.Call localVarCall = getActionLogsValidateBeforeCall(id, null, new ConfigurationOptions());
        Type localVarReturnType = new TypeToken<ActionLog>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private ApiResponse<ActionLog> getActionLogsWithHttpInfo(String id, ConfigurationOptions opts) throws ApiException {
        okhttp3.Call localVarCall = getActionLogsValidateBeforeCall(id, null, opts);
        Type localVarReturnType = new TypeToken<ActionLog>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call getActionLogsAsync(String id, final ApiCallback<ActionLog> _callback) throws ApiException {

        okhttp3.Call localVarCall = getActionLogsValidateBeforeCall(id, _callback, new ConfigurationOptions());
        Type localVarReturnType = new TypeToken<ActionLog>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    private okhttp3.Call getActionLogsAsync(String id, final ApiCallback<ActionLog> _callback, ConfigurationOptions opts) throws ApiException {

        okhttp3.Call localVarCall = getActionLogsValidateBeforeCall(id, _callback, opts);
        Type localVarReturnType = new TypeToken<ActionLog>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class APIgetActionLogsRequest {
        private final String id;

        private APIgetActionLogsRequest(String id) {
            this.id = id;
        }

        /**
         * Build call for getActionLogs
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
            <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
            <tr><td> 404 </td><td> Action Log not found. </td><td>  -  </td></tr>
            <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            return getActionLogsCall(id, _callback);
        }

        /**
         * Execute getActionLogs request
         * @return ActionLog
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
            <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
            <tr><td> 404 </td><td> Action Log not found. </td><td>  -  </td></tr>
            <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
         </table>
         */
        public ActionLog execute() throws ApiException {
            ApiResponse<ActionLog> localVarResp = getActionLogsWithHttpInfo(id);
            return localVarResp.getData();
        }

        /**
         * Execute getActionLogs request. Use any specified configuration options to override any other configuration for this request only.
         * @return ActionLog
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
            <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
            <tr><td> 404 </td><td> Action Log not found. </td><td>  -  </td></tr>
            <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
         </table>
         */
        public ActionLog execute(ConfigurationOptions opts) throws ApiException {
            ApiResponse<ActionLog> localVarResp = getActionLogsWithHttpInfo(id, opts);
            return localVarResp.getData();
        }

        /**
         * Execute getActionLogs request with HTTP info returned
         * @return ApiResponse&lt;ActionLog&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
            <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
            <tr><td> 404 </td><td> Action Log not found. </td><td>  -  </td></tr>
            <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<ActionLog> executeWithHttpInfo() throws ApiException {
            return getActionLogsWithHttpInfo(id);
        }

        /**
         * Execute getActionLogs request with HTTP info returned. Use any specified configuration options to override any other configuration for this request only.
         * @return ApiResponse&lt;ActionLog&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
            <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
            <tr><td> 404 </td><td> Action Log not found. </td><td>  -  </td></tr>
            <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<ActionLog> executeWithHttpInfo(ConfigurationOptions opts) throws ApiException {
            return getActionLogsWithHttpInfo(id, opts);
        }

        /**
         * Execute getActionLogs request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
            <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
            <tr><td> 404 </td><td> Action Log not found. </td><td>  -  </td></tr>
            <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<ActionLog> _callback) throws ApiException {
            return getActionLogsAsync(id, _callback);
        }

        /**
         * Execute getActionLogs request (asynchronously). Use any specified configuration options to override any other configuration for this request only.
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
            <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
            <tr><td> 404 </td><td> Action Log not found. </td><td>  -  </td></tr>
            <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<ActionLog> _callback, ConfigurationOptions opts) throws ApiException {
            return getActionLogsAsync(id, _callback, opts);
        }
    }

    /**
     * [EXPERIMENTAL] GetActionLogs: Get the Action Logs for an Action Id
     * 
     * @param id The Action Id (required)
     * @return APIgetActionLogsRequest
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Action Log not found. </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public APIgetActionLogsRequest getActionLogs(String id) {
        return new APIgetActionLogsRequest(id);
    }
}

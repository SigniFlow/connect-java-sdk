package com.SigniFlowup.connect.api;

import com.SigniFlowup.connect.ApiException;
import com.SigniFlowup.connect.ApiClient;
import com.SigniFlowup.connect.ApiResponse;
import com.SigniFlowup.connect.Configuration;
import com.SigniFlowup.connect.Pair;

import javax.ws.rs.core.GenericType;

import com.SigniFlowup.connect.models.GetAuditDocumentRequest;
import com.SigniFlowup.connect.models.GetAuditDocumentResponse;
import com.SigniFlowup.connect.models.GetDocumentAuditRequest;
import com.SigniFlowup.connect.models.GetDocumentAuditResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AuditsApi {
  private ApiClient apiClient;

  public AuditsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public AuditsApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Get the API cilent
   *
   * @return API client
   */
  public ApiClient getApiClient() {
    return apiClient;
  }

  /**
   * Set the API cilent
   *
   * @param apiClient an instance of API client
   */
  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Get Audit Document
   * #### Used to get an audit document.
   * @param contentType  (required)
   * @param getAuditDocumentRequest ##### Get Audit Document Request Model (optional)
   * @return GetAuditDocumentResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> ##### Get Audit Document Response Model </td><td>  * Content-Type -  <br>  </td></tr>
     </table>
   */
  public GetAuditDocumentResponse postGetAuditDocument(String contentType, GetAuditDocumentRequest getAuditDocumentRequest) throws ApiException {
    return postGetAuditDocumentWithHttpInfo(contentType, getAuditDocumentRequest).getData();
  }

  /**
   * Get Audit Document
   * #### Used to get an audit document.
   * @param contentType  (required)
   * @param getAuditDocumentRequest ##### Get Audit Document Request Model (optional)
   * @return ApiResponse&lt;GetAuditDocumentResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> ##### Get Audit Document Response Model </td><td>  * Content-Type -  <br>  </td></tr>
     </table>
   */
  public ApiResponse<GetAuditDocumentResponse> postGetAuditDocumentWithHttpInfo(String contentType, GetAuditDocumentRequest getAuditDocumentRequest) throws ApiException {
    Object localVarPostBody = getAuditDocumentRequest;
    
    // verify the required parameter 'contentType' is set
    if (contentType == null) {
      throw new ApiException(400, "Missing the required parameter 'contentType' when calling postGetAuditDocument");
    }
    
    // create path and map variables
    String localVarPath = "/GetAuditDocument";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    if (contentType != null)
      localVarHeaderParams.put("Content-Type", apiClient.parameterToString(contentType));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<GetAuditDocumentResponse> localVarReturnType = new GenericType<GetAuditDocumentResponse>() {};

    return apiClient.invokeAPI("AuditsApi.postGetAuditDocument", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Get Document Audit
   * #### Used to get the audit information from a document.
   * @param contentType  (required)
   * @param getDocumentAuditRequest ##### Get Document Audit Request Model (optional)
   * @return GetDocumentAuditResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> ##### Get Document Audit Response Model </td><td>  * Content-Type -  <br>  </td></tr>
     </table>
   */
  public GetDocumentAuditResponse postGetDocumentAudit(String contentType, GetDocumentAuditRequest getDocumentAuditRequest) throws ApiException {
    return postGetDocumentAuditWithHttpInfo(contentType, getDocumentAuditRequest).getData();
  }

  /**
   * Get Document Audit
   * #### Used to get the audit information from a document.
   * @param contentType  (required)
   * @param getDocumentAuditRequest ##### Get Document Audit Request Model (optional)
   * @return ApiResponse&lt;GetDocumentAuditResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> ##### Get Document Audit Response Model </td><td>  * Content-Type -  <br>  </td></tr>
     </table>
   */
  public ApiResponse<GetDocumentAuditResponse> postGetDocumentAuditWithHttpInfo(String contentType, GetDocumentAuditRequest getDocumentAuditRequest) throws ApiException {
    Object localVarPostBody = getDocumentAuditRequest;
    
    // verify the required parameter 'contentType' is set
    if (contentType == null) {
      throw new ApiException(400, "Missing the required parameter 'contentType' when calling postGetDocumentAudit");
    }
    
    // create path and map variables
    String localVarPath = "/GetDocumentAudit";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    if (contentType != null)
      localVarHeaderParams.put("Content-Type", apiClient.parameterToString(contentType));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<GetDocumentAuditResponse> localVarReturnType = new GenericType<GetDocumentAuditResponse>() {};

    return apiClient.invokeAPI("AuditsApi.postGetDocumentAudit", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
}

package com.SigniFlowup.connect.api;

import com.SigniFlowup.connect.ApiException;
import com.SigniFlowup.connect.ApiClient;
import com.SigniFlowup.connect.ApiResponse;
import com.SigniFlowup.connect.Configuration;
import com.SigniFlowup.connect.Pair;

import javax.ws.rs.core.GenericType;

import com.SigniFlowup.connect.models.GetDocLinkRequest;
import com.SigniFlowup.connect.models.GetDocLinkResponse;
import com.SigniFlowup.connect.models.GetDocumentPrepperLinkRequest;
import com.SigniFlowup.connect.models.GetDocumentPrepperLinkResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ViewersApi {
  private ApiClient apiClient;

  public ViewersApi() {
    this(Configuration.getDefaultApiClient());
  }

  public ViewersApi(ApiClient apiClient) {
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
   * Get Document Link
   * #### Used to get the document link that will be used to sign a document.
   * @param contentType  (required)
   * @param getDocLinkRequest ##### Get Document Link Request Model (optional)
   * @return GetDocLinkResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> ##### Get Document Link Response Model </td><td>  * Content-Type -  <br>  </td></tr>
     </table>
   */
  public GetDocLinkResponse postGetDocLink(String contentType, GetDocLinkRequest getDocLinkRequest) throws ApiException {
    return postGetDocLinkWithHttpInfo(contentType, getDocLinkRequest).getData();
  }

  /**
   * Get Document Link
   * #### Used to get the document link that will be used to sign a document.
   * @param contentType  (required)
   * @param getDocLinkRequest ##### Get Document Link Request Model (optional)
   * @return ApiResponse&lt;GetDocLinkResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> ##### Get Document Link Response Model </td><td>  * Content-Type -  <br>  </td></tr>
     </table>
   */
  public ApiResponse<GetDocLinkResponse> postGetDocLinkWithHttpInfo(String contentType, GetDocLinkRequest getDocLinkRequest) throws ApiException {
    Object localVarPostBody = getDocLinkRequest;
    
    // verify the required parameter 'contentType' is set
    if (contentType == null) {
      throw new ApiException(400, "Missing the required parameter 'contentType' when calling postGetDocLink");
    }
    
    // create path and map variables
    String localVarPath = "/GetDocLink";

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

    GenericType<GetDocLinkResponse> localVarReturnType = new GenericType<GetDocLinkResponse>() {};

    return apiClient.invokeAPI("ViewersApi.postGetDocLink", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Get Document Prepper Link
   * #### Used to get a document prepper link (url).
   * @param contentType  (required)
   * @param getDocumentPrepperLinkRequest ##### Get Document Prepper Link Request Model (optional)
   * @return GetDocumentPrepperLinkResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> ##### Get Document Prepper Link Response Model </td><td>  * Content-Type -  <br>  </td></tr>
     </table>
   */
  public GetDocumentPrepperLinkResponse postGetDocumentPrepperLink(String contentType, GetDocumentPrepperLinkRequest getDocumentPrepperLinkRequest) throws ApiException {
    return postGetDocumentPrepperLinkWithHttpInfo(contentType, getDocumentPrepperLinkRequest).getData();
  }

  /**
   * Get Document Prepper Link
   * #### Used to get a document prepper link (url).
   * @param contentType  (required)
   * @param getDocumentPrepperLinkRequest ##### Get Document Prepper Link Request Model (optional)
   * @return ApiResponse&lt;GetDocumentPrepperLinkResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> ##### Get Document Prepper Link Response Model </td><td>  * Content-Type -  <br>  </td></tr>
     </table>
   */
  public ApiResponse<GetDocumentPrepperLinkResponse> postGetDocumentPrepperLinkWithHttpInfo(String contentType, GetDocumentPrepperLinkRequest getDocumentPrepperLinkRequest) throws ApiException {
    Object localVarPostBody = getDocumentPrepperLinkRequest;
    
    // verify the required parameter 'contentType' is set
    if (contentType == null) {
      throw new ApiException(400, "Missing the required parameter 'contentType' when calling postGetDocumentPrepperLink");
    }
    
    // create path and map variables
    String localVarPath = "/GetDocumentPrepperLink";

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

    GenericType<GetDocumentPrepperLinkResponse> localVarReturnType = new GenericType<GetDocumentPrepperLinkResponse>() {};

    return apiClient.invokeAPI("ViewersApi.postGetDocumentPrepperLink", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
}

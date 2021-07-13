package com.SigniFlowup.connect.api;

import com.SigniFlowup.connect.ApiException;
import com.SigniFlowup.connect.ApiClient;
import com.SigniFlowup.connect.ApiResponse;
import com.SigniFlowup.connect.Configuration;
import com.SigniFlowup.connect.Pair;

import javax.ws.rs.core.GenericType;

import com.SigniFlowup.connect.models.ApplyPrepperTemplateRequest;
import com.SigniFlowup.connect.models.ApplyPrepperTemplateResponse;
import com.SigniFlowup.connect.models.GetDocumentTagFieldBoxPositionRequest;
import com.SigniFlowup.connect.models.GetDocumentTagFieldBoxPositionResponse;
import com.SigniFlowup.connect.models.GetDocumentTagFieldPositionRequest;
import com.SigniFlowup.connect.models.GetDocumentTagFieldPositionResponse;
import com.SigniFlowup.connect.models.GetPrepperTemplateListRequest;
import com.SigniFlowup.connect.models.GetPrepperTemplateListResponse;
import com.SigniFlowup.connect.models.GetPrepperTemplateRequest;
import com.SigniFlowup.connect.models.GetPrepperTemplateResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class TemplatesApi {
  private ApiClient apiClient;

  public TemplatesApi() {
    this(Configuration.getDefaultApiClient());
  }

  public TemplatesApi(ApiClient apiClient) {
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
   * Apply a Prepper template
   * #### Used when applying a templaet to a document.
   * @param contentType  (required)
   * @param applyPrepperTemplateRequest ##### Apply A Prepper Template Request Model (optional)
   * @return ApplyPrepperTemplateResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> ##### Apply A Prepper Template Response Model </td><td>  * Content-Type -  <br>  </td></tr>
     </table>
   */
  public ApplyPrepperTemplateResponse postApplyPrepperTemplate(String contentType, ApplyPrepperTemplateRequest applyPrepperTemplateRequest) throws ApiException {
    return postApplyPrepperTemplateWithHttpInfo(contentType, applyPrepperTemplateRequest).getData();
  }

  /**
   * Apply a Prepper template
   * #### Used when applying a templaet to a document.
   * @param contentType  (required)
   * @param applyPrepperTemplateRequest ##### Apply A Prepper Template Request Model (optional)
   * @return ApiResponse&lt;ApplyPrepperTemplateResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> ##### Apply A Prepper Template Response Model </td><td>  * Content-Type -  <br>  </td></tr>
     </table>
   */
  public ApiResponse<ApplyPrepperTemplateResponse> postApplyPrepperTemplateWithHttpInfo(String contentType, ApplyPrepperTemplateRequest applyPrepperTemplateRequest) throws ApiException {
    Object localVarPostBody = applyPrepperTemplateRequest;
    
    // verify the required parameter 'contentType' is set
    if (contentType == null) {
      throw new ApiException(400, "Missing the required parameter 'contentType' when calling postApplyPrepperTemplate");
    }
    
    // create path and map variables
    String localVarPath = "/ApplyPrepperTemplate";

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

    GenericType<ApplyPrepperTemplateResponse> localVarReturnType = new GenericType<ApplyPrepperTemplateResponse>() {};

    return apiClient.invokeAPI("TemplatesApi.postApplyPrepperTemplate", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Get Document Tag Field Box Position
   * #### Used to get the tag field box position on a document.
   * @param contentType  (required)
   * @param getDocumentTagFieldBoxPositionRequest ##### Get Document Tag Field Box Position Request Model (optional)
   * @return GetDocumentTagFieldBoxPositionResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> ##### Get Document Tag Field Box Position Response Model </td><td>  * Content-Type -  <br>  </td></tr>
     </table>
   */
  public GetDocumentTagFieldBoxPositionResponse postGetDocumentTagFieldBoxPosition(String contentType, GetDocumentTagFieldBoxPositionRequest getDocumentTagFieldBoxPositionRequest) throws ApiException {
    return postGetDocumentTagFieldBoxPositionWithHttpInfo(contentType, getDocumentTagFieldBoxPositionRequest).getData();
  }

  /**
   * Get Document Tag Field Box Position
   * #### Used to get the tag field box position on a document.
   * @param contentType  (required)
   * @param getDocumentTagFieldBoxPositionRequest ##### Get Document Tag Field Box Position Request Model (optional)
   * @return ApiResponse&lt;GetDocumentTagFieldBoxPositionResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> ##### Get Document Tag Field Box Position Response Model </td><td>  * Content-Type -  <br>  </td></tr>
     </table>
   */
  public ApiResponse<GetDocumentTagFieldBoxPositionResponse> postGetDocumentTagFieldBoxPositionWithHttpInfo(String contentType, GetDocumentTagFieldBoxPositionRequest getDocumentTagFieldBoxPositionRequest) throws ApiException {
    Object localVarPostBody = getDocumentTagFieldBoxPositionRequest;
    
    // verify the required parameter 'contentType' is set
    if (contentType == null) {
      throw new ApiException(400, "Missing the required parameter 'contentType' when calling postGetDocumentTagFieldBoxPosition");
    }
    
    // create path and map variables
    String localVarPath = "/GetDocumentTagFieldBoxPosition";

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

    GenericType<GetDocumentTagFieldBoxPositionResponse> localVarReturnType = new GenericType<GetDocumentTagFieldBoxPositionResponse>() {};

    return apiClient.invokeAPI("TemplatesApi.postGetDocumentTagFieldBoxPosition", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Get Document Tag Field Position
   * #### Used to get the tag position on a document.
   * @param contentType  (required)
   * @param getDocumentTagFieldPositionRequest ##### Get Document Tag Field Position Request Model (optional)
   * @return GetDocumentTagFieldPositionResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> ##### Get Document Tag Field Position Response Model </td><td>  * Content-Type -  <br>  </td></tr>
     </table>
   */
  public GetDocumentTagFieldPositionResponse postGetDocumentTagFieldPosition(String contentType, GetDocumentTagFieldPositionRequest getDocumentTagFieldPositionRequest) throws ApiException {
    return postGetDocumentTagFieldPositionWithHttpInfo(contentType, getDocumentTagFieldPositionRequest).getData();
  }

  /**
   * Get Document Tag Field Position
   * #### Used to get the tag position on a document.
   * @param contentType  (required)
   * @param getDocumentTagFieldPositionRequest ##### Get Document Tag Field Position Request Model (optional)
   * @return ApiResponse&lt;GetDocumentTagFieldPositionResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> ##### Get Document Tag Field Position Response Model </td><td>  * Content-Type -  <br>  </td></tr>
     </table>
   */
  public ApiResponse<GetDocumentTagFieldPositionResponse> postGetDocumentTagFieldPositionWithHttpInfo(String contentType, GetDocumentTagFieldPositionRequest getDocumentTagFieldPositionRequest) throws ApiException {
    Object localVarPostBody = getDocumentTagFieldPositionRequest;
    
    // verify the required parameter 'contentType' is set
    if (contentType == null) {
      throw new ApiException(400, "Missing the required parameter 'contentType' when calling postGetDocumentTagFieldPosition");
    }
    
    // create path and map variables
    String localVarPath = "/GetDocumentTagFieldPosition";

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

    GenericType<GetDocumentTagFieldPositionResponse> localVarReturnType = new GenericType<GetDocumentTagFieldPositionResponse>() {};

    return apiClient.invokeAPI("TemplatesApi.postGetDocumentTagFieldPosition", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Get Prepper Template
   * #### Used to get a document template.
   * @param contentType  (required)
   * @param getPrepperTemplateRequest ##### Get Prepper Template Request Model (optional)
   * @return GetPrepperTemplateResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> ##### Get Prepper Template Response Model </td><td>  * Content-Type -  <br>  </td></tr>
     </table>
   */
  public GetPrepperTemplateResponse postGetPrepperTemplate(String contentType, GetPrepperTemplateRequest getPrepperTemplateRequest) throws ApiException {
    return postGetPrepperTemplateWithHttpInfo(contentType, getPrepperTemplateRequest).getData();
  }

  /**
   * Get Prepper Template
   * #### Used to get a document template.
   * @param contentType  (required)
   * @param getPrepperTemplateRequest ##### Get Prepper Template Request Model (optional)
   * @return ApiResponse&lt;GetPrepperTemplateResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> ##### Get Prepper Template Response Model </td><td>  * Content-Type -  <br>  </td></tr>
     </table>
   */
  public ApiResponse<GetPrepperTemplateResponse> postGetPrepperTemplateWithHttpInfo(String contentType, GetPrepperTemplateRequest getPrepperTemplateRequest) throws ApiException {
    Object localVarPostBody = getPrepperTemplateRequest;
    
    // verify the required parameter 'contentType' is set
    if (contentType == null) {
      throw new ApiException(400, "Missing the required parameter 'contentType' when calling postGetPrepperTemplate");
    }
    
    // create path and map variables
    String localVarPath = "/GetPrepperTemplate";

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

    GenericType<GetPrepperTemplateResponse> localVarReturnType = new GenericType<GetPrepperTemplateResponse>() {};

    return apiClient.invokeAPI("TemplatesApi.postGetPrepperTemplate", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Get Prepper Template List
   * #### Used to get a list of document templates.
   * @param contentType  (required)
   * @param getPrepperTemplateListRequest ##### Get Prepper Template List Request Model (optional)
   * @return GetPrepperTemplateListResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> ##### Get Prepper Template List Response Model </td><td>  * Content-Type -  <br>  </td></tr>
     </table>
   */
  public GetPrepperTemplateListResponse postGetPrepperTemplateList(String contentType, GetPrepperTemplateListRequest getPrepperTemplateListRequest) throws ApiException {
    return postGetPrepperTemplateListWithHttpInfo(contentType, getPrepperTemplateListRequest).getData();
  }

  /**
   * Get Prepper Template List
   * #### Used to get a list of document templates.
   * @param contentType  (required)
   * @param getPrepperTemplateListRequest ##### Get Prepper Template List Request Model (optional)
   * @return ApiResponse&lt;GetPrepperTemplateListResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> ##### Get Prepper Template List Response Model </td><td>  * Content-Type -  <br>  </td></tr>
     </table>
   */
  public ApiResponse<GetPrepperTemplateListResponse> postGetPrepperTemplateListWithHttpInfo(String contentType, GetPrepperTemplateListRequest getPrepperTemplateListRequest) throws ApiException {
    Object localVarPostBody = getPrepperTemplateListRequest;
    
    // verify the required parameter 'contentType' is set
    if (contentType == null) {
      throw new ApiException(400, "Missing the required parameter 'contentType' when calling postGetPrepperTemplateList");
    }
    
    // create path and map variables
    String localVarPath = "/GetPrepperTemplateList";

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

    GenericType<GetPrepperTemplateListResponse> localVarReturnType = new GenericType<GetPrepperTemplateListResponse>() {};

    return apiClient.invokeAPI("TemplatesApi.postGetPrepperTemplateList", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
}

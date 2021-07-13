package com.SigniFlowup.connect.api;

import com.SigniFlowup.connect.ApiException;
import com.SigniFlowup.connect.ApiClient;
import com.SigniFlowup.connect.ApiResponse;
import com.SigniFlowup.connect.Configuration;
import com.SigniFlowup.connect.Pair;

import javax.ws.rs.core.GenericType;

import com.SigniFlowup.connect.models.MultipleSignersSigningCeremonyRequest;
import com.SigniFlowup.connect.models.MultipleSignersSigningCeremonyResponse;
import com.SigniFlowup.connect.models.SigningCeremonyV2Request;
import com.SigniFlowup.connect.models.SigningCeremonyV2Response;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class SigningCeremonyApi {
  private ApiClient apiClient;

  public SigningCeremonyApi() {
    this(Configuration.getDefaultApiClient());
  }

  public SigningCeremonyApi(ApiClient apiClient) {
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
   * Multiple Signers Signing Ceremony
   * #### Used when there are multiple signers on a document.
   * @param contentType  (required)
   * @param multipleSignersSigningCeremonyRequest ##### Multiple Signers Signing Ceremony Request Model (optional)
   * @return MultipleSignersSigningCeremonyResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> ##### Multiple Signers Signing Ceremony Response Model </td><td>  * Content-Type -  <br>  </td></tr>
     </table>
   */
  public MultipleSignersSigningCeremonyResponse postMultipleSignersSigningCeremony(String contentType, MultipleSignersSigningCeremonyRequest multipleSignersSigningCeremonyRequest) throws ApiException {
    return postMultipleSignersSigningCeremonyWithHttpInfo(contentType, multipleSignersSigningCeremonyRequest).getData();
  }

  /**
   * Multiple Signers Signing Ceremony
   * #### Used when there are multiple signers on a document.
   * @param contentType  (required)
   * @param multipleSignersSigningCeremonyRequest ##### Multiple Signers Signing Ceremony Request Model (optional)
   * @return ApiResponse&lt;MultipleSignersSigningCeremonyResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> ##### Multiple Signers Signing Ceremony Response Model </td><td>  * Content-Type -  <br>  </td></tr>
     </table>
   */
  public ApiResponse<MultipleSignersSigningCeremonyResponse> postMultipleSignersSigningCeremonyWithHttpInfo(String contentType, MultipleSignersSigningCeremonyRequest multipleSignersSigningCeremonyRequest) throws ApiException {
    Object localVarPostBody = multipleSignersSigningCeremonyRequest;
    
    // verify the required parameter 'contentType' is set
    if (contentType == null) {
      throw new ApiException(400, "Missing the required parameter 'contentType' when calling postMultipleSignersSigningCeremony");
    }
    
    // create path and map variables
    String localVarPath = "/MultipleSignersSigningCeremony";

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

    GenericType<MultipleSignersSigningCeremonyResponse> localVarReturnType = new GenericType<MultipleSignersSigningCeremonyResponse>() {};

    return apiClient.invokeAPI("SigningCeremonyApi.postMultipleSignersSigningCeremony", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Signing Ceremony V2
   * #### Used to initiate the signing process of a document.
   * @param contentType  (required)
   * @param signingCeremonyV2Request ##### Signing Ceremony V2 Request Model (optional)
   * @return SigningCeremonyV2Response
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> ##### Signing Ceremony V2 Response Model </td><td>  * Content-Type -  <br>  </td></tr>
     </table>
   */
  public SigningCeremonyV2Response postSigningCeremonyV2(String contentType, SigningCeremonyV2Request signingCeremonyV2Request) throws ApiException {
    return postSigningCeremonyV2WithHttpInfo(contentType, signingCeremonyV2Request).getData();
  }

  /**
   * Signing Ceremony V2
   * #### Used to initiate the signing process of a document.
   * @param contentType  (required)
   * @param signingCeremonyV2Request ##### Signing Ceremony V2 Request Model (optional)
   * @return ApiResponse&lt;SigningCeremonyV2Response&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> ##### Signing Ceremony V2 Response Model </td><td>  * Content-Type -  <br>  </td></tr>
     </table>
   */
  public ApiResponse<SigningCeremonyV2Response> postSigningCeremonyV2WithHttpInfo(String contentType, SigningCeremonyV2Request signingCeremonyV2Request) throws ApiException {
    Object localVarPostBody = signingCeremonyV2Request;
    
    // verify the required parameter 'contentType' is set
    if (contentType == null) {
      throw new ApiException(400, "Missing the required parameter 'contentType' when calling postSigningCeremonyV2");
    }
    
    // create path and map variables
    String localVarPath = "/SigningCeremonyV2";

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

    GenericType<SigningCeremonyV2Response> localVarReturnType = new GenericType<SigningCeremonyV2Response>() {};

    return apiClient.invokeAPI("SigningCeremonyApi.postSigningCeremonyV2", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
}

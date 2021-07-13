package com.SigniFlowup.connect.api;

import com.SigniFlowup.connect.ApiException;
import com.SigniFlowup.connect.ApiClient;
import com.SigniFlowup.connect.ApiResponse;
import com.SigniFlowup.connect.Configuration;
import com.SigniFlowup.connect.Pair;

import javax.ws.rs.core.GenericType;

import com.SigniFlowup.connect.models.LoginRequest;
import com.SigniFlowup.connect.models.LoginResponse;
import com.SigniFlowup.connect.models.LogoutRequest;
import com.SigniFlowup.connect.models.LogoutResponse;
import com.SigniFlowup.connect.models.TokenExtendRequest;
import com.SigniFlowup.connect.models.TokenExtendResponse;
import com.SigniFlowup.connect.models.TokenValidateRequest;
import com.SigniFlowup.connect.models.TokenValidateResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AuthenticationApi {
  private ApiClient apiClient;

  public AuthenticationApi() {
    this(Configuration.getDefaultApiClient());
  }

  public AuthenticationApi(ApiClient apiClient) {
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
   * Login
   * #### Generates a API Token for the User
   * @param contentType  (required)
   * @param loginRequest ##### Login Request Model (required)
   * @return LoginResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> ##### Login Response Model </td><td>  * Content-Type -  <br>  </td></tr>
     </table>
   */
  public LoginResponse login(String contentType, LoginRequest loginRequest) throws ApiException {
    return loginWithHttpInfo(contentType, loginRequest).getData();
  }

  /**
   * Login
   * #### Generates a API Token for the User
   * @param contentType  (required)
   * @param loginRequest ##### Login Request Model (required)
   * @return ApiResponse&lt;LoginResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> ##### Login Response Model </td><td>  * Content-Type -  <br>  </td></tr>
     </table>
   */
  public ApiResponse<LoginResponse> loginWithHttpInfo(String contentType, LoginRequest loginRequest) throws ApiException {
    Object localVarPostBody = loginRequest;
    
    // verify the required parameter 'contentType' is set
    if (contentType == null) {
      throw new ApiException(400, "Missing the required parameter 'contentType' when calling login");
    }
    
    // verify the required parameter 'loginRequest' is set
    if (loginRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'loginRequest' when calling login");
    }
    
    // create path and map variables
    String localVarPath = "/Login";

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

    GenericType<LoginResponse> localVarReturnType = new GenericType<LoginResponse>() {};

    return apiClient.invokeAPI("AuthenticationApi.login", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Logout
   * #### Used to log out a user from SigniFlow.
   * @param contentType  (required)
   * @param logoutRequest ##### Logout Request Model (optional)
   * @return LogoutResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> ##### Logout Response Model </td><td>  * Content-Type -  <br>  </td></tr>
     </table>
   */
  public LogoutResponse postLogout(String contentType, LogoutRequest logoutRequest) throws ApiException {
    return postLogoutWithHttpInfo(contentType, logoutRequest).getData();
  }

  /**
   * Logout
   * #### Used to log out a user from SigniFlow.
   * @param contentType  (required)
   * @param logoutRequest ##### Logout Request Model (optional)
   * @return ApiResponse&lt;LogoutResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> ##### Logout Response Model </td><td>  * Content-Type -  <br>  </td></tr>
     </table>
   */
  public ApiResponse<LogoutResponse> postLogoutWithHttpInfo(String contentType, LogoutRequest logoutRequest) throws ApiException {
    Object localVarPostBody = logoutRequest;
    
    // verify the required parameter 'contentType' is set
    if (contentType == null) {
      throw new ApiException(400, "Missing the required parameter 'contentType' when calling postLogout");
    }
    
    // create path and map variables
    String localVarPath = "/Logout";

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

    GenericType<LogoutResponse> localVarReturnType = new GenericType<LogoutResponse>() {};

    return apiClient.invokeAPI("AuthenticationApi.postLogout", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Token Extend
   * #### Used to extend the period of time in which the session token is valid.
   * @param contentType  (required)
   * @param tokenExtendRequest ##### Token Extend Request Model (optional)
   * @return TokenExtendResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> ##### Token Extend Response Model </td><td>  * Content-Type -  <br>  </td></tr>
     </table>
   */
  public TokenExtendResponse postTokenExtend(String contentType, TokenExtendRequest tokenExtendRequest) throws ApiException {
    return postTokenExtendWithHttpInfo(contentType, tokenExtendRequest).getData();
  }

  /**
   * Token Extend
   * #### Used to extend the period of time in which the session token is valid.
   * @param contentType  (required)
   * @param tokenExtendRequest ##### Token Extend Request Model (optional)
   * @return ApiResponse&lt;TokenExtendResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> ##### Token Extend Response Model </td><td>  * Content-Type -  <br>  </td></tr>
     </table>
   */
  public ApiResponse<TokenExtendResponse> postTokenExtendWithHttpInfo(String contentType, TokenExtendRequest tokenExtendRequest) throws ApiException {
    Object localVarPostBody = tokenExtendRequest;
    
    // verify the required parameter 'contentType' is set
    if (contentType == null) {
      throw new ApiException(400, "Missing the required parameter 'contentType' when calling postTokenExtend");
    }
    
    // create path and map variables
    String localVarPath = "/TokenExtend";

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

    GenericType<TokenExtendResponse> localVarReturnType = new GenericType<TokenExtendResponse>() {};

    return apiClient.invokeAPI("AuthenticationApi.postTokenExtend", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Token Validate
   * #### Used to validate the user&#39;s session token.
   * @param contentType  (required)
   * @param tokenValidateRequest ##### Token Validate Request Model (optional)
   * @return TokenValidateResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> ##### Token Validate Response Model </td><td>  * Content-Type -  <br>  </td></tr>
     </table>
   */
  public TokenValidateResponse postTokenValidate(String contentType, TokenValidateRequest tokenValidateRequest) throws ApiException {
    return postTokenValidateWithHttpInfo(contentType, tokenValidateRequest).getData();
  }

  /**
   * Token Validate
   * #### Used to validate the user&#39;s session token.
   * @param contentType  (required)
   * @param tokenValidateRequest ##### Token Validate Request Model (optional)
   * @return ApiResponse&lt;TokenValidateResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> ##### Token Validate Response Model </td><td>  * Content-Type -  <br>  </td></tr>
     </table>
   */
  public ApiResponse<TokenValidateResponse> postTokenValidateWithHttpInfo(String contentType, TokenValidateRequest tokenValidateRequest) throws ApiException {
    Object localVarPostBody = tokenValidateRequest;
    
    // verify the required parameter 'contentType' is set
    if (contentType == null) {
      throw new ApiException(400, "Missing the required parameter 'contentType' when calling postTokenValidate");
    }
    
    // create path and map variables
    String localVarPath = "/TokenValidate";

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

    GenericType<TokenValidateResponse> localVarReturnType = new GenericType<TokenValidateResponse>() {};

    return apiClient.invokeAPI("AuthenticationApi.postTokenValidate", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
}

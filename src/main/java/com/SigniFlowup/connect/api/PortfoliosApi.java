package com.SigniFlowup.connect.api;

import com.SigniFlowup.connect.ApiException;
import com.SigniFlowup.connect.ApiClient;
import com.SigniFlowup.connect.ApiResponse;
import com.SigniFlowup.connect.Configuration;
import com.SigniFlowup.connect.Pair;

import javax.ws.rs.core.GenericType;

import com.SigniFlowup.connect.models.CreatePortfolioRequest;
import com.SigniFlowup.connect.models.CreatePortfolioResponse;
import com.SigniFlowup.connect.models.DownloadPortfolioRequest;
import com.SigniFlowup.connect.models.DownloadPortfolioResponse;
import com.SigniFlowup.connect.models.LinkToPortfolioRequest;
import com.SigniFlowup.connect.models.LinkToPortfolioResponse;
import com.SigniFlowup.connect.models.SetDocumentOrderRequest;
import com.SigniFlowup.connect.models.SetDocumentOrderResponse;
import com.SigniFlowup.connect.models.SharePortfolioNoEmailRequest;
import com.SigniFlowup.connect.models.SharePortfolioNoEmailResponse;
import com.SigniFlowup.connect.models.SharePortfolioRequest;
import com.SigniFlowup.connect.models.SharePortfolioResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class PortfoliosApi {
  private ApiClient apiClient;

  public PortfoliosApi() {
    this(Configuration.getDefaultApiClient());
  }

  public PortfoliosApi(ApiClient apiClient) {
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
   * Create Portfolio
   * #### Used to create a portfolio to group documents.
   * @param contentType  (required)
   * @param createPortfolioRequest ##### Create Portfolio Request Model (optional)
   * @return CreatePortfolioResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> ##### Create Portfolio Response Model </td><td>  * Content-Type -  <br>  </td></tr>
     </table>
   */
  public CreatePortfolioResponse postCreatePortfolio(String contentType, CreatePortfolioRequest createPortfolioRequest) throws ApiException {
    return postCreatePortfolioWithHttpInfo(contentType, createPortfolioRequest).getData();
  }

  /**
   * Create Portfolio
   * #### Used to create a portfolio to group documents.
   * @param contentType  (required)
   * @param createPortfolioRequest ##### Create Portfolio Request Model (optional)
   * @return ApiResponse&lt;CreatePortfolioResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> ##### Create Portfolio Response Model </td><td>  * Content-Type -  <br>  </td></tr>
     </table>
   */
  public ApiResponse<CreatePortfolioResponse> postCreatePortfolioWithHttpInfo(String contentType, CreatePortfolioRequest createPortfolioRequest) throws ApiException {
    Object localVarPostBody = createPortfolioRequest;
    
    // verify the required parameter 'contentType' is set
    if (contentType == null) {
      throw new ApiException(400, "Missing the required parameter 'contentType' when calling postCreatePortfolio");
    }
    
    // create path and map variables
    String localVarPath = "/CreatePortfolio";

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

    GenericType<CreatePortfolioResponse> localVarReturnType = new GenericType<CreatePortfolioResponse>() {};

    return apiClient.invokeAPI("PortfoliosApi.postCreatePortfolio", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Download Portfolio
   * #### Used to return a string that is then used to download a portfolio.
   * @param contentType  (required)
   * @param downloadPortfolioRequest ##### Download Portfolio Request Model (optional)
   * @return DownloadPortfolioResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> ##### Download Portfolio Response Model </td><td>  * Content-Type -  <br>  </td></tr>
     </table>
   */
  public DownloadPortfolioResponse postDownloadPortfolio(String contentType, DownloadPortfolioRequest downloadPortfolioRequest) throws ApiException {
    return postDownloadPortfolioWithHttpInfo(contentType, downloadPortfolioRequest).getData();
  }

  /**
   * Download Portfolio
   * #### Used to return a string that is then used to download a portfolio.
   * @param contentType  (required)
   * @param downloadPortfolioRequest ##### Download Portfolio Request Model (optional)
   * @return ApiResponse&lt;DownloadPortfolioResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> ##### Download Portfolio Response Model </td><td>  * Content-Type -  <br>  </td></tr>
     </table>
   */
  public ApiResponse<DownloadPortfolioResponse> postDownloadPortfolioWithHttpInfo(String contentType, DownloadPortfolioRequest downloadPortfolioRequest) throws ApiException {
    Object localVarPostBody = downloadPortfolioRequest;
    
    // verify the required parameter 'contentType' is set
    if (contentType == null) {
      throw new ApiException(400, "Missing the required parameter 'contentType' when calling postDownloadPortfolio");
    }
    
    // create path and map variables
    String localVarPath = "/DownloadPortfolio";

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

    GenericType<DownloadPortfolioResponse> localVarReturnType = new GenericType<DownloadPortfolioResponse>() {};

    return apiClient.invokeAPI("PortfoliosApi.postDownloadPortfolio", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Link To Portfolio
   * #### Used to get the url link to a portfolio.
   * @param contentType  (required)
   * @param linkToPortfolioRequest ##### Link To Portfolio Request Model (optional)
   * @return LinkToPortfolioResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> ##### Link To Portfolio Response Model </td><td>  * Content-Type -  <br>  </td></tr>
     </table>
   */
  public LinkToPortfolioResponse postLinkToPortfolio(String contentType, LinkToPortfolioRequest linkToPortfolioRequest) throws ApiException {
    return postLinkToPortfolioWithHttpInfo(contentType, linkToPortfolioRequest).getData();
  }

  /**
   * Link To Portfolio
   * #### Used to get the url link to a portfolio.
   * @param contentType  (required)
   * @param linkToPortfolioRequest ##### Link To Portfolio Request Model (optional)
   * @return ApiResponse&lt;LinkToPortfolioResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> ##### Link To Portfolio Response Model </td><td>  * Content-Type -  <br>  </td></tr>
     </table>
   */
  public ApiResponse<LinkToPortfolioResponse> postLinkToPortfolioWithHttpInfo(String contentType, LinkToPortfolioRequest linkToPortfolioRequest) throws ApiException {
    Object localVarPostBody = linkToPortfolioRequest;
    
    // verify the required parameter 'contentType' is set
    if (contentType == null) {
      throw new ApiException(400, "Missing the required parameter 'contentType' when calling postLinkToPortfolio");
    }
    
    // create path and map variables
    String localVarPath = "/LinkToPortfolio";

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

    GenericType<LinkToPortfolioResponse> localVarReturnType = new GenericType<LinkToPortfolioResponse>() {};

    return apiClient.invokeAPI("PortfoliosApi.postLinkToPortfolio", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Set Document Order
   * #### Used to set the order of documents that needs to be signed.
   * @param contentType  (required)
   * @param setDocumentOrderRequest ##### Set Document Order Request Model (optional)
   * @return SetDocumentOrderResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> ##### Set Document Order Response Model </td><td>  * Content-Type -  <br>  </td></tr>
     </table>
   */
  public SetDocumentOrderResponse postSetDocumentOrder(String contentType, SetDocumentOrderRequest setDocumentOrderRequest) throws ApiException {
    return postSetDocumentOrderWithHttpInfo(contentType, setDocumentOrderRequest).getData();
  }

  /**
   * Set Document Order
   * #### Used to set the order of documents that needs to be signed.
   * @param contentType  (required)
   * @param setDocumentOrderRequest ##### Set Document Order Request Model (optional)
   * @return ApiResponse&lt;SetDocumentOrderResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> ##### Set Document Order Response Model </td><td>  * Content-Type -  <br>  </td></tr>
     </table>
   */
  public ApiResponse<SetDocumentOrderResponse> postSetDocumentOrderWithHttpInfo(String contentType, SetDocumentOrderRequest setDocumentOrderRequest) throws ApiException {
    Object localVarPostBody = setDocumentOrderRequest;
    
    // verify the required parameter 'contentType' is set
    if (contentType == null) {
      throw new ApiException(400, "Missing the required parameter 'contentType' when calling postSetDocumentOrder");
    }
    
    // create path and map variables
    String localVarPath = "/SetDocumentOrder";

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

    GenericType<SetDocumentOrderResponse> localVarReturnType = new GenericType<SetDocumentOrderResponse>() {};

    return apiClient.invokeAPI("PortfoliosApi.postSetDocumentOrder", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Share Portfolio
   * #### Used when a user wants to share a portfolio with someone else.
   * @param contentType  (required)
   * @param sharePortfolioRequest ##### Share Portfolio Request Model (optional)
   * @return SharePortfolioResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> ##### Share Portfolio Response Model </td><td>  * Content-Type -  <br>  </td></tr>
     </table>
   */
  public SharePortfolioResponse postSharePortfolio(String contentType, SharePortfolioRequest sharePortfolioRequest) throws ApiException {
    return postSharePortfolioWithHttpInfo(contentType, sharePortfolioRequest).getData();
  }

  /**
   * Share Portfolio
   * #### Used when a user wants to share a portfolio with someone else.
   * @param contentType  (required)
   * @param sharePortfolioRequest ##### Share Portfolio Request Model (optional)
   * @return ApiResponse&lt;SharePortfolioResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> ##### Share Portfolio Response Model </td><td>  * Content-Type -  <br>  </td></tr>
     </table>
   */
  public ApiResponse<SharePortfolioResponse> postSharePortfolioWithHttpInfo(String contentType, SharePortfolioRequest sharePortfolioRequest) throws ApiException {
    Object localVarPostBody = sharePortfolioRequest;
    
    // verify the required parameter 'contentType' is set
    if (contentType == null) {
      throw new ApiException(400, "Missing the required parameter 'contentType' when calling postSharePortfolio");
    }
    
    // create path and map variables
    String localVarPath = "/SharePortfolio";

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

    GenericType<SharePortfolioResponse> localVarReturnType = new GenericType<SharePortfolioResponse>() {};

    return apiClient.invokeAPI("PortfoliosApi.postSharePortfolio", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Share Portfolio No Email
   * #### Used when a user wants to share a portfolio without sending out an email.
   * @param contentType  (required)
   * @param sharePortfolioNoEmailRequest ##### Share Portfolio No Email Request Model (optional)
   * @return SharePortfolioNoEmailResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> ##### Share Portfolio No Email Response Model </td><td>  * Content-Type -  <br>  </td></tr>
     </table>
   */
  public SharePortfolioNoEmailResponse postSharePortfolioNoEmail(String contentType, SharePortfolioNoEmailRequest sharePortfolioNoEmailRequest) throws ApiException {
    return postSharePortfolioNoEmailWithHttpInfo(contentType, sharePortfolioNoEmailRequest).getData();
  }

  /**
   * Share Portfolio No Email
   * #### Used when a user wants to share a portfolio without sending out an email.
   * @param contentType  (required)
   * @param sharePortfolioNoEmailRequest ##### Share Portfolio No Email Request Model (optional)
   * @return ApiResponse&lt;SharePortfolioNoEmailResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> ##### Share Portfolio No Email Response Model </td><td>  * Content-Type -  <br>  </td></tr>
     </table>
   */
  public ApiResponse<SharePortfolioNoEmailResponse> postSharePortfolioNoEmailWithHttpInfo(String contentType, SharePortfolioNoEmailRequest sharePortfolioNoEmailRequest) throws ApiException {
    Object localVarPostBody = sharePortfolioNoEmailRequest;
    
    // verify the required parameter 'contentType' is set
    if (contentType == null) {
      throw new ApiException(400, "Missing the required parameter 'contentType' when calling postSharePortfolioNoEmail");
    }
    
    // create path and map variables
    String localVarPath = "/SharePortfolio_No_Email";

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

    GenericType<SharePortfolioNoEmailResponse> localVarReturnType = new GenericType<SharePortfolioNoEmailResponse>() {};

    return apiClient.invokeAPI("PortfoliosApi.postSharePortfolioNoEmail", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
}

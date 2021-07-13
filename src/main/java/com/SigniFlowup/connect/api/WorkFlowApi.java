package com.SigniFlowup.connect.api;

import com.SigniFlowup.connect.ApiException;
import com.SigniFlowup.connect.ApiClient;
import com.SigniFlowup.connect.ApiResponse;
import com.SigniFlowup.connect.Configuration;
import com.SigniFlowup.connect.Pair;

import javax.ws.rs.core.GenericType;

import com.SigniFlowup.connect.models.AddWokflowStepV2Response;
import com.SigniFlowup.connect.models.AddWorkflowStepV2Request;
import com.SigniFlowup.connect.models.CancelFlowRequest;
import com.SigniFlowup.connect.models.CancelFlowResponse;
import com.SigniFlowup.connect.models.CreateWorkflowRequest;
import com.SigniFlowup.connect.models.CreateWorkflowResponse;
import com.SigniFlowup.connect.models.DeleteDocRequest;
import com.SigniFlowup.connect.models.DeleteDocResponse;
import com.SigniFlowup.connect.models.DocPrepperAddAdvancedFieldsRequest;
import com.SigniFlowup.connect.models.DocPrepperAddAdvancedFieldsResponse;
import com.SigniFlowup.connect.models.DocPrepperAddFieldsFlowIDRequest;
import com.SigniFlowup.connect.models.DocPrepperAddFieldsFlowIDResponse;
import com.SigniFlowup.connect.models.FullWorkflowRequest;
import com.SigniFlowup.connect.models.FullWorkflowResponse;
import com.SigniFlowup.connect.models.GetDocStatusRequest;
import com.SigniFlowup.connect.models.GetDocStatusResponse;
import com.SigniFlowup.connect.models.GetDocumentRequest;
import com.SigniFlowup.connect.models.GetDocumentResponse;
import com.SigniFlowup.connect.models.InitiateFlowNoEmailRequest;
import com.SigniFlowup.connect.models.InitiateFlowNoEmailResponse;
import com.SigniFlowup.connect.models.InitiateFlowNoInitialEmailRequest;
import com.SigniFlowup.connect.models.InitiateFlowNoInitialEmailResponse;
import com.SigniFlowup.connect.models.InitiateFlowRequest;
import com.SigniFlowup.connect.models.InitiateFlowResponse;
import com.SigniFlowup.connect.models.WorkflowSignRequest;
import com.SigniFlowup.connect.models.WorkflowSignResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class WorkFlowApi {
  private ApiClient apiClient;

  public WorkFlowApi() {
    this(Configuration.getDefaultApiClient());
  }

  public WorkFlowApi(ApiClient apiClient) {
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
   * Create Workflow
   * #### Used to start a new workflow by passing a Base64 encoded document to SigniFlow
   * @param contentType  (required)
   * @param createWorkflowRequest ##### Create Workflow Request Model (required)
   * @return CreateWorkflowResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> ##### Create Workflow Response Model </td><td>  * Content-Type -  <br>  </td></tr>
     </table>
   */
  public CreateWorkflowResponse createWorkflow(String contentType, CreateWorkflowRequest createWorkflowRequest) throws ApiException {
    return createWorkflowWithHttpInfo(contentType, createWorkflowRequest).getData();
  }

  /**
   * Create Workflow
   * #### Used to start a new workflow by passing a Base64 encoded document to SigniFlow
   * @param contentType  (required)
   * @param createWorkflowRequest ##### Create Workflow Request Model (required)
   * @return ApiResponse&lt;CreateWorkflowResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> ##### Create Workflow Response Model </td><td>  * Content-Type -  <br>  </td></tr>
     </table>
   */
  public ApiResponse<CreateWorkflowResponse> createWorkflowWithHttpInfo(String contentType, CreateWorkflowRequest createWorkflowRequest) throws ApiException {
    Object localVarPostBody = createWorkflowRequest;
    
    // verify the required parameter 'contentType' is set
    if (contentType == null) {
      throw new ApiException(400, "Missing the required parameter 'contentType' when calling createWorkflow");
    }
    
    // verify the required parameter 'createWorkflowRequest' is set
    if (createWorkflowRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'createWorkflowRequest' when calling createWorkflow");
    }
    
    // create path and map variables
    String localVarPath = "/CreateWorkflow";

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

    GenericType<CreateWorkflowResponse> localVarReturnType = new GenericType<CreateWorkflowResponse>() {};

    return apiClient.invokeAPI("WorkFlowApi.createWorkflow", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Get Document
   * #### Used to download a document from SigniFlow.
   * @param contentType  (required)
   * @param getDocumentRequest ##### Get Document Request Model (optional)
   * @return GetDocumentResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> ##### Get Document Response Model </td><td>  * Content-Type -  <br>  </td></tr>
     </table>
   */
  public GetDocumentResponse getDocument(String contentType, GetDocumentRequest getDocumentRequest) throws ApiException {
    return getDocumentWithHttpInfo(contentType, getDocumentRequest).getData();
  }

  /**
   * Get Document
   * #### Used to download a document from SigniFlow.
   * @param contentType  (required)
   * @param getDocumentRequest ##### Get Document Request Model (optional)
   * @return ApiResponse&lt;GetDocumentResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> ##### Get Document Response Model </td><td>  * Content-Type -  <br>  </td></tr>
     </table>
   */
  public ApiResponse<GetDocumentResponse> getDocumentWithHttpInfo(String contentType, GetDocumentRequest getDocumentRequest) throws ApiException {
    Object localVarPostBody = getDocumentRequest;
    
    // verify the required parameter 'contentType' is set
    if (contentType == null) {
      throw new ApiException(400, "Missing the required parameter 'contentType' when calling getDocument");
    }
    
    // create path and map variables
    String localVarPath = "/GetDoc";

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

    GenericType<GetDocumentResponse> localVarReturnType = new GenericType<GetDocumentResponse>() {};

    return apiClient.invokeAPI("WorkFlowApi.getDocument", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Add a Workflow step
   * #### Used to add a step to a document Workflow process.
   * @param contentType  (required)
   * @param addWorkflowStepV2Request ##### Add A Workflow Step Request Model (optional)
   * @return AddWokflowStepV2Response
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> ##### Add A Workflow Step Response Model </td><td>  * Content-Type -  <br>  </td></tr>
     </table>
   */
  public AddWokflowStepV2Response postAddWorkflowStep(String contentType, AddWorkflowStepV2Request addWorkflowStepV2Request) throws ApiException {
    return postAddWorkflowStepWithHttpInfo(contentType, addWorkflowStepV2Request).getData();
  }

  /**
   * Add a Workflow step
   * #### Used to add a step to a document Workflow process.
   * @param contentType  (required)
   * @param addWorkflowStepV2Request ##### Add A Workflow Step Request Model (optional)
   * @return ApiResponse&lt;AddWokflowStepV2Response&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> ##### Add A Workflow Step Response Model </td><td>  * Content-Type -  <br>  </td></tr>
     </table>
   */
  public ApiResponse<AddWokflowStepV2Response> postAddWorkflowStepWithHttpInfo(String contentType, AddWorkflowStepV2Request addWorkflowStepV2Request) throws ApiException {
    Object localVarPostBody = addWorkflowStepV2Request;
    
    // verify the required parameter 'contentType' is set
    if (contentType == null) {
      throw new ApiException(400, "Missing the required parameter 'contentType' when calling postAddWorkflowStep");
    }
    
    // create path and map variables
    String localVarPath = "/AddWorkflowStepV2";

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

    GenericType<AddWokflowStepV2Response> localVarReturnType = new GenericType<AddWokflowStepV2Response>() {};

    return apiClient.invokeAPI("WorkFlowApi.postAddWorkflowStep", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Cancel Flow
   * #### Used to cancel a document workflow.
   * @param contentType  (required)
   * @param cancelFlowRequest ##### Cancel Flow Request Model (optional)
   * @return CancelFlowResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> ##### Cancel Flow Response Model </td><td>  * Content-Type -  <br>  </td></tr>
     </table>
   */
  public CancelFlowResponse postCancelFlow(String contentType, CancelFlowRequest cancelFlowRequest) throws ApiException {
    return postCancelFlowWithHttpInfo(contentType, cancelFlowRequest).getData();
  }

  /**
   * Cancel Flow
   * #### Used to cancel a document workflow.
   * @param contentType  (required)
   * @param cancelFlowRequest ##### Cancel Flow Request Model (optional)
   * @return ApiResponse&lt;CancelFlowResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> ##### Cancel Flow Response Model </td><td>  * Content-Type -  <br>  </td></tr>
     </table>
   */
  public ApiResponse<CancelFlowResponse> postCancelFlowWithHttpInfo(String contentType, CancelFlowRequest cancelFlowRequest) throws ApiException {
    Object localVarPostBody = cancelFlowRequest;
    
    // verify the required parameter 'contentType' is set
    if (contentType == null) {
      throw new ApiException(400, "Missing the required parameter 'contentType' when calling postCancelFlow");
    }
    
    // create path and map variables
    String localVarPath = "/CancelFlow";

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

    GenericType<CancelFlowResponse> localVarReturnType = new GenericType<CancelFlowResponse>() {};

    return apiClient.invokeAPI("WorkFlowApi.postCancelFlow", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Delete Document
   * #### This is used to delete a document.
   * @param contentType  (required)
   * @param deleteDocRequest ##### Delete Document Request Model (optional)
   * @return DeleteDocResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> ##### Delete Document Response Model </td><td>  * Content-Type -  <br>  </td></tr>
     </table>
   */
  public DeleteDocResponse postDeleteDoc(String contentType, DeleteDocRequest deleteDocRequest) throws ApiException {
    return postDeleteDocWithHttpInfo(contentType, deleteDocRequest).getData();
  }

  /**
   * Delete Document
   * #### This is used to delete a document.
   * @param contentType  (required)
   * @param deleteDocRequest ##### Delete Document Request Model (optional)
   * @return ApiResponse&lt;DeleteDocResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> ##### Delete Document Response Model </td><td>  * Content-Type -  <br>  </td></tr>
     </table>
   */
  public ApiResponse<DeleteDocResponse> postDeleteDocWithHttpInfo(String contentType, DeleteDocRequest deleteDocRequest) throws ApiException {
    Object localVarPostBody = deleteDocRequest;
    
    // verify the required parameter 'contentType' is set
    if (contentType == null) {
      throw new ApiException(400, "Missing the required parameter 'contentType' when calling postDeleteDoc");
    }
    
    // create path and map variables
    String localVarPath = "/DeleteDoc";

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

    GenericType<DeleteDocResponse> localVarReturnType = new GenericType<DeleteDocResponse>() {};

    return apiClient.invokeAPI("WorkFlowApi.postDeleteDoc", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Document Prepper Add Fields
   * #### Used to add fields to a document using the user&#39;s FlowID.
   * @param contentType  (required)
   * @param docPrepperAddFieldsFlowIDRequest ##### Document Prepper Add Fields Request Model (optional)
   * @return DocPrepperAddFieldsFlowIDResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> ##### Document Prepper Add Fields Response Model </td><td>  * Content-Type -  <br>  </td></tr>
     </table>
   */
  public DocPrepperAddFieldsFlowIDResponse postDocPrepperAddField(String contentType, DocPrepperAddFieldsFlowIDRequest docPrepperAddFieldsFlowIDRequest) throws ApiException {
    return postDocPrepperAddFieldWithHttpInfo(contentType, docPrepperAddFieldsFlowIDRequest).getData();
  }

  /**
   * Document Prepper Add Fields
   * #### Used to add fields to a document using the user&#39;s FlowID.
   * @param contentType  (required)
   * @param docPrepperAddFieldsFlowIDRequest ##### Document Prepper Add Fields Request Model (optional)
   * @return ApiResponse&lt;DocPrepperAddFieldsFlowIDResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> ##### Document Prepper Add Fields Response Model </td><td>  * Content-Type -  <br>  </td></tr>
     </table>
   */
  public ApiResponse<DocPrepperAddFieldsFlowIDResponse> postDocPrepperAddFieldWithHttpInfo(String contentType, DocPrepperAddFieldsFlowIDRequest docPrepperAddFieldsFlowIDRequest) throws ApiException {
    Object localVarPostBody = docPrepperAddFieldsFlowIDRequest;
    
    // verify the required parameter 'contentType' is set
    if (contentType == null) {
      throw new ApiException(400, "Missing the required parameter 'contentType' when calling postDocPrepperAddField");
    }
    
    // create path and map variables
    String localVarPath = "/DocPrepperAddFieldsFlowID";

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

    GenericType<DocPrepperAddFieldsFlowIDResponse> localVarReturnType = new GenericType<DocPrepperAddFieldsFlowIDResponse>() {};

    return apiClient.invokeAPI("WorkFlowApi.postDocPrepperAddField", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Document Prepper Add Advanced Fields
   * #### Used to add advanced fields to a document.
   * @param contentType  (required)
   * @param docPrepperAddAdvancedFieldsRequest ##### Document Prepper Add Advanced Fields Request Model (optional)
   * @return DocPrepperAddAdvancedFieldsResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> ##### Document Prepper Add Advanced Fields Response Model </td><td>  * Content-Type -  <br>  </td></tr>
     </table>
   */
  public DocPrepperAddAdvancedFieldsResponse postDocPrepperAdvancedFields(String contentType, DocPrepperAddAdvancedFieldsRequest docPrepperAddAdvancedFieldsRequest) throws ApiException {
    return postDocPrepperAdvancedFieldsWithHttpInfo(contentType, docPrepperAddAdvancedFieldsRequest).getData();
  }

  /**
   * Document Prepper Add Advanced Fields
   * #### Used to add advanced fields to a document.
   * @param contentType  (required)
   * @param docPrepperAddAdvancedFieldsRequest ##### Document Prepper Add Advanced Fields Request Model (optional)
   * @return ApiResponse&lt;DocPrepperAddAdvancedFieldsResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> ##### Document Prepper Add Advanced Fields Response Model </td><td>  * Content-Type -  <br>  </td></tr>
     </table>
   */
  public ApiResponse<DocPrepperAddAdvancedFieldsResponse> postDocPrepperAdvancedFieldsWithHttpInfo(String contentType, DocPrepperAddAdvancedFieldsRequest docPrepperAddAdvancedFieldsRequest) throws ApiException {
    Object localVarPostBody = docPrepperAddAdvancedFieldsRequest;
    
    // verify the required parameter 'contentType' is set
    if (contentType == null) {
      throw new ApiException(400, "Missing the required parameter 'contentType' when calling postDocPrepperAdvancedFields");
    }
    
    // create path and map variables
    String localVarPath = "/DocPrepperAdvancedFields";

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

    GenericType<DocPrepperAddAdvancedFieldsResponse> localVarReturnType = new GenericType<DocPrepperAddAdvancedFieldsResponse>() {};

    return apiClient.invokeAPI("WorkFlowApi.postDocPrepperAdvancedFields", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * FullWorkflow
   * #### Used to create a fullworkflow for a document.
   * @param contentType  (required)
   * @param fullWorkflowRequest ##### FullWorkflow Request Model (optional)
   * @return FullWorkflowResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> ##### FullWorkflow Response Model </td><td>  * Content-Type -  <br>  </td></tr>
     </table>
   */
  public FullWorkflowResponse postFullWorkflow(String contentType, FullWorkflowRequest fullWorkflowRequest) throws ApiException {
    return postFullWorkflowWithHttpInfo(contentType, fullWorkflowRequest).getData();
  }

  /**
   * FullWorkflow
   * #### Used to create a fullworkflow for a document.
   * @param contentType  (required)
   * @param fullWorkflowRequest ##### FullWorkflow Request Model (optional)
   * @return ApiResponse&lt;FullWorkflowResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> ##### FullWorkflow Response Model </td><td>  * Content-Type -  <br>  </td></tr>
     </table>
   */
  public ApiResponse<FullWorkflowResponse> postFullWorkflowWithHttpInfo(String contentType, FullWorkflowRequest fullWorkflowRequest) throws ApiException {
    Object localVarPostBody = fullWorkflowRequest;
    
    // verify the required parameter 'contentType' is set
    if (contentType == null) {
      throw new ApiException(400, "Missing the required parameter 'contentType' when calling postFullWorkflow");
    }
    
    // create path and map variables
    String localVarPath = "/FullWorkflow";

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

    GenericType<FullWorkflowResponse> localVarReturnType = new GenericType<FullWorkflowResponse>() {};

    return apiClient.invokeAPI("WorkFlowApi.postFullWorkflow", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Get Document Status
   * #### Used to get the status of the document ex. pending/completed/rejected.
   * @param contentType  (required)
   * @param getDocStatusRequest ##### Get Document Status Request Model (optional)
   * @return GetDocStatusResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> ##### Get Document Status Response Model </td><td>  * Content-Type -  <br>  </td></tr>
     </table>
   */
  public GetDocStatusResponse postGetDocStatus(String contentType, GetDocStatusRequest getDocStatusRequest) throws ApiException {
    return postGetDocStatusWithHttpInfo(contentType, getDocStatusRequest).getData();
  }

  /**
   * Get Document Status
   * #### Used to get the status of the document ex. pending/completed/rejected.
   * @param contentType  (required)
   * @param getDocStatusRequest ##### Get Document Status Request Model (optional)
   * @return ApiResponse&lt;GetDocStatusResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> ##### Get Document Status Response Model </td><td>  * Content-Type -  <br>  </td></tr>
     </table>
   */
  public ApiResponse<GetDocStatusResponse> postGetDocStatusWithHttpInfo(String contentType, GetDocStatusRequest getDocStatusRequest) throws ApiException {
    Object localVarPostBody = getDocStatusRequest;
    
    // verify the required parameter 'contentType' is set
    if (contentType == null) {
      throw new ApiException(400, "Missing the required parameter 'contentType' when calling postGetDocStatus");
    }
    
    // create path and map variables
    String localVarPath = "/GetDocStatus";

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

    GenericType<GetDocStatusResponse> localVarReturnType = new GenericType<GetDocStatusResponse>() {};

    return apiClient.invokeAPI("WorkFlowApi.postGetDocStatus", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Initiate Flow
   * #### Used to initiate aworkflow of a document.
   * @param contentType  (required)
   * @param initiateFlowRequest ##### Initiate Flow Request Model (optional)
   * @return InitiateFlowResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> ##### Initiate Flow Response Model </td><td>  * Content-Type -  <br>  </td></tr>
     </table>
   */
  public InitiateFlowResponse postInitiateFlow(String contentType, InitiateFlowRequest initiateFlowRequest) throws ApiException {
    return postInitiateFlowWithHttpInfo(contentType, initiateFlowRequest).getData();
  }

  /**
   * Initiate Flow
   * #### Used to initiate aworkflow of a document.
   * @param contentType  (required)
   * @param initiateFlowRequest ##### Initiate Flow Request Model (optional)
   * @return ApiResponse&lt;InitiateFlowResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> ##### Initiate Flow Response Model </td><td>  * Content-Type -  <br>  </td></tr>
     </table>
   */
  public ApiResponse<InitiateFlowResponse> postInitiateFlowWithHttpInfo(String contentType, InitiateFlowRequest initiateFlowRequest) throws ApiException {
    Object localVarPostBody = initiateFlowRequest;
    
    // verify the required parameter 'contentType' is set
    if (contentType == null) {
      throw new ApiException(400, "Missing the required parameter 'contentType' when calling postInitiateFlow");
    }
    
    // create path and map variables
    String localVarPath = "/InitiateFlow";

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

    GenericType<InitiateFlowResponse> localVarReturnType = new GenericType<InitiateFlowResponse>() {};

    return apiClient.invokeAPI("WorkFlowApi.postInitiateFlow", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Initiate Flow No Email
   * #### Used to initiate a workflow without sending out emails.
   * @param contentType  (required)
   * @param initiateFlowNoEmailRequest ##### Initiate Flow No Email Request Model (optional)
   * @return InitiateFlowNoEmailResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> ##### Initiate Flow No Email Response Model </td><td>  * Content-Type -  <br>  </td></tr>
     </table>
   */
  public InitiateFlowNoEmailResponse postInitiateFlowNoEmail(String contentType, InitiateFlowNoEmailRequest initiateFlowNoEmailRequest) throws ApiException {
    return postInitiateFlowNoEmailWithHttpInfo(contentType, initiateFlowNoEmailRequest).getData();
  }

  /**
   * Initiate Flow No Email
   * #### Used to initiate a workflow without sending out emails.
   * @param contentType  (required)
   * @param initiateFlowNoEmailRequest ##### Initiate Flow No Email Request Model (optional)
   * @return ApiResponse&lt;InitiateFlowNoEmailResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> ##### Initiate Flow No Email Response Model </td><td>  * Content-Type -  <br>  </td></tr>
     </table>
   */
  public ApiResponse<InitiateFlowNoEmailResponse> postInitiateFlowNoEmailWithHttpInfo(String contentType, InitiateFlowNoEmailRequest initiateFlowNoEmailRequest) throws ApiException {
    Object localVarPostBody = initiateFlowNoEmailRequest;
    
    // verify the required parameter 'contentType' is set
    if (contentType == null) {
      throw new ApiException(400, "Missing the required parameter 'contentType' when calling postInitiateFlowNoEmail");
    }
    
    // create path and map variables
    String localVarPath = "/InitiateFlow_No_Email";

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

    GenericType<InitiateFlowNoEmailResponse> localVarReturnType = new GenericType<InitiateFlowNoEmailResponse>() {};

    return apiClient.invokeAPI("WorkFlowApi.postInitiateFlowNoEmail", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Initiate Flow No Initial Email
   * #### Used to initiate a document workflow without an initial email being sent to the user.
   * @param contentType  (required)
   * @param initiateFlowNoInitialEmailRequest ##### Initiate Flow No Initial Email Request Model (optional)
   * @return InitiateFlowNoInitialEmailResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> ##### Initiate Flow No Initial Email Response Model </td><td>  * Content-Type -  <br>  </td></tr>
     </table>
   */
  public InitiateFlowNoInitialEmailResponse postInitiateFlowNoInitialEmail(String contentType, InitiateFlowNoInitialEmailRequest initiateFlowNoInitialEmailRequest) throws ApiException {
    return postInitiateFlowNoInitialEmailWithHttpInfo(contentType, initiateFlowNoInitialEmailRequest).getData();
  }

  /**
   * Initiate Flow No Initial Email
   * #### Used to initiate a document workflow without an initial email being sent to the user.
   * @param contentType  (required)
   * @param initiateFlowNoInitialEmailRequest ##### Initiate Flow No Initial Email Request Model (optional)
   * @return ApiResponse&lt;InitiateFlowNoInitialEmailResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> ##### Initiate Flow No Initial Email Response Model </td><td>  * Content-Type -  <br>  </td></tr>
     </table>
   */
  public ApiResponse<InitiateFlowNoInitialEmailResponse> postInitiateFlowNoInitialEmailWithHttpInfo(String contentType, InitiateFlowNoInitialEmailRequest initiateFlowNoInitialEmailRequest) throws ApiException {
    Object localVarPostBody = initiateFlowNoInitialEmailRequest;
    
    // verify the required parameter 'contentType' is set
    if (contentType == null) {
      throw new ApiException(400, "Missing the required parameter 'contentType' when calling postInitiateFlowNoInitialEmail");
    }
    
    // create path and map variables
    String localVarPath = "/InitiateFlow_No_Initial_Email";

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

    GenericType<InitiateFlowNoInitialEmailResponse> localVarReturnType = new GenericType<InitiateFlowNoInitialEmailResponse>() {};

    return apiClient.invokeAPI("WorkFlowApi.postInitiateFlowNoInitialEmail", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Workflow Sign
   * #### Used to send a request to a user to sign a document workflow.
   * @param contentType  (required)
   * @param workflowSignRequest ##### Workflow Sign Request Model (optional)
   * @return WorkflowSignResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> ##### Workflow Sign Response Model </td><td>  * Content-Type -  <br>  </td></tr>
     </table>
   */
  public WorkflowSignResponse postWorkflowSign(String contentType, WorkflowSignRequest workflowSignRequest) throws ApiException {
    return postWorkflowSignWithHttpInfo(contentType, workflowSignRequest).getData();
  }

  /**
   * Workflow Sign
   * #### Used to send a request to a user to sign a document workflow.
   * @param contentType  (required)
   * @param workflowSignRequest ##### Workflow Sign Request Model (optional)
   * @return ApiResponse&lt;WorkflowSignResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> ##### Workflow Sign Response Model </td><td>  * Content-Type -  <br>  </td></tr>
     </table>
   */
  public ApiResponse<WorkflowSignResponse> postWorkflowSignWithHttpInfo(String contentType, WorkflowSignRequest workflowSignRequest) throws ApiException {
    Object localVarPostBody = workflowSignRequest;
    
    // verify the required parameter 'contentType' is set
    if (contentType == null) {
      throw new ApiException(400, "Missing the required parameter 'contentType' when calling postWorkflowSign");
    }
    
    // create path and map variables
    String localVarPath = "/WorkflowSign";

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

    GenericType<WorkflowSignResponse> localVarReturnType = new GenericType<WorkflowSignResponse>() {};

    return apiClient.invokeAPI("WorkFlowApi.postWorkflowSign", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
}

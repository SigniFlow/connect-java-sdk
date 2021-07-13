# WorkFlowApi

All URIs are relative to *https://server-url/API/SignFlowAPIServiceRest.svc*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createWorkflow**](WorkFlowApi.md#createWorkflow) | **POST** /CreateWorkflow | Create Workflow
[**getDocument**](WorkFlowApi.md#getDocument) | **POST** /GetDoc | Get Document
[**postAddWorkflowStep**](WorkFlowApi.md#postAddWorkflowStep) | **POST** /AddWorkflowStepV2 | Add a Workflow step
[**postCancelFlow**](WorkFlowApi.md#postCancelFlow) | **POST** /CancelFlow | Cancel Flow
[**postDeleteDoc**](WorkFlowApi.md#postDeleteDoc) | **POST** /DeleteDoc | Delete Document
[**postDocPrepperAddField**](WorkFlowApi.md#postDocPrepperAddField) | **POST** /DocPrepperAddFieldsFlowID | Document Prepper Add Fields
[**postDocPrepperAdvancedFields**](WorkFlowApi.md#postDocPrepperAdvancedFields) | **POST** /DocPrepperAdvancedFields | Document Prepper Add Advanced Fields
[**postFullWorkflow**](WorkFlowApi.md#postFullWorkflow) | **POST** /FullWorkflow | FullWorkflow
[**postGetDocStatus**](WorkFlowApi.md#postGetDocStatus) | **POST** /GetDocStatus | Get Document Status
[**postInitiateFlow**](WorkFlowApi.md#postInitiateFlow) | **POST** /InitiateFlow | Initiate Flow
[**postInitiateFlowNoEmail**](WorkFlowApi.md#postInitiateFlowNoEmail) | **POST** /InitiateFlow_No_Email | Initiate Flow No Email
[**postInitiateFlowNoInitialEmail**](WorkFlowApi.md#postInitiateFlowNoInitialEmail) | **POST** /InitiateFlow_No_Initial_Email | Initiate Flow No Initial Email
[**postWorkflowSign**](WorkFlowApi.md#postWorkflowSign) | **POST** /WorkflowSign | Workflow Sign



## createWorkflow

> CreateWorkflowResponse createWorkflow(contentType, createWorkflowRequest)

Create Workflow

#### Used to start a new workflow by passing a Base64 encoded document to SigniFlow

### Example

```java
// Import classes:
import com.SigniFlowup.connect.ApiClient;
import com.SigniFlowup.connect.ApiException;
import com.SigniFlowup.connect.Configuration;
import com.SigniFlowup.connect.model.*;
import com.SigniFlowup.connect.api.WorkFlowApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://server-url/API/SignFlowAPIServiceRest.svc");

        WorkFlowApi apiInstance = new WorkFlowApi(defaultClient);
        String contentType = "application/json"; // String | 
        CreateWorkflowRequest createWorkflowRequest = new CreateWorkflowRequest(); // CreateWorkflowRequest | ##### Create Workflow Request Model
        try {
            CreateWorkflowResponse result = apiInstance.createWorkflow(contentType, createWorkflowRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling WorkFlowApi#createWorkflow");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **contentType** | **String**|  | [default to application/json]
 **createWorkflowRequest** | [**CreateWorkflowRequest**](CreateWorkflowRequest.md)| ##### Create Workflow Request Model |

### Return type

[**CreateWorkflowResponse**](CreateWorkflowResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | ##### Create Workflow Response Model |  * Content-Type -  <br>  |


## getDocument

> GetDocumentResponse getDocument(contentType, getDocumentRequest)

Get Document

#### Used to download a document from SigniFlow.

### Example

```java
// Import classes:
import com.SigniFlowup.connect.ApiClient;
import com.SigniFlowup.connect.ApiException;
import com.SigniFlowup.connect.Configuration;
import com.SigniFlowup.connect.model.*;
import com.SigniFlowup.connect.api.WorkFlowApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://server-url/API/SignFlowAPIServiceRest.svc");

        WorkFlowApi apiInstance = new WorkFlowApi(defaultClient);
        String contentType = "application/json"; // String | 
        GetDocumentRequest getDocumentRequest = new GetDocumentRequest(); // GetDocumentRequest | ##### Get Document Request Model
        try {
            GetDocumentResponse result = apiInstance.getDocument(contentType, getDocumentRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling WorkFlowApi#getDocument");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **contentType** | **String**|  | [default to application/json]
 **getDocumentRequest** | [**GetDocumentRequest**](GetDocumentRequest.md)| ##### Get Document Request Model | [optional]

### Return type

[**GetDocumentResponse**](GetDocumentResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | ##### Get Document Response Model |  * Content-Type -  <br>  |


## postAddWorkflowStep

> AddWokflowStepV2Response postAddWorkflowStep(contentType, addWorkflowStepV2Request)

Add a Workflow step

#### Used to add a step to a document Workflow process.

### Example

```java
// Import classes:
import com.SigniFlowup.connect.ApiClient;
import com.SigniFlowup.connect.ApiException;
import com.SigniFlowup.connect.Configuration;
import com.SigniFlowup.connect.model.*;
import com.SigniFlowup.connect.api.WorkFlowApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://server-url/API/SignFlowAPIServiceRest.svc");

        WorkFlowApi apiInstance = new WorkFlowApi(defaultClient);
        String contentType = "application/json"; // String | 
        AddWorkflowStepV2Request addWorkflowStepV2Request = new AddWorkflowStepV2Request(); // AddWorkflowStepV2Request | ##### Add A Workflow Step Request Model
        try {
            AddWokflowStepV2Response result = apiInstance.postAddWorkflowStep(contentType, addWorkflowStepV2Request);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling WorkFlowApi#postAddWorkflowStep");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **contentType** | **String**|  | [default to application/json]
 **addWorkflowStepV2Request** | [**AddWorkflowStepV2Request**](AddWorkflowStepV2Request.md)| ##### Add A Workflow Step Request Model | [optional]

### Return type

[**AddWokflowStepV2Response**](AddWokflowStepV2Response.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | ##### Add A Workflow Step Response Model |  * Content-Type -  <br>  |


## postCancelFlow

> CancelFlowResponse postCancelFlow(contentType, cancelFlowRequest)

Cancel Flow

#### Used to cancel a document workflow.

### Example

```java
// Import classes:
import com.SigniFlowup.connect.ApiClient;
import com.SigniFlowup.connect.ApiException;
import com.SigniFlowup.connect.Configuration;
import com.SigniFlowup.connect.model.*;
import com.SigniFlowup.connect.api.WorkFlowApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://server-url/API/SignFlowAPIServiceRest.svc");

        WorkFlowApi apiInstance = new WorkFlowApi(defaultClient);
        String contentType = "application/json"; // String | 
        CancelFlowRequest cancelFlowRequest = new CancelFlowRequest(); // CancelFlowRequest | ##### Cancel Flow Request Model
        try {
            CancelFlowResponse result = apiInstance.postCancelFlow(contentType, cancelFlowRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling WorkFlowApi#postCancelFlow");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **contentType** | **String**|  | [default to application/json]
 **cancelFlowRequest** | [**CancelFlowRequest**](CancelFlowRequest.md)| ##### Cancel Flow Request Model | [optional]

### Return type

[**CancelFlowResponse**](CancelFlowResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | ##### Cancel Flow Response Model |  * Content-Type -  <br>  |


## postDeleteDoc

> DeleteDocResponse postDeleteDoc(contentType, deleteDocRequest)

Delete Document

#### This is used to delete a document.

### Example

```java
// Import classes:
import com.SigniFlowup.connect.ApiClient;
import com.SigniFlowup.connect.ApiException;
import com.SigniFlowup.connect.Configuration;
import com.SigniFlowup.connect.model.*;
import com.SigniFlowup.connect.api.WorkFlowApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://server-url/API/SignFlowAPIServiceRest.svc");

        WorkFlowApi apiInstance = new WorkFlowApi(defaultClient);
        String contentType = "application/json"; // String | 
        DeleteDocRequest deleteDocRequest = new DeleteDocRequest(); // DeleteDocRequest | ##### Delete Document Request Model
        try {
            DeleteDocResponse result = apiInstance.postDeleteDoc(contentType, deleteDocRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling WorkFlowApi#postDeleteDoc");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **contentType** | **String**|  | [default to application/json]
 **deleteDocRequest** | [**DeleteDocRequest**](DeleteDocRequest.md)| ##### Delete Document Request Model | [optional]

### Return type

[**DeleteDocResponse**](DeleteDocResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | ##### Delete Document Response Model |  * Content-Type -  <br>  |


## postDocPrepperAddField

> DocPrepperAddFieldsFlowIDResponse postDocPrepperAddField(contentType, docPrepperAddFieldsFlowIDRequest)

Document Prepper Add Fields

#### Used to add fields to a document using the user's FlowID.

### Example

```java
// Import classes:
import com.SigniFlowup.connect.ApiClient;
import com.SigniFlowup.connect.ApiException;
import com.SigniFlowup.connect.Configuration;
import com.SigniFlowup.connect.model.*;
import com.SigniFlowup.connect.api.WorkFlowApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://server-url/API/SignFlowAPIServiceRest.svc");

        WorkFlowApi apiInstance = new WorkFlowApi(defaultClient);
        String contentType = "application/json"; // String | 
        DocPrepperAddFieldsFlowIDRequest docPrepperAddFieldsFlowIDRequest = new DocPrepperAddFieldsFlowIDRequest(); // DocPrepperAddFieldsFlowIDRequest | ##### Document Prepper Add Fields Request Model
        try {
            DocPrepperAddFieldsFlowIDResponse result = apiInstance.postDocPrepperAddField(contentType, docPrepperAddFieldsFlowIDRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling WorkFlowApi#postDocPrepperAddField");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **contentType** | **String**|  | [default to application/json]
 **docPrepperAddFieldsFlowIDRequest** | [**DocPrepperAddFieldsFlowIDRequest**](DocPrepperAddFieldsFlowIDRequest.md)| ##### Document Prepper Add Fields Request Model | [optional]

### Return type

[**DocPrepperAddFieldsFlowIDResponse**](DocPrepperAddFieldsFlowIDResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | ##### Document Prepper Add Fields Response Model |  * Content-Type -  <br>  |


## postDocPrepperAdvancedFields

> DocPrepperAddAdvancedFieldsResponse postDocPrepperAdvancedFields(contentType, docPrepperAddAdvancedFieldsRequest)

Document Prepper Add Advanced Fields

#### Used to add advanced fields to a document.

### Example

```java
// Import classes:
import com.SigniFlowup.connect.ApiClient;
import com.SigniFlowup.connect.ApiException;
import com.SigniFlowup.connect.Configuration;
import com.SigniFlowup.connect.model.*;
import com.SigniFlowup.connect.api.WorkFlowApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://server-url/API/SignFlowAPIServiceRest.svc");

        WorkFlowApi apiInstance = new WorkFlowApi(defaultClient);
        String contentType = "application/json"; // String | 
        DocPrepperAddAdvancedFieldsRequest docPrepperAddAdvancedFieldsRequest = new DocPrepperAddAdvancedFieldsRequest(); // DocPrepperAddAdvancedFieldsRequest | ##### Document Prepper Add Advanced Fields Request Model
        try {
            DocPrepperAddAdvancedFieldsResponse result = apiInstance.postDocPrepperAdvancedFields(contentType, docPrepperAddAdvancedFieldsRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling WorkFlowApi#postDocPrepperAdvancedFields");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **contentType** | **String**|  | [default to application/json]
 **docPrepperAddAdvancedFieldsRequest** | [**DocPrepperAddAdvancedFieldsRequest**](DocPrepperAddAdvancedFieldsRequest.md)| ##### Document Prepper Add Advanced Fields Request Model | [optional]

### Return type

[**DocPrepperAddAdvancedFieldsResponse**](DocPrepperAddAdvancedFieldsResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | ##### Document Prepper Add Advanced Fields Response Model |  * Content-Type -  <br>  |


## postFullWorkflow

> FullWorkflowResponse postFullWorkflow(contentType, fullWorkflowRequest)

FullWorkflow

#### Used to create a fullworkflow for a document.

### Example

```java
// Import classes:
import com.SigniFlowup.connect.ApiClient;
import com.SigniFlowup.connect.ApiException;
import com.SigniFlowup.connect.Configuration;
import com.SigniFlowup.connect.model.*;
import com.SigniFlowup.connect.api.WorkFlowApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://server-url/API/SignFlowAPIServiceRest.svc");

        WorkFlowApi apiInstance = new WorkFlowApi(defaultClient);
        String contentType = "application/json"; // String | 
        FullWorkflowRequest fullWorkflowRequest = new FullWorkflowRequest(); // FullWorkflowRequest | ##### FullWorkflow Request Model
        try {
            FullWorkflowResponse result = apiInstance.postFullWorkflow(contentType, fullWorkflowRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling WorkFlowApi#postFullWorkflow");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **contentType** | **String**|  | [default to application/json]
 **fullWorkflowRequest** | [**FullWorkflowRequest**](FullWorkflowRequest.md)| ##### FullWorkflow Request Model | [optional]

### Return type

[**FullWorkflowResponse**](FullWorkflowResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | ##### FullWorkflow Response Model |  * Content-Type -  <br>  |


## postGetDocStatus

> GetDocStatusResponse postGetDocStatus(contentType, getDocStatusRequest)

Get Document Status

#### Used to get the status of the document ex. pending/completed/rejected.

### Example

```java
// Import classes:
import com.SigniFlowup.connect.ApiClient;
import com.SigniFlowup.connect.ApiException;
import com.SigniFlowup.connect.Configuration;
import com.SigniFlowup.connect.model.*;
import com.SigniFlowup.connect.api.WorkFlowApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://server-url/API/SignFlowAPIServiceRest.svc");

        WorkFlowApi apiInstance = new WorkFlowApi(defaultClient);
        String contentType = "application/json"; // String | 
        GetDocStatusRequest getDocStatusRequest = new GetDocStatusRequest(); // GetDocStatusRequest | ##### Get Document Status Request Model
        try {
            GetDocStatusResponse result = apiInstance.postGetDocStatus(contentType, getDocStatusRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling WorkFlowApi#postGetDocStatus");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **contentType** | **String**|  | [default to application/json]
 **getDocStatusRequest** | [**GetDocStatusRequest**](GetDocStatusRequest.md)| ##### Get Document Status Request Model | [optional]

### Return type

[**GetDocStatusResponse**](GetDocStatusResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | ##### Get Document Status Response Model |  * Content-Type -  <br>  |


## postInitiateFlow

> InitiateFlowResponse postInitiateFlow(contentType, initiateFlowRequest)

Initiate Flow

#### Used to initiate aworkflow of a document.

### Example

```java
// Import classes:
import com.SigniFlowup.connect.ApiClient;
import com.SigniFlowup.connect.ApiException;
import com.SigniFlowup.connect.Configuration;
import com.SigniFlowup.connect.model.*;
import com.SigniFlowup.connect.api.WorkFlowApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://server-url/API/SignFlowAPIServiceRest.svc");

        WorkFlowApi apiInstance = new WorkFlowApi(defaultClient);
        String contentType = "application/json"; // String | 
        InitiateFlowRequest initiateFlowRequest = new InitiateFlowRequest(); // InitiateFlowRequest | ##### Initiate Flow Request Model
        try {
            InitiateFlowResponse result = apiInstance.postInitiateFlow(contentType, initiateFlowRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling WorkFlowApi#postInitiateFlow");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **contentType** | **String**|  | [default to application/json]
 **initiateFlowRequest** | [**InitiateFlowRequest**](InitiateFlowRequest.md)| ##### Initiate Flow Request Model | [optional]

### Return type

[**InitiateFlowResponse**](InitiateFlowResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | ##### Initiate Flow Response Model |  * Content-Type -  <br>  |


## postInitiateFlowNoEmail

> InitiateFlowNoEmailResponse postInitiateFlowNoEmail(contentType, initiateFlowNoEmailRequest)

Initiate Flow No Email

#### Used to initiate a workflow without sending out emails.

### Example

```java
// Import classes:
import com.SigniFlowup.connect.ApiClient;
import com.SigniFlowup.connect.ApiException;
import com.SigniFlowup.connect.Configuration;
import com.SigniFlowup.connect.model.*;
import com.SigniFlowup.connect.api.WorkFlowApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://server-url/API/SignFlowAPIServiceRest.svc");

        WorkFlowApi apiInstance = new WorkFlowApi(defaultClient);
        String contentType = "application/json"; // String | 
        InitiateFlowNoEmailRequest initiateFlowNoEmailRequest = new InitiateFlowNoEmailRequest(); // InitiateFlowNoEmailRequest | ##### Initiate Flow No Email Request Model
        try {
            InitiateFlowNoEmailResponse result = apiInstance.postInitiateFlowNoEmail(contentType, initiateFlowNoEmailRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling WorkFlowApi#postInitiateFlowNoEmail");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **contentType** | **String**|  | [default to application/json]
 **initiateFlowNoEmailRequest** | [**InitiateFlowNoEmailRequest**](InitiateFlowNoEmailRequest.md)| ##### Initiate Flow No Email Request Model | [optional]

### Return type

[**InitiateFlowNoEmailResponse**](InitiateFlowNoEmailResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | ##### Initiate Flow No Email Response Model |  * Content-Type -  <br>  |


## postInitiateFlowNoInitialEmail

> InitiateFlowNoInitialEmailResponse postInitiateFlowNoInitialEmail(contentType, initiateFlowNoInitialEmailRequest)

Initiate Flow No Initial Email

#### Used to initiate a document workflow without an initial email being sent to the user.

### Example

```java
// Import classes:
import com.SigniFlowup.connect.ApiClient;
import com.SigniFlowup.connect.ApiException;
import com.SigniFlowup.connect.Configuration;
import com.SigniFlowup.connect.model.*;
import com.SigniFlowup.connect.api.WorkFlowApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://server-url/API/SignFlowAPIServiceRest.svc");

        WorkFlowApi apiInstance = new WorkFlowApi(defaultClient);
        String contentType = "application/json"; // String | 
        InitiateFlowNoInitialEmailRequest initiateFlowNoInitialEmailRequest = new InitiateFlowNoInitialEmailRequest(); // InitiateFlowNoInitialEmailRequest | ##### Initiate Flow No Initial Email Request Model
        try {
            InitiateFlowNoInitialEmailResponse result = apiInstance.postInitiateFlowNoInitialEmail(contentType, initiateFlowNoInitialEmailRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling WorkFlowApi#postInitiateFlowNoInitialEmail");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **contentType** | **String**|  | [default to application/json]
 **initiateFlowNoInitialEmailRequest** | [**InitiateFlowNoInitialEmailRequest**](InitiateFlowNoInitialEmailRequest.md)| ##### Initiate Flow No Initial Email Request Model | [optional]

### Return type

[**InitiateFlowNoInitialEmailResponse**](InitiateFlowNoInitialEmailResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | ##### Initiate Flow No Initial Email Response Model |  * Content-Type -  <br>  |


## postWorkflowSign

> WorkflowSignResponse postWorkflowSign(contentType, workflowSignRequest)

Workflow Sign

#### Used to send a request to a user to sign a document workflow.

### Example

```java
// Import classes:
import com.SigniFlowup.connect.ApiClient;
import com.SigniFlowup.connect.ApiException;
import com.SigniFlowup.connect.Configuration;
import com.SigniFlowup.connect.model.*;
import com.SigniFlowup.connect.api.WorkFlowApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://server-url/API/SignFlowAPIServiceRest.svc");

        WorkFlowApi apiInstance = new WorkFlowApi(defaultClient);
        String contentType = "application/json"; // String | 
        WorkflowSignRequest workflowSignRequest = new WorkflowSignRequest(); // WorkflowSignRequest | ##### Workflow Sign Request Model
        try {
            WorkflowSignResponse result = apiInstance.postWorkflowSign(contentType, workflowSignRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling WorkFlowApi#postWorkflowSign");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **contentType** | **String**|  | [default to application/json]
 **workflowSignRequest** | [**WorkflowSignRequest**](WorkflowSignRequest.md)| ##### Workflow Sign Request Model | [optional]

### Return type

[**WorkflowSignResponse**](WorkflowSignResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | ##### Workflow Sign Response Model |  * Content-Type -  <br>  |


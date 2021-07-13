# AuditsApi

All URIs are relative to *https://server-url/API/SignFlowAPIServiceRest.svc*

Method | HTTP request | Description
------------- | ------------- | -------------
[**postGetAuditDocument**](AuditsApi.md#postGetAuditDocument) | **POST** /GetAuditDocument | Get Audit Document
[**postGetDocumentAudit**](AuditsApi.md#postGetDocumentAudit) | **POST** /GetDocumentAudit | Get Document Audit



## postGetAuditDocument

> GetAuditDocumentResponse postGetAuditDocument(contentType, getAuditDocumentRequest)

Get Audit Document

#### Used to get an audit document.

### Example

```java
// Import classes:
import com.SigniFlowup.connect.ApiClient;
import com.SigniFlowup.connect.ApiException;
import com.SigniFlowup.connect.Configuration;
import com.SigniFlowup.connect.model.*;
import com.SigniFlowup.connect.api.AuditsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://server-url/API/SignFlowAPIServiceRest.svc");

        AuditsApi apiInstance = new AuditsApi(defaultClient);
        String contentType = "application/json"; // String | 
        GetAuditDocumentRequest getAuditDocumentRequest = new GetAuditDocumentRequest(); // GetAuditDocumentRequest | ##### Get Audit Document Request Model
        try {
            GetAuditDocumentResponse result = apiInstance.postGetAuditDocument(contentType, getAuditDocumentRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AuditsApi#postGetAuditDocument");
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
 **getAuditDocumentRequest** | [**GetAuditDocumentRequest**](GetAuditDocumentRequest.md)| ##### Get Audit Document Request Model | [optional]

### Return type

[**GetAuditDocumentResponse**](GetAuditDocumentResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | ##### Get Audit Document Response Model |  * Content-Type -  <br>  |


## postGetDocumentAudit

> GetDocumentAuditResponse postGetDocumentAudit(contentType, getDocumentAuditRequest)

Get Document Audit

#### Used to get the audit information from a document.

### Example

```java
// Import classes:
import com.SigniFlowup.connect.ApiClient;
import com.SigniFlowup.connect.ApiException;
import com.SigniFlowup.connect.Configuration;
import com.SigniFlowup.connect.model.*;
import com.SigniFlowup.connect.api.AuditsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://server-url/API/SignFlowAPIServiceRest.svc");

        AuditsApi apiInstance = new AuditsApi(defaultClient);
        String contentType = "application/json"; // String | 
        GetDocumentAuditRequest getDocumentAuditRequest = new GetDocumentAuditRequest(); // GetDocumentAuditRequest | ##### Get Document Audit Request Model
        try {
            GetDocumentAuditResponse result = apiInstance.postGetDocumentAudit(contentType, getDocumentAuditRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AuditsApi#postGetDocumentAudit");
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
 **getDocumentAuditRequest** | [**GetDocumentAuditRequest**](GetDocumentAuditRequest.md)| ##### Get Document Audit Request Model | [optional]

### Return type

[**GetDocumentAuditResponse**](GetDocumentAuditResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | ##### Get Document Audit Response Model |  * Content-Type -  <br>  |


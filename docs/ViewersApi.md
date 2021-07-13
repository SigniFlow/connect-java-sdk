# ViewersApi

All URIs are relative to *https://server-url/API/SignFlowAPIServiceRest.svc*

Method | HTTP request | Description
------------- | ------------- | -------------
[**postGetDocLink**](ViewersApi.md#postGetDocLink) | **POST** /GetDocLink | Get Document Link
[**postGetDocumentPrepperLink**](ViewersApi.md#postGetDocumentPrepperLink) | **POST** /GetDocumentPrepperLink | Get Document Prepper Link



## postGetDocLink

> GetDocLinkResponse postGetDocLink(contentType, getDocLinkRequest)

Get Document Link

#### Used to get the document link that will be used to sign a document.

### Example

```java
// Import classes:
import com.SigniFlowup.connect.ApiClient;
import com.SigniFlowup.connect.ApiException;
import com.SigniFlowup.connect.Configuration;
import com.SigniFlowup.connect.model.*;
import com.SigniFlowup.connect.api.ViewersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://server-url/API/SignFlowAPIServiceRest.svc");

        ViewersApi apiInstance = new ViewersApi(defaultClient);
        String contentType = "application/json"; // String | 
        GetDocLinkRequest getDocLinkRequest = new GetDocLinkRequest(); // GetDocLinkRequest | ##### Get Document Link Request Model
        try {
            GetDocLinkResponse result = apiInstance.postGetDocLink(contentType, getDocLinkRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ViewersApi#postGetDocLink");
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
 **getDocLinkRequest** | [**GetDocLinkRequest**](GetDocLinkRequest.md)| ##### Get Document Link Request Model | [optional]

### Return type

[**GetDocLinkResponse**](GetDocLinkResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | ##### Get Document Link Response Model |  * Content-Type -  <br>  |


## postGetDocumentPrepperLink

> GetDocumentPrepperLinkResponse postGetDocumentPrepperLink(contentType, getDocumentPrepperLinkRequest)

Get Document Prepper Link

#### Used to get a document prepper link (url).

### Example

```java
// Import classes:
import com.SigniFlowup.connect.ApiClient;
import com.SigniFlowup.connect.ApiException;
import com.SigniFlowup.connect.Configuration;
import com.SigniFlowup.connect.model.*;
import com.SigniFlowup.connect.api.ViewersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://server-url/API/SignFlowAPIServiceRest.svc");

        ViewersApi apiInstance = new ViewersApi(defaultClient);
        String contentType = "application/json"; // String | 
        GetDocumentPrepperLinkRequest getDocumentPrepperLinkRequest = new GetDocumentPrepperLinkRequest(); // GetDocumentPrepperLinkRequest | ##### Get Document Prepper Link Request Model
        try {
            GetDocumentPrepperLinkResponse result = apiInstance.postGetDocumentPrepperLink(contentType, getDocumentPrepperLinkRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ViewersApi#postGetDocumentPrepperLink");
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
 **getDocumentPrepperLinkRequest** | [**GetDocumentPrepperLinkRequest**](GetDocumentPrepperLinkRequest.md)| ##### Get Document Prepper Link Request Model | [optional]

### Return type

[**GetDocumentPrepperLinkResponse**](GetDocumentPrepperLinkResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | ##### Get Document Prepper Link Response Model |  * Content-Type -  <br>  |


# TemplatesApi

All URIs are relative to *https://server-url/API/SignFlowAPIServiceRest.svc*

Method | HTTP request | Description
------------- | ------------- | -------------
[**postApplyPrepperTemplate**](TemplatesApi.md#postApplyPrepperTemplate) | **POST** /ApplyPrepperTemplate | Apply a Prepper template
[**postGetDocumentTagFieldBoxPosition**](TemplatesApi.md#postGetDocumentTagFieldBoxPosition) | **POST** /GetDocumentTagFieldBoxPosition | Get Document Tag Field Box Position
[**postGetDocumentTagFieldPosition**](TemplatesApi.md#postGetDocumentTagFieldPosition) | **POST** /GetDocumentTagFieldPosition | Get Document Tag Field Position
[**postGetPrepperTemplate**](TemplatesApi.md#postGetPrepperTemplate) | **POST** /GetPrepperTemplate | Get Prepper Template
[**postGetPrepperTemplateList**](TemplatesApi.md#postGetPrepperTemplateList) | **POST** /GetPrepperTemplateList | Get Prepper Template List



## postApplyPrepperTemplate

> ApplyPrepperTemplateResponse postApplyPrepperTemplate(contentType, applyPrepperTemplateRequest)

Apply a Prepper template

#### Used when applying a templaet to a document.

### Example

```java
// Import classes:
import com.SigniFlowup.connect.ApiClient;
import com.SigniFlowup.connect.ApiException;
import com.SigniFlowup.connect.Configuration;
import com.SigniFlowup.connect.model.*;
import com.SigniFlowup.connect.api.TemplatesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://server-url/API/SignFlowAPIServiceRest.svc");

        TemplatesApi apiInstance = new TemplatesApi(defaultClient);
        String contentType = "application/json"; // String | 
        ApplyPrepperTemplateRequest applyPrepperTemplateRequest = new ApplyPrepperTemplateRequest(); // ApplyPrepperTemplateRequest | ##### Apply A Prepper Template Request Model
        try {
            ApplyPrepperTemplateResponse result = apiInstance.postApplyPrepperTemplate(contentType, applyPrepperTemplateRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TemplatesApi#postApplyPrepperTemplate");
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
 **applyPrepperTemplateRequest** | [**ApplyPrepperTemplateRequest**](ApplyPrepperTemplateRequest.md)| ##### Apply A Prepper Template Request Model | [optional]

### Return type

[**ApplyPrepperTemplateResponse**](ApplyPrepperTemplateResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | ##### Apply A Prepper Template Response Model |  * Content-Type -  <br>  |


## postGetDocumentTagFieldBoxPosition

> GetDocumentTagFieldBoxPositionResponse postGetDocumentTagFieldBoxPosition(contentType, getDocumentTagFieldBoxPositionRequest)

Get Document Tag Field Box Position

#### Used to get the tag field box position on a document.

### Example

```java
// Import classes:
import com.SigniFlowup.connect.ApiClient;
import com.SigniFlowup.connect.ApiException;
import com.SigniFlowup.connect.Configuration;
import com.SigniFlowup.connect.model.*;
import com.SigniFlowup.connect.api.TemplatesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://server-url/API/SignFlowAPIServiceRest.svc");

        TemplatesApi apiInstance = new TemplatesApi(defaultClient);
        String contentType = "application/json"; // String | 
        GetDocumentTagFieldBoxPositionRequest getDocumentTagFieldBoxPositionRequest = new GetDocumentTagFieldBoxPositionRequest(); // GetDocumentTagFieldBoxPositionRequest | ##### Get Document Tag Field Box Position Request Model
        try {
            GetDocumentTagFieldBoxPositionResponse result = apiInstance.postGetDocumentTagFieldBoxPosition(contentType, getDocumentTagFieldBoxPositionRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TemplatesApi#postGetDocumentTagFieldBoxPosition");
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
 **getDocumentTagFieldBoxPositionRequest** | [**GetDocumentTagFieldBoxPositionRequest**](GetDocumentTagFieldBoxPositionRequest.md)| ##### Get Document Tag Field Box Position Request Model | [optional]

### Return type

[**GetDocumentTagFieldBoxPositionResponse**](GetDocumentTagFieldBoxPositionResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | ##### Get Document Tag Field Box Position Response Model |  * Content-Type -  <br>  |


## postGetDocumentTagFieldPosition

> GetDocumentTagFieldPositionResponse postGetDocumentTagFieldPosition(contentType, getDocumentTagFieldPositionRequest)

Get Document Tag Field Position

#### Used to get the tag position on a document.

### Example

```java
// Import classes:
import com.SigniFlowup.connect.ApiClient;
import com.SigniFlowup.connect.ApiException;
import com.SigniFlowup.connect.Configuration;
import com.SigniFlowup.connect.model.*;
import com.SigniFlowup.connect.api.TemplatesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://server-url/API/SignFlowAPIServiceRest.svc");

        TemplatesApi apiInstance = new TemplatesApi(defaultClient);
        String contentType = "application/json"; // String | 
        GetDocumentTagFieldPositionRequest getDocumentTagFieldPositionRequest = new GetDocumentTagFieldPositionRequest(); // GetDocumentTagFieldPositionRequest | ##### Get Document Tag Field Position Request Model
        try {
            GetDocumentTagFieldPositionResponse result = apiInstance.postGetDocumentTagFieldPosition(contentType, getDocumentTagFieldPositionRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TemplatesApi#postGetDocumentTagFieldPosition");
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
 **getDocumentTagFieldPositionRequest** | [**GetDocumentTagFieldPositionRequest**](GetDocumentTagFieldPositionRequest.md)| ##### Get Document Tag Field Position Request Model | [optional]

### Return type

[**GetDocumentTagFieldPositionResponse**](GetDocumentTagFieldPositionResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | ##### Get Document Tag Field Position Response Model |  * Content-Type -  <br>  |


## postGetPrepperTemplate

> GetPrepperTemplateResponse postGetPrepperTemplate(contentType, getPrepperTemplateRequest)

Get Prepper Template

#### Used to get a document template.

### Example

```java
// Import classes:
import com.SigniFlowup.connect.ApiClient;
import com.SigniFlowup.connect.ApiException;
import com.SigniFlowup.connect.Configuration;
import com.SigniFlowup.connect.model.*;
import com.SigniFlowup.connect.api.TemplatesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://server-url/API/SignFlowAPIServiceRest.svc");

        TemplatesApi apiInstance = new TemplatesApi(defaultClient);
        String contentType = "application/json"; // String | 
        GetPrepperTemplateRequest getPrepperTemplateRequest = new GetPrepperTemplateRequest(); // GetPrepperTemplateRequest | ##### Get Prepper Template Request Model
        try {
            GetPrepperTemplateResponse result = apiInstance.postGetPrepperTemplate(contentType, getPrepperTemplateRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TemplatesApi#postGetPrepperTemplate");
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
 **getPrepperTemplateRequest** | [**GetPrepperTemplateRequest**](GetPrepperTemplateRequest.md)| ##### Get Prepper Template Request Model | [optional]

### Return type

[**GetPrepperTemplateResponse**](GetPrepperTemplateResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | ##### Get Prepper Template Response Model |  * Content-Type -  <br>  |


## postGetPrepperTemplateList

> GetPrepperTemplateListResponse postGetPrepperTemplateList(contentType, getPrepperTemplateListRequest)

Get Prepper Template List

#### Used to get a list of document templates.

### Example

```java
// Import classes:
import com.SigniFlowup.connect.ApiClient;
import com.SigniFlowup.connect.ApiException;
import com.SigniFlowup.connect.Configuration;
import com.SigniFlowup.connect.model.*;
import com.SigniFlowup.connect.api.TemplatesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://server-url/API/SignFlowAPIServiceRest.svc");

        TemplatesApi apiInstance = new TemplatesApi(defaultClient);
        String contentType = "application/json"; // String | 
        GetPrepperTemplateListRequest getPrepperTemplateListRequest = new GetPrepperTemplateListRequest(); // GetPrepperTemplateListRequest | ##### Get Prepper Template List Request Model
        try {
            GetPrepperTemplateListResponse result = apiInstance.postGetPrepperTemplateList(contentType, getPrepperTemplateListRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TemplatesApi#postGetPrepperTemplateList");
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
 **getPrepperTemplateListRequest** | [**GetPrepperTemplateListRequest**](GetPrepperTemplateListRequest.md)| ##### Get Prepper Template List Request Model | [optional]

### Return type

[**GetPrepperTemplateListResponse**](GetPrepperTemplateListResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | ##### Get Prepper Template List Response Model |  * Content-Type -  <br>  |


# PortfoliosApi

All URIs are relative to *https://server-url/API/SignFlowAPIServiceRest.svc*

Method | HTTP request | Description
------------- | ------------- | -------------
[**postCreatePortfolio**](PortfoliosApi.md#postCreatePortfolio) | **POST** /CreatePortfolio | Create Portfolio
[**postDownloadPortfolio**](PortfoliosApi.md#postDownloadPortfolio) | **POST** /DownloadPortfolio | Download Portfolio
[**postLinkToPortfolio**](PortfoliosApi.md#postLinkToPortfolio) | **POST** /LinkToPortfolio | Link To Portfolio
[**postSetDocumentOrder**](PortfoliosApi.md#postSetDocumentOrder) | **POST** /SetDocumentOrder | Set Document Order
[**postSharePortfolio**](PortfoliosApi.md#postSharePortfolio) | **POST** /SharePortfolio | Share Portfolio
[**postSharePortfolioNoEmail**](PortfoliosApi.md#postSharePortfolioNoEmail) | **POST** /SharePortfolio_No_Email | Share Portfolio No Email



## postCreatePortfolio

> CreatePortfolioResponse postCreatePortfolio(contentType, createPortfolioRequest)

Create Portfolio

#### Used to create a portfolio to group documents.

### Example

```java
// Import classes:
import com.SigniFlowup.connect.ApiClient;
import com.SigniFlowup.connect.ApiException;
import com.SigniFlowup.connect.Configuration;
import com.SigniFlowup.connect.model.*;
import com.SigniFlowup.connect.api.PortfoliosApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://server-url/API/SignFlowAPIServiceRest.svc");

        PortfoliosApi apiInstance = new PortfoliosApi(defaultClient);
        String contentType = "application/json"; // String | 
        CreatePortfolioRequest createPortfolioRequest = new CreatePortfolioRequest(); // CreatePortfolioRequest | ##### Create Portfolio Request Model
        try {
            CreatePortfolioResponse result = apiInstance.postCreatePortfolio(contentType, createPortfolioRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PortfoliosApi#postCreatePortfolio");
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
 **createPortfolioRequest** | [**CreatePortfolioRequest**](CreatePortfolioRequest.md)| ##### Create Portfolio Request Model | [optional]

### Return type

[**CreatePortfolioResponse**](CreatePortfolioResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | ##### Create Portfolio Response Model |  * Content-Type -  <br>  |


## postDownloadPortfolio

> DownloadPortfolioResponse postDownloadPortfolio(contentType, downloadPortfolioRequest)

Download Portfolio

#### Used to return a string that is then used to download a portfolio.

### Example

```java
// Import classes:
import com.SigniFlowup.connect.ApiClient;
import com.SigniFlowup.connect.ApiException;
import com.SigniFlowup.connect.Configuration;
import com.SigniFlowup.connect.model.*;
import com.SigniFlowup.connect.api.PortfoliosApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://server-url/API/SignFlowAPIServiceRest.svc");

        PortfoliosApi apiInstance = new PortfoliosApi(defaultClient);
        String contentType = "application/json"; // String | 
        DownloadPortfolioRequest downloadPortfolioRequest = new DownloadPortfolioRequest(); // DownloadPortfolioRequest | ##### Download Portfolio Request Model
        try {
            DownloadPortfolioResponse result = apiInstance.postDownloadPortfolio(contentType, downloadPortfolioRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PortfoliosApi#postDownloadPortfolio");
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
 **downloadPortfolioRequest** | [**DownloadPortfolioRequest**](DownloadPortfolioRequest.md)| ##### Download Portfolio Request Model | [optional]

### Return type

[**DownloadPortfolioResponse**](DownloadPortfolioResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | ##### Download Portfolio Response Model |  * Content-Type -  <br>  |


## postLinkToPortfolio

> LinkToPortfolioResponse postLinkToPortfolio(contentType, linkToPortfolioRequest)

Link To Portfolio

#### Used to get the url link to a portfolio.

### Example

```java
// Import classes:
import com.SigniFlowup.connect.ApiClient;
import com.SigniFlowup.connect.ApiException;
import com.SigniFlowup.connect.Configuration;
import com.SigniFlowup.connect.model.*;
import com.SigniFlowup.connect.api.PortfoliosApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://server-url/API/SignFlowAPIServiceRest.svc");

        PortfoliosApi apiInstance = new PortfoliosApi(defaultClient);
        String contentType = "application/json"; // String | 
        LinkToPortfolioRequest linkToPortfolioRequest = new LinkToPortfolioRequest(); // LinkToPortfolioRequest | ##### Link To Portfolio Request Model
        try {
            LinkToPortfolioResponse result = apiInstance.postLinkToPortfolio(contentType, linkToPortfolioRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PortfoliosApi#postLinkToPortfolio");
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
 **linkToPortfolioRequest** | [**LinkToPortfolioRequest**](LinkToPortfolioRequest.md)| ##### Link To Portfolio Request Model | [optional]

### Return type

[**LinkToPortfolioResponse**](LinkToPortfolioResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | ##### Link To Portfolio Response Model |  * Content-Type -  <br>  |


## postSetDocumentOrder

> SetDocumentOrderResponse postSetDocumentOrder(contentType, setDocumentOrderRequest)

Set Document Order

#### Used to set the order of documents that needs to be signed.

### Example

```java
// Import classes:
import com.SigniFlowup.connect.ApiClient;
import com.SigniFlowup.connect.ApiException;
import com.SigniFlowup.connect.Configuration;
import com.SigniFlowup.connect.model.*;
import com.SigniFlowup.connect.api.PortfoliosApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://server-url/API/SignFlowAPIServiceRest.svc");

        PortfoliosApi apiInstance = new PortfoliosApi(defaultClient);
        String contentType = "application/json"; // String | 
        SetDocumentOrderRequest setDocumentOrderRequest = new SetDocumentOrderRequest(); // SetDocumentOrderRequest | ##### Set Document Order Request Model
        try {
            SetDocumentOrderResponse result = apiInstance.postSetDocumentOrder(contentType, setDocumentOrderRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PortfoliosApi#postSetDocumentOrder");
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
 **setDocumentOrderRequest** | [**SetDocumentOrderRequest**](SetDocumentOrderRequest.md)| ##### Set Document Order Request Model | [optional]

### Return type

[**SetDocumentOrderResponse**](SetDocumentOrderResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | ##### Set Document Order Response Model |  * Content-Type -  <br>  |


## postSharePortfolio

> SharePortfolioResponse postSharePortfolio(contentType, sharePortfolioRequest)

Share Portfolio

#### Used when a user wants to share a portfolio with someone else.

### Example

```java
// Import classes:
import com.SigniFlowup.connect.ApiClient;
import com.SigniFlowup.connect.ApiException;
import com.SigniFlowup.connect.Configuration;
import com.SigniFlowup.connect.model.*;
import com.SigniFlowup.connect.api.PortfoliosApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://server-url/API/SignFlowAPIServiceRest.svc");

        PortfoliosApi apiInstance = new PortfoliosApi(defaultClient);
        String contentType = "application/json"; // String | 
        SharePortfolioRequest sharePortfolioRequest = new SharePortfolioRequest(); // SharePortfolioRequest | ##### Share Portfolio Request Model
        try {
            SharePortfolioResponse result = apiInstance.postSharePortfolio(contentType, sharePortfolioRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PortfoliosApi#postSharePortfolio");
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
 **sharePortfolioRequest** | [**SharePortfolioRequest**](SharePortfolioRequest.md)| ##### Share Portfolio Request Model | [optional]

### Return type

[**SharePortfolioResponse**](SharePortfolioResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | ##### Share Portfolio Response Model |  * Content-Type -  <br>  |


## postSharePortfolioNoEmail

> SharePortfolioNoEmailResponse postSharePortfolioNoEmail(contentType, sharePortfolioNoEmailRequest)

Share Portfolio No Email

#### Used when a user wants to share a portfolio without sending out an email.

### Example

```java
// Import classes:
import com.SigniFlowup.connect.ApiClient;
import com.SigniFlowup.connect.ApiException;
import com.SigniFlowup.connect.Configuration;
import com.SigniFlowup.connect.model.*;
import com.SigniFlowup.connect.api.PortfoliosApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://server-url/API/SignFlowAPIServiceRest.svc");

        PortfoliosApi apiInstance = new PortfoliosApi(defaultClient);
        String contentType = "application/json"; // String | 
        SharePortfolioNoEmailRequest sharePortfolioNoEmailRequest = new SharePortfolioNoEmailRequest(); // SharePortfolioNoEmailRequest | ##### Share Portfolio No Email Request Model
        try {
            SharePortfolioNoEmailResponse result = apiInstance.postSharePortfolioNoEmail(contentType, sharePortfolioNoEmailRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PortfoliosApi#postSharePortfolioNoEmail");
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
 **sharePortfolioNoEmailRequest** | [**SharePortfolioNoEmailRequest**](SharePortfolioNoEmailRequest.md)| ##### Share Portfolio No Email Request Model | [optional]

### Return type

[**SharePortfolioNoEmailResponse**](SharePortfolioNoEmailResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | ##### Share Portfolio No Email Response Model |  * Content-Type -  <br>  |


# SigningCeremonyApi

All URIs are relative to *https://server-url/API/SignFlowAPIServiceRest.svc*

Method | HTTP request | Description
------------- | ------------- | -------------
[**postMultipleSignersSigningCeremony**](SigningCeremonyApi.md#postMultipleSignersSigningCeremony) | **POST** /MultipleSignersSigningCeremony | Multiple Signers Signing Ceremony
[**postSigningCeremonyV2**](SigningCeremonyApi.md#postSigningCeremonyV2) | **POST** /SigningCeremonyV2 | Signing Ceremony V2



## postMultipleSignersSigningCeremony

> MultipleSignersSigningCeremonyResponse postMultipleSignersSigningCeremony(contentType, multipleSignersSigningCeremonyRequest)

Multiple Signers Signing Ceremony

#### Used when there are multiple signers on a document.

### Example

```java
// Import classes:
import com.SigniFlowup.connect.ApiClient;
import com.SigniFlowup.connect.ApiException;
import com.SigniFlowup.connect.Configuration;
import com.SigniFlowup.connect.model.*;
import com.SigniFlowup.connect.api.SigningCeremonyApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://server-url/API/SignFlowAPIServiceRest.svc");

        SigningCeremonyApi apiInstance = new SigningCeremonyApi(defaultClient);
        String contentType = "application/json"; // String | 
        MultipleSignersSigningCeremonyRequest multipleSignersSigningCeremonyRequest = new MultipleSignersSigningCeremonyRequest(); // MultipleSignersSigningCeremonyRequest | ##### Multiple Signers Signing Ceremony Request Model
        try {
            MultipleSignersSigningCeremonyResponse result = apiInstance.postMultipleSignersSigningCeremony(contentType, multipleSignersSigningCeremonyRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SigningCeremonyApi#postMultipleSignersSigningCeremony");
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
 **multipleSignersSigningCeremonyRequest** | [**MultipleSignersSigningCeremonyRequest**](MultipleSignersSigningCeremonyRequest.md)| ##### Multiple Signers Signing Ceremony Request Model | [optional]

### Return type

[**MultipleSignersSigningCeremonyResponse**](MultipleSignersSigningCeremonyResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | ##### Multiple Signers Signing Ceremony Response Model |  * Content-Type -  <br>  |


## postSigningCeremonyV2

> SigningCeremonyV2Response postSigningCeremonyV2(contentType, signingCeremonyV2Request)

Signing Ceremony V2

#### Used to initiate the signing process of a document.

### Example

```java
// Import classes:
import com.SigniFlowup.connect.ApiClient;
import com.SigniFlowup.connect.ApiException;
import com.SigniFlowup.connect.Configuration;
import com.SigniFlowup.connect.model.*;
import com.SigniFlowup.connect.api.SigningCeremonyApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://server-url/API/SignFlowAPIServiceRest.svc");

        SigningCeremonyApi apiInstance = new SigningCeremonyApi(defaultClient);
        String contentType = "application/json"; // String | 
        SigningCeremonyV2Request signingCeremonyV2Request = new SigningCeremonyV2Request(); // SigningCeremonyV2Request | ##### Signing Ceremony V2 Request Model
        try {
            SigningCeremonyV2Response result = apiInstance.postSigningCeremonyV2(contentType, signingCeremonyV2Request);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SigningCeremonyApi#postSigningCeremonyV2");
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
 **signingCeremonyV2Request** | [**SigningCeremonyV2Request**](SigningCeremonyV2Request.md)| ##### Signing Ceremony V2 Request Model | [optional]

### Return type

[**SigningCeremonyV2Response**](SigningCeremonyV2Response.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | ##### Signing Ceremony V2 Response Model |  * Content-Type -  <br>  |


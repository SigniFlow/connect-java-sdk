# AuthenticationApi

All URIs are relative to *https://server-url/API/SignFlowAPIServiceRest.svc*

Method | HTTP request | Description
------------- | ------------- | -------------
[**login**](AuthenticationApi.md#login) | **POST** /Login | Login
[**postLogout**](AuthenticationApi.md#postLogout) | **POST** /Logout | Logout
[**postTokenExtend**](AuthenticationApi.md#postTokenExtend) | **POST** /TokenExtend | Token Extend
[**postTokenValidate**](AuthenticationApi.md#postTokenValidate) | **POST** /TokenValidate | Token Validate



## login

> LoginResponse login(contentType, loginRequest)

Login

#### Generates a API Token for the User

### Example

```java
// Import classes:
import com.SigniFlowup.connect.ApiClient;
import com.SigniFlowup.connect.ApiException;
import com.SigniFlowup.connect.Configuration;
import com.SigniFlowup.connect.model.*;
import com.SigniFlowup.connect.api.AuthenticationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://server-url/API/SignFlowAPIServiceRest.svc");

        AuthenticationApi apiInstance = new AuthenticationApi(defaultClient);
        String contentType = "application/json"; // String | 
        LoginRequest loginRequest = new LoginRequest(); // LoginRequest | ##### Login Request Model
        try {
            LoginResponse result = apiInstance.login(contentType, loginRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AuthenticationApi#login");
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
 **loginRequest** | [**LoginRequest**](LoginRequest.md)| ##### Login Request Model |

### Return type

[**LoginResponse**](LoginResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | ##### Login Response Model |  * Content-Type -  <br>  |


## postLogout

> LogoutResponse postLogout(contentType, logoutRequest)

Logout

#### Used to log out a user from SigniFlow.

### Example

```java
// Import classes:
import com.SigniFlowup.connect.ApiClient;
import com.SigniFlowup.connect.ApiException;
import com.SigniFlowup.connect.Configuration;
import com.SigniFlowup.connect.model.*;
import com.SigniFlowup.connect.api.AuthenticationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://server-url/API/SignFlowAPIServiceRest.svc");

        AuthenticationApi apiInstance = new AuthenticationApi(defaultClient);
        String contentType = "application/json"; // String | 
        LogoutRequest logoutRequest = new LogoutRequest(); // LogoutRequest | ##### Logout Request Model
        try {
            LogoutResponse result = apiInstance.postLogout(contentType, logoutRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AuthenticationApi#postLogout");
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
 **logoutRequest** | [**LogoutRequest**](LogoutRequest.md)| ##### Logout Request Model | [optional]

### Return type

[**LogoutResponse**](LogoutResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | ##### Logout Response Model |  * Content-Type -  <br>  |


## postTokenExtend

> TokenExtendResponse postTokenExtend(contentType, tokenExtendRequest)

Token Extend

#### Used to extend the period of time in which the session token is valid.

### Example

```java
// Import classes:
import com.SigniFlowup.connect.ApiClient;
import com.SigniFlowup.connect.ApiException;
import com.SigniFlowup.connect.Configuration;
import com.SigniFlowup.connect.model.*;
import com.SigniFlowup.connect.api.AuthenticationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://server-url/API/SignFlowAPIServiceRest.svc");

        AuthenticationApi apiInstance = new AuthenticationApi(defaultClient);
        String contentType = "application/json"; // String | 
        TokenExtendRequest tokenExtendRequest = new TokenExtendRequest(); // TokenExtendRequest | ##### Token Extend Request Model
        try {
            TokenExtendResponse result = apiInstance.postTokenExtend(contentType, tokenExtendRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AuthenticationApi#postTokenExtend");
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
 **tokenExtendRequest** | [**TokenExtendRequest**](TokenExtendRequest.md)| ##### Token Extend Request Model | [optional]

### Return type

[**TokenExtendResponse**](TokenExtendResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | ##### Token Extend Response Model |  * Content-Type -  <br>  |


## postTokenValidate

> TokenValidateResponse postTokenValidate(contentType, tokenValidateRequest)

Token Validate

#### Used to validate the user's session token.

### Example

```java
// Import classes:
import com.SigniFlowup.connect.ApiClient;
import com.SigniFlowup.connect.ApiException;
import com.SigniFlowup.connect.Configuration;
import com.SigniFlowup.connect.model.*;
import com.SigniFlowup.connect.api.AuthenticationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://server-url/API/SignFlowAPIServiceRest.svc");

        AuthenticationApi apiInstance = new AuthenticationApi(defaultClient);
        String contentType = "application/json"; // String | 
        TokenValidateRequest tokenValidateRequest = new TokenValidateRequest(); // TokenValidateRequest | ##### Token Validate Request Model
        try {
            TokenValidateResponse result = apiInstance.postTokenValidate(contentType, tokenValidateRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AuthenticationApi#postTokenValidate");
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
 **tokenValidateRequest** | [**TokenValidateRequest**](TokenValidateRequest.md)| ##### Token Validate Request Model | [optional]

### Return type

[**TokenValidateResponse**](TokenValidateResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | ##### Token Validate Response Model |  * Content-Type -  <br>  |


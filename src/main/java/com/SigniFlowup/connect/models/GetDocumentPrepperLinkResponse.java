/*
 * SigniFlow OpenAPI Spec v1
 * ## SigniFlow API used to automate esignature workflow creation and management. 
 *
 * The version of the OpenAPI document: 1.0
 * Contact: support@signiflow.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.SigniFlowup.connect.models;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.SigniFlowup.connect.JSON;


/**
 * #### This is the response returned when requesting a document prepper url.
 */
@ApiModel(description = "#### This is the response returned when requesting a document prepper url.")
@JsonPropertyOrder({
  GetDocumentPrepperLinkResponse.JSON_PROPERTY_RESULT,
  GetDocumentPrepperLinkResponse.JSON_PROPERTY_U_R_L
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class GetDocumentPrepperLinkResponse {
  public static final String JSON_PROPERTY_RESULT = "Result";
  private String result;

  public static final String JSON_PROPERTY_U_R_L = "URL";
  private String URL;


  public GetDocumentPrepperLinkResponse result(String result) {
    this.result = result;
    return this;
  }

   /**
   * Displays the result of the call.
   * @return result
  **/
  @ApiModelProperty(required = true, value = "Displays the result of the call.")
  @JsonProperty(JSON_PROPERTY_RESULT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getResult() {
    return result;
  }


  public void setResult(String result) {
    this.result = result;
  }


  public GetDocumentPrepperLinkResponse URL(String URL) {
    this.URL = URL;
    return this;
  }

   /**
   * Url
   * @return URL
  **/
  @ApiModelProperty(required = true, value = "Url")
  @JsonProperty(JSON_PROPERTY_U_R_L)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getURL() {
    return URL;
  }


  public void setURL(String URL) {
    this.URL = URL;
  }


  /**
   * Return true if this GetDocumentPrepperLinkResponse object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetDocumentPrepperLinkResponse getDocumentPrepperLinkResponse = (GetDocumentPrepperLinkResponse) o;
    return Objects.equals(this.result, getDocumentPrepperLinkResponse.result) &&
        Objects.equals(this.URL, getDocumentPrepperLinkResponse.URL);
  }

  @Override
  public int hashCode() {
    return Objects.hash(result, URL);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetDocumentPrepperLinkResponse {\n");
    sb.append("    result: ").append(toIndentedString(result)).append("\n");
    sb.append("    URL: ").append(toIndentedString(URL)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}


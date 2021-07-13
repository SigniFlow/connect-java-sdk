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
 * #### This is the response returned when a document status has been requested.
 */
@ApiModel(description = "#### This is the response returned when a document status has been requested.")
@JsonPropertyOrder({
  GetDocStatusResponse.JSON_PROPERTY_DOC_STATUS_FIELD,
  GetDocStatusResponse.JSON_PROPERTY_RESULT_FIELD
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class GetDocStatusResponse {
  public static final String JSON_PROPERTY_DOC_STATUS_FIELD = "DocStatusField";
  private String docStatusField;

  public static final String JSON_PROPERTY_RESULT_FIELD = "ResultField";
  private String resultField;


  public GetDocStatusResponse docStatusField(String docStatusField) {
    this.docStatusField = docStatusField;
    return this;
  }

   /**
   * Status of the document.
   * @return docStatusField
  **/
  @ApiModelProperty(required = true, value = "Status of the document.")
  @JsonProperty(JSON_PROPERTY_DOC_STATUS_FIELD)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getDocStatusField() {
    return docStatusField;
  }


  public void setDocStatusField(String docStatusField) {
    this.docStatusField = docStatusField;
  }


  public GetDocStatusResponse resultField(String resultField) {
    this.resultField = resultField;
    return this;
  }

   /**
   * Displays the result of the call.
   * @return resultField
  **/
  @ApiModelProperty(required = true, value = "Displays the result of the call.")
  @JsonProperty(JSON_PROPERTY_RESULT_FIELD)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getResultField() {
    return resultField;
  }


  public void setResultField(String resultField) {
    this.resultField = resultField;
  }


  /**
   * Return true if this GetDocStatusResponse object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetDocStatusResponse getDocStatusResponse = (GetDocStatusResponse) o;
    return Objects.equals(this.docStatusField, getDocStatusResponse.docStatusField) &&
        Objects.equals(this.resultField, getDocStatusResponse.resultField);
  }

  @Override
  public int hashCode() {
    return Objects.hash(docStatusField, resultField);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetDocStatusResponse {\n");
    sb.append("    docStatusField: ").append(toIndentedString(docStatusField)).append("\n");
    sb.append("    resultField: ").append(toIndentedString(resultField)).append("\n");
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


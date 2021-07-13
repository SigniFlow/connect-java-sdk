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
 * #### The response returned when requesting and audit document.
 */
@ApiModel(description = "#### The response returned when requesting and audit document.")
@JsonPropertyOrder({
  GetAuditDocumentResponse.JSON_PROPERTY_AUDIT_DOCUMENT_FIELD,
  GetAuditDocumentResponse.JSON_PROPERTY_RESULT_FIELD
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class GetAuditDocumentResponse {
  public static final String JSON_PROPERTY_AUDIT_DOCUMENT_FIELD = "AuditDocumentField";
  private String auditDocumentField;

  public static final String JSON_PROPERTY_RESULT_FIELD = "ResultField";
  private String resultField;


  public GetAuditDocumentResponse auditDocumentField(String auditDocumentField) {
    this.auditDocumentField = auditDocumentField;
    return this;
  }

   /**
   * Get auditDocumentField
   * @return auditDocumentField
  **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_AUDIT_DOCUMENT_FIELD)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getAuditDocumentField() {
    return auditDocumentField;
  }


  public void setAuditDocumentField(String auditDocumentField) {
    this.auditDocumentField = auditDocumentField;
  }


  public GetAuditDocumentResponse resultField(String resultField) {
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
   * Return true if this GetAuditDocumentResponse object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetAuditDocumentResponse getAuditDocumentResponse = (GetAuditDocumentResponse) o;
    return Objects.equals(this.auditDocumentField, getAuditDocumentResponse.auditDocumentField) &&
        Objects.equals(this.resultField, getAuditDocumentResponse.resultField);
  }

  @Override
  public int hashCode() {
    return Objects.hash(auditDocumentField, resultField);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetAuditDocumentResponse {\n");
    sb.append("    auditDocumentField: ").append(toIndentedString(auditDocumentField)).append("\n");
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

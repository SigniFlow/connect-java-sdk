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
import com.SigniFlowup.connect.models.TokenField;
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
 * #### The request sent to get the audit information from a document.
 */
@ApiModel(description = "#### The request sent to get the audit information from a document.")
@JsonPropertyOrder({
  GetDocumentAuditRequest.JSON_PROPERTY_DOC_I_D_FIELD,
  GetDocumentAuditRequest.JSON_PROPERTY_TOKEN_FIELD
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class GetDocumentAuditRequest {
  public static final String JSON_PROPERTY_DOC_I_D_FIELD = "DocIDField";
  private String docIDField;

  public static final String JSON_PROPERTY_TOKEN_FIELD = "TokenField";
  private TokenField tokenField;


  public GetDocumentAuditRequest docIDField(String docIDField) {
    this.docIDField = docIDField;
    return this;
  }

   /**
   * Get docIDField
   * @return docIDField
  **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_DOC_I_D_FIELD)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getDocIDField() {
    return docIDField;
  }


  public void setDocIDField(String docIDField) {
    this.docIDField = docIDField;
  }


  public GetDocumentAuditRequest tokenField(TokenField tokenField) {
    this.tokenField = tokenField;
    return this;
  }

   /**
   * Get tokenField
   * @return tokenField
  **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_TOKEN_FIELD)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public TokenField getTokenField() {
    return tokenField;
  }


  public void setTokenField(TokenField tokenField) {
    this.tokenField = tokenField;
  }


  /**
   * Return true if this GetDocumentAuditRequest object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetDocumentAuditRequest getDocumentAuditRequest = (GetDocumentAuditRequest) o;
    return Objects.equals(this.docIDField, getDocumentAuditRequest.docIDField) &&
        Objects.equals(this.tokenField, getDocumentAuditRequest.tokenField);
  }

  @Override
  public int hashCode() {
    return Objects.hash(docIDField, tokenField);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetDocumentAuditRequest {\n");
    sb.append("    docIDField: ").append(toIndentedString(docIDField)).append("\n");
    sb.append("    tokenField: ").append(toIndentedString(tokenField)).append("\n");
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


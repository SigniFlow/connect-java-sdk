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
import java.math.BigDecimal;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.SigniFlowup.connect.JSON;


/**
 * #### The request sent when a user wants to download a document.
 */
@ApiModel(description = "#### The request sent when a user wants to download a document.")
@JsonPropertyOrder({
  GetDocumentRequest.JSON_PROPERTY_DOC_I_D_FIELD,
  GetDocumentRequest.JSON_PROPERTY_TOKEN_FIELD
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class GetDocumentRequest {
  public static final String JSON_PROPERTY_DOC_I_D_FIELD = "DocIDField";
  private BigDecimal docIDField;

  public static final String JSON_PROPERTY_TOKEN_FIELD = "TokenField";
  private TokenField tokenField;


  public GetDocumentRequest docIDField(BigDecimal docIDField) {
    this.docIDField = docIDField;
    return this;
  }

   /**
   * Document ID generated by SigniFlow.
   * @return docIDField
  **/
  @ApiModelProperty(example = "2147483647", required = true, value = "Document ID generated by SigniFlow.")
  @JsonProperty(JSON_PROPERTY_DOC_I_D_FIELD)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public BigDecimal getDocIDField() {
    return docIDField;
  }


  public void setDocIDField(BigDecimal docIDField) {
    this.docIDField = docIDField;
  }


  public GetDocumentRequest tokenField(TokenField tokenField) {
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
   * Return true if this GetDocumentRequest object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetDocumentRequest getDocumentRequest = (GetDocumentRequest) o;
    return Objects.equals(this.docIDField, getDocumentRequest.docIDField) &&
        Objects.equals(this.tokenField, getDocumentRequest.tokenField);
  }

  @Override
  public int hashCode() {
    return Objects.hash(docIDField, tokenField);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetDocumentRequest {\n");
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

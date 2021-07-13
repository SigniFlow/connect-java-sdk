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
 * #### The request sent when the document order for signing is confirmed.
 */
@ApiModel(description = "#### The request sent when the document order for signing is confirmed.")
@JsonPropertyOrder({
  SetDocumentOrderRequest.JSON_PROPERTY_DOC_I_D_FIELD,
  SetDocumentOrderRequest.JSON_PROPERTY_DOCUMENT_ORDER_FIELD,
  SetDocumentOrderRequest.JSON_PROPERTY_TOKEN_FIELD
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class SetDocumentOrderRequest {
  public static final String JSON_PROPERTY_DOC_I_D_FIELD = "DocIDField";
  private String docIDField;

  public static final String JSON_PROPERTY_DOCUMENT_ORDER_FIELD = "DocumentOrderField";
  private String documentOrderField;

  public static final String JSON_PROPERTY_TOKEN_FIELD = "TokenField";
  private TokenField tokenField;


  public SetDocumentOrderRequest docIDField(String docIDField) {
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


  public SetDocumentOrderRequest documentOrderField(String documentOrderField) {
    this.documentOrderField = documentOrderField;
    return this;
  }

   /**
   * Get documentOrderField
   * @return documentOrderField
  **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_DOCUMENT_ORDER_FIELD)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getDocumentOrderField() {
    return documentOrderField;
  }


  public void setDocumentOrderField(String documentOrderField) {
    this.documentOrderField = documentOrderField;
  }


  public SetDocumentOrderRequest tokenField(TokenField tokenField) {
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
   * Return true if this SetDocumentOrderRequest object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SetDocumentOrderRequest setDocumentOrderRequest = (SetDocumentOrderRequest) o;
    return Objects.equals(this.docIDField, setDocumentOrderRequest.docIDField) &&
        Objects.equals(this.documentOrderField, setDocumentOrderRequest.documentOrderField) &&
        Objects.equals(this.tokenField, setDocumentOrderRequest.tokenField);
  }

  @Override
  public int hashCode() {
    return Objects.hash(docIDField, documentOrderField, tokenField);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SetDocumentOrderRequest {\n");
    sb.append("    docIDField: ").append(toIndentedString(docIDField)).append("\n");
    sb.append("    documentOrderField: ").append(toIndentedString(documentOrderField)).append("\n");
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


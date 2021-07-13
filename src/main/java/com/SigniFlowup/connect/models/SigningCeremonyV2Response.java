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
import java.math.BigDecimal;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.SigniFlowup.connect.JSON;


/**
 * #### The response returned when the signing process is requested.
 */
@ApiModel(description = "#### The response returned when the signing process is requested.")
@JsonPropertyOrder({
  SigningCeremonyV2Response.JSON_PROPERTY_CEREMONY_I_D_FIELD,
  SigningCeremonyV2Response.JSON_PROPERTY_RESULT_FIELD,
  SigningCeremonyV2Response.JSON_PROPERTY_SIGNED_DOCUMENT_FIELD
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class SigningCeremonyV2Response {
  public static final String JSON_PROPERTY_CEREMONY_I_D_FIELD = "CeremonyIDField";
  private BigDecimal ceremonyIDField;

  public static final String JSON_PROPERTY_RESULT_FIELD = "ResultField";
  private String resultField;

  public static final String JSON_PROPERTY_SIGNED_DOCUMENT_FIELD = "SignedDocumentField";
  private String signedDocumentField;


  public SigningCeremonyV2Response ceremonyIDField(BigDecimal ceremonyIDField) {
    this.ceremonyIDField = ceremonyIDField;
    return this;
  }

   /**
   * Get ceremonyIDField
   * @return ceremonyIDField
  **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_CEREMONY_I_D_FIELD)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public BigDecimal getCeremonyIDField() {
    return ceremonyIDField;
  }


  public void setCeremonyIDField(BigDecimal ceremonyIDField) {
    this.ceremonyIDField = ceremonyIDField;
  }


  public SigningCeremonyV2Response resultField(String resultField) {
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


  public SigningCeremonyV2Response signedDocumentField(String signedDocumentField) {
    this.signedDocumentField = signedDocumentField;
    return this;
  }

   /**
   * Get signedDocumentField
   * @return signedDocumentField
  **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_SIGNED_DOCUMENT_FIELD)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getSignedDocumentField() {
    return signedDocumentField;
  }


  public void setSignedDocumentField(String signedDocumentField) {
    this.signedDocumentField = signedDocumentField;
  }


  /**
   * Return true if this SigningCeremonyV2Response object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SigningCeremonyV2Response signingCeremonyV2Response = (SigningCeremonyV2Response) o;
    return Objects.equals(this.ceremonyIDField, signingCeremonyV2Response.ceremonyIDField) &&
        Objects.equals(this.resultField, signingCeremonyV2Response.resultField) &&
        Objects.equals(this.signedDocumentField, signingCeremonyV2Response.signedDocumentField);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ceremonyIDField, resultField, signedDocumentField);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SigningCeremonyV2Response {\n");
    sb.append("    ceremonyIDField: ").append(toIndentedString(ceremonyIDField)).append("\n");
    sb.append("    resultField: ").append(toIndentedString(resultField)).append("\n");
    sb.append("    signedDocumentField: ").append(toIndentedString(signedDocumentField)).append("\n");
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


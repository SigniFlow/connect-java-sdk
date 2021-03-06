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
 * #### The request sent to extend the session time by extending the period when the token is valid.
 */
@ApiModel(description = "#### The request sent to extend the session time by extending the period when the token is valid.")
@JsonPropertyOrder({
  TokenExtendRequest.JSON_PROPERTY_TOKEN_FIELD,
  TokenExtendRequest.JSON_PROPERTY_TOKEN_VALIDITY_FIELD
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class TokenExtendRequest {
  public static final String JSON_PROPERTY_TOKEN_FIELD = "TokenField";
  private TokenField tokenField;

  public static final String JSON_PROPERTY_TOKEN_VALIDITY_FIELD = "TokenValidityField";
  private BigDecimal tokenValidityField;


  public TokenExtendRequest tokenField(TokenField tokenField) {
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


  public TokenExtendRequest tokenValidityField(BigDecimal tokenValidityField) {
    this.tokenValidityField = tokenValidityField;
    return this;
  }

   /**
   * Get tokenValidityField
   * @return tokenValidityField
  **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_TOKEN_VALIDITY_FIELD)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public BigDecimal getTokenValidityField() {
    return tokenValidityField;
  }


  public void setTokenValidityField(BigDecimal tokenValidityField) {
    this.tokenValidityField = tokenValidityField;
  }


  /**
   * Return true if this TokenExtendRequest object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TokenExtendRequest tokenExtendRequest = (TokenExtendRequest) o;
    return Objects.equals(this.tokenField, tokenExtendRequest.tokenField) &&
        Objects.equals(this.tokenValidityField, tokenExtendRequest.tokenValidityField);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tokenField, tokenValidityField);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TokenExtendRequest {\n");
    sb.append("    tokenField: ").append(toIndentedString(tokenField)).append("\n");
    sb.append("    tokenValidityField: ").append(toIndentedString(tokenValidityField)).append("\n");
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


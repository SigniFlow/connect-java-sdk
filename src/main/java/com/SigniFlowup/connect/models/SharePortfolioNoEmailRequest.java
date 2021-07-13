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
 * #### The request sent when a user wants to share a portfolio but does not want an email to be sent.
 */
@ApiModel(description = "#### The request sent when a user wants to share a portfolio but does not want an email to be sent.")
@JsonPropertyOrder({
  SharePortfolioNoEmailRequest.JSON_PROPERTY_ACCESS_LEVEL_FIELD,
  SharePortfolioNoEmailRequest.JSON_PROPERTY_PORTFOLIO_I_D_FIELD,
  SharePortfolioNoEmailRequest.JSON_PROPERTY_SHARE_OPTION_FIELD,
  SharePortfolioNoEmailRequest.JSON_PROPERTY_TOKEN_FIELD,
  SharePortfolioNoEmailRequest.JSON_PROPERTY_UNIQUE_I_D_FIELD
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class SharePortfolioNoEmailRequest {
  public static final String JSON_PROPERTY_ACCESS_LEVEL_FIELD = "AccessLevelField";
  private BigDecimal accessLevelField;

  public static final String JSON_PROPERTY_PORTFOLIO_I_D_FIELD = "PortfolioIDField";
  private String portfolioIDField;

  public static final String JSON_PROPERTY_SHARE_OPTION_FIELD = "ShareOptionField";
  private BigDecimal shareOptionField;

  public static final String JSON_PROPERTY_TOKEN_FIELD = "TokenField";
  private TokenField tokenField;

  public static final String JSON_PROPERTY_UNIQUE_I_D_FIELD = "UniqueIDField";
  private String uniqueIDField;


  public SharePortfolioNoEmailRequest accessLevelField(BigDecimal accessLevelField) {
    this.accessLevelField = accessLevelField;
    return this;
  }

   /**
   * Get accessLevelField
   * @return accessLevelField
  **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_ACCESS_LEVEL_FIELD)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public BigDecimal getAccessLevelField() {
    return accessLevelField;
  }


  public void setAccessLevelField(BigDecimal accessLevelField) {
    this.accessLevelField = accessLevelField;
  }


  public SharePortfolioNoEmailRequest portfolioIDField(String portfolioIDField) {
    this.portfolioIDField = portfolioIDField;
    return this;
  }

   /**
   * Get portfolioIDField
   * @return portfolioIDField
  **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_PORTFOLIO_I_D_FIELD)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getPortfolioIDField() {
    return portfolioIDField;
  }


  public void setPortfolioIDField(String portfolioIDField) {
    this.portfolioIDField = portfolioIDField;
  }


  public SharePortfolioNoEmailRequest shareOptionField(BigDecimal shareOptionField) {
    this.shareOptionField = shareOptionField;
    return this;
  }

   /**
   * Get shareOptionField
   * @return shareOptionField
  **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_SHARE_OPTION_FIELD)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public BigDecimal getShareOptionField() {
    return shareOptionField;
  }


  public void setShareOptionField(BigDecimal shareOptionField) {
    this.shareOptionField = shareOptionField;
  }


  public SharePortfolioNoEmailRequest tokenField(TokenField tokenField) {
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


  public SharePortfolioNoEmailRequest uniqueIDField(String uniqueIDField) {
    this.uniqueIDField = uniqueIDField;
    return this;
  }

   /**
   * Get uniqueIDField
   * @return uniqueIDField
  **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_UNIQUE_I_D_FIELD)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getUniqueIDField() {
    return uniqueIDField;
  }


  public void setUniqueIDField(String uniqueIDField) {
    this.uniqueIDField = uniqueIDField;
  }


  /**
   * Return true if this SharePortfolio_No_EmailRequest object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SharePortfolioNoEmailRequest sharePortfolioNoEmailRequest = (SharePortfolioNoEmailRequest) o;
    return Objects.equals(this.accessLevelField, sharePortfolioNoEmailRequest.accessLevelField) &&
        Objects.equals(this.portfolioIDField, sharePortfolioNoEmailRequest.portfolioIDField) &&
        Objects.equals(this.shareOptionField, sharePortfolioNoEmailRequest.shareOptionField) &&
        Objects.equals(this.tokenField, sharePortfolioNoEmailRequest.tokenField) &&
        Objects.equals(this.uniqueIDField, sharePortfolioNoEmailRequest.uniqueIDField);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessLevelField, portfolioIDField, shareOptionField, tokenField, uniqueIDField);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SharePortfolioNoEmailRequest {\n");
    sb.append("    accessLevelField: ").append(toIndentedString(accessLevelField)).append("\n");
    sb.append("    portfolioIDField: ").append(toIndentedString(portfolioIDField)).append("\n");
    sb.append("    shareOptionField: ").append(toIndentedString(shareOptionField)).append("\n");
    sb.append("    tokenField: ").append(toIndentedString(tokenField)).append("\n");
    sb.append("    uniqueIDField: ").append(toIndentedString(uniqueIDField)).append("\n");
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


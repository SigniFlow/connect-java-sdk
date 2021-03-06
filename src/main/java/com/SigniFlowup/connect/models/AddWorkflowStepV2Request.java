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
import com.SigniFlowup.connect.models.ActionField;
import com.SigniFlowup.connect.models.ProxyAllowedField;
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
 * #### Add a step to the Workflow request.
 */
@ApiModel(description = "#### Add a step to the Workflow request.")
@JsonPropertyOrder({
  AddWorkflowStepV2Request.JSON_PROPERTY_ACTION_FIELD,
  AddWorkflowStepV2Request.JSON_PROPERTY_CELL_FIELD,
  AddWorkflowStepV2Request.JSON_PROPERTY_DOC_I_D_FIELD,
  AddWorkflowStepV2Request.JSON_PROPERTY_EMAIL_FIELD,
  AddWorkflowStepV2Request.JSON_PROPERTY_FIRST_NAME_FIELD,
  AddWorkflowStepV2Request.JSON_PROPERTY_LANGUAGE_CODE_FIELD,
  AddWorkflowStepV2Request.JSON_PROPERTY_LAST_NAME_FIELD,
  AddWorkflowStepV2Request.JSON_PROPERTY_PROXY_ALLOWED_FIELD,
  AddWorkflowStepV2Request.JSON_PROPERTY_TOKEN_FIELD
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AddWorkflowStepV2Request {
  public static final String JSON_PROPERTY_ACTION_FIELD = "ActionField";
  private ActionField actionField = ActionField.SignDocument;

  public static final String JSON_PROPERTY_CELL_FIELD = "CellField";
  private String cellField;

  public static final String JSON_PROPERTY_DOC_I_D_FIELD = "DocIDField";
  private String docIDField;

  public static final String JSON_PROPERTY_EMAIL_FIELD = "EmailField";
  private String emailField;

  public static final String JSON_PROPERTY_FIRST_NAME_FIELD = "FirstNameField";
  private String firstNameField;

  public static final String JSON_PROPERTY_LANGUAGE_CODE_FIELD = "LanguageCodeField";
  private String languageCodeField;

  public static final String JSON_PROPERTY_LAST_NAME_FIELD = "LastNameField";
  private String lastNameField;

  public static final String JSON_PROPERTY_PROXY_ALLOWED_FIELD = "ProxyAllowedField";
  private ProxyAllowedField proxyAllowedField = ProxyAllowedField.No;

  public static final String JSON_PROPERTY_TOKEN_FIELD = "TokenField";
  private TokenField tokenField;


  public AddWorkflowStepV2Request actionField(ActionField actionField) {
    this.actionField = actionField;
    return this;
  }

   /**
   * Get actionField
   * @return actionField
  **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_ACTION_FIELD)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public ActionField getActionField() {
    return actionField;
  }


  public void setActionField(ActionField actionField) {
    this.actionField = actionField;
  }


  public AddWorkflowStepV2Request cellField(String cellField) {
    this.cellField = cellField;
    return this;
  }

   /**
   * Mobile number of participant
   * @return cellField
  **/
  @ApiModelProperty(required = true, value = "Mobile number of participant")
  @JsonProperty(JSON_PROPERTY_CELL_FIELD)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getCellField() {
    return cellField;
  }


  public void setCellField(String cellField) {
    this.cellField = cellField;
  }


  public AddWorkflowStepV2Request docIDField(String docIDField) {
    this.docIDField = docIDField;
    return this;
  }

   /**
   * Document ID field.
   * @return docIDField
  **/
  @ApiModelProperty(example = "2147483647", required = true, value = "Document ID field.")
  @JsonProperty(JSON_PROPERTY_DOC_I_D_FIELD)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getDocIDField() {
    return docIDField;
  }


  public void setDocIDField(String docIDField) {
    this.docIDField = docIDField;
  }


  public AddWorkflowStepV2Request emailField(String emailField) {
    this.emailField = emailField;
    return this;
  }

   /**
   * Participant email address.
   * @return emailField
  **/
  @ApiModelProperty(example = "email@domain.com", required = true, value = "Participant email address.")
  @JsonProperty(JSON_PROPERTY_EMAIL_FIELD)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getEmailField() {
    return emailField;
  }


  public void setEmailField(String emailField) {
    this.emailField = emailField;
  }


  public AddWorkflowStepV2Request firstNameField(String firstNameField) {
    this.firstNameField = firstNameField;
    return this;
  }

   /**
   * Participant firstname.
   * @return firstNameField
  **/
  @ApiModelProperty(example = "John", required = true, value = "Participant firstname.")
  @JsonProperty(JSON_PROPERTY_FIRST_NAME_FIELD)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getFirstNameField() {
    return firstNameField;
  }


  public void setFirstNameField(String firstNameField) {
    this.firstNameField = firstNameField;
  }


  public AddWorkflowStepV2Request languageCodeField(String languageCodeField) {
    this.languageCodeField = languageCodeField;
    return this;
  }

   /**
   * Participant 2 Digit ISO Language Code &#x60;en &#x3D; English es &#x3D; Spanish fr &#x3D; French ect&#x60;
   * @return languageCodeField
  **/
  @ApiModelProperty(example = "ENG", required = true, value = "Participant 2 Digit ISO Language Code `en = English es = Spanish fr = French ect`")
  @JsonProperty(JSON_PROPERTY_LANGUAGE_CODE_FIELD)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getLanguageCodeField() {
    return languageCodeField;
  }


  public void setLanguageCodeField(String languageCodeField) {
    this.languageCodeField = languageCodeField;
  }


  public AddWorkflowStepV2Request lastNameField(String lastNameField) {
    this.lastNameField = lastNameField;
    return this;
  }

   /**
   * Participant last name.
   * @return lastNameField
  **/
  @ApiModelProperty(example = "Smith", required = true, value = "Participant last name.")
  @JsonProperty(JSON_PROPERTY_LAST_NAME_FIELD)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getLastNameField() {
    return lastNameField;
  }


  public void setLastNameField(String lastNameField) {
    this.lastNameField = lastNameField;
  }


  public AddWorkflowStepV2Request proxyAllowedField(ProxyAllowedField proxyAllowedField) {
    this.proxyAllowedField = proxyAllowedField;
    return this;
  }

   /**
   * Get proxyAllowedField
   * @return proxyAllowedField
  **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_PROXY_ALLOWED_FIELD)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public ProxyAllowedField getProxyAllowedField() {
    return proxyAllowedField;
  }


  public void setProxyAllowedField(ProxyAllowedField proxyAllowedField) {
    this.proxyAllowedField = proxyAllowedField;
  }


  public AddWorkflowStepV2Request tokenField(TokenField tokenField) {
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
   * Return true if this AddWorkflowStepV2Request object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AddWorkflowStepV2Request addWorkflowStepV2Request = (AddWorkflowStepV2Request) o;
    return Objects.equals(this.actionField, addWorkflowStepV2Request.actionField) &&
        Objects.equals(this.cellField, addWorkflowStepV2Request.cellField) &&
        Objects.equals(this.docIDField, addWorkflowStepV2Request.docIDField) &&
        Objects.equals(this.emailField, addWorkflowStepV2Request.emailField) &&
        Objects.equals(this.firstNameField, addWorkflowStepV2Request.firstNameField) &&
        Objects.equals(this.languageCodeField, addWorkflowStepV2Request.languageCodeField) &&
        Objects.equals(this.lastNameField, addWorkflowStepV2Request.lastNameField) &&
        Objects.equals(this.proxyAllowedField, addWorkflowStepV2Request.proxyAllowedField) &&
        Objects.equals(this.tokenField, addWorkflowStepV2Request.tokenField);
  }

  @Override
  public int hashCode() {
    return Objects.hash(actionField, cellField, docIDField, emailField, firstNameField, languageCodeField, lastNameField, proxyAllowedField, tokenField);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddWorkflowStepV2Request {\n");
    sb.append("    actionField: ").append(toIndentedString(actionField)).append("\n");
    sb.append("    cellField: ").append(toIndentedString(cellField)).append("\n");
    sb.append("    docIDField: ").append(toIndentedString(docIDField)).append("\n");
    sb.append("    emailField: ").append(toIndentedString(emailField)).append("\n");
    sb.append("    firstNameField: ").append(toIndentedString(firstNameField)).append("\n");
    sb.append("    languageCodeField: ").append(toIndentedString(languageCodeField)).append("\n");
    sb.append("    lastNameField: ").append(toIndentedString(lastNameField)).append("\n");
    sb.append("    proxyAllowedField: ").append(toIndentedString(proxyAllowedField)).append("\n");
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


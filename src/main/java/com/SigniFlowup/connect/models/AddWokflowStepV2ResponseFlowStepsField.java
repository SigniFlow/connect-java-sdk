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
 * AddWokflowStepV2ResponseFlowStepsField
 */
@JsonPropertyOrder({
  AddWokflowStepV2ResponseFlowStepsField.JSON_PROPERTY_ACTION_FIELD,
  AddWokflowStepV2ResponseFlowStepsField.JSON_PROPERTY_EMAIL_FIELD,
  AddWokflowStepV2ResponseFlowStepsField.JSON_PROPERTY_FLOW_I_D_FIELD
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AddWokflowStepV2ResponseFlowStepsField {
  public static final String JSON_PROPERTY_ACTION_FIELD = "ActionField";
  private ActionField actionField = ActionField.SignDocument;

  public static final String JSON_PROPERTY_EMAIL_FIELD = "EmailField";
  private String emailField;

  public static final String JSON_PROPERTY_FLOW_I_D_FIELD = "FlowIDField";
  private BigDecimal flowIDField;


  public AddWokflowStepV2ResponseFlowStepsField actionField(ActionField actionField) {
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


  public AddWokflowStepV2ResponseFlowStepsField emailField(String emailField) {
    this.emailField = emailField;
    return this;
  }

   /**
   * Participant email address field.
   * @return emailField
  **/
  @ApiModelProperty(example = "John@domain.com", required = true, value = "Participant email address field.")
  @JsonProperty(JSON_PROPERTY_EMAIL_FIELD)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getEmailField() {
    return emailField;
  }


  public void setEmailField(String emailField) {
    this.emailField = emailField;
  }


  public AddWokflowStepV2ResponseFlowStepsField flowIDField(BigDecimal flowIDField) {
    this.flowIDField = flowIDField;
    return this;
  }

   /**
   * Document Flow ID field.
   * @return flowIDField
  **/
  @ApiModelProperty(example = "2222222", required = true, value = "Document Flow ID field.")
  @JsonProperty(JSON_PROPERTY_FLOW_I_D_FIELD)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public BigDecimal getFlowIDField() {
    return flowIDField;
  }


  public void setFlowIDField(BigDecimal flowIDField) {
    this.flowIDField = flowIDField;
  }


  /**
   * Return true if this AddWokflowStepV2Response_FlowStepsField object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AddWokflowStepV2ResponseFlowStepsField addWokflowStepV2ResponseFlowStepsField = (AddWokflowStepV2ResponseFlowStepsField) o;
    return Objects.equals(this.actionField, addWokflowStepV2ResponseFlowStepsField.actionField) &&
        Objects.equals(this.emailField, addWokflowStepV2ResponseFlowStepsField.emailField) &&
        Objects.equals(this.flowIDField, addWokflowStepV2ResponseFlowStepsField.flowIDField);
  }

  @Override
  public int hashCode() {
    return Objects.hash(actionField, emailField, flowIDField);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddWokflowStepV2ResponseFlowStepsField {\n");
    sb.append("    actionField: ").append(toIndentedString(actionField)).append("\n");
    sb.append("    emailField: ").append(toIndentedString(emailField)).append("\n");
    sb.append("    flowIDField: ").append(toIndentedString(flowIDField)).append("\n");
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


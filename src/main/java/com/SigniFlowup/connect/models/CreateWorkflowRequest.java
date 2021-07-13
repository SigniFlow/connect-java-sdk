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
import com.SigniFlowup.connect.models.AutoExpire;
import com.SigniFlowup.connect.models.AutoRemind;
import com.SigniFlowup.connect.models.DocExtension;
import com.SigniFlowup.connect.models.Priority;
import com.SigniFlowup.connect.models.TokenField;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.SigniFlowup.connect.JSON;


/**
 * #### The request sent to create a document workflow.
 */
@ApiModel(description = "#### The request sent to create a document workflow.")
@JsonPropertyOrder({
  CreateWorkflowRequest.JSON_PROPERTY_ADDITIONAL_DATA_FIELD,
  CreateWorkflowRequest.JSON_PROPERTY_AUTO_EXPIRE_FIELD,
  CreateWorkflowRequest.JSON_PROPERTY_AUTO_REMIND_FIELD,
  CreateWorkflowRequest.JSON_PROPERTY_DOC_FIELD,
  CreateWorkflowRequest.JSON_PROPERTY_DOC_NAME_FIELD,
  CreateWorkflowRequest.JSON_PROPERTY_DUE_DATE_FIELD,
  CreateWorkflowRequest.JSON_PROPERTY_EXTENSION_FIELD,
  CreateWorkflowRequest.JSON_PROPERTY_MESSAGE_FIELD,
  CreateWorkflowRequest.JSON_PROPERTY_PRIORITY_FIELD,
  CreateWorkflowRequest.JSON_PROPERTY_SL_A_FIELD,
  CreateWorkflowRequest.JSON_PROPERTY_TOKEN_FIELD
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CreateWorkflowRequest {
  public static final String JSON_PROPERTY_ADDITIONAL_DATA_FIELD = "AdditionalDataField";
  private String additionalDataField;

  public static final String JSON_PROPERTY_AUTO_EXPIRE_FIELD = "AutoExpireField";
  private AutoExpire autoExpireField;

  public static final String JSON_PROPERTY_AUTO_REMIND_FIELD = "AutoRemindField";
  private AutoRemind autoRemindField;

  public static final String JSON_PROPERTY_DOC_FIELD = "DocField";
  private String docField;

  public static final String JSON_PROPERTY_DOC_NAME_FIELD = "DocNameField";
  private String docNameField;

  public static final String JSON_PROPERTY_DUE_DATE_FIELD = "DueDateField";
  private JsonNullable<OffsetDateTime> dueDateField = JsonNullable.<OffsetDateTime>undefined();

  public static final String JSON_PROPERTY_EXTENSION_FIELD = "ExtensionField";
  private DocExtension extensionField;

  public static final String JSON_PROPERTY_MESSAGE_FIELD = "MessageField";
  private String messageField;

  public static final String JSON_PROPERTY_PRIORITY_FIELD = "PriorityField";
  private Priority priorityField;

  public static final String JSON_PROPERTY_SL_A_FIELD = "SLAField";
  private Integer slAField = 0;

  public static final String JSON_PROPERTY_TOKEN_FIELD = "TokenField";
  private TokenField tokenField;


  public CreateWorkflowRequest additionalDataField(String additionalDataField) {
    this.additionalDataField = additionalDataField;
    return this;
  }

   /**
   * Sets additional data to be embedded in PDF Meta.
   * @return additionalDataField
  **/
  @ApiModelProperty(example = "\"\"", required = true, value = "Sets additional data to be embedded in PDF Meta.")
  @JsonProperty(JSON_PROPERTY_ADDITIONAL_DATA_FIELD)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getAdditionalDataField() {
    return additionalDataField;
  }


  public void setAdditionalDataField(String additionalDataField) {
    this.additionalDataField = additionalDataField;
  }


  public CreateWorkflowRequest autoExpireField(AutoExpire autoExpireField) {
    this.autoExpireField = autoExpireField;
    return this;
  }

   /**
   * Get autoExpireField
   * @return autoExpireField
  **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_AUTO_EXPIRE_FIELD)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public AutoExpire getAutoExpireField() {
    return autoExpireField;
  }


  public void setAutoExpireField(AutoExpire autoExpireField) {
    this.autoExpireField = autoExpireField;
  }


  public CreateWorkflowRequest autoRemindField(AutoRemind autoRemindField) {
    this.autoRemindField = autoRemindField;
    return this;
  }

   /**
   * Get autoRemindField
   * @return autoRemindField
  **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_AUTO_REMIND_FIELD)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public AutoRemind getAutoRemindField() {
    return autoRemindField;
  }


  public void setAutoRemindField(AutoRemind autoRemindField) {
    this.autoRemindField = autoRemindField;
  }


  public CreateWorkflowRequest docField(String docField) {
    this.docField = docField;
    return this;
  }

   /**
   * Base64 Encoded String of document
   * @return docField
  **/
  @ApiModelProperty(example = "String content", required = true, value = "Base64 Encoded String of document")
  @JsonProperty(JSON_PROPERTY_DOC_FIELD)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getDocField() {
    return docField;
  }


  public void setDocField(String docField) {
    this.docField = docField;
  }


  public CreateWorkflowRequest docNameField(String docNameField) {
    this.docNameField = docNameField;
    return this;
  }

   /**
   * Name of document to display in SigniFlow
   * @return docNameField
  **/
  @ApiModelProperty(example = "String content", required = true, value = "Name of document to display in SigniFlow")
  @JsonProperty(JSON_PROPERTY_DOC_NAME_FIELD)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getDocNameField() {
    return docNameField;
  }


  public void setDocNameField(String docNameField) {
    this.docNameField = docNameField;
  }


  public CreateWorkflowRequest dueDateField(OffsetDateTime dueDateField) {
    this.dueDateField = JsonNullable.<OffsetDateTime>of(dueDateField);
    return this;
  }

   /**
   * Due date for the document, use in conjunction with Auto Expire.
   * @return dueDateField
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Due date for the document, use in conjunction with Auto Expire.")
  @JsonIgnore

  public OffsetDateTime getDueDateField() {
        return dueDateField.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_DUE_DATE_FIELD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<OffsetDateTime> getDueDateField_JsonNullable() {
    return dueDateField;
  }
  
  @JsonProperty(JSON_PROPERTY_DUE_DATE_FIELD)
  public void setDueDateField_JsonNullable(JsonNullable<OffsetDateTime> dueDateField) {
    this.dueDateField = dueDateField;
  }

  public void setDueDateField(OffsetDateTime dueDateField) {
    this.dueDateField = JsonNullable.<OffsetDateTime>of(dueDateField);
  }


  public CreateWorkflowRequest extensionField(DocExtension extensionField) {
    this.extensionField = extensionField;
    return this;
  }

   /**
   * Get extensionField
   * @return extensionField
  **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_EXTENSION_FIELD)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public DocExtension getExtensionField() {
    return extensionField;
  }


  public void setExtensionField(DocExtension extensionField) {
    this.extensionField = extensionField;
  }


  public CreateWorkflowRequest messageField(String messageField) {
    this.messageField = messageField;
    return this;
  }

   /**
   * Custom message to display to participants
   * @return messageField
  **/
  @ApiModelProperty(example = "String content", required = true, value = "Custom message to display to participants")
  @JsonProperty(JSON_PROPERTY_MESSAGE_FIELD)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getMessageField() {
    return messageField;
  }


  public void setMessageField(String messageField) {
    this.messageField = messageField;
  }


  public CreateWorkflowRequest priorityField(Priority priorityField) {
    this.priorityField = priorityField;
    return this;
  }

   /**
   * Get priorityField
   * @return priorityField
  **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_PRIORITY_FIELD)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Priority getPriorityField() {
    return priorityField;
  }


  public void setPriorityField(Priority priorityField) {
    this.priorityField = priorityField;
  }


  public CreateWorkflowRequest slAField(Integer slAField) {
    this.slAField = slAField;
    return this;
  }

   /**
   * Deprecated field, Pass 0
   * minimum: 0
   * maximum: 0
   * @return slAField
  **/
  @ApiModelProperty(example = "0", required = true, value = "Deprecated field, Pass 0")
  @JsonProperty(JSON_PROPERTY_SL_A_FIELD)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getSlAField() {
    return slAField;
  }


  public void setSlAField(Integer slAField) {
    this.slAField = slAField;
  }


  public CreateWorkflowRequest tokenField(TokenField tokenField) {
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
   * Return true if this CreateWorkflowRequest object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateWorkflowRequest createWorkflowRequest = (CreateWorkflowRequest) o;
    return Objects.equals(this.additionalDataField, createWorkflowRequest.additionalDataField) &&
        Objects.equals(this.autoExpireField, createWorkflowRequest.autoExpireField) &&
        Objects.equals(this.autoRemindField, createWorkflowRequest.autoRemindField) &&
        Objects.equals(this.docField, createWorkflowRequest.docField) &&
        Objects.equals(this.docNameField, createWorkflowRequest.docNameField) &&
        Objects.equals(this.dueDateField, createWorkflowRequest.dueDateField) &&
        Objects.equals(this.extensionField, createWorkflowRequest.extensionField) &&
        Objects.equals(this.messageField, createWorkflowRequest.messageField) &&
        Objects.equals(this.priorityField, createWorkflowRequest.priorityField) &&
        Objects.equals(this.slAField, createWorkflowRequest.slAField) &&
        Objects.equals(this.tokenField, createWorkflowRequest.tokenField);
  }

  @Override
  public int hashCode() {
    return Objects.hash(additionalDataField, autoExpireField, autoRemindField, docField, docNameField, dueDateField, extensionField, messageField, priorityField, slAField, tokenField);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateWorkflowRequest {\n");
    sb.append("    additionalDataField: ").append(toIndentedString(additionalDataField)).append("\n");
    sb.append("    autoExpireField: ").append(toIndentedString(autoExpireField)).append("\n");
    sb.append("    autoRemindField: ").append(toIndentedString(autoRemindField)).append("\n");
    sb.append("    docField: ").append(toIndentedString(docField)).append("\n");
    sb.append("    docNameField: ").append(toIndentedString(docNameField)).append("\n");
    sb.append("    dueDateField: ").append(toIndentedString(dueDateField)).append("\n");
    sb.append("    extensionField: ").append(toIndentedString(extensionField)).append("\n");
    sb.append("    messageField: ").append(toIndentedString(messageField)).append("\n");
    sb.append("    priorityField: ").append(toIndentedString(priorityField)).append("\n");
    sb.append("    slAField: ").append(toIndentedString(slAField)).append("\n");
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

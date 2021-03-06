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
 * GetPrepperTemplateListResponseTemplateInformationValuesField
 */
@JsonPropertyOrder({
  GetPrepperTemplateListResponseTemplateInformationValuesField.JSON_PROPERTY_NAME_FIELD,
  GetPrepperTemplateListResponseTemplateInformationValuesField.JSON_PROPERTY_PREPPER_TEMPLATE_I_D_FIELD,
  GetPrepperTemplateListResponseTemplateInformationValuesField.JSON_PROPERTY_TEMPLATE_DESCRIPTION_FIELD
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class GetPrepperTemplateListResponseTemplateInformationValuesField {
  public static final String JSON_PROPERTY_NAME_FIELD = "NameField";
  private String nameField;

  public static final String JSON_PROPERTY_PREPPER_TEMPLATE_I_D_FIELD = "PrepperTemplateIDField";
  private BigDecimal prepperTemplateIDField;

  public static final String JSON_PROPERTY_TEMPLATE_DESCRIPTION_FIELD = "TemplateDescriptionField";
  private String templateDescriptionField;


  public GetPrepperTemplateListResponseTemplateInformationValuesField nameField(String nameField) {
    this.nameField = nameField;
    return this;
  }

   /**
   * Get nameField
   * @return nameField
  **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_NAME_FIELD)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getNameField() {
    return nameField;
  }


  public void setNameField(String nameField) {
    this.nameField = nameField;
  }


  public GetPrepperTemplateListResponseTemplateInformationValuesField prepperTemplateIDField(BigDecimal prepperTemplateIDField) {
    this.prepperTemplateIDField = prepperTemplateIDField;
    return this;
  }

   /**
   * Get prepperTemplateIDField
   * @return prepperTemplateIDField
  **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_PREPPER_TEMPLATE_I_D_FIELD)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public BigDecimal getPrepperTemplateIDField() {
    return prepperTemplateIDField;
  }


  public void setPrepperTemplateIDField(BigDecimal prepperTemplateIDField) {
    this.prepperTemplateIDField = prepperTemplateIDField;
  }


  public GetPrepperTemplateListResponseTemplateInformationValuesField templateDescriptionField(String templateDescriptionField) {
    this.templateDescriptionField = templateDescriptionField;
    return this;
  }

   /**
   * Template description.
   * @return templateDescriptionField
  **/
  @ApiModelProperty(required = true, value = "Template description.")
  @JsonProperty(JSON_PROPERTY_TEMPLATE_DESCRIPTION_FIELD)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getTemplateDescriptionField() {
    return templateDescriptionField;
  }


  public void setTemplateDescriptionField(String templateDescriptionField) {
    this.templateDescriptionField = templateDescriptionField;
  }


  /**
   * Return true if this GetPrepperTemplateListResponse_TemplateInformationValuesField object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetPrepperTemplateListResponseTemplateInformationValuesField getPrepperTemplateListResponseTemplateInformationValuesField = (GetPrepperTemplateListResponseTemplateInformationValuesField) o;
    return Objects.equals(this.nameField, getPrepperTemplateListResponseTemplateInformationValuesField.nameField) &&
        Objects.equals(this.prepperTemplateIDField, getPrepperTemplateListResponseTemplateInformationValuesField.prepperTemplateIDField) &&
        Objects.equals(this.templateDescriptionField, getPrepperTemplateListResponseTemplateInformationValuesField.templateDescriptionField);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nameField, prepperTemplateIDField, templateDescriptionField);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetPrepperTemplateListResponseTemplateInformationValuesField {\n");
    sb.append("    nameField: ").append(toIndentedString(nameField)).append("\n");
    sb.append("    prepperTemplateIDField: ").append(toIndentedString(prepperTemplateIDField)).append("\n");
    sb.append("    templateDescriptionField: ").append(toIndentedString(templateDescriptionField)).append("\n");
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


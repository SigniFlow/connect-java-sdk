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
 * FullWorkflowRequestWorkflowUserFieldsField
 */
@JsonPropertyOrder({
  FullWorkflowRequestWorkflowUserFieldsField.JSON_PROPERTY_FIELD_TYPE_FIELD,
  FullWorkflowRequestWorkflowUserFieldsField.JSON_PROPERTY_FONT_FAMILY_FIELD,
  FullWorkflowRequestWorkflowUserFieldsField.JSON_PROPERTY_FONT_SIZE_FIELD,
  FullWorkflowRequestWorkflowUserFieldsField.JSON_PROPERTY_GROUP_USER_NUMBER_FIELD,
  FullWorkflowRequestWorkflowUserFieldsField.JSON_PROPERTY_HEIGHT_FIELD,
  FullWorkflowRequestWorkflowUserFieldsField.JSON_PROPERTY_IS_INVISIBLE_FIELD,
  FullWorkflowRequestWorkflowUserFieldsField.JSON_PROPERTY_PAGE_NUMBER_FIELD,
  FullWorkflowRequestWorkflowUserFieldsField.JSON_PROPERTY_TAG_NAME_FIELD,
  FullWorkflowRequestWorkflowUserFieldsField.JSON_PROPERTY_VALUE_FIELD,
  FullWorkflowRequestWorkflowUserFieldsField.JSON_PROPERTY_WIDTH_FIELD,
  FullWorkflowRequestWorkflowUserFieldsField.JSON_PROPERTY_XCOORDINATE_FIELD,
  FullWorkflowRequestWorkflowUserFieldsField.JSON_PROPERTY_XOFFSET_FIELD,
  FullWorkflowRequestWorkflowUserFieldsField.JSON_PROPERTY_YCOORDINATE_FIELD,
  FullWorkflowRequestWorkflowUserFieldsField.JSON_PROPERTY_YOFFSET_FIELD
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class FullWorkflowRequestWorkflowUserFieldsField {
  public static final String JSON_PROPERTY_FIELD_TYPE_FIELD = "FieldTypeField";
  private BigDecimal fieldTypeField;

  public static final String JSON_PROPERTY_FONT_FAMILY_FIELD = "FontFamilyField";
  private String fontFamilyField;

  public static final String JSON_PROPERTY_FONT_SIZE_FIELD = "FontSizeField";
  private BigDecimal fontSizeField;

  public static final String JSON_PROPERTY_GROUP_USER_NUMBER_FIELD = "GroupUserNumberField";
  private BigDecimal groupUserNumberField;

  public static final String JSON_PROPERTY_HEIGHT_FIELD = "HeightField";
  private String heightField;

  public static final String JSON_PROPERTY_IS_INVISIBLE_FIELD = "IsInvisibleField";
  private Boolean isInvisibleField;

  public static final String JSON_PROPERTY_PAGE_NUMBER_FIELD = "PageNumberField";
  private BigDecimal pageNumberField;

  public static final String JSON_PROPERTY_TAG_NAME_FIELD = "TagNameField";
  private String tagNameField;

  public static final String JSON_PROPERTY_VALUE_FIELD = "ValueField";
  private String valueField;

  public static final String JSON_PROPERTY_WIDTH_FIELD = "WidthField";
  private String widthField;

  public static final String JSON_PROPERTY_XCOORDINATE_FIELD = "XCoordinateField";
  private String xcoordinateField;

  public static final String JSON_PROPERTY_XOFFSET_FIELD = "XOffsetField";
  private BigDecimal xoffsetField;

  public static final String JSON_PROPERTY_YCOORDINATE_FIELD = "YCoordinateField";
  private String ycoordinateField;

  public static final String JSON_PROPERTY_YOFFSET_FIELD = "YOffsetField";
  private BigDecimal yoffsetField;


  public FullWorkflowRequestWorkflowUserFieldsField fieldTypeField(BigDecimal fieldTypeField) {
    this.fieldTypeField = fieldTypeField;
    return this;
  }

   /**
   * Field type.
   * @return fieldTypeField
  **/
  @ApiModelProperty(example = "7", required = true, value = "Field type.")
  @JsonProperty(JSON_PROPERTY_FIELD_TYPE_FIELD)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public BigDecimal getFieldTypeField() {
    return fieldTypeField;
  }


  public void setFieldTypeField(BigDecimal fieldTypeField) {
    this.fieldTypeField = fieldTypeField;
  }


  public FullWorkflowRequestWorkflowUserFieldsField fontFamilyField(String fontFamilyField) {
    this.fontFamilyField = fontFamilyField;
    return this;
  }

   /**
   * The font family of the fields text.
   * @return fontFamilyField
  **/
  @ApiModelProperty(example = "Arial", required = true, value = "The font family of the fields text.")
  @JsonProperty(JSON_PROPERTY_FONT_FAMILY_FIELD)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getFontFamilyField() {
    return fontFamilyField;
  }


  public void setFontFamilyField(String fontFamilyField) {
    this.fontFamilyField = fontFamilyField;
  }


  public FullWorkflowRequestWorkflowUserFieldsField fontSizeField(BigDecimal fontSizeField) {
    this.fontSizeField = fontSizeField;
    return this;
  }

   /**
   * The font size of the fields text.
   * @return fontSizeField
  **/
  @ApiModelProperty(example = "15", required = true, value = "The font size of the fields text.")
  @JsonProperty(JSON_PROPERTY_FONT_SIZE_FIELD)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public BigDecimal getFontSizeField() {
    return fontSizeField;
  }


  public void setFontSizeField(BigDecimal fontSizeField) {
    this.fontSizeField = fontSizeField;
  }


  public FullWorkflowRequestWorkflowUserFieldsField groupUserNumberField(BigDecimal groupUserNumberField) {
    this.groupUserNumberField = groupUserNumberField;
    return this;
  }

   /**
   * The users in the group&#39;s user number.
   * @return groupUserNumberField
  **/
  @ApiModelProperty(example = "5", required = true, value = "The users in the group's user number.")
  @JsonProperty(JSON_PROPERTY_GROUP_USER_NUMBER_FIELD)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public BigDecimal getGroupUserNumberField() {
    return groupUserNumberField;
  }


  public void setGroupUserNumberField(BigDecimal groupUserNumberField) {
    this.groupUserNumberField = groupUserNumberField;
  }


  public FullWorkflowRequestWorkflowUserFieldsField heightField(String heightField) {
    this.heightField = heightField;
    return this;
  }

   /**
   * Field height.
   * @return heightField
  **/
  @ApiModelProperty(example = "15", required = true, value = "Field height.")
  @JsonProperty(JSON_PROPERTY_HEIGHT_FIELD)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getHeightField() {
    return heightField;
  }


  public void setHeightField(String heightField) {
    this.heightField = heightField;
  }


  public FullWorkflowRequestWorkflowUserFieldsField isInvisibleField(Boolean isInvisibleField) {
    this.isInvisibleField = isInvisibleField;
    return this;
  }

   /**
   * Is the field visible.
   * @return isInvisibleField
  **/
  @ApiModelProperty(required = true, value = "Is the field visible.")
  @JsonProperty(JSON_PROPERTY_IS_INVISIBLE_FIELD)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean getIsInvisibleField() {
    return isInvisibleField;
  }


  public void setIsInvisibleField(Boolean isInvisibleField) {
    this.isInvisibleField = isInvisibleField;
  }


  public FullWorkflowRequestWorkflowUserFieldsField pageNumberField(BigDecimal pageNumberField) {
    this.pageNumberField = pageNumberField;
    return this;
  }

   /**
   * Field page number.
   * @return pageNumberField
  **/
  @ApiModelProperty(example = "2", required = true, value = "Field page number.")
  @JsonProperty(JSON_PROPERTY_PAGE_NUMBER_FIELD)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public BigDecimal getPageNumberField() {
    return pageNumberField;
  }


  public void setPageNumberField(BigDecimal pageNumberField) {
    this.pageNumberField = pageNumberField;
  }


  public FullWorkflowRequestWorkflowUserFieldsField tagNameField(String tagNameField) {
    this.tagNameField = tagNameField;
    return this;
  }

   /**
   * Field tag name.
   * @return tagNameField
  **/
  @ApiModelProperty(required = true, value = "Field tag name.")
  @JsonProperty(JSON_PROPERTY_TAG_NAME_FIELD)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getTagNameField() {
    return tagNameField;
  }


  public void setTagNameField(String tagNameField) {
    this.tagNameField = tagNameField;
  }


  public FullWorkflowRequestWorkflowUserFieldsField valueField(String valueField) {
    this.valueField = valueField;
    return this;
  }

   /**
   * Field value.
   * @return valueField
  **/
  @ApiModelProperty(required = true, value = "Field value.")
  @JsonProperty(JSON_PROPERTY_VALUE_FIELD)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getValueField() {
    return valueField;
  }


  public void setValueField(String valueField) {
    this.valueField = valueField;
  }


  public FullWorkflowRequestWorkflowUserFieldsField widthField(String widthField) {
    this.widthField = widthField;
    return this;
  }

   /**
   * Field width.
   * @return widthField
  **/
  @ApiModelProperty(example = "25", required = true, value = "Field width.")
  @JsonProperty(JSON_PROPERTY_WIDTH_FIELD)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getWidthField() {
    return widthField;
  }


  public void setWidthField(String widthField) {
    this.widthField = widthField;
  }


  public FullWorkflowRequestWorkflowUserFieldsField xcoordinateField(String xcoordinateField) {
    this.xcoordinateField = xcoordinateField;
    return this;
  }

   /**
   * The fields x-coordinates.
   * @return xcoordinateField
  **/
  @ApiModelProperty(example = "60", required = true, value = "The fields x-coordinates.")
  @JsonProperty(JSON_PROPERTY_XCOORDINATE_FIELD)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getXcoordinateField() {
    return xcoordinateField;
  }


  public void setXcoordinateField(String xcoordinateField) {
    this.xcoordinateField = xcoordinateField;
  }


  public FullWorkflowRequestWorkflowUserFieldsField xoffsetField(BigDecimal xoffsetField) {
    this.xoffsetField = xoffsetField;
    return this;
  }

   /**
   * The fields x-coordinates offset.
   * @return xoffsetField
  **/
  @ApiModelProperty(example = "15", required = true, value = "The fields x-coordinates offset.")
  @JsonProperty(JSON_PROPERTY_XOFFSET_FIELD)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public BigDecimal getXoffsetField() {
    return xoffsetField;
  }


  public void setXoffsetField(BigDecimal xoffsetField) {
    this.xoffsetField = xoffsetField;
  }


  public FullWorkflowRequestWorkflowUserFieldsField ycoordinateField(String ycoordinateField) {
    this.ycoordinateField = ycoordinateField;
    return this;
  }

   /**
   * The fields y-coordinates.
   * @return ycoordinateField
  **/
  @ApiModelProperty(example = "150", required = true, value = "The fields y-coordinates.")
  @JsonProperty(JSON_PROPERTY_YCOORDINATE_FIELD)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getYcoordinateField() {
    return ycoordinateField;
  }


  public void setYcoordinateField(String ycoordinateField) {
    this.ycoordinateField = ycoordinateField;
  }


  public FullWorkflowRequestWorkflowUserFieldsField yoffsetField(BigDecimal yoffsetField) {
    this.yoffsetField = yoffsetField;
    return this;
  }

   /**
   * The fields y-coordinates offset.
   * @return yoffsetField
  **/
  @ApiModelProperty(example = "20", required = true, value = "The fields y-coordinates offset.")
  @JsonProperty(JSON_PROPERTY_YOFFSET_FIELD)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public BigDecimal getYoffsetField() {
    return yoffsetField;
  }


  public void setYoffsetField(BigDecimal yoffsetField) {
    this.yoffsetField = yoffsetField;
  }


  /**
   * Return true if this FullWorkflowRequest_WorkflowUserFieldsField object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FullWorkflowRequestWorkflowUserFieldsField fullWorkflowRequestWorkflowUserFieldsField = (FullWorkflowRequestWorkflowUserFieldsField) o;
    return Objects.equals(this.fieldTypeField, fullWorkflowRequestWorkflowUserFieldsField.fieldTypeField) &&
        Objects.equals(this.fontFamilyField, fullWorkflowRequestWorkflowUserFieldsField.fontFamilyField) &&
        Objects.equals(this.fontSizeField, fullWorkflowRequestWorkflowUserFieldsField.fontSizeField) &&
        Objects.equals(this.groupUserNumberField, fullWorkflowRequestWorkflowUserFieldsField.groupUserNumberField) &&
        Objects.equals(this.heightField, fullWorkflowRequestWorkflowUserFieldsField.heightField) &&
        Objects.equals(this.isInvisibleField, fullWorkflowRequestWorkflowUserFieldsField.isInvisibleField) &&
        Objects.equals(this.pageNumberField, fullWorkflowRequestWorkflowUserFieldsField.pageNumberField) &&
        Objects.equals(this.tagNameField, fullWorkflowRequestWorkflowUserFieldsField.tagNameField) &&
        Objects.equals(this.valueField, fullWorkflowRequestWorkflowUserFieldsField.valueField) &&
        Objects.equals(this.widthField, fullWorkflowRequestWorkflowUserFieldsField.widthField) &&
        Objects.equals(this.xcoordinateField, fullWorkflowRequestWorkflowUserFieldsField.xcoordinateField) &&
        Objects.equals(this.xoffsetField, fullWorkflowRequestWorkflowUserFieldsField.xoffsetField) &&
        Objects.equals(this.ycoordinateField, fullWorkflowRequestWorkflowUserFieldsField.ycoordinateField) &&
        Objects.equals(this.yoffsetField, fullWorkflowRequestWorkflowUserFieldsField.yoffsetField);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fieldTypeField, fontFamilyField, fontSizeField, groupUserNumberField, heightField, isInvisibleField, pageNumberField, tagNameField, valueField, widthField, xcoordinateField, xoffsetField, ycoordinateField, yoffsetField);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FullWorkflowRequestWorkflowUserFieldsField {\n");
    sb.append("    fieldTypeField: ").append(toIndentedString(fieldTypeField)).append("\n");
    sb.append("    fontFamilyField: ").append(toIndentedString(fontFamilyField)).append("\n");
    sb.append("    fontSizeField: ").append(toIndentedString(fontSizeField)).append("\n");
    sb.append("    groupUserNumberField: ").append(toIndentedString(groupUserNumberField)).append("\n");
    sb.append("    heightField: ").append(toIndentedString(heightField)).append("\n");
    sb.append("    isInvisibleField: ").append(toIndentedString(isInvisibleField)).append("\n");
    sb.append("    pageNumberField: ").append(toIndentedString(pageNumberField)).append("\n");
    sb.append("    tagNameField: ").append(toIndentedString(tagNameField)).append("\n");
    sb.append("    valueField: ").append(toIndentedString(valueField)).append("\n");
    sb.append("    widthField: ").append(toIndentedString(widthField)).append("\n");
    sb.append("    xcoordinateField: ").append(toIndentedString(xcoordinateField)).append("\n");
    sb.append("    xoffsetField: ").append(toIndentedString(xoffsetField)).append("\n");
    sb.append("    ycoordinateField: ").append(toIndentedString(ycoordinateField)).append("\n");
    sb.append("    yoffsetField: ").append(toIndentedString(yoffsetField)).append("\n");
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


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
 * GetDocumentTagFieldBoxPositionResponseDocumentTagFieldsBoxPositionField
 */
@JsonPropertyOrder({
  GetDocumentTagFieldBoxPositionResponseDocumentTagFieldsBoxPositionField.JSON_PROPERTY_HEIGHT_FIELD,
  GetDocumentTagFieldBoxPositionResponseDocumentTagFieldsBoxPositionField.JSON_PROPERTY_PAGE_NUMBER_FIELD,
  GetDocumentTagFieldBoxPositionResponseDocumentTagFieldsBoxPositionField.JSON_PROPERTY_WIDTH_FIELD,
  GetDocumentTagFieldBoxPositionResponseDocumentTagFieldsBoxPositionField.JSON_PROPERTY_XCOORDINATE_FIELD,
  GetDocumentTagFieldBoxPositionResponseDocumentTagFieldsBoxPositionField.JSON_PROPERTY_YCOORDINATE_FIELD
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class GetDocumentTagFieldBoxPositionResponseDocumentTagFieldsBoxPositionField {
  public static final String JSON_PROPERTY_HEIGHT_FIELD = "HeightField";
  private String heightField;

  public static final String JSON_PROPERTY_PAGE_NUMBER_FIELD = "PageNumberField";
  private BigDecimal pageNumberField;

  public static final String JSON_PROPERTY_WIDTH_FIELD = "WidthField";
  private String widthField;

  public static final String JSON_PROPERTY_XCOORDINATE_FIELD = "XCoordinateField";
  private String xcoordinateField;

  public static final String JSON_PROPERTY_YCOORDINATE_FIELD = "YCoordinateField";
  private String ycoordinateField;


  public GetDocumentTagFieldBoxPositionResponseDocumentTagFieldsBoxPositionField heightField(String heightField) {
    this.heightField = heightField;
    return this;
  }

   /**
   * The height of the field.
   * @return heightField
  **/
  @ApiModelProperty(required = true, value = "The height of the field.")
  @JsonProperty(JSON_PROPERTY_HEIGHT_FIELD)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getHeightField() {
    return heightField;
  }


  public void setHeightField(String heightField) {
    this.heightField = heightField;
  }


  public GetDocumentTagFieldBoxPositionResponseDocumentTagFieldsBoxPositionField pageNumberField(BigDecimal pageNumberField) {
    this.pageNumberField = pageNumberField;
    return this;
  }

   /**
   * The page number where the field is.
   * @return pageNumberField
  **/
  @ApiModelProperty(required = true, value = "The page number where the field is.")
  @JsonProperty(JSON_PROPERTY_PAGE_NUMBER_FIELD)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public BigDecimal getPageNumberField() {
    return pageNumberField;
  }


  public void setPageNumberField(BigDecimal pageNumberField) {
    this.pageNumberField = pageNumberField;
  }


  public GetDocumentTagFieldBoxPositionResponseDocumentTagFieldsBoxPositionField widthField(String widthField) {
    this.widthField = widthField;
    return this;
  }

   /**
   * Get widthField
   * @return widthField
  **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_WIDTH_FIELD)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getWidthField() {
    return widthField;
  }


  public void setWidthField(String widthField) {
    this.widthField = widthField;
  }


  public GetDocumentTagFieldBoxPositionResponseDocumentTagFieldsBoxPositionField xcoordinateField(String xcoordinateField) {
    this.xcoordinateField = xcoordinateField;
    return this;
  }

   /**
   * The x coordinates of the field.
   * @return xcoordinateField
  **/
  @ApiModelProperty(required = true, value = "The x coordinates of the field.")
  @JsonProperty(JSON_PROPERTY_XCOORDINATE_FIELD)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getXcoordinateField() {
    return xcoordinateField;
  }


  public void setXcoordinateField(String xcoordinateField) {
    this.xcoordinateField = xcoordinateField;
  }


  public GetDocumentTagFieldBoxPositionResponseDocumentTagFieldsBoxPositionField ycoordinateField(String ycoordinateField) {
    this.ycoordinateField = ycoordinateField;
    return this;
  }

   /**
   * The y coordinates of the field
   * @return ycoordinateField
  **/
  @ApiModelProperty(required = true, value = "The y coordinates of the field")
  @JsonProperty(JSON_PROPERTY_YCOORDINATE_FIELD)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getYcoordinateField() {
    return ycoordinateField;
  }


  public void setYcoordinateField(String ycoordinateField) {
    this.ycoordinateField = ycoordinateField;
  }


  /**
   * Return true if this GetDocumentTagFieldBoxPositionResponse_DocumentTagFieldsBoxPositionField object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetDocumentTagFieldBoxPositionResponseDocumentTagFieldsBoxPositionField getDocumentTagFieldBoxPositionResponseDocumentTagFieldsBoxPositionField = (GetDocumentTagFieldBoxPositionResponseDocumentTagFieldsBoxPositionField) o;
    return Objects.equals(this.heightField, getDocumentTagFieldBoxPositionResponseDocumentTagFieldsBoxPositionField.heightField) &&
        Objects.equals(this.pageNumberField, getDocumentTagFieldBoxPositionResponseDocumentTagFieldsBoxPositionField.pageNumberField) &&
        Objects.equals(this.widthField, getDocumentTagFieldBoxPositionResponseDocumentTagFieldsBoxPositionField.widthField) &&
        Objects.equals(this.xcoordinateField, getDocumentTagFieldBoxPositionResponseDocumentTagFieldsBoxPositionField.xcoordinateField) &&
        Objects.equals(this.ycoordinateField, getDocumentTagFieldBoxPositionResponseDocumentTagFieldsBoxPositionField.ycoordinateField);
  }

  @Override
  public int hashCode() {
    return Objects.hash(heightField, pageNumberField, widthField, xcoordinateField, ycoordinateField);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetDocumentTagFieldBoxPositionResponseDocumentTagFieldsBoxPositionField {\n");
    sb.append("    heightField: ").append(toIndentedString(heightField)).append("\n");
    sb.append("    pageNumberField: ").append(toIndentedString(pageNumberField)).append("\n");
    sb.append("    widthField: ").append(toIndentedString(widthField)).append("\n");
    sb.append("    xcoordinateField: ").append(toIndentedString(xcoordinateField)).append("\n");
    sb.append("    ycoordinateField: ").append(toIndentedString(ycoordinateField)).append("\n");
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


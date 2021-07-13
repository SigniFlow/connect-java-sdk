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
import com.SigniFlowup.connect.models.GetDocumentAuditResponseActivityField;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.SigniFlowup.connect.JSON;


/**
 * #### The response returned after requesting the audit information from a document.
 */
@ApiModel(description = "#### The response returned after requesting the audit information from a document.")
@JsonPropertyOrder({
  GetDocumentAuditResponse.JSON_PROPERTY_ACTIVITY_FIELD,
  GetDocumentAuditResponse.JSON_PROPERTY_RESULT_FIELD
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class GetDocumentAuditResponse {
  public static final String JSON_PROPERTY_ACTIVITY_FIELD = "ActivityField";
  private Set<GetDocumentAuditResponseActivityField> activityField = new LinkedHashSet<>();

  public static final String JSON_PROPERTY_RESULT_FIELD = "ResultField";
  private String resultField;


  public GetDocumentAuditResponse activityField(Set<GetDocumentAuditResponseActivityField> activityField) {
    this.activityField = activityField;
    return this;
  }

  public GetDocumentAuditResponse addActivityFieldItem(GetDocumentAuditResponseActivityField activityFieldItem) {
    this.activityField.add(activityFieldItem);
    return this;
  }

   /**
   * Get activityField
   * @return activityField
  **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_ACTIVITY_FIELD)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Set<GetDocumentAuditResponseActivityField> getActivityField() {
    return activityField;
  }


  public void setActivityField(Set<GetDocumentAuditResponseActivityField> activityField) {
    this.activityField = activityField;
  }


  public GetDocumentAuditResponse resultField(String resultField) {
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


  /**
   * Return true if this GetDocumentAuditResponse object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetDocumentAuditResponse getDocumentAuditResponse = (GetDocumentAuditResponse) o;
    return Objects.equals(this.activityField, getDocumentAuditResponse.activityField) &&
        Objects.equals(this.resultField, getDocumentAuditResponse.resultField);
  }

  @Override
  public int hashCode() {
    return Objects.hash(activityField, resultField);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetDocumentAuditResponse {\n");
    sb.append("    activityField: ").append(toIndentedString(activityField)).append("\n");
    sb.append("    resultField: ").append(toIndentedString(resultField)).append("\n");
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


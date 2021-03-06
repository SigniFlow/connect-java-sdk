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
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.SigniFlowup.connect.JSON;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * #### The priority level of the workflow.   &#x60;0 &#x3D; Low 1 &#x3D; Normal 2 &#x3D; High&#x60;
 */
public enum Priority {
  
  /**
   * Low
   */
  Low(0),
  
  /**
   * Normal
   */
  Normal(1),
  
  /**
   * High
   */
  High(2);

  private Integer value;

  Priority(Integer value) {
    this.value = value;
  }

  @JsonValue
  public Integer getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static Priority fromValue(Integer value) {
    for (Priority b : Priority.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}


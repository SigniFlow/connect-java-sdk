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
 * #### Is the action taken by a user in a workflow on this step.  &#x60;0 &#x3D; SignDocument 1 &#x3D; ViewDocument 2 &#x3D; ApproveDocument&#x60; 
 */
public enum ActionField {
  
  /**
   * Sign The Document
   */
  SignDocument(0),
  
  /**
   * View The Document
   */
  ViewDocument(1),
  
  /**
   * Approve The Document
   */
  ApproveDocument(2);

  private Integer value;

  ActionField(Integer value) {
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
  public static ActionField fromValue(Integer value) {
    for (ActionField b : ActionField.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}


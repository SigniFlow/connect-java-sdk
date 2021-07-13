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
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.SigniFlowup.connect.JSON;


/**
 * #### The request sent to start the signing process of a document.
 */
@ApiModel(description = "#### The request sent to start the signing process of a document.")
@JsonPropertyOrder({
  SigningCeremonyV2Request.JSON_PROPERTY_CHECKBOX_FIELDS_LIST_FIELD,
  SigningCeremonyV2Request.JSON_PROPERTY_DOC_FIELD,
  SigningCeremonyV2Request.JSON_PROPERTY_DOC_NAME_FIELD,
  SigningCeremonyV2Request.JSON_PROPERTY_INITIAL_FIELDS_LIST_FIELD,
  SigningCeremonyV2Request.JSON_PROPERTY_LOGIN_PASSWORD_FIELD,
  SigningCeremonyV2Request.JSON_PROPERTY_LOGIN_USER_NAME_FIELD,
  SigningCeremonyV2Request.JSON_PROPERTY_SIGNATURE_H_FIELD,
  SigningCeremonyV2Request.JSON_PROPERTY_SIGNATURE_IMAGE_FIELD,
  SigningCeremonyV2Request.JSON_PROPERTY_SIGNATURE_IMAGE_INCLUDE_BORDER_FIELD,
  SigningCeremonyV2Request.JSON_PROPERTY_SIGNATURE_IMAGE_INCLUDE_REASON_FIELD,
  SigningCeremonyV2Request.JSON_PROPERTY_SIGNATURE_IMAGE_INCLUDE_SIGNED_BY_FIELD,
  SigningCeremonyV2Request.JSON_PROPERTY_SIGNATURE_IMAGE_INCLUDE_SIGNED_DATE_FIELD,
  SigningCeremonyV2Request.JSON_PROPERTY_SIGNATURE_IMAGE_TYPE_FIELD,
  SigningCeremonyV2Request.JSON_PROPERTY_SIGNATURE_PAGE_FIELD,
  SigningCeremonyV2Request.JSON_PROPERTY_SIGNATURE_W_FIELD,
  SigningCeremonyV2Request.JSON_PROPERTY_SIGNATURE_X_FIELD,
  SigningCeremonyV2Request.JSON_PROPERTY_SIGNATURE_Y_FIELD,
  SigningCeremonyV2Request.JSON_PROPERTY_SIGNER_EMAIL_FIELD,
  SigningCeremonyV2Request.JSON_PROPERTY_SIGNER_FULL_NAME_FIELD,
  SigningCeremonyV2Request.JSON_PROPERTY_SIGNER_IDENTIFICATION_NUMBER_FIELD,
  SigningCeremonyV2Request.JSON_PROPERTY_SIGNER_LOCATION_FIELD,
  SigningCeremonyV2Request.JSON_PROPERTY_SIGNER_MOBILE_NUMBER_FIELD,
  SigningCeremonyV2Request.JSON_PROPERTY_SIGNER_REASON_FIELD,
  SigningCeremonyV2Request.JSON_PROPERTY_SIGNER_TRUST_ORIGIN_FIELD,
  SigningCeremonyV2Request.JSON_PROPERTY_SIGNER_TRUST_REFERENCE_FIELD,
  SigningCeremonyV2Request.JSON_PROPERTY_TEXT_FIELDS_LIST_FIELD
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class SigningCeremonyV2Request {
  public static final String JSON_PROPERTY_CHECKBOX_FIELDS_LIST_FIELD = "CheckboxFieldsListField";
  private Set<Object> checkboxFieldsListField = new LinkedHashSet<>();

  public static final String JSON_PROPERTY_DOC_FIELD = "DocField";
  private String docField;

  public static final String JSON_PROPERTY_DOC_NAME_FIELD = "DocNameField";
  private String docNameField;

  public static final String JSON_PROPERTY_INITIAL_FIELDS_LIST_FIELD = "InitialFieldsListField";
  private Set<Object> initialFieldsListField = new LinkedHashSet<>();

  public static final String JSON_PROPERTY_LOGIN_PASSWORD_FIELD = "LoginPasswordField";
  private String loginPasswordField;

  public static final String JSON_PROPERTY_LOGIN_USER_NAME_FIELD = "LoginUserNameField";
  private String loginUserNameField;

  public static final String JSON_PROPERTY_SIGNATURE_H_FIELD = "SignatureHField";
  private BigDecimal signatureHField;

  public static final String JSON_PROPERTY_SIGNATURE_IMAGE_FIELD = "SignatureImageField";
  private String signatureImageField;

  public static final String JSON_PROPERTY_SIGNATURE_IMAGE_INCLUDE_BORDER_FIELD = "SignatureImageIncludeBorderField";
  private Boolean signatureImageIncludeBorderField;

  public static final String JSON_PROPERTY_SIGNATURE_IMAGE_INCLUDE_REASON_FIELD = "SignatureImageIncludeReasonField";
  private Boolean signatureImageIncludeReasonField;

  public static final String JSON_PROPERTY_SIGNATURE_IMAGE_INCLUDE_SIGNED_BY_FIELD = "SignatureImageIncludeSignedByField";
  private Boolean signatureImageIncludeSignedByField;

  public static final String JSON_PROPERTY_SIGNATURE_IMAGE_INCLUDE_SIGNED_DATE_FIELD = "SignatureImageIncludeSignedDateField";
  private Boolean signatureImageIncludeSignedDateField;

  public static final String JSON_PROPERTY_SIGNATURE_IMAGE_TYPE_FIELD = "SignatureImageTypeField";
  private BigDecimal signatureImageTypeField;

  public static final String JSON_PROPERTY_SIGNATURE_PAGE_FIELD = "SignaturePageField";
  private BigDecimal signaturePageField;

  public static final String JSON_PROPERTY_SIGNATURE_W_FIELD = "SignatureWField";
  private BigDecimal signatureWField;

  public static final String JSON_PROPERTY_SIGNATURE_X_FIELD = "SignatureXField";
  private BigDecimal signatureXField;

  public static final String JSON_PROPERTY_SIGNATURE_Y_FIELD = "SignatureYField";
  private BigDecimal signatureYField;

  public static final String JSON_PROPERTY_SIGNER_EMAIL_FIELD = "SignerEmailField";
  private String signerEmailField;

  public static final String JSON_PROPERTY_SIGNER_FULL_NAME_FIELD = "SignerFullNameField";
  private String signerFullNameField;

  public static final String JSON_PROPERTY_SIGNER_IDENTIFICATION_NUMBER_FIELD = "SignerIdentificationNumberField";
  private String signerIdentificationNumberField;

  public static final String JSON_PROPERTY_SIGNER_LOCATION_FIELD = "SignerLocationField";
  private String signerLocationField;

  public static final String JSON_PROPERTY_SIGNER_MOBILE_NUMBER_FIELD = "SignerMobileNumberField";
  private String signerMobileNumberField;

  public static final String JSON_PROPERTY_SIGNER_REASON_FIELD = "SignerReasonField";
  private String signerReasonField;

  public static final String JSON_PROPERTY_SIGNER_TRUST_ORIGIN_FIELD = "SignerTrustOriginField";
  private String signerTrustOriginField;

  public static final String JSON_PROPERTY_SIGNER_TRUST_REFERENCE_FIELD = "SignerTrustReferenceField";
  private String signerTrustReferenceField;

  public static final String JSON_PROPERTY_TEXT_FIELDS_LIST_FIELD = "TextFieldsListField";
  private Set<Object> textFieldsListField = new LinkedHashSet<>();


  public SigningCeremonyV2Request checkboxFieldsListField(Set<Object> checkboxFieldsListField) {
    this.checkboxFieldsListField = checkboxFieldsListField;
    return this;
  }

  public SigningCeremonyV2Request addCheckboxFieldsListFieldItem(Object checkboxFieldsListFieldItem) {
    this.checkboxFieldsListField.add(checkboxFieldsListFieldItem);
    return this;
  }

   /**
   * Get checkboxFieldsListField
   * @return checkboxFieldsListField
  **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_CHECKBOX_FIELDS_LIST_FIELD)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Set<Object> getCheckboxFieldsListField() {
    return checkboxFieldsListField;
  }


  public void setCheckboxFieldsListField(Set<Object> checkboxFieldsListField) {
    this.checkboxFieldsListField = checkboxFieldsListField;
  }


  public SigningCeremonyV2Request docField(String docField) {
    this.docField = docField;
    return this;
  }

   /**
   * Get docField
   * @return docField
  **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_DOC_FIELD)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getDocField() {
    return docField;
  }


  public void setDocField(String docField) {
    this.docField = docField;
  }


  public SigningCeremonyV2Request docNameField(String docNameField) {
    this.docNameField = docNameField;
    return this;
  }

   /**
   * Get docNameField
   * @return docNameField
  **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_DOC_NAME_FIELD)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getDocNameField() {
    return docNameField;
  }


  public void setDocNameField(String docNameField) {
    this.docNameField = docNameField;
  }


  public SigningCeremonyV2Request initialFieldsListField(Set<Object> initialFieldsListField) {
    this.initialFieldsListField = initialFieldsListField;
    return this;
  }

  public SigningCeremonyV2Request addInitialFieldsListFieldItem(Object initialFieldsListFieldItem) {
    this.initialFieldsListField.add(initialFieldsListFieldItem);
    return this;
  }

   /**
   * Get initialFieldsListField
   * @return initialFieldsListField
  **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_INITIAL_FIELDS_LIST_FIELD)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Set<Object> getInitialFieldsListField() {
    return initialFieldsListField;
  }


  public void setInitialFieldsListField(Set<Object> initialFieldsListField) {
    this.initialFieldsListField = initialFieldsListField;
  }


  public SigningCeremonyV2Request loginPasswordField(String loginPasswordField) {
    this.loginPasswordField = loginPasswordField;
    return this;
  }

   /**
   * Get loginPasswordField
   * @return loginPasswordField
  **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_LOGIN_PASSWORD_FIELD)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getLoginPasswordField() {
    return loginPasswordField;
  }


  public void setLoginPasswordField(String loginPasswordField) {
    this.loginPasswordField = loginPasswordField;
  }


  public SigningCeremonyV2Request loginUserNameField(String loginUserNameField) {
    this.loginUserNameField = loginUserNameField;
    return this;
  }

   /**
   * Get loginUserNameField
   * @return loginUserNameField
  **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_LOGIN_USER_NAME_FIELD)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getLoginUserNameField() {
    return loginUserNameField;
  }


  public void setLoginUserNameField(String loginUserNameField) {
    this.loginUserNameField = loginUserNameField;
  }


  public SigningCeremonyV2Request signatureHField(BigDecimal signatureHField) {
    this.signatureHField = signatureHField;
    return this;
  }

   /**
   * Get signatureHField
   * @return signatureHField
  **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_SIGNATURE_H_FIELD)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public BigDecimal getSignatureHField() {
    return signatureHField;
  }


  public void setSignatureHField(BigDecimal signatureHField) {
    this.signatureHField = signatureHField;
  }


  public SigningCeremonyV2Request signatureImageField(String signatureImageField) {
    this.signatureImageField = signatureImageField;
    return this;
  }

   /**
   * Get signatureImageField
   * @return signatureImageField
  **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_SIGNATURE_IMAGE_FIELD)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getSignatureImageField() {
    return signatureImageField;
  }


  public void setSignatureImageField(String signatureImageField) {
    this.signatureImageField = signatureImageField;
  }


  public SigningCeremonyV2Request signatureImageIncludeBorderField(Boolean signatureImageIncludeBorderField) {
    this.signatureImageIncludeBorderField = signatureImageIncludeBorderField;
    return this;
  }

   /**
   * Get signatureImageIncludeBorderField
   * @return signatureImageIncludeBorderField
  **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_SIGNATURE_IMAGE_INCLUDE_BORDER_FIELD)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean getSignatureImageIncludeBorderField() {
    return signatureImageIncludeBorderField;
  }


  public void setSignatureImageIncludeBorderField(Boolean signatureImageIncludeBorderField) {
    this.signatureImageIncludeBorderField = signatureImageIncludeBorderField;
  }


  public SigningCeremonyV2Request signatureImageIncludeReasonField(Boolean signatureImageIncludeReasonField) {
    this.signatureImageIncludeReasonField = signatureImageIncludeReasonField;
    return this;
  }

   /**
   * Get signatureImageIncludeReasonField
   * @return signatureImageIncludeReasonField
  **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_SIGNATURE_IMAGE_INCLUDE_REASON_FIELD)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean getSignatureImageIncludeReasonField() {
    return signatureImageIncludeReasonField;
  }


  public void setSignatureImageIncludeReasonField(Boolean signatureImageIncludeReasonField) {
    this.signatureImageIncludeReasonField = signatureImageIncludeReasonField;
  }


  public SigningCeremonyV2Request signatureImageIncludeSignedByField(Boolean signatureImageIncludeSignedByField) {
    this.signatureImageIncludeSignedByField = signatureImageIncludeSignedByField;
    return this;
  }

   /**
   * Get signatureImageIncludeSignedByField
   * @return signatureImageIncludeSignedByField
  **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_SIGNATURE_IMAGE_INCLUDE_SIGNED_BY_FIELD)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean getSignatureImageIncludeSignedByField() {
    return signatureImageIncludeSignedByField;
  }


  public void setSignatureImageIncludeSignedByField(Boolean signatureImageIncludeSignedByField) {
    this.signatureImageIncludeSignedByField = signatureImageIncludeSignedByField;
  }


  public SigningCeremonyV2Request signatureImageIncludeSignedDateField(Boolean signatureImageIncludeSignedDateField) {
    this.signatureImageIncludeSignedDateField = signatureImageIncludeSignedDateField;
    return this;
  }

   /**
   * Get signatureImageIncludeSignedDateField
   * @return signatureImageIncludeSignedDateField
  **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_SIGNATURE_IMAGE_INCLUDE_SIGNED_DATE_FIELD)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean getSignatureImageIncludeSignedDateField() {
    return signatureImageIncludeSignedDateField;
  }


  public void setSignatureImageIncludeSignedDateField(Boolean signatureImageIncludeSignedDateField) {
    this.signatureImageIncludeSignedDateField = signatureImageIncludeSignedDateField;
  }


  public SigningCeremonyV2Request signatureImageTypeField(BigDecimal signatureImageTypeField) {
    this.signatureImageTypeField = signatureImageTypeField;
    return this;
  }

   /**
   * Get signatureImageTypeField
   * @return signatureImageTypeField
  **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_SIGNATURE_IMAGE_TYPE_FIELD)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public BigDecimal getSignatureImageTypeField() {
    return signatureImageTypeField;
  }


  public void setSignatureImageTypeField(BigDecimal signatureImageTypeField) {
    this.signatureImageTypeField = signatureImageTypeField;
  }


  public SigningCeremonyV2Request signaturePageField(BigDecimal signaturePageField) {
    this.signaturePageField = signaturePageField;
    return this;
  }

   /**
   * Get signaturePageField
   * @return signaturePageField
  **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_SIGNATURE_PAGE_FIELD)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public BigDecimal getSignaturePageField() {
    return signaturePageField;
  }


  public void setSignaturePageField(BigDecimal signaturePageField) {
    this.signaturePageField = signaturePageField;
  }


  public SigningCeremonyV2Request signatureWField(BigDecimal signatureWField) {
    this.signatureWField = signatureWField;
    return this;
  }

   /**
   * Get signatureWField
   * @return signatureWField
  **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_SIGNATURE_W_FIELD)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public BigDecimal getSignatureWField() {
    return signatureWField;
  }


  public void setSignatureWField(BigDecimal signatureWField) {
    this.signatureWField = signatureWField;
  }


  public SigningCeremonyV2Request signatureXField(BigDecimal signatureXField) {
    this.signatureXField = signatureXField;
    return this;
  }

   /**
   * Get signatureXField
   * @return signatureXField
  **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_SIGNATURE_X_FIELD)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public BigDecimal getSignatureXField() {
    return signatureXField;
  }


  public void setSignatureXField(BigDecimal signatureXField) {
    this.signatureXField = signatureXField;
  }


  public SigningCeremonyV2Request signatureYField(BigDecimal signatureYField) {
    this.signatureYField = signatureYField;
    return this;
  }

   /**
   * Get signatureYField
   * @return signatureYField
  **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_SIGNATURE_Y_FIELD)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public BigDecimal getSignatureYField() {
    return signatureYField;
  }


  public void setSignatureYField(BigDecimal signatureYField) {
    this.signatureYField = signatureYField;
  }


  public SigningCeremonyV2Request signerEmailField(String signerEmailField) {
    this.signerEmailField = signerEmailField;
    return this;
  }

   /**
   * Get signerEmailField
   * @return signerEmailField
  **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_SIGNER_EMAIL_FIELD)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getSignerEmailField() {
    return signerEmailField;
  }


  public void setSignerEmailField(String signerEmailField) {
    this.signerEmailField = signerEmailField;
  }


  public SigningCeremonyV2Request signerFullNameField(String signerFullNameField) {
    this.signerFullNameField = signerFullNameField;
    return this;
  }

   /**
   * Get signerFullNameField
   * @return signerFullNameField
  **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_SIGNER_FULL_NAME_FIELD)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getSignerFullNameField() {
    return signerFullNameField;
  }


  public void setSignerFullNameField(String signerFullNameField) {
    this.signerFullNameField = signerFullNameField;
  }


  public SigningCeremonyV2Request signerIdentificationNumberField(String signerIdentificationNumberField) {
    this.signerIdentificationNumberField = signerIdentificationNumberField;
    return this;
  }

   /**
   * Get signerIdentificationNumberField
   * @return signerIdentificationNumberField
  **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_SIGNER_IDENTIFICATION_NUMBER_FIELD)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getSignerIdentificationNumberField() {
    return signerIdentificationNumberField;
  }


  public void setSignerIdentificationNumberField(String signerIdentificationNumberField) {
    this.signerIdentificationNumberField = signerIdentificationNumberField;
  }


  public SigningCeremonyV2Request signerLocationField(String signerLocationField) {
    this.signerLocationField = signerLocationField;
    return this;
  }

   /**
   * Get signerLocationField
   * @return signerLocationField
  **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_SIGNER_LOCATION_FIELD)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getSignerLocationField() {
    return signerLocationField;
  }


  public void setSignerLocationField(String signerLocationField) {
    this.signerLocationField = signerLocationField;
  }


  public SigningCeremonyV2Request signerMobileNumberField(String signerMobileNumberField) {
    this.signerMobileNumberField = signerMobileNumberField;
    return this;
  }

   /**
   * Get signerMobileNumberField
   * @return signerMobileNumberField
  **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_SIGNER_MOBILE_NUMBER_FIELD)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getSignerMobileNumberField() {
    return signerMobileNumberField;
  }


  public void setSignerMobileNumberField(String signerMobileNumberField) {
    this.signerMobileNumberField = signerMobileNumberField;
  }


  public SigningCeremonyV2Request signerReasonField(String signerReasonField) {
    this.signerReasonField = signerReasonField;
    return this;
  }

   /**
   * Get signerReasonField
   * @return signerReasonField
  **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_SIGNER_REASON_FIELD)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getSignerReasonField() {
    return signerReasonField;
  }


  public void setSignerReasonField(String signerReasonField) {
    this.signerReasonField = signerReasonField;
  }


  public SigningCeremonyV2Request signerTrustOriginField(String signerTrustOriginField) {
    this.signerTrustOriginField = signerTrustOriginField;
    return this;
  }

   /**
   * Get signerTrustOriginField
   * @return signerTrustOriginField
  **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_SIGNER_TRUST_ORIGIN_FIELD)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getSignerTrustOriginField() {
    return signerTrustOriginField;
  }


  public void setSignerTrustOriginField(String signerTrustOriginField) {
    this.signerTrustOriginField = signerTrustOriginField;
  }


  public SigningCeremonyV2Request signerTrustReferenceField(String signerTrustReferenceField) {
    this.signerTrustReferenceField = signerTrustReferenceField;
    return this;
  }

   /**
   * Get signerTrustReferenceField
   * @return signerTrustReferenceField
  **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_SIGNER_TRUST_REFERENCE_FIELD)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getSignerTrustReferenceField() {
    return signerTrustReferenceField;
  }


  public void setSignerTrustReferenceField(String signerTrustReferenceField) {
    this.signerTrustReferenceField = signerTrustReferenceField;
  }


  public SigningCeremonyV2Request textFieldsListField(Set<Object> textFieldsListField) {
    this.textFieldsListField = textFieldsListField;
    return this;
  }

  public SigningCeremonyV2Request addTextFieldsListFieldItem(Object textFieldsListFieldItem) {
    this.textFieldsListField.add(textFieldsListFieldItem);
    return this;
  }

   /**
   * Get textFieldsListField
   * @return textFieldsListField
  **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_TEXT_FIELDS_LIST_FIELD)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Set<Object> getTextFieldsListField() {
    return textFieldsListField;
  }


  public void setTextFieldsListField(Set<Object> textFieldsListField) {
    this.textFieldsListField = textFieldsListField;
  }


  /**
   * Return true if this SigningCeremonyV2Request object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SigningCeremonyV2Request signingCeremonyV2Request = (SigningCeremonyV2Request) o;
    return Objects.equals(this.checkboxFieldsListField, signingCeremonyV2Request.checkboxFieldsListField) &&
        Objects.equals(this.docField, signingCeremonyV2Request.docField) &&
        Objects.equals(this.docNameField, signingCeremonyV2Request.docNameField) &&
        Objects.equals(this.initialFieldsListField, signingCeremonyV2Request.initialFieldsListField) &&
        Objects.equals(this.loginPasswordField, signingCeremonyV2Request.loginPasswordField) &&
        Objects.equals(this.loginUserNameField, signingCeremonyV2Request.loginUserNameField) &&
        Objects.equals(this.signatureHField, signingCeremonyV2Request.signatureHField) &&
        Objects.equals(this.signatureImageField, signingCeremonyV2Request.signatureImageField) &&
        Objects.equals(this.signatureImageIncludeBorderField, signingCeremonyV2Request.signatureImageIncludeBorderField) &&
        Objects.equals(this.signatureImageIncludeReasonField, signingCeremonyV2Request.signatureImageIncludeReasonField) &&
        Objects.equals(this.signatureImageIncludeSignedByField, signingCeremonyV2Request.signatureImageIncludeSignedByField) &&
        Objects.equals(this.signatureImageIncludeSignedDateField, signingCeremonyV2Request.signatureImageIncludeSignedDateField) &&
        Objects.equals(this.signatureImageTypeField, signingCeremonyV2Request.signatureImageTypeField) &&
        Objects.equals(this.signaturePageField, signingCeremonyV2Request.signaturePageField) &&
        Objects.equals(this.signatureWField, signingCeremonyV2Request.signatureWField) &&
        Objects.equals(this.signatureXField, signingCeremonyV2Request.signatureXField) &&
        Objects.equals(this.signatureYField, signingCeremonyV2Request.signatureYField) &&
        Objects.equals(this.signerEmailField, signingCeremonyV2Request.signerEmailField) &&
        Objects.equals(this.signerFullNameField, signingCeremonyV2Request.signerFullNameField) &&
        Objects.equals(this.signerIdentificationNumberField, signingCeremonyV2Request.signerIdentificationNumberField) &&
        Objects.equals(this.signerLocationField, signingCeremonyV2Request.signerLocationField) &&
        Objects.equals(this.signerMobileNumberField, signingCeremonyV2Request.signerMobileNumberField) &&
        Objects.equals(this.signerReasonField, signingCeremonyV2Request.signerReasonField) &&
        Objects.equals(this.signerTrustOriginField, signingCeremonyV2Request.signerTrustOriginField) &&
        Objects.equals(this.signerTrustReferenceField, signingCeremonyV2Request.signerTrustReferenceField) &&
        Objects.equals(this.textFieldsListField, signingCeremonyV2Request.textFieldsListField);
  }

  @Override
  public int hashCode() {
    return Objects.hash(checkboxFieldsListField, docField, docNameField, initialFieldsListField, loginPasswordField, loginUserNameField, signatureHField, signatureImageField, signatureImageIncludeBorderField, signatureImageIncludeReasonField, signatureImageIncludeSignedByField, signatureImageIncludeSignedDateField, signatureImageTypeField, signaturePageField, signatureWField, signatureXField, signatureYField, signerEmailField, signerFullNameField, signerIdentificationNumberField, signerLocationField, signerMobileNumberField, signerReasonField, signerTrustOriginField, signerTrustReferenceField, textFieldsListField);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SigningCeremonyV2Request {\n");
    sb.append("    checkboxFieldsListField: ").append(toIndentedString(checkboxFieldsListField)).append("\n");
    sb.append("    docField: ").append(toIndentedString(docField)).append("\n");
    sb.append("    docNameField: ").append(toIndentedString(docNameField)).append("\n");
    sb.append("    initialFieldsListField: ").append(toIndentedString(initialFieldsListField)).append("\n");
    sb.append("    loginPasswordField: ").append(toIndentedString(loginPasswordField)).append("\n");
    sb.append("    loginUserNameField: ").append(toIndentedString(loginUserNameField)).append("\n");
    sb.append("    signatureHField: ").append(toIndentedString(signatureHField)).append("\n");
    sb.append("    signatureImageField: ").append(toIndentedString(signatureImageField)).append("\n");
    sb.append("    signatureImageIncludeBorderField: ").append(toIndentedString(signatureImageIncludeBorderField)).append("\n");
    sb.append("    signatureImageIncludeReasonField: ").append(toIndentedString(signatureImageIncludeReasonField)).append("\n");
    sb.append("    signatureImageIncludeSignedByField: ").append(toIndentedString(signatureImageIncludeSignedByField)).append("\n");
    sb.append("    signatureImageIncludeSignedDateField: ").append(toIndentedString(signatureImageIncludeSignedDateField)).append("\n");
    sb.append("    signatureImageTypeField: ").append(toIndentedString(signatureImageTypeField)).append("\n");
    sb.append("    signaturePageField: ").append(toIndentedString(signaturePageField)).append("\n");
    sb.append("    signatureWField: ").append(toIndentedString(signatureWField)).append("\n");
    sb.append("    signatureXField: ").append(toIndentedString(signatureXField)).append("\n");
    sb.append("    signatureYField: ").append(toIndentedString(signatureYField)).append("\n");
    sb.append("    signerEmailField: ").append(toIndentedString(signerEmailField)).append("\n");
    sb.append("    signerFullNameField: ").append(toIndentedString(signerFullNameField)).append("\n");
    sb.append("    signerIdentificationNumberField: ").append(toIndentedString(signerIdentificationNumberField)).append("\n");
    sb.append("    signerLocationField: ").append(toIndentedString(signerLocationField)).append("\n");
    sb.append("    signerMobileNumberField: ").append(toIndentedString(signerMobileNumberField)).append("\n");
    sb.append("    signerReasonField: ").append(toIndentedString(signerReasonField)).append("\n");
    sb.append("    signerTrustOriginField: ").append(toIndentedString(signerTrustOriginField)).append("\n");
    sb.append("    signerTrustReferenceField: ").append(toIndentedString(signerTrustReferenceField)).append("\n");
    sb.append("    textFieldsListField: ").append(toIndentedString(textFieldsListField)).append("\n");
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


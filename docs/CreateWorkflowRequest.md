

# CreateWorkflowRequest

#### The request sent to create a document workflow.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**additionalDataField** | **String** | Sets additional data to be embedded in PDF Meta. | 
**autoExpireField** | **AutoExpire** |  | 
**autoRemindField** | **AutoRemind** |  | 
**docField** | **String** | Base64 Encoded String of document | 
**docNameField** | **String** | Name of document to display in SigniFlow | 
**dueDateField** | **OffsetDateTime** | Due date for the document, use in conjunction with Auto Expire. |  [optional]
**extensionField** | **DocExtension** |  | 
**messageField** | **String** | Custom message to display to participants | 
**priorityField** | **Priority** |  | 
**slAField** | **Integer** | Deprecated field, Pass 0 | 
**tokenField** | [**TokenField**](TokenField.md) |  | 




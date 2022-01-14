
/**
 * Lockstep Software Development Kit for Java
 *
 * (c) 2021-2022 Lockstep, Inc.
 *
 * For the full copyright and license information, please view the LICENSE
 * file that was distributed with this source code.
 *
 * @author     Ted Spence <tspence@lockstep.io>
 * @copyright  2021-2022 Lockstep, Inc.
 * @version    2022.2
 * @link       https://github.com/Lockstep-Network/lockstep-sdk-java
 */


package io.lockstep.api.models;

import java.util.Date;

public class PaymentModel
{
    private String groupKey;
    private String paymentId;
    private String companyId;
    private String erpKey;
    private String paymentType;
    private String tenderType;
    private Boolean isOpen;
    private String memoText;
    private Date paymentDate;
    private Date postDate;
    private Double paymentAmount;
    private Double unappliedAmount;
    private String currencyCode;
    private String referenceCode;
    private Date created;
    private String createdUserId;
    private Date modified;
    private String modifiedUserId;
    private String appEnrollmentId;
    private Boolean isVoided;
    private Boolean inDispute;
    private PaymentAppliedModel[] applications;
    private NoteModel[] notes;
    private AttachmentModel[] attachments;
    private CustomFieldDefinitionModel[] customFieldDefinitions;
    private CustomFieldValueModel[] customFieldValues;

    /**
     * The GroupKey uniquely identifies a single Lockstep Platform account.  All records for this
     * account will share the same GroupKey value.  GroupKey values cannot be changed once created.
     *
     * For more information, see [Accounts and GroupKeys](https://developer.lockstep.io/docs/accounts-and-groupkeys).
     *
     * @return The field groupKey
     */
    public String getGroupKey() { return this.groupKey; }
    /**
     * The GroupKey uniquely identifies a single Lockstep Platform account.  All records for this
     * account will share the same GroupKey value.  GroupKey values cannot be changed once created.
     *
     * For more information, see [Accounts and GroupKeys](https://developer.lockstep.io/docs/accounts-and-groupkeys).
     *
     * @param value The new value for groupKey
     */
    public void setGroupKey(String value) { this.groupKey = value; }
    /**
     * The unique ID of this record, automatically assigned by Lockstep when this record is
     * added to the Lockstep platform.
     *
     * For the ID of this record in its originating financial system, see `ErpKey`.
     *
     * @return The field paymentId
     */
    public String getPaymentId() { return this.paymentId; }
    /**
     * The unique ID of this record, automatically assigned by Lockstep when this record is
     * added to the Lockstep platform.
     *
     * For the ID of this record in its originating financial system, see `ErpKey`.
     *
     * @param value The new value for paymentId
     */
    public void setPaymentId(String value) { this.paymentId = value; }
    /**
     * The ID of the company to which this payment belongs.
     *
     * @return The field companyId
     */
    public String getCompanyId() { return this.companyId; }
    /**
     * The ID of the company to which this payment belongs.
     *
     * @param value The new value for companyId
     */
    public void setCompanyId(String value) { this.companyId = value; }
    /**
     * The unique ID of this record as it was known in its originating financial system.
     *
     * If this company record was imported from a financial system, it will have the value `ErpKey`
     * set to the original primary key number of the record as it was known in the originating financial
     * system.  If this record was not imported, this value will be `null`.
     *
     * For more information, see [Identity Columns](https://developer.lockstep.io/docs/identity-columns).
     *
     * @return The field erpKey
     */
    public String getErpKey() { return this.erpKey; }
    /**
     * The unique ID of this record as it was known in its originating financial system.
     *
     * If this company record was imported from a financial system, it will have the value `ErpKey`
     * set to the original primary key number of the record as it was known in the originating financial
     * system.  If this record was not imported, this value will be `null`.
     *
     * For more information, see [Identity Columns](https://developer.lockstep.io/docs/identity-columns).
     *
     * @param value The new value for erpKey
     */
    public void setErpKey(String value) { this.erpKey = value; }
    /**
     * The type of payment, cash or check.
     *
     * @return The field paymentType
     */
    public String getPaymentType() { return this.paymentType; }
    /**
     * The type of payment, cash or check.
     *
     * @param value The new value for paymentType
     */
    public void setPaymentType(String value) { this.paymentType = value; }
    /**
     * Cash, check, credit card, wire transfer.
     *
     * @return The field tenderType
     */
    public String getTenderType() { return this.tenderType; }
    /**
     * Cash, check, credit card, wire transfer.
     *
     * @param value The new value for tenderType
     */
    public void setTenderType(String value) { this.tenderType = value; }
    /**
     * Has the payment been fully applied?
     *
     * @return The field isOpen
     */
    public Boolean getIsOpen() { return this.isOpen; }
    /**
     * Has the payment been fully applied?
     *
     * @param value The new value for isOpen
     */
    public void setIsOpen(Boolean value) { this.isOpen = value; }
    /**
     * Memo or reference text (ex. memo field on a check).
     *
     * @return The field memoText
     */
    public String getMemoText() { return this.memoText; }
    /**
     * Memo or reference text (ex. memo field on a check).
     *
     * @param value The new value for memoText
     */
    public void setMemoText(String value) { this.memoText = value; }
    /**
     * The date of this payment.
     *
     * @return The field paymentDate
     */
    public Date getPaymentDate() { return this.paymentDate; }
    /**
     * The date of this payment.
     *
     * @param value The new value for paymentDate
     */
    public void setPaymentDate(Date value) { this.paymentDate = value; }
    /**
     * Payment post date.
     *
     * @return The field postDate
     */
    public Date getPostDate() { return this.postDate; }
    /**
     * Payment post date.
     *
     * @param value The new value for postDate
     */
    public void setPostDate(Date value) { this.postDate = value; }
    /**
     * Total amount of this payment.
     *
     * @return The field paymentAmount
     */
    public Double getPaymentAmount() { return this.paymentAmount; }
    /**
     * Total amount of this payment.
     *
     * @param value The new value for paymentAmount
     */
    public void setPaymentAmount(Double value) { this.paymentAmount = value; }
    /**
     * Unapplied balance of this payment.
     *
     * @return The field unappliedAmount
     */
    public Double getUnappliedAmount() { return this.unappliedAmount; }
    /**
     * Unapplied balance of this payment.
     *
     * @param value The new value for unappliedAmount
     */
    public void setUnappliedAmount(Double value) { this.unappliedAmount = value; }
    /**
     * Currency of the payment. This will be validated by the /api/v1/currencies data set
     *
     * @return The field currencyCode
     */
    public String getCurrencyCode() { return this.currencyCode; }
    /**
     * Currency of the payment. This will be validated by the /api/v1/currencies data set
     *
     * @param value The new value for currencyCode
     */
    public void setCurrencyCode(String value) { this.currencyCode = value; }
    /**
     * Reference code for the payment for the given Erp system.
     *
     * @return The field referenceCode
     */
    public String getReferenceCode() { return this.referenceCode; }
    /**
     * Reference code for the payment for the given Erp system.
     *
     * @param value The new value for referenceCode
     */
    public void setReferenceCode(String value) { this.referenceCode = value; }
    /**
     * The date on which this record was created.
     *
     * @return The field created
     */
    public Date getCreated() { return this.created; }
    /**
     * The date on which this record was created.
     *
     * @param value The new value for created
     */
    public void setCreated(Date value) { this.created = value; }
    /**
     * The ID of the user who created this payment.
     *
     * @return The field createdUserId
     */
    public String getCreatedUserId() { return this.createdUserId; }
    /**
     * The ID of the user who created this payment.
     *
     * @param value The new value for createdUserId
     */
    public void setCreatedUserId(String value) { this.createdUserId = value; }
    /**
     * The date on which this record was last modified.
     *
     * @return The field modified
     */
    public Date getModified() { return this.modified; }
    /**
     * The date on which this record was last modified.
     *
     * @param value The new value for modified
     */
    public void setModified(Date value) { this.modified = value; }
    /**
     * The ID of the user who last modified this payment.
     *
     * @return The field modifiedUserId
     */
    public String getModifiedUserId() { return this.modifiedUserId; }
    /**
     * The ID of the user who last modified this payment.
     *
     * @param value The new value for modifiedUserId
     */
    public void setModifiedUserId(String value) { this.modifiedUserId = value; }
    /**
     * AppEnrollmentId for this record; used for mapping purposes.
     *
     * @return The field appEnrollmentId
     */
    public String getAppEnrollmentId() { return this.appEnrollmentId; }
    /**
     * AppEnrollmentId for this record; used for mapping purposes.
     *
     * @param value The new value for appEnrollmentId
     */
    public void setAppEnrollmentId(String value) { this.appEnrollmentId = value; }
    /**
     * Is the payment voided?
     *
     * @return The field isVoided
     */
    public Boolean getIsVoided() { return this.isVoided; }
    /**
     * Is the payment voided?
     *
     * @param value The new value for isVoided
     */
    public void setIsVoided(Boolean value) { this.isVoided = value; }
    /**
     * Is the payment in dispute?
     *
     * @return The field inDispute
     */
    public Boolean getInDispute() { return this.inDispute; }
    /**
     * Is the payment in dispute?
     *
     * @param value The new value for inDispute
     */
    public void setInDispute(Boolean value) { this.inDispute = value; }
    /**
     * All applications this payment is associated with.
     * To retrieve this collection, specify `Applications` in the "Include" parameter for your query.
     *
     * @return The field applications
     */
    public PaymentAppliedModel[] getApplications() { return this.applications; }
    /**
     * All applications this payment is associated with.
     * To retrieve this collection, specify `Applications` in the "Include" parameter for your query.
     *
     * @param value The new value for applications
     */
    public void setApplications(PaymentAppliedModel[] value) { this.applications = value; }
    /**
     * All notes attached to this payment.
     * To retrieve this collection, specify `Notes` in the "Include" parameter for your query.
     *
     * @return The field notes
     */
    public NoteModel[] getNotes() { return this.notes; }
    /**
     * All notes attached to this payment.
     * To retrieve this collection, specify `Notes` in the "Include" parameter for your query.
     *
     * @param value The new value for notes
     */
    public void setNotes(NoteModel[] value) { this.notes = value; }
    /**
     * All attachments attached to this payment.
     * To retrieve this collection, specify `Attachments` in the "Include" parameter for your query.
     *
     * @return The field attachments
     */
    public AttachmentModel[] getAttachments() { return this.attachments; }
    /**
     * All attachments attached to this payment.
     * To retrieve this collection, specify `Attachments` in the "Include" parameter for your query.
     *
     * @param value The new value for attachments
     */
    public void setAttachments(AttachmentModel[] value) { this.attachments = value; }
    /**
     * All definitions attached to this payment.
     * To retrieve this collection, specify `CustomFieldValues` in the "Include" parameter for your query.
     *
     * @return The field customFieldDefinitions
     */
    public CustomFieldDefinitionModel[] getCustomFieldDefinitions() { return this.customFieldDefinitions; }
    /**
     * All definitions attached to this payment.
     * To retrieve this collection, specify `CustomFieldValues` in the "Include" parameter for your query.
     *
     * @param value The new value for customFieldDefinitions
     */
    public void setCustomFieldDefinitions(CustomFieldDefinitionModel[] value) { this.customFieldDefinitions = value; }
    /**
     * All values attached to this payment.
     * To retrieve this collection, specify `CustomFieldValues` in the "Include" parameter for your query.
     *
     * @return The field customFieldValues
     */
    public CustomFieldValueModel[] getCustomFieldValues() { return this.customFieldValues; }
    /**
     * All values attached to this payment.
     * To retrieve this collection, specify `CustomFieldValues` in the "Include" parameter for your query.
     *
     * @param value The new value for customFieldValues
     */
    public void setCustomFieldValues(CustomFieldValueModel[] value) { this.customFieldValues = value; }
};

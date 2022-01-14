
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

public class InvoiceModel
{
    private String groupKey;
    private String invoiceId;
    private String companyId;
    private String customerId;
    private String erpKey;
    private String purchaseOrderCode;
    private String referenceCode;
    private String salespersonCode;
    private String salespersonName;
    private String invoiceTypeCode;
    private String invoiceStatusCode;
    private String termsCode;
    private String specialTerms;
    private String currencyCode;
    private Double totalAmount;
    private Double salesTaxAmount;
    private Double discountAmount;
    private Double outstandingBalanceAmount;
    private Date invoiceDate;
    private Date discountDate;
    private Date postedDate;
    private Date invoiceClosedDate;
    private Date paymentDueDate;
    private Date importedDate;
    private String primaryOriginAddressId;
    private String primaryBillToAddressId;
    private String primaryShipToAddressId;
    private Date created;
    private String createdUserId;
    private Date modified;
    private String modifiedUserId;
    private String appEnrollmentId;
    private Boolean isVoided;
    private Boolean inDispute;
    private Boolean excludeFromAging;
    private InvoiceAddressModel[] addresses;
    private InvoiceLineModel[] lines;
    private InvoicePaymentDetailModel[] payments;
    private NoteModel[] notes;
    private AttachmentModel[] attachments;
    private CompanyModel company;
    private CompanyModel customer;
    private ContactModel customerPrimaryContact;
    private CreditMemoInvoiceModel[] creditMemos;
    private CustomFieldValueModel[] customFieldValues;
    private CustomFieldDefinitionModel[] customFieldDefinitions;

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
     * @return The field invoiceId
     */
    public String getInvoiceId() { return this.invoiceId; }
    /**
     * The unique ID of this record, automatically assigned by Lockstep when this record is
     * added to the Lockstep platform.
     *
     * For the ID of this record in its originating financial system, see `ErpKey`.
     *
     * @param value The new value for invoiceId
     */
    public void setInvoiceId(String value) { this.invoiceId = value; }
    /**
     * The ID number of the company that created this invoice.
     *
     * @return The field companyId
     */
    public String getCompanyId() { return this.companyId; }
    /**
     * The ID number of the company that created this invoice.
     *
     * @param value The new value for companyId
     */
    public void setCompanyId(String value) { this.companyId = value; }
    /**
     * The ID number of the counterparty for the invoice, for example, a customer or vendor.
     *
     * @return The field customerId
     */
    public String getCustomerId() { return this.customerId; }
    /**
     * The ID number of the counterparty for the invoice, for example, a customer or vendor.
     *
     * @param value The new value for customerId
     */
    public void setCustomerId(String value) { this.customerId = value; }
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
     * The purchase order code as it exists in the user's ERP or accounting system.
     *
     * @return The field purchaseOrderCode
     */
    public String getPurchaseOrderCode() { return this.purchaseOrderCode; }
    /**
     * The purchase order code as it exists in the user's ERP or accounting system.
     *
     * @param value The new value for purchaseOrderCode
     */
    public void setPurchaseOrderCode(String value) { this.purchaseOrderCode = value; }
    /**
     * An additional reference code that is sometimes used to identify this invoice.
     * The meaning of this field is specific to the ERP or accounting system used by the user.
     *
     * @return The field referenceCode
     */
    public String getReferenceCode() { return this.referenceCode; }
    /**
     * An additional reference code that is sometimes used to identify this invoice.
     * The meaning of this field is specific to the ERP or accounting system used by the user.
     *
     * @param value The new value for referenceCode
     */
    public void setReferenceCode(String value) { this.referenceCode = value; }
    /**
     * A code identifying the salesperson responsible for writing this quote, invoice, or order.
     *
     * @return The field salespersonCode
     */
    public String getSalespersonCode() { return this.salespersonCode; }
    /**
     * A code identifying the salesperson responsible for writing this quote, invoice, or order.
     *
     * @param value The new value for salespersonCode
     */
    public void setSalespersonCode(String value) { this.salespersonCode = value; }
    /**
     * A string identifying the salesperson responsible for writing this quote, invoice, or order.
     *
     * @return The field salespersonName
     */
    public String getSalespersonName() { return this.salespersonName; }
    /**
     * A string identifying the salesperson responsible for writing this quote, invoice, or order.
     *
     * @param value The new value for salespersonName
     */
    public void setSalespersonName(String value) { this.salespersonName = value; }
    /**
     * A code identifying the type of this invoice.
     *
     * @return The field invoiceTypeCode
     */
    public String getInvoiceTypeCode() { return this.invoiceTypeCode; }
    /**
     * A code identifying the type of this invoice.
     *
     * @param value The new value for invoiceTypeCode
     */
    public void setInvoiceTypeCode(String value) { this.invoiceTypeCode = value; }
    /**
     * A code identifying the status of this invoice.
     *
     * @return The field invoiceStatusCode
     */
    public String getInvoiceStatusCode() { return this.invoiceStatusCode; }
    /**
     * A code identifying the status of this invoice.
     *
     * @param value The new value for invoiceStatusCode
     */
    public void setInvoiceStatusCode(String value) { this.invoiceStatusCode = value; }
    /**
     * A code identifying the terms given to the purchaser.
     *
     * @return The field termsCode
     */
    public String getTermsCode() { return this.termsCode; }
    /**
     * A code identifying the terms given to the purchaser.
     *
     * @param value The new value for termsCode
     */
    public void setTermsCode(String value) { this.termsCode = value; }
    /**
     * If the customer negotiated any special terms different from the standard terms above, describe them here.
     *
     * @return The field specialTerms
     */
    public String getSpecialTerms() { return this.specialTerms; }
    /**
     * If the customer negotiated any special terms different from the standard terms above, describe them here.
     *
     * @param value The new value for specialTerms
     */
    public void setSpecialTerms(String value) { this.specialTerms = value; }
    /**
     * The three-character ISO 4217 currency code used for this invoice.
     *
     * @return The field currencyCode
     */
    public String getCurrencyCode() { return this.currencyCode; }
    /**
     * The three-character ISO 4217 currency code used for this invoice.
     *
     * @param value The new value for currencyCode
     */
    public void setCurrencyCode(String value) { this.currencyCode = value; }
    /**
     * The total value of this invoice, inclusive of all taxes and line items.
     *
     * @return The field totalAmount
     */
    public Double getTotalAmount() { return this.totalAmount; }
    /**
     * The total value of this invoice, inclusive of all taxes and line items.
     *
     * @param value The new value for totalAmount
     */
    public void setTotalAmount(Double value) { this.totalAmount = value; }
    /**
     * The total sales (or transactional) tax calculated for this invoice.
     *
     * @return The field salesTaxAmount
     */
    public Double getSalesTaxAmount() { return this.salesTaxAmount; }
    /**
     * The total sales (or transactional) tax calculated for this invoice.
     *
     * @param value The new value for salesTaxAmount
     */
    public void setSalesTaxAmount(Double value) { this.salesTaxAmount = value; }
    /**
     * The total discounts given by the seller to the buyer on this invoice.
     *
     * @return The field discountAmount
     */
    public Double getDiscountAmount() { return this.discountAmount; }
    /**
     * The total discounts given by the seller to the buyer on this invoice.
     *
     * @param value The new value for discountAmount
     */
    public void setDiscountAmount(Double value) { this.discountAmount = value; }
    /**
     * The remaining balance value of this invoice.
     *
     * @return The field outstandingBalanceAmount
     */
    public Double getOutstandingBalanceAmount() { return this.outstandingBalanceAmount; }
    /**
     * The remaining balance value of this invoice.
     *
     * @param value The new value for outstandingBalanceAmount
     */
    public void setOutstandingBalanceAmount(Double value) { this.outstandingBalanceAmount = value; }
    /**
     * The reporting date for this invoice.
     *
     * @return The field invoiceDate
     */
    public Date getInvoiceDate() { return this.invoiceDate; }
    /**
     * The reporting date for this invoice.
     *
     * @param value The new value for invoiceDate
     */
    public void setInvoiceDate(Date value) { this.invoiceDate = value; }
    /**
     * The date when discounts were adjusted for this invoice.
     *
     * @return The field discountDate
     */
    public Date getDiscountDate() { return this.discountDate; }
    /**
     * The date when discounts were adjusted for this invoice.
     *
     * @param value The new value for discountDate
     */
    public void setDiscountDate(Date value) { this.discountDate = value; }
    /**
     * The date when this invoice posted to the company's general ledger.
     *
     * @return The field postedDate
     */
    public Date getPostedDate() { return this.postedDate; }
    /**
     * The date when this invoice posted to the company's general ledger.
     *
     * @param value The new value for postedDate
     */
    public void setPostedDate(Date value) { this.postedDate = value; }
    /**
     * The date when the invoice was closed and finalized after completion of all payments and delivery of all products and
     * services.
     *
     * @return The field invoiceClosedDate
     */
    public Date getInvoiceClosedDate() { return this.invoiceClosedDate; }
    /**
     * The date when the invoice was closed and finalized after completion of all payments and delivery of all products and
     * services.
     *
     * @param value The new value for invoiceClosedDate
     */
    public void setInvoiceClosedDate(Date value) { this.invoiceClosedDate = value; }
    /**
     * The date when the remaining outstanding balance is due.
     *
     * @return The field paymentDueDate
     */
    public Date getPaymentDueDate() { return this.paymentDueDate; }
    /**
     * The date when the remaining outstanding balance is due.
     *
     * @param value The new value for paymentDueDate
     */
    public void setPaymentDueDate(Date value) { this.paymentDueDate = value; }
    /**
     * The date and time when this record was imported from the user's ERP or accounting system.
     *
     * @return The field importedDate
     */
    public Date getImportedDate() { return this.importedDate; }
    /**
     * The date and time when this record was imported from the user's ERP or accounting system.
     *
     * @param value The new value for importedDate
     */
    public void setImportedDate(Date value) { this.importedDate = value; }
    /**
     * The ID number of the invoice's origination address
     *
     * @return The field primaryOriginAddressId
     */
    public String getPrimaryOriginAddressId() { return this.primaryOriginAddressId; }
    /**
     * The ID number of the invoice's origination address
     *
     * @param value The new value for primaryOriginAddressId
     */
    public void setPrimaryOriginAddressId(String value) { this.primaryOriginAddressId = value; }
    /**
     * The ID number of the invoice's bill-to address
     *
     * @return The field primaryBillToAddressId
     */
    public String getPrimaryBillToAddressId() { return this.primaryBillToAddressId; }
    /**
     * The ID number of the invoice's bill-to address
     *
     * @param value The new value for primaryBillToAddressId
     */
    public void setPrimaryBillToAddressId(String value) { this.primaryBillToAddressId = value; }
    /**
     * The ID number of the invoice's ship-to address
     *
     * @return The field primaryShipToAddressId
     */
    public String getPrimaryShipToAddressId() { return this.primaryShipToAddressId; }
    /**
     * The ID number of the invoice's ship-to address
     *
     * @param value The new value for primaryShipToAddressId
     */
    public void setPrimaryShipToAddressId(String value) { this.primaryShipToAddressId = value; }
    /**
     * The date on which this address record was created.
     *
     * @return The field created
     */
    public Date getCreated() { return this.created; }
    /**
     * The date on which this address record was created.
     *
     * @param value The new value for created
     */
    public void setCreated(Date value) { this.created = value; }
    /**
     * The ID number of the user who created this address.
     *
     * @return The field createdUserId
     */
    public String getCreatedUserId() { return this.createdUserId; }
    /**
     * The ID number of the user who created this address.
     *
     * @param value The new value for createdUserId
     */
    public void setCreatedUserId(String value) { this.createdUserId = value; }
    /**
     * The date on which this address record was last modified.
     *
     * @return The field modified
     */
    public Date getModified() { return this.modified; }
    /**
     * The date on which this address record was last modified.
     *
     * @param value The new value for modified
     */
    public void setModified(Date value) { this.modified = value; }
    /**
     * The ID number of the user who most recently modified this address.
     *
     * @return The field modifiedUserId
     */
    public String getModifiedUserId() { return this.modifiedUserId; }
    /**
     * The ID number of the user who most recently modified this address.
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
     * Is the invoice voided?
     *
     * @return The field isVoided
     */
    public Boolean getIsVoided() { return this.isVoided; }
    /**
     * Is the invoice voided?
     *
     * @param value The new value for isVoided
     */
    public void setIsVoided(Boolean value) { this.isVoided = value; }
    /**
     * Is the invoice in dispute?
     *
     * @return The field inDispute
     */
    public Boolean getInDispute() { return this.inDispute; }
    /**
     * Is the invoice in dispute?
     *
     * @param value The new value for inDispute
     */
    public void setInDispute(Boolean value) { this.inDispute = value; }
    /**
     * Should the invoice be excluded from aging calculations?
     *
     * @return The field excludeFromAging
     */
    public Boolean getExcludeFromAging() { return this.excludeFromAging; }
    /**
     * Should the invoice be excluded from aging calculations?
     *
     * @param value The new value for excludeFromAging
     */
    public void setExcludeFromAging(Boolean value) { this.excludeFromAging = value; }
    /**
     * All addresses connected to this invoice.
     * To retrieve this collection, specify `Addresses` in the "Include" parameter for your query.
     *
     * @return The field addresses
     */
    public InvoiceAddressModel[] getAddresses() { return this.addresses; }
    /**
     * All addresses connected to this invoice.
     * To retrieve this collection, specify `Addresses` in the "Include" parameter for your query.
     *
     * @param value The new value for addresses
     */
    public void setAddresses(InvoiceAddressModel[] value) { this.addresses = value; }
    /**
     * All lines attached to this invoice.
     * To retrieve this collection, specify `Lines` in the "Include" parameter for your query.
     *
     * @return The field lines
     */
    public InvoiceLineModel[] getLines() { return this.lines; }
    /**
     * All lines attached to this invoice.
     * To retrieve this collection, specify `Lines` in the "Include" parameter for your query.
     *
     * @param value The new value for lines
     */
    public void setLines(InvoiceLineModel[] value) { this.lines = value; }
    /**
     * All payments attached to this invoice, the amount of the payment applied to this Invoice, and the date the Payment was applied.
     * To retrieve this collection, specify `Payments` in the "Include" parameter for your query.
     *
     * @return The field payments
     */
    public InvoicePaymentDetailModel[] getPayments() { return this.payments; }
    /**
     * All payments attached to this invoice, the amount of the payment applied to this Invoice, and the date the Payment was applied.
     * To retrieve this collection, specify `Payments` in the "Include" parameter for your query.
     *
     * @param value The new value for payments
     */
    public void setPayments(InvoicePaymentDetailModel[] value) { this.payments = value; }
    /**
     * All notes attached to this invoice.
     * To retrieve this collection, specify `Notes` in the "Include" parameter for your query.
     *
     * @return The field notes
     */
    public NoteModel[] getNotes() { return this.notes; }
    /**
     * All notes attached to this invoice.
     * To retrieve this collection, specify `Notes` in the "Include" parameter for your query.
     *
     * @param value The new value for notes
     */
    public void setNotes(NoteModel[] value) { this.notes = value; }
    /**
     * All attachments attached to this invoice.
     * To retrieve this collection, specify `Attachments` in the "Include" parameter for your query.
     *
     * @return The field attachments
     */
    public AttachmentModel[] getAttachments() { return this.attachments; }
    /**
     * All attachments attached to this invoice.
     * To retrieve this collection, specify `Attachments` in the "Include" parameter for your query.
     *
     * @param value The new value for attachments
     */
    public void setAttachments(AttachmentModel[] value) { this.attachments = value; }
    /**
     * The Company associated to this invoice.
     * To retrieve this item, specify `Company` in the "Include" parameter for your query.
     *
     * @return The field company
     */
    public CompanyModel getCompany() { return this.company; }
    /**
     * The Company associated to this invoice.
     * To retrieve this item, specify `Company` in the "Include" parameter for your query.
     *
     * @param value The new value for company
     */
    public void setCompany(CompanyModel value) { this.company = value; }
    /**
     * The Customer associated to the invoice customer
     * To retrieve this item, specify `Customer` in the "Include" parameter for your query.
     *
     * @return The field customer
     */
    public CompanyModel getCustomer() { return this.customer; }
    /**
     * The Customer associated to the invoice customer
     * To retrieve this item, specify `Customer` in the "Include" parameter for your query.
     *
     * @param value The new value for customer
     */
    public void setCustomer(CompanyModel value) { this.customer = value; }
    /**
     * The Contact associated to the invoice customer
     * To retrieve this item, specify `Customer` in the "Include" parameter for your query.
     *
     * @return The field customerPrimaryContact
     */
    public ContactModel getCustomerPrimaryContact() { return this.customerPrimaryContact; }
    /**
     * The Contact associated to the invoice customer
     * To retrieve this item, specify `Customer` in the "Include" parameter for your query.
     *
     * @param value The new value for customerPrimaryContact
     */
    public void setCustomerPrimaryContact(ContactModel value) { this.customerPrimaryContact = value; }
    /**
     * The credit memos associated to this invoice.
     * To retrieve this item, specify `CreditMemos` in the "Include" parameter for your query.
     *
     * @return The field creditMemos
     */
    public CreditMemoInvoiceModel[] getCreditMemos() { return this.creditMemos; }
    /**
     * The credit memos associated to this invoice.
     * To retrieve this item, specify `CreditMemos` in the "Include" parameter for your query.
     *
     * @param value The new value for creditMemos
     */
    public void setCreditMemos(CreditMemoInvoiceModel[] value) { this.creditMemos = value; }
    /**
     * All custom field values associated with this invoice
     * To retrieve this item, specify `CustomFieldValues` in the "Include" parameter for your query.
     *
     * @return The field customFieldValues
     */
    public CustomFieldValueModel[] getCustomFieldValues() { return this.customFieldValues; }
    /**
     * All custom field values associated with this invoice
     * To retrieve this item, specify `CustomFieldValues` in the "Include" parameter for your query.
     *
     * @param value The new value for customFieldValues
     */
    public void setCustomFieldValues(CustomFieldValueModel[] value) { this.customFieldValues = value; }
    /**
     * All custom field definitions
     *
     * @return The field customFieldDefinitions
     */
    public CustomFieldDefinitionModel[] getCustomFieldDefinitions() { return this.customFieldDefinitions; }
    /**
     * All custom field definitions
     *
     * @param value The new value for customFieldDefinitions
     */
    public void setCustomFieldDefinitions(CustomFieldDefinitionModel[] value) { this.customFieldDefinitions = value; }
};

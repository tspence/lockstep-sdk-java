
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


package io.lockstep.api.clients;

import io.lockstep.api.LockstepApi;
import io.lockstep.api.RestRequest;
import io.lockstep.api.models.LockstepResponse;
import io.lockstep.api.models.InvoiceModel;

import io.lockstep.api.models.ActionResultModel;
import io.lockstep.api.models.FetchResult;
import com.google.gson.reflect.TypeToken;
import io.lockstep.api.models.InvoiceSummaryModel;
import io.lockstep.api.models.AtRiskInvoiceSummaryModel;

public class InvoicesClient
{
    private LockstepApi client;

    /**
     * Constructor for method collection
     *
     * @param client A {@link io.lockstep.api.LockstepApi} platform client
     */
    public InvoicesClient(LockstepApi client) {
        this.client = client;
    }

    /**
     * Retrieves the Invoice specified by this unique identifier, optionally including nested data sets.
     *
     * An Invoice represents a bill sent from one company to another.  The creator of the invoice is identified by the `CompanyId` field, and the recipient of the invoice is identified by the `CustomerId` field.  Most invoices are uniquely identified both by a Lockstep Platform ID number and a customer ERP "key" that was generated by the system that originated the invoice.  Invoices have a total amount and a due date, and when some payments have been made on the Invoice the `TotalAmount` and the `OutstandingBalanceAmount` may be different.
     *
     *
     * @param id The unique Lockstep Platform ID number of this invoice; NOT the customer's ERP key
     * @param include To fetch additional data on this object, specify the list of elements to retrieve. Available collections: Addresses, Lines, Payments, Notes, Attachments, Company, Customer, CustomFields, CreditMemos
     * @return A {@link io.lockstep.api.models.LockstepResponse} containing the results
     */
    public LockstepResponse<InvoiceModel> retrieveInvoice(String id, String include)
    {
        RestRequest<InvoiceModel> r = new RestRequest<InvoiceModel>(this.client, "GET", "/api/v1/Invoices/{id}");
        r.AddPath("{id}", id.toString());
        r.AddQuery("include", include.toString());
        return r.Call(InvoiceModel.class);
    }

    /**
     * Updates an existing Invoice with the information supplied to this PATCH call.
     *
     * The PATCH method allows you to change specific values on the object while leaving other values alone.  As input you should supply a list of field names and new values.  If you do not provide the name of a field, that field will remain unchanged.  This allows you to ensure that you are only updating the specific fields desired.  An Invoice represents a bill sent from one company to another.  The creator of the invoice is identified by the `CompanyId` field, and the recipient of the invoice is identified by the `CustomerId` field.  Most invoices are uniquely identified both by a Lockstep Platform ID number and a customer ERP "key" that was generated by the system that originated the invoice.  Invoices have a total amount and a due date, and when some payments have been made on the Invoice the `TotalAmount` and the `OutstandingBalanceAmount` may be different.
     *
     *
     * @param id The unique Lockstep Platform ID number of the invoice to update; NOT the customer's ERP key
     * @param body A list of changes to apply to this Invoice
     * @return A {@link io.lockstep.api.models.LockstepResponse} containing the results
     */
    public LockstepResponse<InvoiceModel> updateInvoice(String id, Object body)
    {
        RestRequest<InvoiceModel> r = new RestRequest<InvoiceModel>(this.client, "PATCH", "/api/v1/Invoices/{id}");
        r.AddPath("{id}", id.toString());
        r.AddBody(body);
        return r.Call(InvoiceModel.class);
    }

    /**
     * Deletes the Invoice referred to by this unique identifier. An Invoice represents a bill sent from one company to another.  The creator of the invoice is identified by the `CompanyId` field, and the recipient of the invoice is identified by the `CustomerId` field.  Most invoices are uniquely identified both by a Lockstep Platform ID number and a customer ERP "key" that was generated by the system that originated the invoice.  Invoices have a total amount and a due date, and when some payments have been made on the Invoice the `TotalAmount` and the `OutstandingBalanceAmount` may be different.
     *
     *
     * @param id The unique Lockstep Platform ID number of the invoice to delete; NOT the customer's ERP key
     * @return A {@link io.lockstep.api.models.LockstepResponse} containing the results
     */
    public LockstepResponse<ActionResultModel> deleteInvoice(String id)
    {
        RestRequest<ActionResultModel> r = new RestRequest<ActionResultModel>(this.client, "DELETE", "/api/v1/Invoices/{id}");
        r.AddPath("{id}", id.toString());
        return r.Call(ActionResultModel.class);
    }

    /**
     * Creates one or more Invoices within this account and returns the records as created.
     *
     * An Invoice represents a bill sent from one company to another.  The creator of the invoice is identified by the `CompanyId` field, and the recipient of the invoice is identified by the `CustomerId` field.  Most invoices are uniquely identified both by a Lockstep Platform ID number and a customer ERP "key" that was generated by the system that originated the invoice.  Invoices have a total amount and a due date, and when some payments have been made on the Invoice the `TotalAmount` and the `OutstandingBalanceAmount` may be different.
     *
     *
     * @param body The Invoices to create
     * @return A {@link io.lockstep.api.models.LockstepResponse} containing the results
     */
    public LockstepResponse<InvoiceModel[]> createInvoices(InvoiceModel[] body)
    {
        RestRequest<InvoiceModel[]> r = new RestRequest<InvoiceModel[]>(this.client, "POST", "/api/v1/Invoices");
        r.AddBody(body);
        return r.Call(InvoiceModel[].class);
    }

    /**
     * Queries Invoices for this account using the specified filtering, sorting, nested fetch, and pagination rules requested.
     *
     * More information on querying can be found on the [Searchlight Query Language](https://developer.lockstep.io/docs/querying-with-searchlight) page on the Lockstep Developer website.  An Invoice represents a bill sent from one company to another.  The creator of the invoice is identified by the `CompanyId` field, and the recipient of the invoice is identified by the `CustomerId` field.  Most invoices are uniquely identified both by a Lockstep Platform ID number and a customer ERP "key" that was generated by the system that originated the invoice.  Invoices have a total amount and a due date, and when some payments have been made on the Invoice the `TotalAmount` and the `OutstandingBalanceAmount` may be different.
     *
     *
     * @param filter The filter for this query. See [Searchlight Query Language](https://developer.lockstep.io/docs/querying-with-searchlight)
     * @param include To fetch additional data on this object, specify the list of elements to retrieve. Available collections: Addresses, Lines, Payments, Notes, Attachments, Company, Customer, CustomFields, CreditMemos
     * @param order The sort order for this query. See See [Searchlight Query Language](https://developer.lockstep.io/docs/querying-with-searchlight)
     * @param pageSize The page size for results (default 200). See [Searchlight Query Language](https://developer.lockstep.io/docs/querying-with-searchlight)
     * @param pageNumber The page number for results (default 0). See [Searchlight Query Language](https://developer.lockstep.io/docs/querying-with-searchlight)
     * @return A {@link io.lockstep.api.models.LockstepResponse} containing the results
     */
    public LockstepResponse<FetchResult<InvoiceModel>> queryInvoices(String filter, String include, String order, Integer pageSize, Integer pageNumber)
    {
        RestRequest<FetchResult<InvoiceModel>> r = new RestRequest<FetchResult<InvoiceModel>>(this.client, "GET", "/api/v1/Invoices/query");
        r.AddQuery("filter", filter.toString());
        r.AddQuery("include", include.toString());
        r.AddQuery("order", order.toString());
        r.AddQuery("pageSize", pageSize.toString());
        r.AddQuery("pageNumber", pageNumber.toString());
        return r.Call(new TypeToken<FetchResult<InvoiceModel>>() {}.getType());
    }

    /**
     * Queries Invoices for this account using the specified filtering, sorting, nested fetch, and pagination rules requested.  Display the results using the Invoice Summary View format.
     *
     * More information on querying can be found on the [Searchlight Query Language](https://developer.lockstep.io/docs/querying-with-searchlight) page on the Lockstep Developer website.
     *
     * The Invoice Summary View represents a slightly different view of the data and includes some extra fields that might be useful.  For more information, see the data format of the Invoice Summary Model.
     *
     *
     * @param filter The filter for this query. See [Searchlight Query Language](https://developer.lockstep.io/docs/querying-with-searchlight)
     * @param include To fetch additional data on this object, specify the list of elements to retrieve. No collections are currently available but may be offered in the future
     * @param order The sort order for this query. See See [Searchlight Query Language](https://developer.lockstep.io/docs/querying-with-searchlight)
     * @param pageSize The page size for results (default 200). See [Searchlight Query Language](https://developer.lockstep.io/docs/querying-with-searchlight)
     * @param pageNumber The page number for results (default 0). See [Searchlight Query Language](https://developer.lockstep.io/docs/querying-with-searchlight)
     * @return A {@link io.lockstep.api.models.LockstepResponse} containing the results
     */
    public LockstepResponse<FetchResult<InvoiceSummaryModel>> queryInvoiceSummaryView(String filter, String include, String order, Integer pageSize, Integer pageNumber)
    {
        RestRequest<FetchResult<InvoiceSummaryModel>> r = new RestRequest<FetchResult<InvoiceSummaryModel>>(this.client, "GET", "/api/v1/Invoices/views/summary");
        r.AddQuery("filter", filter.toString());
        r.AddQuery("include", include.toString());
        r.AddQuery("order", order.toString());
        r.AddQuery("pageSize", pageSize.toString());
        r.AddQuery("pageNumber", pageNumber.toString());
        return r.Call(new TypeToken<FetchResult<InvoiceSummaryModel>>() {}.getType());
    }

    /**
     * Queries At Risk Invoices for this account using the specified filtering, sorting, nested fetch, and pagination rules requested.  Display the results using the At Risk Invoice Summary View format.
     *
     * More information on querying can be found on the [Searchlight Query Language](https://developer.lockstep.io/docs/querying-with-searchlight) page on the Lockstep Developer website.
     *
     * The At Risk Invoice Summary View represents a slightly different view of the data and includes some extra fields that might be useful.  For more information, see the data format of the At Risk Invoice Summary Model.
     *
     *
     * @param filter The filter for this query. See [Searchlight Query Language](https://developer.lockstep.io/docs/querying-with-searchlight)
     * @param include To fetch additional data on this object, specify the list of elements to retrieve. No collections are currently available but may be offered in the future
     * @param order The sort order for this query. See See [Searchlight Query Language](https://developer.lockstep.io/docs/querying-with-searchlight)
     * @param pageSize The page size for results (default 200). See [Searchlight Query Language](https://developer.lockstep.io/docs/querying-with-searchlight)
     * @param pageNumber The page number for results (default 0). See [Searchlight Query Language](https://developer.lockstep.io/docs/querying-with-searchlight)
     * @return A {@link io.lockstep.api.models.LockstepResponse} containing the results
     */
    public LockstepResponse<FetchResult<AtRiskInvoiceSummaryModel>> queryAtRiskInvoiceSummaryView(String filter, String include, String order, Integer pageSize, Integer pageNumber)
    {
        RestRequest<FetchResult<AtRiskInvoiceSummaryModel>> r = new RestRequest<FetchResult<AtRiskInvoiceSummaryModel>>(this.client, "GET", "/api/v1/Invoices/views/at-risk-summary");
        r.AddQuery("filter", filter.toString());
        r.AddQuery("include", include.toString());
        r.AddQuery("order", order.toString());
        r.AddQuery("pageSize", pageSize.toString());
        r.AddQuery("pageNumber", pageNumber.toString());
        return r.Call(new TypeToken<FetchResult<AtRiskInvoiceSummaryModel>>() {}.getType());
    }
}

/**
 * Created By: Md. Abdul Hannan
 * Created Date: 2/26/2018
 * Time: 11:58 AM
 * Modified By:
 * Modified date:
 * (C) CopyRight NybSys ltd.
 */
package com.nybsys.tillboxweb.controllers.sales;

import com.nybsys.tillboxweb.constant.PurchaseModuleConstant;
import com.nybsys.tillboxweb.constant.SalesModuleConstant;
import com.nybsys.tillboxweb.core.RequestHelper;
import com.nybsys.tillboxweb.core.RequestMessage;
import com.nybsys.tillboxweb.core.ResponseMessage;
import com.nybsys.tillboxweb.models.purchase.StatementSearchModel;
import com.nybsys.tillboxweb.models.purchase.SupplierInvoiceModel;
import com.nybsys.tillboxweb.models.sales.CustomerInvoiceModel;
import com.nybsys.tillboxweb.models.sales.CustomerModel;
import com.nybsys.tillboxweb.models.sales.VMCustomerInvoice;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.eclipse.paho.client.mqttv3.MqttException;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import static com.nybsys.tillboxweb.constant.WorkerPublishedConstants.WORKER_PURCHASE_MODULE_TOPIC;
import static com.nybsys.tillboxweb.constant.WorkerPublishedConstants.WORKER_SALES_MODULE_TOPIC;

@RestController
@RequestMapping(SalesModuleConstant.CUSTOMER_INVOICE_BASE_URL)
@Api(tags = "Sales")
public class CustomerInvoiceController {


    @ApiOperation(value = SalesModuleConstant.CUSTOMER_INVOICE_SAVE_SERVICE_LINK_DESCRIPTION, response = VMCustomerInvoice.class)
    @RequestMapping(value = SalesModuleConstant.SAVE_SERVICE_LINK, method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseMessage save(@RequestBody RequestMessage requestMessage) throws MqttException {

        ResponseMessage responseMessage;
        String publishedMessageId;
        Object lock;

        RequestHelper requestHelper = new RequestHelper();
        lock = requestHelper.getLock(SalesModuleConstant.CUSTOMER_INVOICE_BASE_URL + SalesModuleConstant.SAVE_SERVICE_LINK
                , WORKER_SALES_MODULE_TOPIC, requestMessage);
        publishedMessageId = requestHelper.getPublishedMessageId();
        responseMessage = requestHelper.getResponse(lock, publishedMessageId);

        return responseMessage;
    }

    @ApiOperation(value = SalesModuleConstant.CUSTOMER_INVOICE__SEARCH_SERVICE_LINK_DESCRIPTION, response = CustomerInvoiceModel.class)
    @RequestMapping(value = SalesModuleConstant.SEARCH_SERVICE_LINK, method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseMessage search(@RequestBody RequestMessage requestMessage) throws MqttException {

        ResponseMessage responseMessage;
        String publishedMessageId;
        Object lock;

        RequestHelper requestHelper = new RequestHelper();
        lock = requestHelper.getLock(SalesModuleConstant.CUSTOMER_INVOICE_BASE_URL + SalesModuleConstant.SEARCH_SERVICE_LINK
                , WORKER_SALES_MODULE_TOPIC, requestMessage);
        publishedMessageId = requestHelper.getPublishedMessageId();
        responseMessage = requestHelper.getResponse(lock, publishedMessageId);

        return responseMessage;
    }

    @ApiOperation(value = SalesModuleConstant.CUSTOMER_INVOICE__GET_BY_ID_SERVICE_LINK_DESCRIPTION, response = CustomerInvoiceModel.class)
    @RequestMapping(value = SalesModuleConstant.GET_BY_ID_SERVICE_LINK, method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseMessage getByID(@RequestBody RequestMessage requestMessage) throws MqttException {

        ResponseMessage responseMessage;
        String publishedMessageId;
        Object lock;

        RequestHelper requestHelper = new RequestHelper();
        lock = requestHelper.getLock(SalesModuleConstant.CUSTOMER_INVOICE_BASE_URL + SalesModuleConstant.GET_BY_ID_SERVICE_LINK
                , WORKER_SALES_MODULE_TOPIC, requestMessage);
        publishedMessageId = requestHelper.getPublishedMessageId();
        responseMessage = requestHelper.getResponse(lock, publishedMessageId);

        return responseMessage;
    }

    @ApiOperation(value = SalesModuleConstant.CUSTOMER_STATEMENT_SERVICE_LINK_DESCRIPTION, response = StatementSearchModel.class)
    @RequestMapping(value = SalesModuleConstant.CUSTOMER_STATEMENT_SERVICE_LINK, method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseMessage customerStatement(@RequestBody RequestMessage requestMessage) throws MqttException {

        ResponseMessage responseMessage;
        String publishedMessageId;
        Object lock;

        RequestHelper requestHelper = new RequestHelper();
        lock = requestHelper.getLock(SalesModuleConstant.CUSTOMER_INVOICE_BASE_URL + SalesModuleConstant.CUSTOMER_STATEMENT_SERVICE_LINK
                , WORKER_SALES_MODULE_TOPIC, requestMessage);
        publishedMessageId = requestHelper.getPublishedMessageId();
        responseMessage = requestHelper.getResponse(lock, publishedMessageId);

        return responseMessage;
    }


    @ApiOperation(value = SalesModuleConstant.CUSTOMER_OUTSTANDING_SERVICE_LINK, response = CustomerModel.class)
    @RequestMapping(value = SalesModuleConstant.CUSTOMER_OUTSTANDING_SERVICE_LINK, method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseMessage customerOutstanding(@RequestBody RequestMessage requestMessage) throws MqttException {

        ResponseMessage responseMessage;
        String publishedMessageId;
        Object lock;

        RequestHelper requestHelper = new RequestHelper();
        lock = requestHelper.getLock(SalesModuleConstant.CUSTOMER_INVOICE_BASE_URL + SalesModuleConstant.CUSTOMER_OUTSTANDING_SERVICE_LINK
                , WORKER_SALES_MODULE_TOPIC, requestMessage);
        publishedMessageId = requestHelper.getPublishedMessageId();
        responseMessage = requestHelper.getResponse(lock, publishedMessageId);

        return responseMessage;
    }


    @ApiOperation(value = SalesModuleConstant.CUSTOMER_INVOICE_DELETE_SERVICE_LINK_DESCRIPTION, response = CustomerInvoiceModel.class)
    @RequestMapping(value = SalesModuleConstant.DELETE_SERVICE_LINK, method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseMessage delete(@RequestBody RequestMessage requestMessage) throws MqttException {

        ResponseMessage responseMessage;
        String publishedMessageId;
        Object lock;

        RequestHelper requestHelper = new RequestHelper();
        lock = requestHelper.getLock(SalesModuleConstant.CUSTOMER_INVOICE_BASE_URL + SalesModuleConstant.DELETE_SERVICE_LINK
                , WORKER_SALES_MODULE_TOPIC, requestMessage);
        publishedMessageId = requestHelper.getPublishedMessageId();
        responseMessage = requestHelper.getResponse(lock, publishedMessageId);

        return responseMessage;
    }


    @ApiOperation(value = "get customer invoice list", response = CustomerInvoiceModel.class)
    @RequestMapping(value = "getCustomerInvoiceList", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseMessage getCustomerInvoiceList(@RequestBody RequestMessage requestMessage) throws MqttException {

        ResponseMessage responseMessage;
        String publishedMessageId;
        Object lock;

        RequestHelper requestHelper = new RequestHelper();
        lock = requestHelper.getLock(SalesModuleConstant.CUSTOMER_INVOICE_BASE_URL + "getCustomerInvoiceList"
                , WORKER_SALES_MODULE_TOPIC, requestMessage);
        publishedMessageId = requestHelper.getPublishedMessageId();
        responseMessage = requestHelper.getResponse(lock, publishedMessageId);

        return responseMessage;
    }


}

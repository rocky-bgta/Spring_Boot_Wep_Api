/**
 * Created By: Md. Rashed Khan Menon
 * Created Date: 22/02/2018
 * Time: 04:45
 * Modified By:
 * Modified date:
 * (C) CopyRight NybSys ltd.
 */

package com.nybsys.tillboxweb.controllers.sales;

import com.nybsys.tillboxweb.constant.SalesModuleConstant;
import com.nybsys.tillboxweb.core.RequestHelper;
import com.nybsys.tillboxweb.core.RequestMessage;
import com.nybsys.tillboxweb.core.ResponseMessage;
import com.nybsys.tillboxweb.models.sales.CustomerDiscountFlatModel;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.eclipse.paho.client.mqttv3.MqttException;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import static com.nybsys.tillboxweb.constant.WorkerPublishedConstants.WORKER_SALES_MODULE_TOPIC;

@RestController
@RequestMapping(SalesModuleConstant.CUSTOMER_DISCOUNT_FLAT_BASE_URL)
@Api(tags = "Sales",value = SalesModuleConstant.CUSTOMER_DISCOUNT_FLAT_CONTROLLER_NAME, description = SalesModuleConstant.CUSTOMER_DISCOUNT_FLAT_CONTROLLER_DESCRIPTION)
public class CustomerDiscountFlatController {

    @ApiOperation(value = SalesModuleConstant.CUSTOMER_DISCOUNT_FLAT_SAVE_SERVICE_LINK_DESCRIPTION, response = CustomerDiscountFlatModel.class)
    @RequestMapping(value = SalesModuleConstant.SAVE_SERVICE_LINK, method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseMessage save(@RequestBody RequestMessage requestMessage) throws MqttException {

        ResponseMessage responseMessage;
        String publishedMessageId;
        Object lock;

        RequestHelper requestHelper = new RequestHelper();
        lock = requestHelper.getLock(SalesModuleConstant.CUSTOMER_DISCOUNT_FLAT_BASE_URL + SalesModuleConstant.SAVE_SERVICE_LINK
                ,WORKER_SALES_MODULE_TOPIC, requestMessage);
        publishedMessageId = requestHelper.getPublishedMessageId();
        responseMessage = requestHelper.getResponse(lock, publishedMessageId);

        return responseMessage;
    }

    @ApiOperation(value = SalesModuleConstant.CUSTOMER_DISCOUNT_FLAT_SEARCH_SERVICE_LINK_DESCRIPTION, response = CustomerDiscountFlatModel.class)
    @RequestMapping(value = SalesModuleConstant.SEARCH_SERVICE_LINK, method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseMessage search(@RequestBody RequestMessage requestMessage) throws MqttException {

        ResponseMessage responseMessage;
        String publishedMessageId;
        Object lock;

        RequestHelper requestHelper = new RequestHelper();
        lock = requestHelper.getLock(SalesModuleConstant.CUSTOMER_DISCOUNT_FLAT_BASE_URL + SalesModuleConstant.SEARCH_SERVICE_LINK
                ,WORKER_SALES_MODULE_TOPIC, requestMessage);
        publishedMessageId = requestHelper.getPublishedMessageId();
        responseMessage = requestHelper.getResponse(lock, publishedMessageId);

        return responseMessage;
    }

    @ApiOperation(value = SalesModuleConstant.CUSTOMER_DISCOUNT_FLAT_DELETE_SERVICE_LINK_DESCRIPTION, response = CustomerDiscountFlatModel.class)
    @RequestMapping(value = SalesModuleConstant.DELETE_SERVICE_LINK, method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseMessage delete(@RequestBody RequestMessage requestMessage) throws MqttException {

        ResponseMessage responseMessage;
        String publishedMessageId;
        Object lock;

        RequestHelper requestHelper = new RequestHelper();
        lock = requestHelper.getLock(SalesModuleConstant.CUSTOMER_DISCOUNT_FLAT_BASE_URL + SalesModuleConstant.DELETE_SERVICE_LINK
                ,WORKER_SALES_MODULE_TOPIC, requestMessage);
        publishedMessageId = requestHelper.getPublishedMessageId();
        responseMessage = requestHelper.getResponse(lock, publishedMessageId);

        return responseMessage;
    }
}

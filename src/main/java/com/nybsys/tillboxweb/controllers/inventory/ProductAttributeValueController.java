/**
 * Created By: Md. Rashed Khan Menon
 * Created Date: 14/02/2018
 * Time: 02:09
 * Modified By:
 * Modified date:
 * (C) CopyRight NybSys ltd.
 */

package com.nybsys.tillboxweb.controllers.inventory;

import com.nybsys.tillboxweb.constant.InventoryModuleConstant;
import com.nybsys.tillboxweb.core.RequestHelper;
import com.nybsys.tillboxweb.core.RequestMessage;
import com.nybsys.tillboxweb.core.ResponseMessage;
import com.nybsys.tillboxweb.models.inventory.ProductAttributeValueModel;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.eclipse.paho.client.mqttv3.MqttException;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import static com.nybsys.tillboxweb.constant.WorkerPublishedConstants.WORKER_INVENTORY_MODULE_TOPIC;

@RestController
@RequestMapping(InventoryModuleConstant.PRODUCT_ATTRIBUTE_VALUE_BASE_URL)
@Api(tags = "Inventory")
public class ProductAttributeValueController {


    @ApiOperation(value = InventoryModuleConstant.PRODUCT_ATTRIBUTE_VALUE_SAVE_DESCRIPTION, response = ProductAttributeValueModel.class)
    @RequestMapping(value = InventoryModuleConstant.SAVE, method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseMessage save(@RequestBody RequestMessage requestMessage) throws MqttException {

        ResponseMessage responseMessage;
        String publishedMessageId;
        Object lock;

        RequestHelper requestHelper = new RequestHelper();
        lock = requestHelper.getLock(InventoryModuleConstant.PRODUCT_ATTRIBUTE_VALUE_BASE_URL+InventoryModuleConstant.SAVE
                ,WORKER_INVENTORY_MODULE_TOPIC, requestMessage);
        publishedMessageId = requestHelper.getPublishedMessageId();
        responseMessage = requestHelper.getResponse(lock, publishedMessageId);

        return responseMessage;
    }

    @ApiOperation(value = InventoryModuleConstant.PRODUCT_ATTRIBUTE_VALUE_DELETE_DESCRIPTION, response = ProductAttributeValueModel.class)
    @RequestMapping(value = InventoryModuleConstant.DELETE, method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseMessage delete(@RequestBody RequestMessage requestMessage) throws MqttException {

        ResponseMessage responseMessage;
        String publishedMessageId;
        Object lock;

        RequestHelper requestHelper = new RequestHelper();
        lock = requestHelper.getLock(InventoryModuleConstant.PRODUCT_ATTRIBUTE_VALUE_BASE_URL+InventoryModuleConstant.DELETE
                ,WORKER_INVENTORY_MODULE_TOPIC, requestMessage);
        publishedMessageId = requestHelper.getPublishedMessageId();
        responseMessage = requestHelper.getResponse(lock, publishedMessageId);

        return responseMessage;
    }

    @ApiOperation(value = InventoryModuleConstant.PRODUCT_ATTRIBUTE_VALUE_SEARCH_DESCRIPTION, response = ProductAttributeValueModel.class)
    @RequestMapping(value = InventoryModuleConstant.SEARCH, method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseMessage search(@RequestBody RequestMessage requestMessage) throws MqttException {

        ResponseMessage responseMessage;
        String publishedMessageId;
        Object lock;

        RequestHelper requestHelper = new RequestHelper();
        lock = requestHelper.getLock(InventoryModuleConstant.PRODUCT_ATTRIBUTE_VALUE_BASE_URL+InventoryModuleConstant.SEARCH
                ,WORKER_INVENTORY_MODULE_TOPIC, requestMessage);
        publishedMessageId = requestHelper.getPublishedMessageId();
        responseMessage = requestHelper.getResponse(lock, publishedMessageId);

        return responseMessage;
    }

    @ApiOperation(value = InventoryModuleConstant.PRODUCT_ATTRIBUTE_VALUE_INACTIVE_DESCRIPTION, response = ProductAttributeValueModel.class)
    @RequestMapping(value = InventoryModuleConstant.INACTIVE, method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseMessage inactive(@RequestBody RequestMessage requestMessage) throws MqttException {

        ResponseMessage responseMessage;
        String publishedMessageId;
        Object lock;

        RequestHelper requestHelper = new RequestHelper();
        lock = requestHelper.getLock(InventoryModuleConstant.PRODUCT_ATTRIBUTE_VALUE_BASE_URL+InventoryModuleConstant.INACTIVE
                ,WORKER_INVENTORY_MODULE_TOPIC, requestMessage);
        publishedMessageId = requestHelper.getPublishedMessageId();
        responseMessage = requestHelper.getResponse(lock, publishedMessageId);

        return responseMessage;
    }
}

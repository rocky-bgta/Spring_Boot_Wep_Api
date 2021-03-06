/**
 * Created By: Md. Nazmus Salahin
 * Created Date: 29-Dec-17
 * Time: 2:47 PM
 * Modified By:
 * Modified date:
 * (C) CopyRight Nybsys ltd.
 */
package com.nybsys.tillboxweb.controllers.security;

import com.nybsys.tillboxweb.constant.SecurityModuleConstant;
import com.nybsys.tillboxweb.core.RequestHelper;
import com.nybsys.tillboxweb.core.RequestMessage;
import com.nybsys.tillboxweb.core.ResponseMessage;
import com.nybsys.tillboxweb.models.security.AccessRightRoleMappingModel;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.eclipse.paho.client.mqttv3.MqttException;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import static com.nybsys.tillboxweb.constant.WorkerPublishedConstants.WORKER_SECURITY_MODULE_TOPIC;

@RestController
@RequestMapping(SecurityModuleConstant.ACCESS_RIGHT_ROLE_MAPPING_BASE_URL)
@Api(tags = "Security", value = SecurityModuleConstant.ACCESS_RIGHT_ROLE_MAPPING_CONTROLLER_NAME, description = SecurityModuleConstant.ACCESS_RIGHT_ROLE_MAPPING_CONTROLLER_DESCRIPTION)
public class AccessRightRoleMappingController {

    @ApiOperation(value = SecurityModuleConstant.ACCESS_RIGHT_ROLE_MAPPING_SAVE_SERVICE_LINK_DESCRIPTION, response = AccessRightRoleMappingModel.class)
    @RequestMapping(value = SecurityModuleConstant.SAVE_SERVICE_LINK, method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseMessage save(@RequestBody RequestMessage requestMessage) throws MqttException {

        ResponseMessage responseMessage;
        String publishedMessageId;
        Object lock;

        RequestHelper requestHelper = new RequestHelper();
        lock = requestHelper.getLock(SecurityModuleConstant.ACCESS_RIGHT_ROLE_MAPPING_BASE_URL + SecurityModuleConstant.SAVE_SERVICE_LINK
                , WORKER_SECURITY_MODULE_TOPIC, requestMessage);
        publishedMessageId = requestHelper.getPublishedMessageId();
        responseMessage = requestHelper.getResponse(lock, publishedMessageId);

        return responseMessage;
    }

    @ApiOperation(value = SecurityModuleConstant.ACCESS_RIGHT_ROLE_MAPPING_GET_BY_ID_SERVICE_LINK_DESCRIPTION, response = AccessRightRoleMappingModel.class)
    @RequestMapping(value = SecurityModuleConstant.GET_BY_ID_SERVICE_LINK, method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseMessage getByID(@RequestBody RequestMessage requestMessage) throws MqttException {

        ResponseMessage responseMessage;
        String publishedMessageId;
        Object lock;

        RequestHelper requestHelper = new RequestHelper();
        lock = requestHelper.getLock(SecurityModuleConstant.ACCESS_RIGHT_ROLE_MAPPING_BASE_URL + SecurityModuleConstant.GET_BY_ID_SERVICE_LINK
                , WORKER_SECURITY_MODULE_TOPIC, requestMessage);
        publishedMessageId = requestHelper.getPublishedMessageId();
        responseMessage = requestHelper.getResponse(lock, publishedMessageId);

        return responseMessage;
    }

    @ApiOperation(value = SecurityModuleConstant.ACCESS_RIGHT_ROLE_MAPPING_GET_ALL_SERVICE_LINK_DESCRIPTION, response = AccessRightRoleMappingModel.class)
    @RequestMapping(value = SecurityModuleConstant.GET_ALL_SERVICE_LINK, method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseMessage Test(@RequestBody RequestMessage requestMessage) throws MqttException {

        ResponseMessage responseMessage;
        String publishedMessageId;
        Object lock;

        RequestHelper requestHelper = new RequestHelper();
        lock = requestHelper.getLock(SecurityModuleConstant.ACCESS_RIGHT_ROLE_MAPPING_BASE_URL + SecurityModuleConstant.GET_ALL_SERVICE_LINK
                , WORKER_SECURITY_MODULE_TOPIC, requestMessage);
        publishedMessageId = requestHelper.getPublishedMessageId();
        responseMessage = requestHelper.getResponse(lock, publishedMessageId);

        return responseMessage;
    }

}

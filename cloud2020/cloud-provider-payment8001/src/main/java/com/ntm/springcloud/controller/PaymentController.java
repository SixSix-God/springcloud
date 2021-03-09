package com.ntm.springcloud.controller;

import com.ntm.springcloud.entities.CommonResult;
import com.ntm.springcloud.entities.Payment;
import com.ntm.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @description:
 * @author: Blue
 * @date: 2021/3/9 14:05
 */
@Slf4j
@RestController
public class PaymentController {
    @Resource
    private PaymentService paymentService;

    @Value("${server.port}")
    private String serverPort;

    @Resource
    private DiscoveryClient discoveryClient;

    @PostMapping(value="/payment/creat")
    public CommonResult creat(@RequestBody Payment payment){
        int result = paymentService.create(payment);
        log.info("****插入结果:" + result);
        if(result > 0){
            return new CommonResult(200,"插入数据成功！,serverport: " + serverPort,result);
        }else{
            return new CommonResult(-1,"插入数据失败！",null);
        }
    }

}

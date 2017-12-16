package com.itguang.userapi2.web;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author itguang
 * @create 2017-12-16 14:03
 **/
@RestController
@Slf4j
public class UserController {

    @Autowired
    private DiscoveryClient client;
    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public String hello(){

//        ServiceInstance instance = client.getLocalServiceInstance();
        return "hello world from hello-service2";

    }




}


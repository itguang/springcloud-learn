package com.itguang.ribbonconsumer.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author itguang
 * @create 2017-12-16 14:15
 **/
@RestController
public class ConsumerController {

    //这个 hello-service 是我们在服务提供者配置的 spring.application.name的值
    String helloServiceUrl = "http://hello-service/hello";


    @Autowired
    private RestTemplate restTemplate;


    @RequestMapping(value = "/ribbon-consumer")
    public String helloConsumer() {
        ResponseEntity<String> reponse = restTemplate.getForEntity(helloServiceUrl, String.class);
        String body = reponse.getBody();
        return body;
    }


}

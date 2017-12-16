package com.itguang.eurekaservicepeer2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaServicePeer2Application {

	public static void main(String[] args) {
		SpringApplication.run(EurekaServicePeer2Application.class, args);
	}
}

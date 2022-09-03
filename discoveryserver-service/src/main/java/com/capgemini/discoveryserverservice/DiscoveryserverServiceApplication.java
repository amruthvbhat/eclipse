package com.capgemini.discoveryserverservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableEurekaServer

public class DiscoveryserverServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(DiscoveryserverServiceApplication.class, args);
	}

}

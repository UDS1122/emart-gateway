package com.demo.uds.emartgateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/*
 Eureka server serving as API gateway responsible for various functions 
 like service registry etc.
 Other services like Catalog, Order services registers as Eureka Clients
 */

@SpringBootApplication
@EnableEurekaServer
public class EmartGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmartGatewayApplication.class, args);
	}

}

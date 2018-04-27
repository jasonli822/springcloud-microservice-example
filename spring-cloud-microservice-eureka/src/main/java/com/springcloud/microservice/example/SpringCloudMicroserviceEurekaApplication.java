package com.springcloud.microservice.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class SpringCloudMicroserviceEurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudMicroserviceEurekaApplication.class, args);
	}
}

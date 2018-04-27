package com.springcloud.microservice.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class SpringCloudMicroserviceCurrencyConversionServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudMicroserviceCurrencyConversionServiceApplication.class, args);
	}
}
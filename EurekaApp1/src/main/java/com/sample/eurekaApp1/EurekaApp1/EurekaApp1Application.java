package com.sample.eurekaApp1.EurekaApp1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class EurekaApp1Application {

	public static void main(String[] args) {
		SpringApplication.run(EurekaApp1Application.class, args);
	}
}

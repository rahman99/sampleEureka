package com.sample.zookeeer.ZookeperApp2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ZookeperApp2Application {

	public static void main(String[] args) {
		SpringApplication.run(ZookeperApp2Application.class, args);
	}
}

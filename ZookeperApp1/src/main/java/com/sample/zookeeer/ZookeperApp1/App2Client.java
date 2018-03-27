package com.sample.zookeeer.ZookeperApp1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Configuration
@EnableFeignClients
@EnableDiscoveryClient
public class App2Client {

	@Autowired
	private TheClient theClient;
	
	@FeignClient(name = "zookeeperApp2")
	interface TheClient {

		@RequestMapping(path = "app2/hello", method = RequestMethod.GET)
		@ResponseBody
		String HelloWorld();
	}
	
	public String helloApp1() {
		return theClient.HelloWorld();
	}
}

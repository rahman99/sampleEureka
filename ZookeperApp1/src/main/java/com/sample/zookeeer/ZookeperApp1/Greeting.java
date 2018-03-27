package com.sample.zookeeer.ZookeperApp1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Greeting {

	@Autowired
	private App2Client app2Client;
	
	@GetMapping("app1/helloApp1")
	public String getGreeting() {
		return "Hi "+app2Client.helloApp1();
	}
	
}

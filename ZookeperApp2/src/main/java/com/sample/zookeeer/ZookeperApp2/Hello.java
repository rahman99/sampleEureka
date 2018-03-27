package com.sample.zookeeer.ZookeperApp2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {

	@GetMapping("app2/hello")
	public String sayHello() {
		return "hello zookeper App 2";
	}
}

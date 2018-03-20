package com.sample.eurekaApp1.EurekaApp1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("app1")
public class HelloResource {

	@GetMapping("/hello/server")
    public String hello() {
        return "Hello Test Eureka App";
    }
	
	@GetMapping("greeting/{message}")
	public String greeting(@PathVariable("message") String message) {
		return "Hi "+message;
	}
}

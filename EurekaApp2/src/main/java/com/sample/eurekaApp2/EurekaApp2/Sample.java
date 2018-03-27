package com.sample.eurekaApp2.EurekaApp2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@RestController
@RequestMapping("app2")
public class Sample {

	@Autowired
	private ISample isample;
	
	@RequestMapping("/hello/2")
	@HystrixCommand(fallbackMethod="fallback")
    public String greeting() {
        return "app2: "+isample.hello();
    }
	
	public String fallback(Throwable hystrixCommand) {
        return "App1 can not be accessed!!!";
    }
}

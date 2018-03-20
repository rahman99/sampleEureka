package com.sample.eurekaApp2.EurekaApp2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Sample {

	@Autowired
	private ISample isample;
	
	@RequestMapping("/hello/2")
    public String greeting() {
        return "app2: "+isample.hello();
    }
	
}

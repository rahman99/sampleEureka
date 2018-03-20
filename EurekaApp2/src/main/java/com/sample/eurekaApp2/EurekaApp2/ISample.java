package com.sample.eurekaApp2.EurekaApp2;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("EurekaApp1")
public interface ISample {

	//this is mapping in App1 path
	@RequestMapping("/rest/hello/server")
    String hello();
}

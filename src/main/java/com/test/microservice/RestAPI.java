package com.test.microservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestAPI {
	
	@GetMapping("/greet")
	public String greetMe() {
		String result="<h1>Welcome requester sir , this is a greet message from REST API</h1>";
		return result;
	}

}

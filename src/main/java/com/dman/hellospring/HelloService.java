package com.dman.hellospring;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloService {


	@GetMapping("/hello")	
	public String getHello() {

		return "Hello Spring boot example";
	}

}

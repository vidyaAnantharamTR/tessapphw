package com.testhw.app;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

	//@RequestMapping("/hello")		
	
	@RequestMapping(value="/hello")
	
	public String hello() {
		return "Hello World!---Welcome";
		
	}
	



}

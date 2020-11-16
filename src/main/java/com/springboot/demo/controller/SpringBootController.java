package com.springboot.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringBootController {
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String doSomthing() {
		return "this is my demo application for deployment";
	}

}

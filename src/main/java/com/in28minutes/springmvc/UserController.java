package com.in28minutes.springmvc;

import org.springframework.web.bind.annotation.RequestMapping;

public class UserController {
	
	@RequestMapping(value="/login")
	public String sayHello() {
		return "welcome";
	}
	

}

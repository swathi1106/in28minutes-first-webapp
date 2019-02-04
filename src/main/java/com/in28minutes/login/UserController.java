package com.in28minutes.login;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class UserController {
	
	@RequestMapping(value="/Welcome")
	public String sayHello() {
		return "welcome";
	}
	

}

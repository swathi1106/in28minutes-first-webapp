package com.in28minutes.springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller 
public class LoginController {
//	@ResponseBody(if we want to print something or send response back to browser)
	@RequestMapping(value = "/login")
	public String sayHello() {
//		return "Hello World Welcome";
		return "login";
	}

}

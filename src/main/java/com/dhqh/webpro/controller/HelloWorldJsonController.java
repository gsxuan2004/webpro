package com.dhqh.webpro.controller;

import org.springframework.boot.autoconfigure.security.SecurityProperties.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldJsonController {

	@RequestMapping("/hellojson")
	public User getUser() {
		User user=new User();
		user.setName("gsx");
		user.setPassword("xxxx");
		return user;
	}
}

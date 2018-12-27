package com.dhqh.webpro.controller;

import java.text.DateFormat;
import java.util.Date;

import javax.servlet.Filter;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class HelloWorldController {
	@Value("${name}")
	private String name;
	@Value("${age}")
	private Integer age;
	
    @RequestMapping("/hello")
    public String index() {
        return "Hello World"+name+age;
    }
    @RequestMapping("/hellojsp")
    public String hello(Model m) {
    	m.addAttribute("now",DateFormat.getDateTimeInstance().format(new Date()));
        System.out.println("test filter and controller order!");
    	
    	return "hellojsp";
    }
}
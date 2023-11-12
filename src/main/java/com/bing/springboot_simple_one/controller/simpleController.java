package com.bing.springboot_simple_one.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("hello2")
public class simpleController {

	@RequestMapping("hello2")
	public String hello() {
		System.out.println("11111");

		return "helloworld2";
	}

}

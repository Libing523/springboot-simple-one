package com.bing.springboot_simple_one.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("hello2")
public class simpleController {

	@RequestMapping("hello2")
	public String hello() {
		System.out.println("11111");
		System.out.println("22222");
		System.out.println("master 00");
		System.out.println("test 001");
		System.out.println("master 02");
        System.out.println("test002");
        System.out.println("-------master01");

        System.out.println("-------master");
		System.out.println("-------test");


		return "helloworld2";
	}

}

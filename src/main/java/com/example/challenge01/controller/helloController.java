package com.example.challenge01.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class helloController {
	
	@RequestMapping(value="/")
	public String getHello() {
		// TODO Auto-generated constructor stub
		return "Hello";
	}

}

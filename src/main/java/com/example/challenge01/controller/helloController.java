package com.example.challenge01.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class helloController {
	
	//Challenge02: Path Variables
	@RequestMapping("/hello/{name}")
	public String getHello(@PathVariable String name) {
		// TODO Auto-generated constructor stub
		//Challenge02: Path Variables
		return "Hello "+name+"!!";
	}

}

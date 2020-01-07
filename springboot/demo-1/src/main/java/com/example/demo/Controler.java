package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controler {

	@RequestMapping("/hello")
	public String sayHi()
	{
		return "Hi";
	}
}

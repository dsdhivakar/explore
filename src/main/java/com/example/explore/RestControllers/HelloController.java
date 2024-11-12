package com.example.explore.RestControllers;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class HelloController {

	@GetMapping("/")
	public String sayHello() {
		return "Hi, I am a Good boy";
	}
	
}

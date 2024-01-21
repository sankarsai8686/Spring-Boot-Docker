package com.bss.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeRestController {
	
	
	
	@GetMapping("/")
	public String welcomeMessage() {
		System.out.println("welcomeMessage");
		return "welcome";
	}

}

package com.codingdojo.firstproject;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

// Annotation
@RestController
public class HumanController {
	
	@RequestMapping("/human")
	public String index(@RequestParam(value="name", required=false) String searchQuery) {
		if (searchQuery == null) {
			return "Hello Human! Welcome to SpringBoot!";
		}
		return "Hello " + searchQuery + "! Welcome to Springboot!";
	}
	
}
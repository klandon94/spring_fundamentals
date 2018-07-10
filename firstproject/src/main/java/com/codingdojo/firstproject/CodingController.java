package com.codingdojo.firstproject;

import org.springframework.web.bind.annotation.PathVariable;
// Importing dependencies
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

// Annotation
@RestController
@RequestMapping("/coding")
public class CodingController {
	
//	Annotation
	@RequestMapping("")
	public String hello() {
		return "Hello Coding Dojo!";
	}
	
	@RequestMapping("/python")
	public String world() {
		return "Python/Django was awesome!!";
	}
	
	@RequestMapping("/java")
	public String java() {
		return "Java/Spring is better!";
	}
	
}
	
	

package com.codingdojo.firstproject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

// Annotation
@Controller
//@RequestMapping("/hello")
public class HomeController {
	
	@RequestMapping("/")
	public String index(Model model) {
		model.addAttribute("dojoName", "Washington, DC");
		return "index.jsp";
	}
	
////	Annotation
//	@RequestMapping("")
////	Method that maps to the request route above
//	public String hello() {
//		return "Hello World!";
//	}
//	
//	@RequestMapping("/world")
//	public String world() {
//		return "Class level annotations are cool too!";
//	}
	
//	@RequestMapping("/")
//	public String index(@RequestParam(value="q", required=false) String searchQuery) {
//		if (searchQuery == null) {
//			return "You searched for: nothing";
//		}
//		return "You searched for: " + searchQuery;
//	}
//	
//	@RequestMapping("/m/{track}/{module}/{lesson}")
//	public String showLesson(@PathVariable("track") String track, @PathVariable("module") String module, @PathVariable("lesson") String lesson) {
//		return "Track: " + track + ", Module: " + module + ", Lesson: " + lesson;
//	}
}

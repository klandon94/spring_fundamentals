package com.codingdojo.firstproject;

import org.springframework.web.bind.annotation.PathVariable;
// Importing dependencies
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

// Annotation
@RestController
public class DojoController {
	
	@RequestMapping("/{dojo}")
	public String show(@PathVariable("dojo") String d)  {
		if (d.equals("dojo")) return "The " + d + " is awesome!";
		else if (d.equals("burbank-dojo")) {
			String[] parts = d.split("-");
			String part1 = (Character.toUpperCase(parts[0].charAt(0)) + parts[0].substring(1, parts[0].length()));
			String part2 = (Character.toUpperCase(parts[1].charAt(0)) + parts[1].substring(1, parts[1].length()));
			return part1 + " " + part2 + " is located in Southern California";
		}
		else if (d.equals("san-jose")){
			String[] parts = d.split("-");
			Character p1 = Character.toUpperCase(parts[0].charAt(0));
			Character p2 = Character.toUpperCase(parts[1].charAt(0));
			StringBuilder s = new StringBuilder().append(p1).append(p2);
			return s + " dojo is the headquarters";
		}
		return "NONE";
	}
	
}
	
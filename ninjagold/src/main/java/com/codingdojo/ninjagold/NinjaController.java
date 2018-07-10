package com.codingdojo.ninjagold;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Random;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class NinjaController {

	@RequestMapping("/")
	public String index(HttpSession session) {
		if (session.getAttribute("gold") == null) session.setAttribute("gold", 0);
		if (session.getAttribute("activities") == null) session.setAttribute("activities", new ArrayList<HashMap<String, String>>());
		return "ninjagold.jsp";
	}
	
	@RequestMapping(value="/process_money", method=RequestMethod.POST)
	public String process(HttpSession session, @RequestParam(value="property") String prop) {
		int goldEarned = 0;
		String activity = "";
		String color = "";
		Random r = new Random();
		
		Date date = new java.util.Date();
		SimpleDateFormat newFormat = new SimpleDateFormat("MMMM d yyyy, h:mm:ss aa");
		String newDate = newFormat.format(date);
		
		if (prop.equals("farm")) goldEarned = r.nextInt(11) + 10;
		else if (prop.equals("cave")) goldEarned = r.nextInt(6) + 5;
		else if (prop.equals("house")) goldEarned = r.nextInt(4) + 2;
		else if (prop.equals("casino")) goldEarned = -50 + r.nextInt(101);
		
		if (goldEarned >= 0) {
			activity = "Earned " + String.valueOf(goldEarned) + " golds from the " + prop + "! (" + newDate + ")";
			color = "green";
		}
		else {
			activity = "Entered a casino and lost " + String.valueOf(Math.abs(goldEarned)) + " golds...Ouch...(" + newDate + ")";
			color = "red";
		}
		
		HashMap<String, String> dict = new HashMap<String, String>();
		dict.put("activity", activity);
		dict.put("color", color);
		ArrayList<HashMap<String, String>> list = (ArrayList<HashMap<String, String>>) session.getAttribute("activities");
		list.add(dict);
		session.setAttribute("activities", list);
		
		goldEarned += (int) session.getAttribute("gold");
		session.setAttribute("gold", goldEarned);
		
		return "redirect:/";
	}
	
	@RequestMapping("/reset")
	public String reset(HttpSession session) {
		session.invalidate();
		return "redirect:/";
	}
}

package com.codingdojo.displaydate;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	@RequestMapping("/")
	public String index(Model model) {
		model.addAttribute("blah", "blah");
		return "index.jsp";
	}
	
	@RequestMapping("/date")
	public String datedash(Model model) {
		Date date = new java.util.Date();
		SimpleDateFormat newFormat = new SimpleDateFormat("EEEEEE, d MMMM yyyy");
		String newDate = newFormat.format(date);
		model.addAttribute("date", newDate);
		return "date.jsp";
	}
	
	@RequestMapping("/time")
	public String timedash(Model model) {
		Date time = new java.util.Date();
		SimpleDateFormat newFormat = new SimpleDateFormat("h:mm aa");
		String newTime = newFormat.format(time);
		model.addAttribute("time", newTime);
		return "time.jsp";
	}
	
	@RequestMapping("/countee")
	public String countee(HttpSession session) {
		if (session.getAttribute("amt") == null) session.setAttribute("amt", 0);
		int amt = (int) session.getAttribute("amt");
		amt++;
		session.setAttribute("amt", amt);
		return "countee.jsp";
	}
	
	@RequestMapping("/counter")
	public String counter(HttpSession session) {
		if (session.getAttribute("amt") == null) session.setAttribute("amt", 0);
		return "counter.jsp";
	}
	
	@RequestMapping("/reset")
	public String reset(HttpSession session) {
		session.invalidate();
		return "redirect:/counter";
	}
	
}

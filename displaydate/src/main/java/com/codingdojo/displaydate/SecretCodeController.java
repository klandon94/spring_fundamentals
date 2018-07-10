package com.codingdojo.displaydate;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class SecretCodeController {
	
	@RequestMapping("/code")
	public String coder() {
		return "code.jsp";
	}
	
	@RequestMapping(value="/secret", method=RequestMethod.POST)
	public String bushido(@RequestParam(value="code") String code, RedirectAttributes redirect) {
		if (code.equals("bushido")) return "bushido.jsp";
		redirect.addFlashAttribute("error", "You must train harder!");
		return "redirect:/code";
	}
	
}
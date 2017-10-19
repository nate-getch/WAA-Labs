package edu.mum.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
  
@Controller
public class HomeController {

 
	@RequestMapping({"/","/welcome"})
	public String welcome(Model model) {
		
		model.addAttribute("greeting", "Welcome to our community, Kimosabe!!");
		model.addAttribute("tagline", "The one and only place to live, work and play!!");
		
		return "welcome";
	}
	
	@ModelAttribute ("homeTestOrder")
	 public String testOrder() {
		
		// test interceptor Order		
		System.out.println("CONTROLLER @MODELATTRIBUTE PREHANDLE");

		return "This is CONTROLLER ORDER!";
	}


 
}

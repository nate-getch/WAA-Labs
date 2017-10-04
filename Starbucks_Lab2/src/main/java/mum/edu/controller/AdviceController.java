package mum.edu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import mum.edu.service.AdviceService;
import mum.edu.domain.Advice;

@RequestMapping("/advice")
@Controller
public class AdviceController {
	
	@Autowired
	AdviceService adviceService;
	
	@RequestMapping("/list")
	public String listAdvice(Model model) {
		model.addAttribute("adviceList", this.adviceService.getAll());
		
		return "adviceList";
	}
	
	@RequestMapping("/display")
	public String displayAdvice(Advice advice, Model model) {
		System.out.println(advice.getAdviceTitle());
		//return "display";
		Advice a = this.adviceService.getAdvice(advice.getAdviceTitle());
		if(a == null) {
			System.out.println("uable to find");
			return "error-forbidden";
		}
		else {
			model.addAttribute("adviceInfo",a );
			return "display";
		}
		
	}
	
}

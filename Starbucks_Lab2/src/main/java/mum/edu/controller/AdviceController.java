package mum.edu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

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
	
	// Form post
	@RequestMapping(value = "/display", method = RequestMethod.POST)
	public String displayAdvice(Advice advice, Model model) {
		System.out.println(advice.getAdviceTitle());

		Advice a = this.adviceService.getAdvice(advice.getAdviceTitle());
		if (a == null) {
			model.addAttribute("error", "Requested Advice Not Found");
			return "display";
		} else {
			model.addAttribute("adviceInfo", a);
			return "display";
		}

	}

	// using request param -> display?title=medium
	@RequestMapping(value = "/display")
	public String displayAdviceFromParam(@RequestParam("title") String advTitle, Model model) {
		System.out.println("from req param " + advTitle);

		Advice a = this.adviceService.getAdvice(advTitle);
		if (a == null) {
			System.out.println("unable to find");
			model.addAttribute("error", "Requested Advice Not Found");
			return "display";
		} else {
			model.addAttribute("adviceInfo", a);
			return "display";
		}

	}

	// using request param -> display/medium
	@RequestMapping(value = "/display/{title}")
	public String displayAdvicePathVar(@PathVariable("title") String advTitle, Model model) {
		System.out.println("from path var " + advTitle);

		Advice a = this.adviceService.getAdvice(advTitle);
		if (a == null) {
			System.out.println("unable to find");
			model.addAttribute("error", "Requested Advice Not Found");
			return "display";
		} else {
			model.addAttribute("adviceInfo", a);
			return "display";
		}

	}

}

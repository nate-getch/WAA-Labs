package mum.edu.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import mum.edu.domain.Calculator;
import mum.edu.service.CalculatorService;
import mum.edu.validator.calculatorValidator;

@Controller
public class CalculatorController {
	
	@Autowired
	private CalculatorService calculatorService;
	@Autowired
	private calculatorValidator calculatorValidator;
	
	@RequestMapping("/")
	public String home() {
		return "index";
	}
	
	@RequestMapping(value="/calc2", method = RequestMethod.POST)
	public String doCalc(Calculator calculator, RedirectAttributes redirectAttributes, Model model) {
		//validate first
		List<String> errors = calculatorValidator.validate(calculator);
		if (errors.isEmpty()) {
			calculatorService.sum(calculator);
			calculatorService.mul(calculator);
			redirectAttributes.addAttribute("msg", "Greetings");
			redirectAttributes.addFlashAttribute(calculator);
			return "redirect:/displayResult";
		}
		else {
			model.addAttribute("errors", errors);
			return "index";
		}
		
	}
	
	// use PRG 
	@RequestMapping(value="/displayResult", method = RequestMethod.GET)
	public String showResult( @RequestParam(value = "msg", required = false) String reqParam, RedirectAttributes redirectAttributes, Model model) {
		model.addAttribute("greeting", reqParam);
		model.addAttribute(redirectAttributes.getFlashAttributes());
		return "result";
	}
}

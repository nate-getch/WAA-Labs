package mum.edu.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

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
	public String doCalc(Calculator calculator, Model model) {
		//validate first
		List<String> errors = calculatorValidator.validate(calculator);
		if (errors.isEmpty()) {
			calculatorService.sum(calculator);
			calculatorService.mul(calculator);
			return "result";
		}
		else {
			model.addAttribute("errors", errors);
			return "index";
		}
		
	}
}

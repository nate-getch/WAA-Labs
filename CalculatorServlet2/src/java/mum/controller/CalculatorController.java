package mum.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import mum.domain.Calculator;
import mum.edu.framework.annotation.AutoWired;
import mum.edu.framework.annotation.RequestMapping;
import mum.edu.framework.annotation.Controller;
import mum.validator.CalcValidator;
import mum.service.CalculatorService;

@Controller
public class CalculatorController {

	@AutoWired
	CalcValidator calcValidator;
	@AutoWired
	CalculatorService calculatorService;

	@RequestMapping(value = { "/" })
	public String displayHome(HttpServletRequest request, HttpServletResponse response) {
		return "/WEB-INF/jsp/index.jsp";
	}
	
	@RequestMapping(value = { "/calc" })
	public String displayForm(HttpServletRequest request, HttpServletResponse response) {
		return "/WEB-INF/jsp/calculator.jsp";
	}

	@RequestMapping(value = { "/calc2" })
	public String calculate(Calculator calculator, HttpServletRequest request, HttpServletResponse response) {
	
		List<String> errors = calcValidator.validate(calculator);
		if (errors.isEmpty()) {
			calculatorService.sum(calculator);
			calculatorService.mul(calculator);
			request.setAttribute("calculator", calculator);
			return "/WEB-INF/jsp/result.jsp";
		} else {
			// store errors and calculator in a scope variable for the view
			request.setAttribute("errors", errors);
			request.setAttribute("form", calculator);
			return "/WEB-INF/jsp/calculator.jsp";
		}
		
	}

}

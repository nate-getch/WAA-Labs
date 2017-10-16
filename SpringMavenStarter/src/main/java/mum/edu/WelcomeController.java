package mum.edu;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import mum.edu.CustomHandlerException;
import mum.edu.CustomResponseStatusException;

@Controller
public class WelcomeController {
	@RequestMapping("/")
	public String welcome() {
		
		return "index";
	}
	
	@RequestMapping("/ex0")
	public String ExceptionOne() {
		throw new CustomResponseStatusException("my Custom @ResponseStatus Exception");
	}
	
	@RequestMapping("/ex1")
	public String ExceptionTwo() {
		throw new CustomHandlerException("my Custom @ExceptionHandler");
	}

}

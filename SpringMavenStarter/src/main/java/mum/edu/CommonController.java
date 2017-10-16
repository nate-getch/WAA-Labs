package mum.edu;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.ModelAndView;

import mum.edu.CustomResponseStatusException;

@ControllerAdvice
public class CommonController {
	
	@ModelAttribute("testAttrib")
	public String getMe() {
		return "this is global attrib";
	}
	
	@ResponseStatus(value = HttpStatus.FORBIDDEN, reason = "my Custom @ResponseStatus Exception")
	@ExceptionHandler(CustomResponseStatusException.class)
	public void se() {
		return;
	}
	
	@ExceptionHandler(CustomHandlerException.class)
	public ModelAndView soso(HttpServletRequest req, CustomHandlerException exception) {
		 ModelAndView mav = new ModelAndView();
		 mav.addObject("msg", exception.getMessage());
		 mav.setViewName("productNotFound");
		 return mav;
	}

}

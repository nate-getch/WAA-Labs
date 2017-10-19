package mum.edu.interceptor;

import java.security.Principal;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class VolunteerInterceptor extends HandlerInterceptorAdapter {
	
	@Override
	public boolean preHandle(HttpServletRequest request,
			HttpServletResponse response, Object handler) throws Exception {

		// test interceptor Order		
		System.out.println("INTERCEPTOR PREHANDLE");
 	
		return true;
		
	}

 	@Override
	public void postHandle(HttpServletRequest request,
			HttpServletResponse response, Object handler,ModelAndView modelAndView) throws Exception {
	String userMessage = "Become a Community Member - Join the Team!";
 
		Principal principal = request.getUserPrincipal();

		if (principal != null) {
			if (request.isUserInRole("ROLE_ADMIN") )
				userMessage = "There is ALWAYS Free cookies at www.freebies.com";
			else 
				userMessage = "We have Many NEW and exciting Volunteer opportunities!!!";
 	}
	
//		System.out.println("Calling postHandle");
		modelAndView.getModelMap().addAttribute("SpecialBlurb", userMessage);

		return;
	}

	@Override
	public void afterCompletion(HttpServletRequest request,
			HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
//		System.out.println("Calling afterCompletion");
		return;
	}

}

package mum.edu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import mum.edu.domain.User;
import mum.edu.service.UserService;

@Controller
public class LoginController {
	
	@Autowired
	UserService userService;
	
	@RequestMapping("/")
	public String login() {
		return "login";
	}
	
	@RequestMapping(value = "/login")
	public String processLogin(User user) {
		User newUser = userService.authUser(user);
		//System.out.println(user.getPassword());
		if(newUser == null) {
			return "login";
		}
		else {
			return "LoginSuccessful";
		}
		
	}
}

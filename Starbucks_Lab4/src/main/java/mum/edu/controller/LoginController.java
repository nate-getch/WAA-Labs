package mum.edu.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import mum.edu.domain.User;
import mum.edu.service.UserService;

@Controller
@SessionAttributes({ "user" })
public class LoginController {

	@Autowired
	UserService userService;

	@RequestMapping("/")
	public String login() {
		return "login";
	}

	@RequestMapping(value = "/login")
	public String processLogin(User user, HttpSession session, Model model) {
		if (userService.authUser(user) == null) {
			model.addAttribute("error", "Invalid Login. Please Try Again.");
			return "login";
		} else {
			model.addAttribute(user);
			return "redirect:/advice/list";
		}
	}

	@RequestMapping(value = "/logout")
	public String logout(User user, HttpSession session, SessionStatus status) {
		status.setComplete();
		return "redirect:/";
	}

}

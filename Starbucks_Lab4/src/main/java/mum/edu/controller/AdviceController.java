package mum.edu.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import mum.edu.service.AdviceService;
import mum.edu.domain.Advice;

@RequestMapping("/advice")
@SessionAttributes({ "user" })
@Controller
public class AdviceController {

	@Autowired
	AdviceService adviceService;

	@RequestMapping("/list")
	public String listAdvice(Model model, HttpSession session) {

		if (loggedIn(session) == true) {
			model.addAttribute(session.getAttribute("user"));
			model.addAttribute("adviceList", this.adviceService.getAll());
			return "adviceList";
		} else {
			return "error-forbidden";
		}

	}

	// Form post
	@RequestMapping(value = "/display", method = RequestMethod.POST)
	public String displayAdvice(Advice advice, Model model, HttpSession session) {
		if (loggedIn(session) == true) {
			System.out.println(advice.getAdviceTitle());

			Advice a = this.adviceService.getAdvice(advice.getAdviceTitle());
			if (a == null) {
				model.addAttribute("error", "Requested Advice Not Found");
				return "display";
			} else {
				model.addAttribute("adviceInfo", a);
				return "display";
			}
		} else {
			return "error-forbidden";
		}

	}

	public boolean loggedIn(HttpSession session) {
		if (session.getAttribute("user") != null) {
			return true;
		}
		return false;
	}

}

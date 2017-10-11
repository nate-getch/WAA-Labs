package edu.mum.controller;

import java.io.File;
import java.util.Locale;

import javax.servlet.ServletContext;
import javax.validation.Valid;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import edu.mum.domain.Employee;

@Controller
public class EmployeeController {

	@Autowired
	ServletContext servletContext;

	private static final Log logger = LogFactory.getLog(EmployeeController.class);

	@RequestMapping(value = { "/", "employee_input" })
	public String inputEmployee(@ModelAttribute("employee") Employee employee, Model model) {

		Locale locale = LocaleContextHolder.getLocale();
		System.out.printf("WELCOME %s in %s\n", "nate!", locale.getDisplayLanguage());

		model.addAttribute("pg_title", "Add Employee");
		model.addAttribute("pg_body", "EmployeeForm");
		return "template";
		// return "EmployeeForm";
	}

	@RequestMapping(value = "/employee_save")
	public String saveEmployee(@Valid @ModelAttribute("employee") Employee employee, BindingResult bindingResult,
			Model model) {

		if (bindingResult.hasErrors()) {
			// return "EmployeeForm";
			model.addAttribute("pg_title", "Add Employee");
			model.addAttribute("pg_body", "EmployeeForm");
			return "template";
		}

		String[] suppressedFields = bindingResult.getSuppressedFields();
		if (suppressedFields.length > 0) {
			throw new RuntimeException("Attempt to bind fields that haven't been allowed in initBinder(): "
					+ StringUtils.addStringToArray(suppressedFields, ", "));
		}

		MultipartFile userImage = employee.getUserImage();
		String rootDirectory = servletContext.getRealPath("/");

		// isEmpty means file exists BUT NO Content
		if (userImage != null && !userImage.isEmpty()) {
			try {
				userImage.transferTo(new File(rootDirectory + "\\resources\\images\\" + employee.getId() + ".png"));
			} catch (Exception e) {
				throw new RuntimeException("User Image saving failed", e);
			}
		}

		// save employee here
		model.addAttribute("employee", employee);

		return "EmployeeDetails";
	}

	@InitBinder
	public void initBinder(WebDataBinder binder) {
		// binder.setDisallowedFields(new String[]{"firstName"});
	}
}

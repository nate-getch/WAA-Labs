package com.packt.webstore.controller;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.packt.webstore.domain.Employee;
import com.packt.webstore.domain.Address;
import com.packt.webstore.service.AddressService;
import com.packt.webstore.service.EmployeeService;

@Controller
@RequestMapping({ "/employees" })
public class EmployeeController {

	@Autowired
	EmployeeService employeeService;
	@Autowired
	AddressService addressService;

	@RequestMapping(value = { "", "/list" })
	public String listEmployees(Model model) {

		model.addAttribute("employees", employeeService.findAll());
		return "employees";
	}

	@RequestMapping("/employee")
	public String getEmployeeByNumber(Model model, @RequestParam("id") String employeeId) {
		
		Employee employee = null;
		try {
			Long empId = Long.valueOf(employeeId);
			if( empId instanceof Long ) {
				employee = employeeService.findOne(empId);
			}
		}
		catch(NumberFormatException e) {
			System.out.println(e);
		}

		model.addAttribute("employee", employee);
		return "employee";
	}

	@RequestMapping(value = "/add", method = RequestMethod.GET)
	public String addNewEmployee(@ModelAttribute("newEmployee") Employee newEmployee) {
		
		return "addEmployee";
	}

	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public String processAddNewEmployee(@Valid @ModelAttribute("newEmployee") Employee employeeToBeAdded, BindingResult result) {
		if(result.hasErrors()) {
			return "addEmployee"; 
		}
		
		employeeService.save(employeeToBeAdded);
		return "redirect:/employees/list";
	}

}

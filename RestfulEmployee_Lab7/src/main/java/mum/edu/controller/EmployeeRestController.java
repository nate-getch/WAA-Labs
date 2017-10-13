package mum.edu.controller;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import mum.edu.domain.Employee;
import mum.edu.service.EmployeeService;

@RequestMapping("/api/employee")
@Controller
public class EmployeeRestController {
	

	@Autowired
	EmployeeService employeeService;
	
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public @ResponseBody Employee addEmployee(@Valid @RequestBody Employee employee) {
		employeeService.save(employee);
		return employee;
	}
	
	/*
	 @RequestMapping(value = "/{name}", method = RequestMethod.GET, produces = "application/json")
	public @ResponseBody Employee getEmployeeInJSON(@PathVariable String name) {
		Employee emp = new Employee(1, name);
		Employee.setName("This is " + name + " Employee!");

		return emp;
	}
	*/
	
}

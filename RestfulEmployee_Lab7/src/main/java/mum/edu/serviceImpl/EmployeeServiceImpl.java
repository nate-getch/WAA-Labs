package mum.edu.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mum.edu.domain.Employee;
import mum.edu.repo.EmployeeRepo;
import mum.edu.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService{
	
	@Autowired
	EmployeeRepo employeeRepo;
	
	public Employee save(Employee emp) {
		return employeeRepo.save(emp);
	}
}

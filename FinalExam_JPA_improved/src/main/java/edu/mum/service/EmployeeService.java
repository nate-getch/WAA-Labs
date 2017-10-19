package edu.mum.service;

import java.util.List;
import java.util.Set;

import edu.mum.domain.Employee;
 
public interface EmployeeService {

	public void save(Employee emp);
    public void saveFull( Employee emp);  		

	public List<Employee> findAll();
 	public Employee findOne(Long id);
	public Employee findByEmployeeNumber(int empId);
 
}

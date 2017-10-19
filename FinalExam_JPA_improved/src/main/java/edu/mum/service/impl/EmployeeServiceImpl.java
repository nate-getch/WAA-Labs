package edu.mum.service.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.mum.domain.Employee;
import edu.mum.repository.AddressRepository;
import edu.mum.repository.EmployeeRepository;
import edu.mum.service.EmployeeService;

@Service
@Transactional
public class EmployeeServiceImpl implements EmployeeService{
	@Autowired
	EmployeeRepository employeeRepository;
	
	@Autowired
	AddressRepository addressRepository;
	
	public void save(Employee emp) {
		employeeRepository.save(emp);
	}

	public void saveFull(Employee emp) {

	}

	public List<Employee> findAll() {
		return (List<Employee>) employeeRepository.findAll();
	}

	public Employee findOne(Long id) {
		return employeeRepository.findOne(id);
	}

	public Employee findByEmployeeNumber(int empId) {
		return employeeRepository.findByEmployeeNumber(empId);
	}
}

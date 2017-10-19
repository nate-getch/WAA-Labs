package com.packt.webstore.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.packt.webstore.domain.Employee;
import com.packt.webstore.repository.AddressRepository;
import com.packt.webstore.repository.EmployeeRepository;
import com.packt.webstore.service.EmployeeService;

@Service
@Transactional
public class EmployeeServiceImpl implements EmployeeService {
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

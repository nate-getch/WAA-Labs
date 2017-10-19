package edu.mum.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import edu.mum.domain.Employee;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Long> {
	public Employee findByEmployeeNumber(int empId);
}

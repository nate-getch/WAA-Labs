package mum.edu.repoImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import mum.edu.domain.Employee;
import mum.edu.repo.EmployeeRepo;

@Repository
public class EmployeeRepoImpl implements EmployeeRepo {
	
	List<Employee> emp;
	public EmployeeRepoImpl(){
		emp = new ArrayList<Employee>();
	}
	
	public Employee save(Employee e) {
		emp.add(e);
		return e;
	}
}

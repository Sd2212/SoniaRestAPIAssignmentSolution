package com.mgmt.emp.service;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.mgmt.emp.model.Employee;

@Service
public interface EmployeeService {

	public List<Employee> showEmployees();
	
	public String addEmployee(Employee employee) ;
	
	public Optional<Employee> findAnEmployeeById(Integer id);
	
	public String deleteById(Integer id);
	
	public List<Employee> sortedEmployeesByFirstName(Direction direction);
	
	public List<Employee> searchByFirstname(String firstname);
	
	public Employee update(Integer id, Employee employee );

}

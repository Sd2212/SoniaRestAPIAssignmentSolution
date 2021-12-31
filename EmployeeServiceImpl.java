package com.mgmt.emp.serviceImpl;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import com.mgmt.emp.model.Employee;
import com.mgmt.emp.repository.EmployeeRepository;
import com.mgmt.emp.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService{

	@Autowired
	EmployeeRepository empRepository;

	@Transactional
	public List<Employee> showEmployees() {
		return empRepository.findAll();
	}

	@Transactional
	public Optional<Employee> findAnEmployeeById(Integer id) {
		return empRepository.findById(id);
	}
	
	@Transactional
	public String addEmployee(Employee employee) {
		empRepository.save(employee);
		empRepository.flush();
		return "Employee Added";
	}
	
	@Transactional
	public String deleteById(Integer id) {
		empRepository.deleteById(id);
		return "Deleted";
	}
	
	@Transactional
	public List<Employee> sortedEmployeesByFirstName(Direction direction){
		return empRepository.findAll(Sort.by(direction, "firstname"));
	}

	@Transactional
	public List<Employee> searchByFirstname(String firstname) {
		return  empRepository.findByFirstname(firstname);	 
		
	}

	@Transactional
	public Employee update(Integer id, Employee employee) {		
		return empRepository.save(employee);
	}

}

package com.mgmt.emp.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mgmt.emp.model.Employee;
import com.mgmt.emp.service.EmployeeService;

@RestController
@RequestMapping("/emp")
public class EmployeeController {

	@Autowired
	EmployeeService employeeService;

	@PostMapping("/showEmployees")
	public List<Employee> showEmployees() {
		return employeeService.showEmployees();
	}

	@PostMapping("/addEmployee")
	public String addEmployee(@RequestBody Employee employee) {
		return employeeService.addEmployee(employee);
	}

	@GetMapping("/findEmployee/{id}")
	public Optional<Employee> findAnEmployeeById(@PathVariable Integer id) {
		return employeeService.findAnEmployeeById(id);
	}

	@DeleteMapping("/deleteEmployee/{id}")
	public String deleteById(@PathVariable Integer id) {
		return employeeService.deleteById(id);
	}

	@GetMapping("/sort")
	public List<Employee> sortedEmployeesByFirstName(Direction direction) {
		return employeeService.sortedEmployeesByFirstName(direction);
	}

	@GetMapping("/search/{firstname}")
	public List<Employee> searchByFirstname(@PathVariable String firstname) {
		return employeeService.searchByFirstname(firstname);

	}

	@PutMapping("/update/{id}")
	public Employee update(@PathVariable Integer id, @RequestBody Employee employee) {
		return employeeService.update(id, employee);

	}

}

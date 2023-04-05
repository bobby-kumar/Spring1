package com.example.demo;

import java.util.ArrayList;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class Controller {
	
	//	localhost:8080/emp
	@GetMapping("/emp")
	public Employee getEmployee() {
		return new Employee(101,"naresh","Trainer");
	}
	
//	localhost:8080/Employee/empList
	@GetMapping("/Employee/empList")
	public List<Employee> listOfEmp() {
		List<Employee> listOfEmployee = new ArrayList<>();
		
		listOfEmployee.add(new Employee(101, "mohan", "Trainer"));
		listOfEmployee.add(new Employee(102, "rahul", "HR"));
		
		return listOfEmployee;
	}
	
//	localhost:8080/emp/12/arya/trainer
	@GetMapping("emp/{id}/{name}/{deg}")
	public Employee emp(@PathVariable(name = "id") int ids,
			@PathVariable(name = "name") String empname, 
			@PathVariable(name = "deg") String empdeg) {
		
		return new Employee(ids, empname, empdeg);
	}
	
//	localhost:8080/Employee?empId=4 & name=bobby & degination=student
	@GetMapping("/Employee")
	public Employee queryParam(
		 	@RequestParam(name="empId") int id,
		 	@RequestParam(name="name") String name, 
		 	@RequestParam(name="degination") String deg) {
		return new Employee(id,name,deg);
	}
}

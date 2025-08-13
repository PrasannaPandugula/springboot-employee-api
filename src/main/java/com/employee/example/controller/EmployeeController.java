package com.employee.example.controller;
import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.employee.example.model.Employee;

@RestController
public class EmployeeController {

  @GetMapping("/employees")
  public List<Employee> getEmployees() {
	        return Arrays.asList(
	                new Employee(1, "John Doe", "Engineering"),
	                new Employee(2, "Jane Smith", "Finance"),
	                new Employee(3, "Mark Taylor", "HR")
	        );
	    }
  
  @GetMapping("/")
  public String hello() {
      return "Hello World!";
  }
}


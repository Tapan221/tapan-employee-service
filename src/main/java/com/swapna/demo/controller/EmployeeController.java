package com.swapna.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.swapna.demo.model.Employee;
import com.swapna.demo.service.EmployeeService;



@RestController
public class EmployeeController {
	
	@Autowired
	EmployeeService service;
	
	@PostMapping("/addEmployee")
	public void addEmployee(@RequestBody Employee[] emp) {
		 service.addEmpToDB(emp);
	}
	@DeleteMapping("/deleteById/{id}")
	public void deleteEmployee(@PathVariable int id) {
		service.delete(id);		
	}
	@GetMapping("/getAll")
	public List<Employee> getAll(){
		return service.getallEmp();
	}
	
	
	
 	
	

}

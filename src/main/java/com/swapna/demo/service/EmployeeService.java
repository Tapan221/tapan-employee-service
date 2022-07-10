package com.swapna.demo.service;

import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.swapna.demo.model.Employee;
import com.swapna.demo.repository.EmployeeRepository;

@Service
public class EmployeeService {

	@Autowired
	EmployeeRepository repo;

	public void addEmpToDB(Employee[] emp) {
		
		for(Employee e : emp) {
			repo.save(e);
			
		}
		 
	}
	
	public void delete(int id) {
		  repo.deleteById(id);
		
	}
	
	public List<Employee> getallEmp() {
		return repo.findAll();
	}

}

package com.example.demo.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.dao.EmployeeDAO;
import com.example.demo.domain.Employee;


@Component
public class EmployeeService {

@Autowired
EmployeeDAO empDAO;
	
	public List<Employee> getEmpList() {
		
		return empDAO.getEmpList();
	}

	public void saveEmployee(Employee employee) {
		empDAO.saveEmployee(employee);
		
	}
}	



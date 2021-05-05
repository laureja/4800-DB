package com.example.demo.dao;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.domain.Employee;

@Component
public class EmployeeDAO {

	@Autowired
	private CompanyMapper companyMapper;
	
public List<Employee> getEmpList() {
	
		List<Employee> empList = new ArrayList<Employee>();
			
		empList = companyMapper.getEmpList();
		
		return empList;
	}

public void saveEmployee(Employee employee) {
	
	companyMapper.saveEmployee(employee);
	
	
}



}

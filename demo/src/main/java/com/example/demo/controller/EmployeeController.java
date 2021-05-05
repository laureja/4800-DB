package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.domain.Employee;
import com.example.demo.domain.FormCommand;
import com.example.demo.service.EmployeeService;

@Controller
public class EmployeeController {

	@Autowired
	EmployeeService empService;

	 
	@RequestMapping(value = "/displayEmployees", method = RequestMethod.GET)
	public String formExampleDisplay(HttpServletRequest request, Model model) {
		System.out.println("I am in displkayEmployees inside Employee Controller");
		
		HttpSession session = request.getSession(true);
		
		String userName = session.getAttribute("user").toString();
		
		System.out.println("userName from Session inside displayEmployees :"+ userName);

		
		// database query
		// mvc		
		List<Employee> empList = new ArrayList<Employee>();
		
		//EmployeeService empService = new EmployeeService();
		empList = empService.getEmpList();
		
		for (Employee e : empList)
			System.out.println(e);		
		
		model.addAttribute("empList",empList);	
		
		return "displayEmployees";
	}
	
	@RequestMapping(value = "/saveEmployee", method = RequestMethod.POST)
	public String saveEmployee(@ModelAttribute Employee employee, Model model) {
		
		System.out.println("I am in saveEmployee inside Employee Controller");
		
		System.out.println("Employee details in saveEmployee"+employee);
		

		empService.saveEmployee(employee);
		
		model.addAttribute("employee", employee);
		model.addAttribute("dnoList",getDnumbers());
		model.addAttribute("message","Update Successful");		

		
		return "editEmployee";
	}

	
	
	@RequestMapping(value = "/editEmployee/{ssn}", method = RequestMethod.GET)
	public String editEmployee(@PathVariable String ssn, @ModelAttribute Employee employee, Model model) {

		System.out.println("I am in editEmployee inside Employee Controller");
		
		// database query
		// mvc 
		
		employee = new Employee();
		employee.setSsn(ssn);
		
		model.addAttribute("employee",employee);
		model.addAttribute("dnoList",getDnumbers());
		model.addAttribute("message","Please update employee");
	
		
		return "editEmployee";
	}
	
	public ArrayList<String> getDnumbers() {
		ArrayList<String> dnoList = new ArrayList<String>();
		dnoList.add("1");
		dnoList.add("4");
		dnoList.add("5");
		dnoList.add("6");	
		
		return dnoList;
	}
	

}
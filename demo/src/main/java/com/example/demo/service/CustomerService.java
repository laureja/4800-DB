package com.example.demo.service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.dao.CustomerDAO;
import com.example.demo.domain.Customer;
import com.example.demo.domain.Review;

@Component
public class CustomerService {
	
	@Autowired
	CustomerDAO customerDAO;
	
	public List<Customer> getCustomerList() {
		return customerDAO.getCustomerList();
		
	}
	
	public void saveCustomer(Customer customer) {
		customerDAO.saveCustomer(customer);
	}
	
	public void insertCustomer(Customer customer) {
		customerDAO.insertCustomer(customer);
	}
	public Customer getCustomerEmail(Customer customer) {
		return customerDAO.getCustomerEmail(customer);
	}
}

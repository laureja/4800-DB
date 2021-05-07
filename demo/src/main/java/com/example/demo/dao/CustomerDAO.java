package com.example.demo.dao;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.domain.Customer;
import com.example.demo.domain.Review;
@Component
public class CustomerDAO {
	
	@Autowired
	private CustomerMapper customerMapper;
	
	public List<Customer> getCustomerList(){
		
		List<Customer> customerList = new ArrayList<Customer>();
		customerList = customerMapper.getCustomerList();
		return customerList;
		
	}
	
	public void saveCustomer(Customer customer) {
		customerMapper.saveCustomer(customer);
	}
	
	public void insertCustomer(Customer customer) {
		customerMapper.insertCustomer(customer);
	}
	
	public Customer getCustomerEmail(Customer customer) {
		customer = customerMapper.getCustomerEmail(customer);
		return customer;
	}

}

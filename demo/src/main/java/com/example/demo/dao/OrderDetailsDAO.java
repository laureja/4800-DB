package com.example.demo.dao;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.domain.OrderDetails;

@Component
public class OrderDetailsDAO {
	
	@Autowired
	private OrderDetailsMapper orderDetailsMapper;
	
	public List<OrderDetails> getOrderDetails() {
		List<OrderDetails> orderDetailsList =  new ArrayList<OrderDetails>();
		orderDetailsList = orderDetailsMapper.getOrderDetails();
		return orderDetailsList;
	}
}

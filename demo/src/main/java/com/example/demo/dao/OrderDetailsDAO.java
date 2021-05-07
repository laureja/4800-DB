package com.example.demo.dao;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.domain.OrderDetails;
import com.example.demo.domain.Review;

@Component
public class OrderDetailsDAO {
	
	@Autowired
	private OrderDetailsMapper orderDetailsMapper;
	

	public List<OrderDetails> getOrderDetailsList() {
		List<OrderDetails> orderDetailsList =  new ArrayList<OrderDetails>();
		orderDetailsList = orderDetailsMapper.getOrderDetails();
		return orderDetailsList;
	}
	
	public void insertOrderDetail(OrderDetails orderDetail) {
		orderDetailsMapper.insertOrderDetail(orderDetail);
	}
}

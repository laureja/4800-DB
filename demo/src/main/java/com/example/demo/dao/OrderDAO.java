package com.example.demo.dao;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.domain.Order;
import com.example.demo.domain.OrderDetails;
import com.example.demo.domain.Restaurant;

@Component
public class OrderDAO {
	
	@Autowired
	private OrderMapper orderMapper;
	
	public List<Order> getOrderList(){
		List<Order> orderList = new ArrayList<Order>();
		orderList = orderMapper.getOrderList();
		return orderList;
	}
	public void saveOrder(Order order) {
		orderMapper.saveOrder(order);
	}
	
	public void insertOrder(Order order) {
		orderMapper.insertOrder(order);
	}
	

}

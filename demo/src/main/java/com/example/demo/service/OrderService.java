package com.example.demo.service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.dao.OrderDAO;
import com.example.demo.domain.Order;

@Component
public class OrderService {
	
	@Autowired
	OrderDAO orderDAO;
	
	public List<Order> getOrderList() {
		return orderDAO.getOrderList();
	}
	public void saveOrder(Order order) {
		orderDAO.saveOrder(order);
	}
}

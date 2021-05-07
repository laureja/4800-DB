package com.example.demo.service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.dao.OrderDAO;
import com.example.demo.dao.OrderDetailsDAO;
import com.example.demo.domain.Order;
import com.example.demo.domain.OrderDetails;
import com.example.demo.domain.Review;

@Component
public class OrderService {
	
	@Autowired
	OrderDAO orderDAO;
	
	@Autowired
	OrderDetailsDAO orderDetailsDAO;
	
	public List<Order> getOrderList() {
		return orderDAO.getOrderList();
	}
	public void saveOrder(Order order) {
		orderDAO.saveOrder(order);
	}
	
	public void insertOrderDetail(OrderDetails orderDetail) {
		orderDetailsDAO.insertOrderDetail(orderDetail);
	}
	
	public void insertOrder(Order order) {
		orderDAO.insertOrder(order);
	}
}

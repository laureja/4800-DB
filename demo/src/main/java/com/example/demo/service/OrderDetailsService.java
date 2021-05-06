package com.example.demo.service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.dao.OrderDetailsDAO;
import com.example.demo.domain.OrderDetails;

@Component
public class OrderDetailsService {
	
	@Autowired
	OrderDetailsDAO orderDetailsDAO;
	
	public List<OrderDetails> getOrderDetailsList() {
		return orderDetailsDAO.getOrderDetailsList();

	}
}

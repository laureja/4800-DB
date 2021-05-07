package com.example.demo.domain;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class menuForm {
    List<OrderDetails> orderDetailsList;
	
    public String getFlag() {
		return flag;
	}

	public void setFlag(String flag) {
		this.flag = flag;
	}

	String flag;
    
    
	public menuForm(List<OrderDetails> orderDetailsList) {
		super();
		this.orderDetailsList = orderDetailsList;
	}
	
    public void addItem(OrderDetails orderDetail) {
        this.orderDetailsList.add(orderDetail);
    }
	
	
	public menuForm() {
		this.orderDetailsList = new ArrayList<OrderDetails>();
	}


	public List<OrderDetails> getOrderDetailsList() {
		return orderDetailsList;
	}


	public void setOrderDetailsList(List<OrderDetails> orderDetailsList) {
		this.orderDetailsList = orderDetailsList;
	}

	@Override
	public String toString() {
		return "menuForm [orderDetailsList=" + orderDetailsList + ", flag=" + flag + "]";
	}

	



    
    
    
}
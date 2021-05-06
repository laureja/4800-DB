package com.example.demo.dao;
import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.example.demo.domain.OrderDetails;

@Mapper
public interface OrderDetailsMapper {
	
	@Select("SELECT ONO,FOODNAME,RESTID,QTY FROM RESTAURANT_ODETAILS")
	List<OrderDetails> getOrderDetails();
}

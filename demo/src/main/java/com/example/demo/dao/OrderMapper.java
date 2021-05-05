package com.example.demo.dao;
import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.example.demo.domain.Order;

@Mapper
public interface OrderMapper {
	@Select("SELECT ONO,CUSTEMAIL,ORDERDINEINEFLAG,ORDERDELIVERYFLAG,ORDERPICKUPFLAG,ORDERPICKUPDATE,ORDERDELIVERYDATE,ORDERDINEINRECEIVEDDATE FROM RESTAURANT_ORDER")
	List<Order> getOrderList();
	
	@Update("update RESTAURANT_ORDER set custemail=#{custemail},orderdineinflag=#{orderdineinflag},orderdeliveryflag=#{orderdeliveryflag},orderpickupflag=#{orderpickupflag},orderpickupdate=#{orderpickupdate},orderdeliverydate=#{orderdeliverydate},orderdineinreceiveddate=#{orderdineinreceiveddate} where ono=#{ono}")
	void saveOrder(Order order);
	
	@Insert("insert RESTAURANT_ORDER (ono,custemail,orderdineinflag,orderdeliveryflag,orderpickupflag,orderpickupdate,orderdeliverydate,orderdineinreceiveddate) values(#{ono},#{custemail},#{orderdineinflag},#{orderdeliveryflag},#{orderpickupflag},#{orderpickupdate},#{orderdeliverydate},#{orderdineinreceiveddate})")
	void insertOrder(Order order);
	
}

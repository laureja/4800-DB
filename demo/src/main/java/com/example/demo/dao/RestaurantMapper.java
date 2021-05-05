package com.example.demo.dao;
import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.example.demo.domain.Restaurant;

@Mapper
public interface RestaurantMapper {
	
	@Select("SELECT RESTID,RNAME,PHONE,EMAIL,HOURS,DININGTYPE,STREETNO,STREETNAME,CITY,STATE,ZIP,PRICERANGE,DELIVERYFLAG,OUTDOORSEATINGFLAG FROM RESTAURANT")
	List<Restaurant> getRestaurantList();
	
	@Update("update RESTAURANT set rname=#{rname},phone=#{phone},email=#{email},hours=#{hours},diningtype=#{diningtype},streetno=#{streetno},streetname=#{streetname},city=#{city},state=#{state},zip=#{zip},pricerange=#{pricerange},deliveryflag=#{deliveryflag},outdoorseatingflag=#{outdoorseatingflag} where restid=#{restid}")
	void saveRestaurant(Restaurant restaurant);
	
	@Insert("insert RESTAURANT (restid,rname,phone,email,hours,diningtype,streetno,streetname,city,state,zip,pricerange,deliveryflag,outdoorseatingflag) values(#{restid},#{rname},#{phone},#{email},#{hours},#{diningtype},#{streetno},#{streetname},#{city},#{state},#{zip},#{pricerange},#{deliveryflag},#{outdoorseatingflag})")
	void insertRestaurant(Restaurant restaurant);
}

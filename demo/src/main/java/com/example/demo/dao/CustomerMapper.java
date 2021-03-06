package com.example.demo.dao;
import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.example.demo.domain.Customer;


@Mapper
public interface CustomerMapper {
	
	
	@Select("SELECT EMAIL,FNAME,MINIT,LNAME,PHONE,PASSWORD,STREETNO,STREETNAME,CITY,STATE,ZIP FROM RESTAURANT_CUSTOMER")
	List<Customer> getCustomerList();
	
	@Update("update RESTAURANT_CUSTOMER set fname=#{fname},minit=#{minit},lname=#{lname},phone=#{phone},password=#{password},streetno=#{streetno},streetname=#{streetname},city=#{city},state=#{state},zip=#{zip} where email=#{email}")
	void saveCustomer(Customer customer);
	
	@Insert("insert into RESTAURANT_CUSTOMER (email,fname,minit,lname,phone,password,streetno,streetname,city,state,zip) values(#{email},#{fname},#{minit},#{lname},#{phone},#{password},#{streetno},#{streetname},#{city},#{state},#{zip})")
	void insertCustomer(Customer customer);
	
	//Use for login
	@Select("SELECT EMAIL,FNAME,MINIT,LNAME,PHONE,PASSWORD,STREETNO,STREETNAME,CITY,STATE,ZIP FROM RESTAURANT_CUSTOMER WHERE email=#{email}")
	Customer getCustomerEmail(Customer customer);
}

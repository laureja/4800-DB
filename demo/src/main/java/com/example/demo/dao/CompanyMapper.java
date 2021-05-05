package com.example.demo.dao;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.example.demo.domain.Employee;

@Mapper
public interface CompanyMapper {
	
	@Select("SELECT SSN, FNAME, LNAME, DNO, SALARY, SUPERSSN FROM EMPLOYEE")
	List<Employee> getEmpList();
	
	@Update("update EMPLOYEE set fname = #{fname}, lname=#{lname}, dno=#{dno} where ssn = #{ssn}")
	void saveEmployee(Employee employee);
	
	@Insert("insert EMPLOYEE (ssn, fname, lname, dno) values(#{ssn}, #{fname}, #{lname}, #{dno})")
	void insertEmployee(Employee employee);	
		
}

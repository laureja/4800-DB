package com.example.demo.domain;

import java.math.BigDecimal;

public class Employee {
	
	String ssn;
	String fname;
	String lname;
	String dno;
	BigDecimal salary;
	
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}


	public Employee(String ssn, String fname, String lname, String dno, BigDecimal salary) {
		super();
		this.ssn = ssn;
		this.fname = fname;
		this.lname = lname;
		this.dno = dno;
		this.salary = salary;
	}


	public String getSsn() {
		return ssn;
	}


	public void setSsn(String ssn) {
		this.ssn = ssn;
	}


	public String getFname() {
		return fname;
	}


	public void setFname(String fname) {
		this.fname = fname;
	}


	public String getLname() {
		return lname;
	}


	public void setLname(String lname) {
		this.lname = lname;
	}


	public String getDno() {
		return dno;
	}


	public void setDno(String dno) {
		this.dno = dno;
	}


	public BigDecimal getSalary() {
		return salary;
	}


	public void setSalary(BigDecimal salary) {
		this.salary = salary;
	}


	@Override
	public String toString() {
		return "Employee [ssn=" + ssn + ", fname=" + fname + ", lname=" + lname + ", dno=" + dno + ", salary=" + salary
				+ "]";
	}

	
	
	
	

}

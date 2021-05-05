package com.example.demo.domain;

public class Customer {
	
	String email;
	String fname;
	char minit;
	String lname;
	String phone;
	String password;
	String streetno;
	String streetname;
	String city;
	String state;
	int zip;
	
	public Customer() {
		
	}
	
	public Customer(String email,String fname,char minit,String lname,String phone,String password,String streetno,String streetname,String city,String state,int zip) {
		super();
		this.email = email;
		this.fname = fname;
		this.minit = minit;
		this.phone = phone;
		this.password = password;
		this.streetname = streetname;
		this.city = city;
		this.state = state;
		this.zip = zip;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public char getMinit() {
		return minit;
	}

	public void setMinit(char minit) {
		this.minit = minit;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getStreetno() {
		return streetno;
	}

	public void setStreetno(String streetno) {
		this.streetno = streetno;
	}

	public String getStreetname() {
		return streetname;
	}

	public void setStreetname(String streetname) {
		this.streetname = streetname;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public int getZip() {
		return zip;
	}

	public void setZip(int zip) {
		this.zip = zip;
	}

	@Override
	public String toString() {
		return "Customer [email=" + email + ", fname=" + fname + ", minit=" + minit + ", lname=" + lname + ", phone="
				+ phone + ", password=" + password + ", streetno=" + streetno + ", streetname=" + streetname + ", city="
				+ city + ", state=" + state + ", zip=" + zip + "]";
	}

}

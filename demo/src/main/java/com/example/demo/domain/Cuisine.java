package com.example.demo.domain;


public class Cuisine {
	int restid;
	String cname;
	
	
	public Cuisine() {
		
	}


	public Cuisine(int restid, String cname) {
		super();
		this.restid = restid;
		this.cname = cname;
	}


	public int getRestid() {
		return restid;
	}


	public void setRestid(int restid) {
		this.restid = restid;
	}


	public String getCname() {
		return cname;
	}


	public void setCname(String cname) {
		this.cname = cname;
	}
	
	

	
	
	
	

}

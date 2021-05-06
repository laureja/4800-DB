package com.example.demo.domain;

public class Menu {
	int restid;
	String foodname;
	float price;
	
	public Menu() {
		
	}

	public Menu(int restid, String foodname, float price) {
		super();
		this.restid = restid;
		this.foodname = foodname;
		this.price = price;
	}

	public int getRestid() {
		return restid;
	}

	public void setRestid(int restid) {
		this.restid = restid;
	}

	public String getFoodname() {
		return foodname;
	}

	public void setFoodname(String foodname) {
		this.foodname = foodname;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Menu [restid=" + restid + ", foodname=" + foodname + ", price=" + price + "]";
	}
	

}

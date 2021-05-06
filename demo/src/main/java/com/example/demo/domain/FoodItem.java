package com.example.demo.domain;

public class FoodItem {
	String foodname;
	String fcatname;
	
	public FoodItem() {
		
	}

	public FoodItem(String foodname, String fcatname) {
		super();
		this.foodname = foodname;
		this.fcatname = fcatname;
	}

	public String getFoodname() {
		return foodname;
	}

	public void setFoodname(String foodname) {
		this.foodname = foodname;
	}

	public String getFcatname() {
		return fcatname;
	}

	public void setFcatname(String fcatname) {
		this.fcatname = fcatname;
	}

	@Override
	public String toString() {
		return "FoodItem [foodname=" + foodname + ", fcatname=" + fcatname + "]";
	}
	

}

package com.example.demo.domain;

public class OrderDetails {
	int ono;
	String foodname;
	int restid;
	float qty;
	
	public OrderDetails() {
		
	}

	public OrderDetails(int ono, String foodname, int restid, float qty) {
		super();
		this.ono = ono;
		this.foodname = foodname;
		this.restid = restid;
		this.qty = qty;
	}

	public int getOno() {
		return ono;
	}

	public void setOno(int ono) {
		this.ono = ono;
	}

	public String getFoodname() {
		return foodname;
	}

	public void setFoodname(String foodname) {
		this.foodname = foodname;
	}

	public int getRestid() {
		return restid;
	}

	public void setRestid(int restid) {
		this.restid = restid;
	}

	public float getQty() {
		return qty;
	}

	public void setQty(float qty) {
		this.qty = qty;
	}

	@Override
	public String toString() {
		return "OrderDetails [ono=" + ono + ", foodname=" + foodname + ", restid=" + restid + ", qty=" + qty + "]";
	}
	

}

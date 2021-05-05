package com.example.demo.domain;

public class Order {
	int ono;
	String orderdate;
	String custemail;
	char orderdineinflag;
	char orderdeliveryflag;
	char orderpickupflag;
	String orderpickupdate;
	String orderdeliverydate;
	String orderdineinreceiveddate;
	
	public Order() {
		
	}

	public Order(int ono, String orderdate, String custemail, char orderdineinflag, char orderdeliveryflag,
			char orderpickupflag, String orderpickupdate, String orderdeliverydate, String orderdineinreceiveddate) {
		super();
		this.ono = ono;
		this.orderdate = orderdate;
		this.custemail = custemail;
		this.orderdineinflag = orderdineinflag;
		this.orderdeliveryflag = orderdeliveryflag;
		this.orderpickupflag = orderpickupflag;
		this.orderpickupdate = orderpickupdate;
		this.orderdeliverydate = orderdeliverydate;
		this.orderdineinreceiveddate = orderdineinreceiveddate;
	}

	public int getOno() {
		return ono;
	}

	public void setOno(int ono) {
		this.ono = ono;
	}

	public String getOrderdate() {
		return orderdate;
	}

	public void setOrderdate(String orderdate) {
		this.orderdate = orderdate;
	}

	public String getCustemail() {
		return custemail;
	}

	public void setCustemail(String custemail) {
		this.custemail = custemail;
	}

	public char getOrderdineinflag() {
		return orderdineinflag;
	}

	public void setOrderdineinflag(char orderdineinflag) {
		this.orderdineinflag = orderdineinflag;
	}

	public char getOrderdeliveryflag() {
		return orderdeliveryflag;
	}

	public void setOrderdeliveryflag(char orderdeliveryflag) {
		this.orderdeliveryflag = orderdeliveryflag;
	}

	public char getOrderpickupflag() {
		return orderpickupflag;
	}

	public void setOrderpickupflag(char orderpickupflag) {
		this.orderpickupflag = orderpickupflag;
	}

	public String getOrderpickupdate() {
		return orderpickupdate;
	}

	public void setOrderpickupdate(String orderpickupdate) {
		this.orderpickupdate = orderpickupdate;
	}

	public String getOrderdeliverydate() {
		return orderdeliverydate;
	}

	public void setOrderdeliverydate(String orderdeliverydate) {
		this.orderdeliverydate = orderdeliverydate;
	}

	public String getOrderdineinreceiveddate() {
		return orderdineinreceiveddate;
	}

	public void setOrderdineinreceiveddate(String orderdineinreceiveddate) {
		this.orderdineinreceiveddate = orderdineinreceiveddate;
	}

	@Override
	public String toString() {
		return "Order [ono=" + ono + ", orderdate=" + orderdate + ", custemail=" + custemail + ", orderdineinflag="
				+ orderdineinflag + ", orderdeliveryflag=" + orderdeliveryflag + ", orderpickupflag=" + orderpickupflag
				+ ", orderpickupdate=" + orderpickupdate + ", orderdeliverydate=" + orderdeliverydate
				+ ", orderdineinreceiveddate=" + orderdineinreceiveddate + "]";
	}
	
	
	

}

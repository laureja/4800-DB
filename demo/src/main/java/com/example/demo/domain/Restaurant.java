package com.example.demo.domain;


public class Restaurant {
	
	int restid;
	String rname;
	String phone;
	String email;
	String hours;
	String diningtype;
	int streetno;
	String streetname;
	String city;
	String state;
	int zip;
	String pricerange;
	String deliveryflag;
	String outdoorseatingflag;
	
	public Restaurant() {
		
	}
	
	public Restaurant(int restid,String rname,String phone,String email,String hours,String diningtype,int streetno,String streetname,String city,String state,int zip,String pricerange,String deliveryflag,String outdoorseatingflag) {
		super();
		this.restid = restid;
		this.rname = rname;
		this.phone = phone;
		this.email = email;
		this.hours = hours;
		this.diningtype = diningtype;
		this.streetno = streetno;
		this.streetname = streetname;
		this.city= city;
		this.state = state;
		this.zip = zip;
		this.pricerange = pricerange;
		this.deliveryflag = deliveryflag;
		this.outdoorseatingflag = outdoorseatingflag;
	}

	public int getRestid() {
		return restid;
	}

	public void setRestid(int restid) {
		this.restid = restid;
	}

	public String getRname() {
		return rname;
	}

	public void setRname(String rname) {
		this.rname = rname;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getHours() {
		return hours;
	}

	public void setHours(String hours) {
		this.hours = hours;
	}

	public String getDiningtype() {
		return diningtype;
	}

	public void setDiningtype(String diningtype) {
		this.diningtype = diningtype;
	}

	public int getStreetno() {
		return streetno;
	}

	public void setStreetno(int streetno) {
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

	public String getPricerange() {
		return pricerange;
	}

	public void setPricerange(String pricerange) {
		this.pricerange = pricerange;
	}

	public String getDeliveryflag() {
		return deliveryflag;
	}

	public void setDeliveryflag(String deliveryflag) {
		this.deliveryflag = deliveryflag;
	}

	public String getOutdoorseatingflag() {
		return outdoorseatingflag;
	}

	public void setOutdoorseatingflag(String outdoorseatingflag) {
		this.outdoorseatingflag = outdoorseatingflag;
	}

	@Override
	public String toString() {
		return "Restaurant [restid=" + restid + ", rname=" + rname + ", phone=" + phone + ", email=" + email
				+ ", hours=" + hours + ", diningtype=" + diningtype + ", streetno=" + streetno + ", streetname="
				+ streetname + ", city=" + city + ", state=" + state + ", zip=" + zip + ", pricerange=" + pricerange
				+ ", deliveryflag=" + deliveryflag + ", outdoorseatingflag=" + outdoorseatingflag + "]";
	}

	
	

}

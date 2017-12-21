package com.zkc.bean;

public class Customers {
	private int cust_id;
	private String cust_name;
	private String cust_city;
	private String cust_country;
	@Override
	public String toString() {
		return "Product [cust_id=" + cust_id + ", cust_name=" + cust_name + ", cust_city=" + cust_city
				+ ", cust_country=" + cust_country + "]";
	}
	public int getCust_id() {
		return cust_id;
	}
	public void setCust_id(int cust_id) {
		this.cust_id = cust_id;
	}
	public String getCust_name() {
		return cust_name;
	}
	public void setCust_name(String cust_name) {
		this.cust_name = cust_name;
	}
	public String getCust_city() {
		return cust_city;
	}
	public void setCust_city(String cust_city) {
		this.cust_city = cust_city;
	}
	public String getCust_country() {
		return cust_country;
	}
	public void setCust_country(String cust_country) {
		this.cust_country = cust_country;
	}
	
}

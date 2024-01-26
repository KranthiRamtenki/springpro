package com.nt.dto;

public class CustomerDto {
	
	private String cust_name;
	private double princple_amount;
	private int    rate;
	private int    time;
	
	
	public String getCust_name() {
		return cust_name;
	}
	public void setCust_name(String cust_name) {
		this.cust_name = cust_name;
	}
	public double getPrincple_amount() {
		return princple_amount;
	}
	public void setPrincple_amount(double princple_amount) {
		this.princple_amount = princple_amount;
	}
	public int getRate() {
		return rate;
	}
	public void setRate(int rate) {
		this.rate = rate;
	}
	public int getTime() {
		return time;
	}
	public void setTime(int time) {
		this.time = time;
	}
	
	@Override
	public String toString() {
		return "CustomerDto [cust_name=" + cust_name + ", princple_amount=" + princple_amount + ", rate=" + rate
				+ ", time=" + time + "]";
	}
	
	

}

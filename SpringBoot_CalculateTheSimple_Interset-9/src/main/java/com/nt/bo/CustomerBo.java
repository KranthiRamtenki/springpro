package com.nt.bo;

import lombok.Data;

@Data
public class CustomerBo {
	
	private String cust_name;
	private double princple_amount;
	private int    rate;
	private int    time;
	private double simple_intrest;
	
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
	
	public double getSimple_intrest() {
		return simple_intrest;
	}
	public void setSimple_intrest(double simple_intrest) {
		this.simple_intrest = simple_intrest;
	}
	@Override
	public String toString() {
		return "CustomerBo [cust_name=" + cust_name + ", princple_amount=" + princple_amount + ", rate=" + rate
				+ ", time=" + time + ", simple_intrest=" + simple_intrest + "]";
	}
	
	
	

}

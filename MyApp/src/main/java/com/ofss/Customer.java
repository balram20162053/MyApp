package com.ofss;

public class Customer {
	private String  custName;
    private String location;
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Customer(String custName, String location) {
		super();
		this.custName = custName;
		this.location = location;
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	@Override
	public String toString() {
		return "Customer [custName=" + custName + ", location=" + location + "]";
	}
    
}

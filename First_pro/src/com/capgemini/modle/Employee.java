package com.capgemini.modle;

import java.util.List;

public class Employee {
	private int employeeNumber;
	private String name;
	private List<Address> address;
	
	public Employee() {
		// TODO Auto-generated constructor stub
		//System.out.println("Constructer");
		
	}
	public int getEmployeeNumber() {
	//	System.out.println("employee number getter method");
		return employeeNumber;
	}
	public void setEmployeeNumber(int employeeNumber) {
	//	System.out.println("employee number setter method");
		this.employeeNumber = employeeNumber;
	}
	public String getName() {
		//System.out.println("employee Name getter method");
		return name;
	}
	public void setName(String name) {
	//	System.out.println("employee Name setter method");
		this.name = name;
	}
	public List<Address> getAddress() {
		return address;
	}
	public void setAddress(List<Address> address) {
		this.address = address;
	}
	
	
	

}

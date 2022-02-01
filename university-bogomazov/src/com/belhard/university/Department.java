package com.belhard.university;

public class Department {
	private String name;
	private int numberOfEmployees;
	
	public Department(String name) {
		this.name = name;
	}
	
	public String getName(){
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getNumberOfEmployees() {
		return numberOfEmployees;
	}
	
}

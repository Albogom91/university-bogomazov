package com.belhard.university;

public class Employee extends Person {
	private Money salary;
	private int yearsOfExperience;
	
	public Employee(String firstName, String lastName) {
		super(firstName, lastName);
	}
	
	public Employee(String firstName, String patronymicName, String lastName) {
		super(firstName, patronymicName, lastName);
	}
	
	public Money getSalary() {
		return salary;
	}
	
	public void setSalary(Money salary) {
		this.salary = salary;
	}
	
	public int getYearsOfExperience() {
		return yearsOfExperience;
	}
	
	public void setYearsOfExperience(int yearsOfExperience) {
		if (yearsOfExperience > 0) {
			this.yearsOfExperience = yearsOfExperience;
		}
	}
	
	@Override
	public String toString() {
		String name = new String();
		name = super.toString();
		return name;
	}
}

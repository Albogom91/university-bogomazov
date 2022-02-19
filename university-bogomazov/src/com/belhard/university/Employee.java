package com.belhard.university;

import com.belhard.university.exceptions.*;

public abstract class Employee extends Person implements Identifiable {
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
		try {
			if (yearsOfExperience < 0) {
				throw new IllegalExperienceAmount("Invalid years of experience (can't be negative)!");
			}
		}catch (Exception e){
			e.printStackTrace();
			return;
		}
		this.yearsOfExperience = yearsOfExperience;
	}
	
	@Override
	public String toString() {
		String name = new String();
		name = super.toString();
		return name;
	}
}

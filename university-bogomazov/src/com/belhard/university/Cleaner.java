package com.belhard.university;

public class Cleaner extends Employee {
	private int floorToClean;
	
	public Cleaner(String firstName, String lastName) {
		super(firstName, lastName);
	}
	
	public Cleaner(String firstName, String patronymicName, String lastName) {
		super(firstName, patronymicName, lastName);
	}
	
	public int getFloorToClean() {
		return floorToClean;
	}
	
	public void setFloorToClean(int floorToClean) {
		if (floorToClean > 0) {
			this.floorToClean = floorToClean;
		}
	}
	
	@Override
	public String toString() {
		String name = new String();
		name = super.toString();
		return name;
	}
}

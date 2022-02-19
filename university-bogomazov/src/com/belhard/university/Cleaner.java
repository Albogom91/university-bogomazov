package com.belhard.university;

import java.util.Objects;

import com.belhard.university.exceptions.*;

public class Cleaner extends Employee implements Identifiable {
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
		try {
			if (floorToClean < -1 || floorToClean > 180) {
				throw new IllegalFloorToClean("Invalid floor(does not exist)!");
			}
		}catch (Exception e){
			e.printStackTrace();
			return;
		}
		this.floorToClean = floorToClean;
	}
	
	@Override
	public String toString() {
		String name = new String();
		name = super.toString();
		return name;
	}
	
	@Override
	public String introduceYourself() {
		String introInfo = "My name is ";
		introInfo += getFirstName() + " " + getLastName() + ", ";
		introInfo += "I am " + getClass().getSimpleName().toLowerCase() + ", ";
		introInfo += "I clean " + getFloorToClean() + " floor.\n";
		return introInfo;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(this == obj) {
			return true;
		}
		if(obj == null) {
			return false;
		}
		if(getClass() != obj.getClass()) {
			return false;
		}
		Cleaner other = (Cleaner) obj;
		return getId() == other.getId()
				&& getAge() == other.getAge()
				&& Objects.equals(getFirstName(), other.getFirstName())
				&& Objects.equals(getLastName(), other.getLastName())
				&& floorToClean == other.floorToClean;
	}
	
	@Override
	public int hashCode() {
		int result = getId();
		result = 23 * result + getAge();
		result = 23 * result + (getFirstName() == null ? 0 : getFirstName().hashCode());
		result = 23 * result + (getLastName() == null ? 0 : getLastName().hashCode());
		result = 23 * result + (getLastName() == null ? 0 : getLastName().hashCode());
		result = 23 * result + floorToClean;
		return result;
	}
}

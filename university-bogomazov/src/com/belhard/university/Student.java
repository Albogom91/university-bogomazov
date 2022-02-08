package com.belhard.university;

public class Student extends Person {
	private double academicRecord;
	
	public Student(String firstName, String lastName) {
		super(firstName, lastName);
	}
	
	public Student(String firstName, String patronymicName, String lastName) {
		super(firstName, patronymicName, lastName);
	}
	
	public double getAcademicRecord() {
		return academicRecord;
	}
	
	public void setAcademicRecord(double academicRecord) {
		if (academicRecord > 0 && academicRecord <= 10) {
			this.academicRecord = academicRecord;
		}
	}
	
	@Override
	public String toString() {
		String name = new String();
		name = super.toString();
		return name;
	}
	
}
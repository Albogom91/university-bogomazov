package com.belhard.university;

public class Faculty {
	private FacultyName name;
	private int numberOfDepartments;
	private int numberOfGroups;
	private final Department[] departments = new Department[10];
	
	public enum FacultyName{
		FACULTY_OF_HUMANITIES_AND_SOCIAL_SCINENCES,
		FACULTY_OF_NATURAL_SCIENCES,
	}
	
	public Faculty(FacultyName name) {
		this.name = name;
	}
	
	public FacultyName getName(){
		return name;
	}
	
	public void setName(FacultyName name) {
		this.name = name;
	}
	
	public int getNumberOfDepartments() {
		return numberOfDepartments;
	}
	
	public int getNumberOfGroups() {
		return numberOfGroups;
	}
	
	public Department[] getDepartments() {
		return departments;
	}
	
}

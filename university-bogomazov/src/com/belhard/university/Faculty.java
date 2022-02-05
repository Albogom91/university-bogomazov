package com.belhard.university;

public class Faculty extends Collective {
	private FacultyName name;
	private int numberOfDepartments;
	private int numberOfGroups;
	
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
	
	public boolean addDepartment(Department department) {
		boolean isAdded = this.addInstance(department);
		return isAdded;
	}
	
	public boolean removeDepartment(Department department) {
		boolean isRemoved = this.removeInstance(department);
		return isRemoved;
	}
	
	public String getFacultyInfo() {
		String divider = "-----\n";
		this.numberOfDepartments = this.getNumberOfInstances();
		String facultyInfo = divider + getName() + ".\n" + divider;
		if (numberOfDepartments < 1) {
			facultyInfo += "Currently there are no departments in the faculty.\n" + divider;
		} else {
			facultyInfo += "Current departments in the faculty are:\n" + divider;
			facultyInfo += this.getCollectiveInfo();
		}
		facultyInfo += "Current number of departments is " + this.numberOfDepartments + ".\n" + divider;
		return facultyInfo;
	}
	
}

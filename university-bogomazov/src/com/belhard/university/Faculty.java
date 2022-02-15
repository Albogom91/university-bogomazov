package com.belhard.university;

import java.util.Objects;

import com.belhard.university.datastructures.*;

public class Faculty implements Identifiable{
	private static int counter = 0;
	private int id;
	private FacultyName name;
	private int numberOfDepartments;
	private Teacher facultyHead;
	private List<Department> departments = new DynamicArray<Department>();
	private final static int maxNumberOfDepartments = 20;
	
	public enum FacultyName{
		HUMANITIES_AND_SOCIAL_SCINENCES,
		NATURAL_SCIENCES,
	}
	
	public Faculty(FacultyName name) {
		super();
		id = ++counter;
		this.name = name;
	}
	
	@Override
	public int getId() {
		return id;
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
	
	public Teacher getFacultyHead() {
		return facultyHead;
	}
	
	public void setFacultyHead(Teacher teacher) {
		this.facultyHead = teacher;
	}
	
	public List<Department> getDepartments(){
		return departments;
	}
	
	public int getMaxNumberOfDepartments() {
		return maxNumberOfDepartments;
	}
	
	public int size() {
		return departments.size();
	}
	
	public boolean addDepartment(Department department) {
		boolean isAdded = false;
		if (containsDepartment(department)) {
			System.out.println(department.toString() + " is already in the faculty");
		} else {
		if (numberOfDepartments < maxNumberOfDepartments) {
			isAdded = departments.add(department);;
			numberOfDepartments = departments.size();
			}
		}
		numberOfDepartments = departments.size();
		return isAdded;
	}
	
	public boolean removeDepartment(Department department) {
		boolean isRemoved = departments.remove(department);
		numberOfDepartments = departments.size();
		return isRemoved;
	}
	
	public boolean containsDepartment(Department department) {
		boolean doesContain = departments.contains(department);
		return doesContain;
	}

	public Department getDepartment(int index) {
		if (index >= numberOfDepartments || index < 0) {
			System.out.println("Wrong index");
			return null;
		}
		Department department = (Department) departments.get(index);
		return department;
	}
	
	public Department[] toArrayDepartments() {
		Object[] temp = departments.toArray();
		Department[] departmentsArray = new Department[temp.length];
		for(int i = 0; i < temp.length; i++) {
			departmentsArray[i] = (Department) temp[i];
		}
		return departmentsArray;
	}
	
	public String getFacultyInfo() {
		String divider = "-----\n";
		String facultyInfo = divider + toString() + ".\n" + divider;
		DynamicArray<Department> tempDepartments = (DynamicArray<Department>) departments;
		if (facultyHead != null) {
			facultyInfo += "Faculty head: " + facultyHead.toString() + "\n" + divider;
		} else {
			facultyInfo += "Faculty head is currently unassigned.\n" + divider;
		}
		if (numberOfDepartments < 1) {
			facultyInfo += "Currently there are no departments in the faculty.\n" + divider;
		} else {
			facultyInfo += "Current departments in the faculty are:\n" + divider;
			facultyInfo += tempDepartments.getInfo() + divider;
		}
		facultyInfo += "Current number of departments is " + numberOfDepartments + ".\n" + divider;
		return facultyInfo;
	}
	
	@Override
	public String toString() {
		String name = getClass().getSimpleName() + " of " + this.name.toString().toLowerCase() + "(id#" + id + ")";
		return name;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		Faculty other = (Faculty) obj;
		return id == other.id 
				&& Objects.equals(name, other.name)
				&& numberOfDepartments == other.numberOfDepartments 
				&& facultyHead.equals(other.facultyHead);

	}

	@Override
	public int hashCode() {
		int result = id;
		result = 37 * result + (name == null ? 0 : name.hashCode());
		result = 37 * result + numberOfDepartments;
		result = 37 * result + (facultyHead == null ? 0 : facultyHead.hashCode());
		return result;
	}
}

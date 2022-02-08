package com.belhard.university;

import java.util.Objects;

import com.belhard.university.datastructures.DynamicArray;

public class Department implements Identifiable {
	private static int counter = 0;
	private int id;
	private DepName name;
	private Teacher depHead;
	private Teacher depAssistHead;
	private Cleaner cleaner;
	private int numberOfTeachers;
	private DynamicArray teachers = new DynamicArray();
	private final static int maxNumberOfTeachers = 10;
	
	public enum DepName{
		MATH_AND_PHYSICS,
		CHEMESTRY,
		HISTORY_AND_LITERATURE,
	}
	
	public Department(DepName name) {
		super();
		id = ++counter;
		this.name = name;
	}
	
	@Override
	public int getId() {
		return id;
	}
	
	public DepName getName(){
		return name;
	}
	
	public void setName(DepName name) {
		this.name = name;
	}
	
	public Teacher getDepHead() {
		return depHead;
	}
	
	public void setDepHead(Teacher teacher) {
		this.depHead = teacher;
	}
	
	public Teacher getDepAssistHead() {
		return depAssistHead;
	}
	
	public void setDepAssistHead(Teacher teacher) {
		this.depAssistHead = teacher;
	}
	
	public Cleaner getCleaner() {
		return cleaner;
	}
	
	public void setCleaner(Cleaner cleaner) {
		this.cleaner = cleaner;
	}
	
	public int getNumberOfTeachers() {
		return numberOfTeachers;
	}
	
	public DynamicArray getTeachers(){
		return teachers;
	}
	
	public int getMaxNumberOfTeachers() {
		return maxNumberOfTeachers;
	}
	
	public int size() {
		return teachers.getNumberOfInstances();
	}

	public boolean addTeacher(Teacher teacher) {
		boolean isAdded = false;
		if (containsTeacher(teacher)) {
			System.out.println(teacher.toString() + " is already in the department");
		} else {
		if (numberOfTeachers < maxNumberOfTeachers) {
			isAdded = teachers.add(teacher);
			numberOfTeachers = teachers.getNumberOfInstances();
			}
		}
		return isAdded;
	}
	
	public boolean removeTeacher(Teacher teacher) {
		boolean isRemoved = teachers.remove(teacher);
		numberOfTeachers = teachers.getNumberOfInstances();
		return isRemoved;
	}
	
	public boolean containsTeacher(Teacher teacher) {
		boolean doesContain = teachers.contains(teacher);
		if(!doesContain) {
			if(depHead != null && depHead.equals(teacher)) {
				doesContain = true;
			}
			if(depAssistHead != null && depAssistHead.equals(teacher)) {
				doesContain = true;
			}
		}
		return doesContain;
	}

	public Teacher getTeacher(int index) {
		if (index >= numberOfTeachers || index < 0) {
			System.out.println("Wrong index");
			return null;
		}
		Teacher teacher = (Teacher) teachers.get(index);
		return teacher;
	}
	
	public Teacher[] toArrayTeachers() {
		Object[] temp = teachers.toArray();
		Teacher[] teachersArray = new Teacher[temp.length];
		for(int i = 0; i < temp.length; i++) {
			teachersArray[i] = (Teacher) temp[i];
		}
		return teachersArray;
	}
	
	public String getDepInfo() {
		String divider = "-----\n";
		String depInfo = divider + toString() + ".\n" + divider;
		if (depHead != null) {
			depInfo += "Department head: " + depHead.toString() + "\n" + divider;
		} else {
			depInfo += "Department head is currently unassigned.\n" + divider;
		}
		if (depAssistHead != null) {
			depInfo += "Department head assistant: " + depAssistHead.toString() + "\n" + divider;
		} else {
			depInfo += "Department head assistant is currently unassigned.\n" + divider;
		}
		if (numberOfTeachers < 1) {
			depInfo += "Currently there are no teachers in the department.\n" + divider;
		} else {
			depInfo += "Current teachers in the department are:\n" + divider;
			depInfo += teachers.getInfo() + divider;
		}
		depInfo += "Number of teachers: " + numberOfTeachers + ".\n" + divider;
		depInfo += "Currently " + (maxNumberOfTeachers - numberOfTeachers) + " teachers needed to complete department.\n" + divider;
		if (cleaner != null) {
			depInfo += "Cleaner: " + cleaner.toString() + "\n" + divider;
		} else {
			depInfo += "Cleaner is currently unassigned.\n" + divider;
		}
		return depInfo;
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
		Department other = (Department) obj;
		return id == other.id 
				&& Objects.equals(name, other.name)
				&& numberOfTeachers == other.numberOfTeachers 
				&& depHead.equals(other.depHead)
				&& depAssistHead.equals(other.depAssistHead)
				&& cleaner.equals(other.cleaner);

	}

	@Override
	public int hashCode() {
		int result = id;
		result = 31 * result + (name == null ? 0 : name.hashCode());
		result = 31 * result + numberOfTeachers;
		result = 31 * result + (depHead == null ? 0 : depHead.hashCode());
		result = 31 * result + (depAssistHead == null ? 0 : depAssistHead.hashCode());
		result = 31 * result + (cleaner == null ? 0 : cleaner.hashCode());
		return result;
	}
}

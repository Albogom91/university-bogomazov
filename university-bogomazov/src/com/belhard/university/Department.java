package com.belhard.university;

public class Department extends Collective {
	private DepName name;
	private Teacher depHead;
	private Teacher depAssistHead;
	private Cleaner cleaner;
	private int numberOfTeachers;
	
	public enum DepName{
		MATH_AND_PHYSICS,
		CHEMESTRY,
		HISTORY_AND_LITERATURE,
	}
	
	public Department(DepName name) {
		super();
		this.name = name;
	}
	
	public DepName getDepName(){
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

	public boolean addTeacher(Teacher teacher) {
		boolean isAdded = this.addInstance(teacher);
		return isAdded;
	}
	
	public boolean removeTeacher(Teacher teacher) {
		boolean isRemoved = this.removeInstance(teacher);
		return isRemoved;
	}
	
	public String getDepInfo() {
		String divider = "-----\n";
		this.numberOfTeachers = this.getNumberOfInstances();
		String depInfo = divider + "Department of " + getDepName() + ".\n" + divider;
		if (depHead != null) {
			depInfo += "Department head: " + depHead.getBriefPersonInfo() + "\n" + divider;
		} else {
			depInfo += "Department head is currently unassigned.\n" + divider;
		}
		if (depAssistHead != null) {
			depInfo += "Department head assistant: " + depAssistHead.getBriefPersonInfo() + "\n" + divider;
		} else {
			depInfo += "Department head assistant is currently unassigned.\n" + divider;
		}
		if (numberOfTeachers < 1) {
			depInfo += "Currently there are no teachers in the department.\n" + divider;
		} else {
			depInfo += "Current teachers in the department are:\n" + divider;
			depInfo += this.getCollectiveInfo();
		}
		depInfo += "Number of teachers: " + numberOfTeachers + ".\n" + divider;
		depInfo += "Currently " + (this.getInstances().length - numberOfTeachers) + " teachers needed to complete department.\n" + divider;
		if (cleaner != null) {
			depInfo += "Cleaner: " + cleaner.getBriefPersonInfo() + "\n" + divider;
		} else {
			depInfo += "Cleaner is currently unassigned.\n" + divider;
		}
		return depInfo;
	}
	
}

package com.belhard.university;

public class Faculty {
	private String name;
	private int numberOfDepartments;
	private final Group[] groups = new Group[10];
	private int numberOfGroups;
	
	public Faculty(String name) {
		this.name = name;
	}
	
	public String getName(){
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getNumberOfDepartments() {
		return numberOfDepartments;
	}
	
	public Group[] getGroups() {
		return groups;
	}
	
	public int getNumberOfGroups() {
		return numberOfGroups;
	}
	
	public boolean addGroup(Group group) {
		boolean isAdded = false;
		if (numberOfGroups < groups.length) {
			groups[numberOfGroups++] = group;
			isAdded = true;
		}
		return isAdded;
	}

	public boolean removeGroup(Group group) {
		boolean isRemoved = false;
		for (int i = 0; i < numberOfGroups; i++) {
			if (this.groups[i].getNumber() == group.getNumber()) {
				isRemoved = true;
				if (i == numberOfGroups - 1) {
					this.groups[i] = null;
				} else {
					while (i < numberOfGroups - 1) {
						this.groups[i] = this.groups[i + 1];
						i++;
					}
					groups[numberOfGroups - 1] = null;
					break;
				}
			}
		}
		if (isRemoved) {
			numberOfGroups--;
		}
		return isRemoved;
	}
}

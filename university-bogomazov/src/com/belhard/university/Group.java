package com.belhard.university;

public class Group extends Collective {
	private int number;
	private Teacher teacher;
	private int numberOfStudents;
	private int studyYear;

	public Group(int number) {
		super();
		this.number = number;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public Teacher getTeacher() {
		return teacher;
	}

	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}
	
	public int getNumberOfStudents() {
		return numberOfStudents;
	}
	
	public int getStudyYear() {
		return studyYear;
	}
	
	public void setStudyYear(int studyYear) {
		if (studyYear > 0 && studyYear < 7) {
			this.studyYear = studyYear;
		}
	}
	
	public boolean addStudent(Student student) {
		boolean isAdded = this.addInstance(student);
		return isAdded;
	}
	
	public boolean removeStudent(Student student) {
		boolean isRemoved = this.removeInstance(student);
		return isRemoved;
	}
	
	public String getGroupInfo() {
		String divider = "-----\n";
		this.numberOfStudents = this.getNumberOfInstances();
		String groupInfo = divider + "Group #" + number + ".\n" + divider;
		if (teacher != null) {
			groupInfo += teacher.getBriefPersonInfo() + "\n" + divider;
		} else {
			groupInfo += "Teacher is currently unassigned.\n" + divider;
		}
		if (numberOfStudents < 1) {
			groupInfo += "Currently there are no students in the group.\n" + divider;
		} else {
			groupInfo += "Current students in the group are:\n" + divider;
			groupInfo += this.getCollectiveInfo();
		}
		groupInfo += "Number of students: " + numberOfStudents + ".\n" + divider;
		groupInfo += "Currently there are " + (this.getInstances().length - numberOfStudents) + " places left in the group.\n" + divider;
		return groupInfo;
	}
}
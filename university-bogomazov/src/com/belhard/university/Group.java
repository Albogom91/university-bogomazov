package com.belhard.university;

public class Group {
	private int number;
	private final Student[] students = new Student[8];
	private Teacher teacher;
	private int numberOfStudents;
	private int studyYear;

	public Group(int number) {
		this.number = number;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}
	
	public Student[] getStudents() {
		return students;
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
		boolean isAdded = false;
		if (numberOfStudents < students.length) {
			students[numberOfStudents++] = student;
			isAdded = true;
		}
		return isAdded;
	}

	public boolean removeStudent(Student student) {
		boolean isRemoved = false;
		for (int i = 0; i < numberOfStudents; i++) {
			if (this.students[i].getId() == student.getId()) {
				isRemoved = true;
				if (i == numberOfStudents - 1) {
					this.students[i] = null;
				} else {
					while (i < numberOfStudents - 1) {
						this.students[i] = this.students[i + 1];
						i++;
					}
					students[numberOfStudents - 1] = null;
					break;
				}
			}
		}
		if (isRemoved) {
			numberOfStudents--;
		}
		return isRemoved;
	}

	public String getGroupInfo() {
		String divider = "-----\n";
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
			for (int i = 0; i < numberOfStudents; i++) {
				groupInfo += students[i].getBriefPersonInfo() + "\n" + divider;
			}
		}
		groupInfo += "Number of students: " + numberOfStudents + ".\n" + divider;
		groupInfo += "Currently there are " + (students.length - numberOfStudents) + " places left in the group.\n" + divider;
		return groupInfo;
	}
}
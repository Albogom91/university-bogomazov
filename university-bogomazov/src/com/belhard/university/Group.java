package com.belhard.university;

import com.belhard.university.datastructures.DynamicArray;

public class Group implements Identifiable {
	private static int counter = 0;
	private int id;
	private int number;
	private Teacher teacher;
	private int numberOfStudents;
	private DynamicArray students = new DynamicArray();
	private final static int maxNumberOfStudents = 8;

	public Group(int number) {
		super();
		id = ++counter;
		this.number = number;
	}

	@Override
	public int getId() {
		return id;
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

	public int getMaxNumberOfStudents() {
		return maxNumberOfStudents;
	}

	public DynamicArray getStudents() {
		return students;
	}

	public int size() {
		return students.getNumberOfInstances();
	}

	public boolean addStudent(Student student) {
		boolean isAdded = false;
		if (containsStudent(student)) {
			System.out.println(student.toString() + " is already in the group");
		} else {
			if (numberOfStudents < maxNumberOfStudents) {
				isAdded = students.add(student);
				numberOfStudents = students.getNumberOfInstances();
			}
		}
		return isAdded;
	}

	public boolean removeStudent(Student student) {
		boolean isRemoved = students.remove(student);
		numberOfStudents = students.getNumberOfInstances();
		return isRemoved;
	}

	public boolean containsStudent(Student student) {
		boolean doesContain = students.contains(student);
		return doesContain;
	}

	public Student getStudent(int index) {
		if (index >= numberOfStudents || index < 0) {
			System.out.println("Wrong index");
			return null;
		}
		Student student = (Student) students.get(index);
		return student;
	}

	public Student[] toArrayStudents() {
		Object[] temp = students.toArray();
		Student[] studentsArray = new Student[temp.length];
		for (int i = 0; i < temp.length; i++) {
			studentsArray[i] = (Student) temp[i];
		}
		return studentsArray;
	}

	public String getGroupInfo() {
		String divider = "-----\n";
		String groupInfo = divider + toString() + ".\n" + divider;
		if (teacher != null) {
			groupInfo += teacher.toString() + "\n" + divider;
		} else {
			groupInfo += "Teacher is currently unassigned.\n" + divider;
		}
		if (numberOfStudents < 1) {
			groupInfo += "Currently there are no students in the group.\n" + divider;
		} else {
			groupInfo += "Current students in the group are:\n" + divider;
			groupInfo += students.getInfo() + divider;
		}
		groupInfo += "Number of students: " + numberOfStudents + ".\n" + divider;
		groupInfo += "Currently there are " + (maxNumberOfStudents - numberOfStudents) + " places left in the group.\n" + divider;
		return groupInfo;
	}

	@Override
	public String toString() {
		String name = getClass().getSimpleName() + " #" + number + "(id#" + id + ")";
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
		Group other = (Group) obj;
		return id == other.id 
				&& number == other.number 
				&& numberOfStudents == other.numberOfStudents
				&& teacher.equals(other.teacher);
	}

	@Override
	public int hashCode() {
		int result = id;
		result = 29 * result + number;
		result = 29 * result + numberOfStudents;
		result = 29 * result + (teacher == null ? 0 : teacher.hashCode());
		return result;
	}
}
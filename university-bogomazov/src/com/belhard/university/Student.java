package com.belhard.university;

import java.util.Objects;

public class Student extends Person implements Identifiable{
	private int studyYear;
	private double academicRecord;
	
	public Student(String firstName, String lastName) {
		super(firstName, lastName);
	}
	
	public Student(String firstName, String patronymicName, String lastName) {
		super(firstName, patronymicName, lastName);
	}
	
	public int getStudyYear() {
		return studyYear;
	}
	
	public void setStudyYear(int studyYear) {
		if (studyYear > 0 && studyYear < 7) {
			this.studyYear = studyYear;
		}
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
	
	@Override
	public String introduceYourself() {
		String introInfo = "My name is ";
		introInfo += getFirstName() + " " + getLastName() + ", ";
		introInfo += "I am " + getClass().getSimpleName().toLowerCase() + ", ";
		introInfo += "this is my " + getStudyYear() + " year in the University, ";
		introInfo += "my academic record is " + getAcademicRecord() + ".\n";
		return introInfo;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(this == obj) {
			return true;
		}
		if(obj == null) {
			return false;
		}
		if(getClass() != obj.getClass()) {
			return false;
		}
		Student other = (Student) obj;
		return getId() == other.getId()
				&& getAge() == other.getAge()
			    && Objects.equals(getFirstName(), other.getFirstName())
			    && Objects.equals(getLastName(), other.getLastName())
				&& studyYear == other.studyYear;
	}
	
	@Override
	public int hashCode() {
		int result = getId();
		result = 17 * result + getAge();
		result = 17 * result + (getFirstName() == null ? 0 : getFirstName().hashCode());
		result = 17 * result + (getLastName() == null ? 0 : getLastName().hashCode());
		result = 17 * result + studyYear;
		return result;
	}
}
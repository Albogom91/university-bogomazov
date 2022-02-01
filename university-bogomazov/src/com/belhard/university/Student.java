package com.belhard.university;

import java.util.Date;

public class Student {
	private static int counter = 0;
	private int id;
	private String firstName;
	private String lastName;
	private String patronymicName;
	private Date dateOfBirth;
	private int age;
	private Address address;
	private double academicRecord;
	

	public Student(String firstName, String lastName) {
		id = ++counter;
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	public Student(String firstName, String patronymicName, String lastName) {
		this(firstName, lastName);
		this.patronymicName = patronymicName;
	}
	
	public int getId() {
		return id;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String getPatronymicName() {
		return patronymicName;
	}
	
	public void setPatronymicName(String patronymicName) {
		this.patronymicName = patronymicName;
	}
	
	public Date getDateOfBirth() {
		return dateOfBirth;
	}
	
	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		if (age > 7 && age < 130) {
			this.age = age;
		}
	}
	
	public Address getAddress() {
		return address;
	}
	
	public void setAddress(Address address) {
		this.address = address;
	}
	
	public double getAcademicRecord() {
		return academicRecord;
	}
	
	public void setAcademicRecord(double academicRecord) {
		if (academicRecord > 0 && academicRecord <= 10) {
			this.academicRecord = academicRecord;
		}
	}
	
	public String getShortStudentInfo() {
		String ShortInfo = "Student id: " + id + "; " + firstName + " ";
		if (patronymicName != null) {
			ShortInfo += patronymicName + " ";
		}
		ShortInfo +=lastName + ".";
		return ShortInfo;
		
	}
	
}
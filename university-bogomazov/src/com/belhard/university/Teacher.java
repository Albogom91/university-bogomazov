package com.belhard.university;

import java.util.Date;

public class Teacher {
	private static int counter = 0;
	private int id;
	private String firstName;
	private String lastName;
	private String patronymicName;
	private Date dateOfBirth;
	private int age;
	private Address address;
	String discipline;
	String rank;
	

	public Teacher(String firstName, String lastName) {
		id = ++counter;
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	public Teacher(String firstName, String lastName, String patronymicName) {
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
		if (age > 18 && age < 130) {
			this.age = age;
		}
	}
	
	public Address getAddress() {
		return address;
	}
	
	public void setAddress(Address address) {
		this.address = address;
	}
	
	public String getDiscipline() {
		return discipline;
	}
	
	public void setDiscipline(String discipline) {
		this.discipline = discipline;
	}
	
	public String getRank() {
		return rank;
	}
	
	public void setRank(String rank) {
		this.rank = rank;
	}
	
	public String getShortTeacherInfo() {
		String ShortInfo = "Teacher id: " + id + "; " + firstName + " ";
		if (patronymicName != null) {
			ShortInfo += patronymicName + " ";
		}
		ShortInfo +=lastName + ".";
		return ShortInfo;
		
	}
	
}


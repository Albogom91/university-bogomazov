package com.belhard.university;

import java.util.Objects;

public class Teacher extends Employee implements Identifiable{
	private Discipline discipline;
	private Rank rank;
	private boolean phD;
	
	public enum Discipline{
		MATH,
		PHYSICS,
		CHEMESTRY,
		HISTORY,
		LITERATURE,
	}
	
	public enum Rank{
		PROFESSOR,
		ASSOCIATE_PROFESSOR,
		ASSISTANT_PROFESSOR,
	}

	public Teacher(String firstName, String lastName) {
		super(firstName, lastName);
	}
	
	public Teacher(String firstName, String patronymicName, String lastName) {
		super(firstName, patronymicName, lastName);
	}
	
	@Override
	public int getId() {
		return super.getId();
	}
		
	public Discipline getDiscipline() {
		return discipline;
	}
	
	public void setDiscipline(Discipline discipline) {
		this.discipline = discipline;
	}
	
	public Rank getRank() {
		return rank;
	}
	
	public void setRank(Rank rank) {
		this.rank = rank;
	}
	
	public boolean getPhD() {
		return phD;
	}
	
	public void setPhD(boolean phD) {
		this.phD = phD;
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
		introInfo += "I teach " + getDiscipline().toString().toLowerCase();
		if(getPhD()) {
			introInfo += ", I have doctoral degree.\n";
		}
		else {
			introInfo += ".\n";
		}
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
		Teacher other = (Teacher) obj;
		return getId() == other.getId()
				&& getAge() == other.getAge()
				&& Objects.equals(getFirstName(), other.getFirstName())
				&& Objects.equals(getLastName(), other.getLastName())
				&& Objects.equals(discipline, other.discipline);
	}
	
	@Override
	public int hashCode() {
		int result = getId();
		result = 19 * result + getAge();
		result = 19 * result + (getFirstName() == null ? 0 : getFirstName().hashCode());
		result = 19 * result + (getLastName() == null ? 0 : getLastName().hashCode());
		result = 19 * result + (getLastName() == null ? 0 : getLastName().hashCode());
		result = 19 * result + (discipline == null ? 0 : discipline.hashCode());
		return result;
	}
	
}


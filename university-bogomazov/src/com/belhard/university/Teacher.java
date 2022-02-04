package com.belhard.university;

public class Teacher extends Employee {
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
	
}


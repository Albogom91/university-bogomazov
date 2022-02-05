package com.belhard.university;

public class Collective {
	private int numberOfPersons;
	private static int collectiveSize;
	private Person[] persons = new Person[collectiveSize];
	
	public Collective(){
		
	}
	
	public int getNumberOfPersons() {
		return numberOfPersons;
	}
	
	public int getCollectiveSize() {
		return collectiveSize;
	}
	
	public static void setCollectiveSize(int collectiveSize) {
		if(collectiveSize > 0) {
			Collective.collectiveSize = collectiveSize;
		}
	}
	
	public Person[] getPersons() {
		return persons;
	}
	
	public boolean addPerson(Person person) {
		boolean isAdded = false;
		if (numberOfPersons < persons.length) {
			persons[numberOfPersons++] = person;
			isAdded = true;
		}
		return isAdded;
	}

	public boolean removePerson(Person person) {
		boolean isRemoved = false;
		for (int i = 0; i < numberOfPersons; i++) {
			if (this.persons[i].getId() == person.getId()) {
				isRemoved = true;
				if (i == numberOfPersons - 1) {
					this.persons[i] = null;
				} else {
					while (i < numberOfPersons - 1) {
						this.persons[i] = this.persons[i + 1];
						i++;
					}
					persons[numberOfPersons - 1] = null;
					break;
				}
			}
		}
		if (isRemoved) {
			numberOfPersons--;
		}
		return isRemoved;
	}
	
	public String getCollectiveInfo() {
		String divider = "-----\n";
		String collectiveInfo = new String();
		for (int i = 0; i < numberOfPersons; i++) {
			collectiveInfo += persons[i].getBriefPersonInfo() + "\n" + divider;
		}
		return collectiveInfo;
	}
}

package com.belhard.university;

public class Collective {
	private int numberOfInstances;
	private static int collectiveSize;
	private Object[] instances = new Object[collectiveSize];
	
	public Collective(){
		
	}
	
	public int getNumberOfInstances() {
		return numberOfInstances;
	}
	
	public int getCollectiveSize() {
		return collectiveSize;
	}
	
	public static void setCollectiveSize(int collectiveSize) {
		if(collectiveSize > 0) {
			Collective.collectiveSize = collectiveSize;
		}
	}
	
	public Object[] getInstances() {
		return instances;
	}
	
	public boolean addInstance(Object o) {
		boolean isAdded = false;
		if (numberOfInstances < instances.length) {
			instances[numberOfInstances++] = o;
			isAdded = true;
		}
		return isAdded;
	}

	public boolean removeInstance(Object o) {
		boolean isRemoved = false;
		for (int i = 0; i < numberOfInstances; i++) {
			if (this.instances[i].equals(o)) {
				isRemoved = true;
				if (i == numberOfInstances - 1) {
					this.instances[i] = null;
				} else {
					while (i < numberOfInstances - 1) {
						this.instances[i] = this.instances[i + 1];
						i++;
					}
					instances[numberOfInstances - 1] = null;
					break;
				}
			}
		}
		if (isRemoved) {
			numberOfInstances--;
		}
		return isRemoved;
	}
	
	public String getCollectiveInfo() {
		String divider = "-----\n";
		String collectiveInfo = new String();
		for (int i = 0; i < numberOfInstances; i++) {
			if(this.instances[i] instanceof Person) {
				Person temp = (Person) this.instances[i];
				collectiveInfo += temp.getBriefPersonInfo() + "\n" + divider;
			}
			else if(this.instances[i] instanceof Collective) {
				String className = this.instances[i].getClass().getSimpleName();
				switch (className) {
				case ("Group"):
					Group g = (Group) this.instances[i];
					collectiveInfo += className + " #" + g.getNumber() + "\n" + divider;
					break;
				case ("Department"):
					Department d = (Department) this.instances[i];
					collectiveInfo += className + " of " + d.getDepName() + "\n" + divider;
					break;
				default:
					break;
				}
			}
		}
		return collectiveInfo;
	}
}

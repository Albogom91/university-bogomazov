package com.belhard.university.datastructures;

public class DynamicArray implements List {
	private int numberOfInstances;
	private static final int size = 5;
	private Object[] instances = new Object[size];

	public DynamicArray() {
		super();
	}

	public int getNumberOfInstances() {
		return numberOfInstances;
	}

	public int getSize() {
		return size;
	}

	public Object[] getInstances() {
		return instances;
	}
	
	@Override
	public int size() {
		return numberOfInstances;
	}

	@Override
	public boolean add(Object obj) {
		boolean isAdded = false;
		if (numberOfInstances < instances.length) {
			instances[numberOfInstances++] = obj;
			isAdded = true;
		}
		else {if(numberOfInstances == instances.length) {
			Object[] newInstances = new Object[instances.length + 1];
			for(int i = 0; i < instances.length; i++) {
				newInstances[i] = instances[i];
			}
			newInstances[numberOfInstances++] = obj;
			instances = newInstances;
			isAdded = true;
			}
		}
		return isAdded;
	}

	@Override
	public boolean remove(Object obj) {
		boolean isRemoved = false;
		for (int i = 0; i < numberOfInstances; i++) {
			if (this.instances[i].equals(obj)) {
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
	
	@Override
	public boolean contains(Object obj) {
		boolean doesContain = false;
		for(int i = 0; i < numberOfInstances; i++) {
			if(instances[i].equals(obj)) {
				doesContain = true;
				break;
			}
		}
		return doesContain;
	}
	
	@Override
	public Object get(int index) {
		return instances[index];
	}
	
	@Override
	public Object[] toArray() {
		Object[] temp = new Object[numberOfInstances];
		for(int i = 0; i < temp.length; i++) {
			temp[i] = instances[i];
		}
		return temp;
	}
	
	@Override
	public String getInfo() {
		String showInfo = new String();
		for(int i = 0; i < numberOfInstances; i++) {
			showInfo += instances[i].toString() + "\n";
		}
		return showInfo;
	}
}

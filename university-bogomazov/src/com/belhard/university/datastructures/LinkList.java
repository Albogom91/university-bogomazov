package com.belhard.university.datastructures;

public interface LinkList<E> {
	void addNode(E obj);
	void removeNode(E obj);
	int getIndexInList(E obj);
	int getListLength();
	boolean containsObjectInList(E obj);
	void displayList();
	Object[] getListToArray();
}

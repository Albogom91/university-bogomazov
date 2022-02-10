package com.belhard.university.datastructures;

public class LinkedList {
	
	private String name;
	
	public LinkedList(String name) {
		super();
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	class Node {
		Object obj;
		Node next;

		public Node(Object obj) {
			this.obj = obj;
			next = null;
		}
	}

	private Node head = null;
	private Node tail = null;

	public void addNode(Object obj) {
		Node newNode = new Node(obj);
		if (head == null) {
			head = newNode;
			tail = newNode;
		}
		else {
			tail.next = newNode;
			tail = newNode;
		}
	}
	
	public void removeNode(Object obj) {
		int index = getIndexInList(obj);
		if(index < 0) {
			return;
		}
		Node current = head;
		int count = 0;
		if(current == null) {
			System.out.println("List is empty! Nothing to remove!");
			return;
		}
		if(index == 0) {
			head = head.next;
		}
		while(current != null) {
			if(count == index - 1) {
				Node temp = current;
				current = current.next;
				temp.next = current.next;
				break;
			}
			count++;
			current = current.next;
		}
	}
	
	public int getIndexInList(Object obj) {
		int index = 0;
		Node current = head;
		boolean doesContain = false;
		while(current != null) {
			if(current.obj.equals(obj)) {
				doesContain = true;
				break;
			}
			current = current.next;
			index++;
		}
		if(!doesContain) {
			index = -1;
			System.out.println("No such object in the list!");
		}
		return index;
	}
	
	public int getListLength() {
		int length = 0;
		Node current = head;
		while(current != null) {
			current = current.next;
			length++;
		}
		return length;
	}
	
	public boolean containsObjectInList(Object obj) {
		Node current = head;
		boolean doesContain = false;
		while(current != null) {
			if(current.obj.equals(obj)) {
				doesContain = true;
				break;
			}
			current = current.next;
		}
		return doesContain;
	}
	
	public void displayList() {
		Node current = head;
		if(current == null) {
			System.out.println("List is empty!");
			return;
		}
		System.out.println("Current nodes in " + getName() + " are:");
		while(current != null) {
			System.out.println(current.obj.toString());
			current = current.next;
		}
		System.out.println();
	}
	
	public Object[] getListToArray() {
		int length = getListLength();
		int count = 0;
		Node current = head;
		if(length == 0) {
			return null;
		}
		Object[] objects = new Object[length];
		while(current != null) {
			objects[count++] = current.obj;
			current = current.next;
		}
		return objects;
	}

}

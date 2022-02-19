package com.belhard.university.exceptions;

public class IllegalSalary extends RuntimeException {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -5225893600339890588L;

	public IllegalSalary(String message) {
		super(message);
	}
}

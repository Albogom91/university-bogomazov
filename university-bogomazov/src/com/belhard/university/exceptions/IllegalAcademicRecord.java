package com.belhard.university.exceptions;

public class IllegalAcademicRecord extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = -634488647050372107L;
	
	public IllegalAcademicRecord (String message) {
		super(message);
	}
}

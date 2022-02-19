package com.belhard.university.exceptions;

public class IllegalStudyYear extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7360832662226020516L;
	
	public IllegalStudyYear(String message) {
		super(message);
	}
}

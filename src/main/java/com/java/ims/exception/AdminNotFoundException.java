package com.java.ims.exception;

public class AdminNotFoundException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public AdminNotFoundException(String message)
	{
		super(message);
		System.out.println(message);
	}
	
}

package com.xicaum59.desafio3.exceptions;

public class ResourceNotFoundException extends RuntimeException {
	
	private static final long serialVersionUID =  1L;
	
	public ResourceNotFoundException(String msg) {
		super(msg);
	}

}

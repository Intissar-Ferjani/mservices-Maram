package com.intissar.demo.service.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.BAD_REQUEST)
public class EmailAlreadyExistsException extends Exception {

	private String message;

	public EmailAlreadyExistsException(String message) {
		super(message);
	}
	
	
	
	
}

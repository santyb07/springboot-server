package com.tcs.bill.config;

public class NoBillFoundException extends RuntimeException {
	
	public NoBillFoundException(String message) {
		super(message);
	}

}

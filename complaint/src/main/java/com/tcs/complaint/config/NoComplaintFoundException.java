package com.tcs.complaint.config;

public class NoComplaintFoundException  extends RuntimeException {
	public NoComplaintFoundException(String message) {
		super(message);
	}
}

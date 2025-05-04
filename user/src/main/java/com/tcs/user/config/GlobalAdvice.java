package com.tcs.user.config;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalAdvice {
	
	@ExceptionHandler(NoUserFoundException.class)
	public ResponseEntity<Map<String,String>>NoUserFoundException(NoUserFoundException e){
		Map<String,String> output = new HashMap<String,String>();
		output.put("message", e.getMessage());
		output.put("date", new Date().toString());
		
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(output);
		
	}

}

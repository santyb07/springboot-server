package com.tcs.bill.config;

import java.util.Map;
import java.util.*;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalAdvice {
	
	public ResponseEntity<Map<String,String>>NoBillFoundException(NoBillFoundException e){
		Map<String,String> res = new HashMap<String,String>();
		res.put("message", e.getMessage());
		res.put("date", new Date().toString());
		
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(res);
		
	}

}

package com.tcs.user.service;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.tcs.user.model.Complaint;
import com.tcs.user.model.User;

@FeignClient(name="COMPLAINT",url="http://localhost:8200")//port address of complaint
public interface ComplaintService {
		
//		@GetMapping("/complaint/{id}")
//		public List<Complaint> getUserById(@PathVariable("id") String id);
		
		@GetMapping("/complaint-userId/{id}")
		public List<Complaint> getUserById(@PathVariable("id") String id);

		
	}

package com.tcs.user.service;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.tcs.user.model.Bill;

@FeignClient(name="BILL",url="http://localhost:8100")//port address of bill
public interface BillService {
	
	@GetMapping("/bill/{id}")
	public List<Bill> getUserById(@PathVariable("id") String id);
	
	
}

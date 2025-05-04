package com.tcs.bill.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tcs.bill.model.Bill;

@Repository
public interface BillRepository extends JpaRepository<Bill, Integer>{
	
	//fetchBillby user id
	public List<Bill> findByUserId(String id);
	
	
	//fetch amount less than certain amount
//	public List<Bill> findByAmountLessThan(int amount);

}

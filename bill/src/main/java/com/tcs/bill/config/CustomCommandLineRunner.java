package com.tcs.bill.config;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.tcs.bill.model.Bill;
import com.tcs.bill.service.BillService;


@Component
public class CustomCommandLineRunner implements CommandLineRunner {
	
	Logger logger = LoggerFactory.getLogger(getClass());
	
	@Autowired
	BillService billservice;

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		logger.info("***********************************************");
		logger.info("CommandLineRunner is working");
		logger.debug("hi this an error at the debug level");
		
//		Bill bill1 = new Bill(1,"Bill1","1",1300);
//		Bill bill2=new Bill(2,"Bill2","2",1500);
//		Bill bill3=new Bill(3,"Bill3","3",1200);
		
//		this.billservice.Save(bill1);
//		this.billservice.Save(bill2);
//		this.billservice.Save(bill3);
		
		logger.debug("all the bills are saved");
		
		logger.info("***********************************************");
		
		//1/ read
		
		logger.debug("using findAll");
		List<Bill> bills = this.billservice.get();
		logger.debug("{}",bills);
		
		logger.info("***********************************************");
		
		logger.debug("using findById");
		Bill res = this.billservice.get(1);
		logger.debug("{}",res);
				
		logger.info("***********************************************");
		
		
		
		
		
	}

}

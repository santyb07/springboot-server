package com.tcs.user.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.tcs.user.model.User;
import com.tcs.user.service.UserService;

@Component
public class CustomCommandLineRunner implements CommandLineRunner{
	
	Logger logger = LoggerFactory.getLogger(getClass());
	
	@Autowired
	private UserService userService;

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		logger.debug("************************************");
		logger.info("CommandLin Runner for user ");
		
//		User user1 = new User("Jay","1234567890","add1");
//		User user2 = new User("Shubham","1234567890","add2");
//		User user3 = new User("Khushboo","1234567890","add3");
		
//		this.userService.save(user1);
//		this.userService.save(user2);
//		this.userService.save(user3);
		
		logger.debug("Values are added successfully");
		
		logger.debug("************************************");
		
		logger.debug("User:{}" , this.userService.get());
		
//		this.userService.getBill(2);
		
		logger.debug("************************************");
		
	}

}

package com.springboot.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.springboot.Entity.User;
import com.springboot.dao.UserRepository;

@SpringBootApplication
public class SpringbootjpaApplication {

	public static void main(String[] args) {
		
		ApplicationContext context = SpringApplication.run(SpringbootjpaApplication.class, args);
		
		UserRepository UserRepository = context.getBean(UserRepository.class);
		User user = new User();
		user.setName("Samyak");
		user.setCity("Hansi");
		user.setStatus("I am Java Developer");
		
		User user2 = new User();
		user2.setName("Dhruv Gupta");
		user2.setCity("Delhi");
		user2.setStatus("I am Python Developer");
		
		UserRepository.save(user2);
	}
	

}

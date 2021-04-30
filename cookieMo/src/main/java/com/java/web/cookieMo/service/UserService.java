package com.java.web.cookieMo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.java.web.cookieMo.model.User;
import com.java.web.cookieMo.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepository;
	
	public User validateUserAndPassword(User user) {
		
		boolean validated = false;
		User validatedUser = userRepository.findByUserName(user.getUserName());
		
		if(validatedUser != null && validatedUser.getPassword().equals(user.getPassword())) {
			return validatedUser;
		}
		return validatedUser;
	}
	
	public User createUser(User user) {
		
		User savedUser = userRepository.save(user);
		return savedUser;
	}
	
}

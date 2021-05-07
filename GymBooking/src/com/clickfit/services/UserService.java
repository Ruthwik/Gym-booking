package com.clickfit.services;

import java.util.HashMap;
import java.util.UUID;

import com.clickfit.model.User;

public class UserService {

	private HashMap<String, User> users = new HashMap<>();
	
	public User register(String firstName, String lastName,String email) {
		String userId = UUID.randomUUID().toString();
		User user = new User(userId, firstName, lastName, email);
		users.put(userId,user);
		return user;
	}
	
	public void deRegister(String userId) {
		users.remove(userId);
	}
}

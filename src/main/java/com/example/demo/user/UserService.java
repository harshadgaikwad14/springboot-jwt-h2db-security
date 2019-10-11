package com.example.demo.user;

import com.example.demo.model.User;

public interface UserService {
	
	public User findByUsername(final String username);

}

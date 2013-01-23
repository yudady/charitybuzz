package com.charitybuzz.service;

import java.util.List;

import com.charitybuzz.domain.User;

public interface UserService {
	
	public List<User> findAll();

	public User findByEmail(String email);

}

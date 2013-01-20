package com.charitybuzz.dao;

import java.util.List;

import com.charitybuzz.domain.User;

public interface UserDao {
	public List<User> findAll();

}

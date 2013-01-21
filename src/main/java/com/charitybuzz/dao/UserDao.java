package com.charitybuzz.dao;

import java.util.List;

import com.charitybuzz.domain.User;

public interface UserDao {
	
	public int insert(User user);
	
	public int update(User user);
	
	public int delete(Long userId);
	
	public User findById(Long userId);

	public List<User> findAll();
	
	public int findTotalCount();

}

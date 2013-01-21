package com.charitybuzz.dao;

import java.util.List;

import com.charitybuzz.domain.User;

public interface UserDao {
	
	public void insert(User user);
	
	public User update(User user);
	
	public User findByUserId(Long custId);

	public List<User> findAll();
	
	public int findTotalUserCount();

}

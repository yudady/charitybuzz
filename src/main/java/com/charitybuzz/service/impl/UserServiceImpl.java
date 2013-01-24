package com.charitybuzz.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.charitybuzz.dao.UserDao;
import com.charitybuzz.domain.Bidder;
import com.charitybuzz.service.UserService;
@Service("userService")
public class UserServiceImpl implements UserService{
	
	@Resource(name="userJdbcDao")
	private UserDao userDao;
	
	public List<Bidder> findAll(){
		return userDao.findAll();
	}

	@Override
	public Bidder findByEmail(String email) {
		return userDao.findByEmail(email);
	};

}

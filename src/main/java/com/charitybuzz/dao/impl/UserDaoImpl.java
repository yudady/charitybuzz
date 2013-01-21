package com.charitybuzz.dao.impl;

import java.util.List;

import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.simple.ParameterizedBeanPropertyRowMapper;
import org.springframework.jdbc.core.simple.SimpleJdbcDaoSupport;
import org.springframework.stereotype.Repository;

import com.charitybuzz.dao.UserDao;
import com.charitybuzz.domain.User;


@Repository("userJdbcDao")
public class UserDaoImpl extends SimpleJdbcDaoSupport implements UserDao {
	
	@Override
	public List<User> findAll() {
		
		String sql = "select * from t_user";
		 
		List<User> users = 
			getSimpleJdbcTemplate().query(sql, ParameterizedBeanPropertyRowMapper.newInstance(User.class));
		//this.getSimpleJdbcTemplate().queryForList(sql, new BeanPropertySqlParameterSource(users));
		return users;
	}

	@Override
	public void insert(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public User findByUserId(int custId) {
		String sql = "SELECT * FROM CUSTOMER WHERE CUST_ID = ?";
		 
		return null;
	
	}

	@Override
	public int findTotalUser() {
		// TODO Auto-generated method stub
		return 0;
	}
	

}

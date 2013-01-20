package com.charitybuzz.dao.impl;

import java.util.List;

import javax.annotation.Resource;
import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.charitybuzz.dao.UserDao;
import com.charitybuzz.domain.User;


@Repository("userJdbcDao")
public class UserDaoImpl implements UserDao {
	
	private JdbcTemplate jdbcTemplate;
	
	@Resource
	public void setDataSource(DataSource dataSource) {
		jdbcTemplate = new JdbcTemplate(dataSource);
	}
	
	@Override
	public List<User> findAll() {
		String sqlCount = "select count(*) from users";
		//獲取整數值
		int count = jdbcTemplate.queryForInt(sqlCount);
		System.out.println(count);
		return null;
	}
	

}

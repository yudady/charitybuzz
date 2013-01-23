package com.charitybuzz.dao.impl;

import java.util.HashMap;
import java.util.Map;

import javax.inject.Inject;
import javax.sql.DataSource;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.simple.ParameterizedBeanPropertyRowMapper;
import org.springframework.stereotype.Repository;

import com.charitybuzz.dao.UserDao;
import com.charitybuzz.domain.User;

@Repository("userJdbcDao")
public class UserDaoImpl extends BaseDaoImpl<User> implements UserDao {

	/**
	 * 注入DataSource
	 * 
	 * @param dataSource
	 */
	@Inject
	public UserDaoImpl(DataSource dataSource) {
		setDataSource(dataSource);
	}

	@Override
	public Class<User> getClazz() {
		return User.class;
	}

	@Override
	public String getTableName() {
		return " t_user ";
	}

	@Override
	public int insert(User user) {
		String sql = "INSERT INTO t_user (id,firstName,lastName,screenName,passWord,email,promoCode) "
				+ " VALUES (:id, :firstName, :lastName, :screenName, :passWord, :email, :promoCode) ";
		return super.insert(sql, user);

	}

	@Override
	public int update(User user) {
		String sql = " update t_user set firstName=:firstName, lastName=:lastName, "
				+ "screenName=:screenName, passWord=:passWord, email=:email, "
				+ "promoCode=:promoCode where id=:id ";
		return super.update(sql, user);

	}

	@Override
	public User findByEmail(String email) {
		String sql = "select * from " + getTableName() + " where email=:email";
		BeanPropertyRowMapper<User> rm = ParameterizedBeanPropertyRowMapper
				.newInstance(getClazz());
		Map<String, Object> args = new HashMap<String, Object>();
		args.put("email", email);
		return this.getSimpleJdbcTemplate().queryForObject(sql, rm, args);
	}

}

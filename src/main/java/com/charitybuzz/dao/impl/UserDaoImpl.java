package com.charitybuzz.dao.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;
import javax.sql.DataSource;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.core.simple.ParameterizedBeanPropertyRowMapper;
import org.springframework.jdbc.core.simple.SimpleJdbcDaoSupport;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;

import com.charitybuzz.dao.UserDao;
import com.charitybuzz.domain.User;

@Repository("userJdbcDao")
public class UserDaoImpl extends SimpleJdbcDaoSupport implements UserDao {

	
	/**
	 * 注入DataSource
	 * @param dataSource
	 */
	@Inject
	public UserDaoImpl(DataSource dataSource){
		setDataSource(dataSource);
	}
	
	

	@Override
	public List<User> findAll() {

		String sql = "select * from t_user";
		BeanPropertyRowMapper<User> rm =  ParameterizedBeanPropertyRowMapper.newInstance(User.class);
		return this.getSimpleJdbcTemplate().query(sql, rm, new HashMap<String, Object>());
	}

	@Override
	public int insert(User user) {
		String sql = "INSERT INTO T_USER (ID,FIRSTNAME,LASTNAME,SCREENNAME,PASSWORD,EMAIL,PROMOCODE) "
				+ " VALUES (:id, :firstName, :lastName, :screenName, :passWord, :email, :promoCode) ";

		SqlParameterSource ps = new BeanPropertySqlParameterSource(user);
		KeyHolder keyHolder = new GeneratedKeyHolder();
		return this.getSimpleJdbcTemplate().getNamedParameterJdbcOperations()
				.update(sql, ps, keyHolder);
	}

	@Override
	public User findByUserId(Long userId) {
		String sql = "SELECT * FROM T_USER WHERE ID = ?";
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("id", userId);
		return this.getSimpleJdbcTemplate().queryForObject(sql,
				new BeanPropertyRowMapper<User>(User.class), userId);

	}

	@Override
	public int findTotalUserCount() {
		String sql = " select count(id) from t_user ";
		return this.getSimpleJdbcTemplate().queryForInt(sql,
				new HashMap<String, Object>());
	}

	@Override
	public int update(User user) {
		String sql = " update T_USER set FIRSTNAME=:firstName, LASTNAME=:lastName, " +
				"SCREENNAME=:screenName, PASSWORD=:passWord, EMAIL=:email, " +
				"PROMOCODE=:promoCode where ID=:id ";
		SqlParameterSource sp = new BeanPropertySqlParameterSource(user);
		return this.getSimpleJdbcTemplate().update(sql, sp);
		
	}



	@Override
	public int delete(Long userId) {
		String sql = "delete from t_user where id=:id";
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("id", userId);
		return this.getSimpleJdbcTemplate().getNamedParameterJdbcOperations().update(sql, paramMap);
	}

}

package com.charitybuzz.dao.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.core.simple.ParameterizedBeanPropertyRowMapper;
import org.springframework.jdbc.core.simple.SimpleJdbcDaoSupport;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;

public abstract class BaseDaoImpl<T> extends SimpleJdbcDaoSupport {

	@SuppressWarnings("rawtypes")
	public abstract Class getClazz();

	public abstract String getTableName();

	@SuppressWarnings("unchecked")
	public List<T> findAll() {
		String sql = "select * from " + getTableName() + " order by id desc";
		BeanPropertyRowMapper<T> rm = ParameterizedBeanPropertyRowMapper
				.newInstance(getClazz());
		return this.getSimpleJdbcTemplate().query(sql, rm,
				new HashMap<String, Object>());
	}

	public int insert(String sql, T user) {
		SqlParameterSource ps = new BeanPropertySqlParameterSource(user);
		KeyHolder keyHolder = new GeneratedKeyHolder();
		return this.getSimpleJdbcTemplate().getNamedParameterJdbcOperations()
				.update(sql, ps, keyHolder);
	}

	@SuppressWarnings("unchecked")
	public T findById(Long userId) {
		String sql = "SELECT * FROM " + getTableName() + " WHERE ID = ?";
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("id", userId);
		return this.getSimpleJdbcTemplate().queryForObject(sql,
				new BeanPropertyRowMapper<T>(getClazz()), userId);

	}

	public int findTotalCount() {
		String sql = " select count(id) from " + getTableName();
		return this.getSimpleJdbcTemplate().queryForInt(sql,
				new HashMap<String, Object>());
	}

	public int update(String sql, T user) {
		SqlParameterSource sp = new BeanPropertySqlParameterSource(user);
		return this.getSimpleJdbcTemplate().update(sql, sp);
	}

	public int delete(Long userId) {
		String sql = "delete from " + getTableName() + " where id=:id";
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("id", userId);
		return this.getSimpleJdbcTemplate().getNamedParameterJdbcOperations()
				.update(sql, paramMap);
	}

}

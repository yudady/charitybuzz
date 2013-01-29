package com.charitybuzz.dao.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcDaoSupport;
import org.springframework.jdbc.core.simple.ParameterizedBeanPropertyRowMapper;

import com.charitybuzz.dao.BaseDao;

public abstract class BaseDaoImpl<T> extends NamedParameterJdbcDaoSupport
		implements BaseDao<T> {

	/** logger. */
	Logger log = LoggerFactory.getLogger(this.getClass());

	@SuppressWarnings("rawtypes")
	protected abstract Class getClazz();

	protected String getTableName() {
		StringBuilder sb = new StringBuilder();
		sb.append(" ");
		sb.append(this.getClass().getSimpleName().replace("DaoImpl", ""));
		sb.append(" ");
		return sb.toString();
	};

	@SuppressWarnings("unchecked")
	@Override
	public List<T> findAll() {
		String sql = "select * from " + getTableName() + " order by id desc";
		BeanPropertyRowMapper<T> rowMapper = ParameterizedBeanPropertyRowMapper
				.newInstance(getClazz());
		return this.getJdbcTemplate().query(sql, rowMapper);
	}

	@Override
	public T findById(Long Id) {
		List<T> lists = this.findListByColumn("id", Id);
		if (lists.size() > 0) {
			return lists.get(0);
		}
		return null;

	}

	@Override
	public int findTotalCount() {
		String sql = " select count(id) from " + getTableName();
		return this.getNamedParameterJdbcTemplate().queryForInt(sql,
				new HashMap<String, Object>());
	}

	@Override
	public int delete(Long userId) {
		String sql = "delete from " + getTableName() + " where id=:id";
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("id", userId);
		return this.getNamedParameterJdbcTemplate().update(sql, paramMap);
	}

	@Override
	public int updateNamesById(String[] columns, Long id, Object[] objs) {
		StringBuilder sb = new StringBuilder();
		sb.append(" UPDATE ");
		sb.append(getTableName());
		sb.append(" SET ");
		for (int i = 0; i < columns.length; i++) {
			String column = columns[i];
			sb.append(column);
			sb.append("=:");
			sb.append(column);
			if (i < (columns.length - 1)) {
				sb.append(" , ");
			}
		}
		sb.append(" WHERE ID=:id ");
		log.debug("[SQL]" + sb.toString());
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("id", id);
		for (int i = 0; i < columns.length; i++) {
			String column = columns[i];
			Object obj = objs[i];
			paramMap.put(column, obj);
		}
		return this.getNamedParameterJdbcTemplate().update(sb.toString(),
				paramMap);
	}

	@Override
	public T findByColumns(String[] columns, Object[] objs) {
		List<T> ts = this.findListByColumns(columns, objs);
		if (ts.size() == 1) {
			return ts.get(0);
		}
		return null;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<T> findListByColumn(String nameId, Long id) {
		String sql = "select * from " + getTableName() + " where " + nameId
				+ "=:" + nameId;

		BeanPropertyRowMapper<T> rowMapper = ParameterizedBeanPropertyRowMapper
				.newInstance(getClazz());
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put(nameId, id);
		return (List<T>) this.getNamedParameterJdbcTemplate().query(sql,
				paramMap, rowMapper);

	}

	@SuppressWarnings("unchecked")
	@Override
	public List<T> findListByColumns(String[] columns, Object[] objs) {
		StringBuilder sb = new StringBuilder();
		sb.append("SELECT * FROM ");
		sb.append(getTableName());
		sb.append(" WHERE 1=1");
		for (int i = 0; i < columns.length; i++) {
			String column = columns[i];
			sb.append(" AND ");
			sb.append(column);
			sb.append("=:");
			sb.append(column);
		}
		log.debug("[SQL]" + sb.toString());
		Map<String, Object> paramMap = new HashMap<String, Object>();
		for (int i = 0; i < columns.length; i++) {
			String column = columns[i];
			Object obj = objs[i];
			paramMap.put(column, obj);
		}

		BeanPropertyRowMapper<T> rowMapper = ParameterizedBeanPropertyRowMapper
				.newInstance(getClazz());
		for (int i = 0; i < columns.length; i++) {
			String column = columns[i];
			Object obj = objs[i];
			paramMap.put(column, obj);
		}

		return this.getNamedParameterJdbcTemplate().query(sb.toString(),
				paramMap, rowMapper);

	}

	@Override
	public int insert(String[] columns, Object[] objs) {
		StringBuilder sb = new StringBuilder();
		sb.append("INSERT INTO ");
		sb.append(getTableName().trim());
		sb.append(" (id");

		for (int i = 0; i < columns.length; i++) {
			String column = columns[i];
			sb.append("," + column);
		}
		sb.append(" ) VALUES ( seq_");
		sb.append(getTableName().trim());
		sb.append(".NEXTVAL");
		for (int i = 0; i < columns.length; i++) {
			String column = columns[i];
			sb.append(", :" + column);
		}
		sb.append(" ) ");

		log.debug("[SQL]" + sb.toString());

		Map<String, Object> paramMap = new HashMap<String, Object>();
		for (int i = 0; i < columns.length; i++) {
			String column = columns[i];
			Object obj = objs[i];
			paramMap.put(column, obj);
		}
		return this.getNamedParameterJdbcTemplate().update(sb.toString(),
				paramMap);

	}
}

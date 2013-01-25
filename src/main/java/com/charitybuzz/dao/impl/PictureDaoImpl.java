package com.charitybuzz.dao.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;
import javax.sql.DataSource;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.simple.ParameterizedBeanPropertyRowMapper;
import org.springframework.stereotype.Repository;

import com.charitybuzz.dao.PictureDao;
import com.charitybuzz.domain.Picture;

@Repository
public class PictureDaoImpl extends BaseDaoImpl<Picture> implements PictureDao {
	/**
	 * 注入DataSource
	 * 
	 * @param dataSource
	 */
	@Inject
	public PictureDaoImpl(DataSource dataSource) {
		setDataSource(dataSource);
	}

	@Override
	public Class<Picture> getClazz() {
		return Picture.class;
	}

	@Override
	public String getTableName() {
		return "picture";
	}

	@Override
	public int insert(Picture picture) {
		String sql = "";
		return super.insert(sql, picture);
	}

	@Override
	public int update(Picture picture) {
		String sql = " ";
		return super.update(sql, picture);
	}

	@Override
	public List<Picture> findByitemId(Long itemId) {
		String sql = "select * from " + getTableName()
				+ " where itemId=:itemId";
		BeanPropertyRowMapper<Picture> rm = ParameterizedBeanPropertyRowMapper
				.newInstance(getClazz());
		Map<String, Object> args = new HashMap<String, Object>();
		args.put("itemId", itemId);
		return this.getSimpleJdbcTemplate().query(sql, rm, args);
	}

}

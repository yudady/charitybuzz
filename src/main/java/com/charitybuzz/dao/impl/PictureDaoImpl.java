package com.charitybuzz.dao.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;
import javax.sql.DataSource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.simple.ParameterizedBeanPropertyRowMapper;
import org.springframework.stereotype.Repository;

import com.charitybuzz.dao.PictureDao;
import com.charitybuzz.domain.Picture;

@Repository("pictureJdbcDao")
public class PictureDaoImpl extends BaseDaoImpl<Picture>
		implements PictureDao {
	/** logger. */
	private Logger log = LoggerFactory.getLogger(this.getClass());
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
		return "t_picture";
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
	public List<Picture> findPictureByArticleId(Long articleId) {
		log.debug("[LOG][articleId]" + articleId);
		String sql = "select * from " + getTableName()
				+ " where articleId=:articleId";
		BeanPropertyRowMapper<Picture> rm = ParameterizedBeanPropertyRowMapper
				.newInstance(getClazz());
		Map<String, Object> args = new HashMap<String, Object>();
		args.put("articleId", articleId);
		return this.getSimpleJdbcTemplate().query(sql, rm, args);
	}

}

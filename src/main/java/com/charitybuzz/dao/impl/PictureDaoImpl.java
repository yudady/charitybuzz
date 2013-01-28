package com.charitybuzz.dao.impl;

import javax.inject.Inject;
import javax.sql.DataSource;

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


}

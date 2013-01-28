package com.charitybuzz.dao.impl;

import javax.inject.Inject;
import javax.sql.DataSource;

import org.springframework.stereotype.Repository;

import com.charitybuzz.dao.SubCategoryDao;
import com.charitybuzz.domain.SubCategory;

@Repository
public class SubCategoryDaoImpl extends BaseDaoImpl<SubCategory> implements
		SubCategoryDao {
	/**
	 * 注入DataSource
	 * 
	 * @param dataSource
	 */
	@Inject
	public SubCategoryDaoImpl(DataSource dataSource) {
		setDataSource(dataSource);
	}

	@Override
	public Class<SubCategory> getClazz() {
		return SubCategory.class;
	}

}

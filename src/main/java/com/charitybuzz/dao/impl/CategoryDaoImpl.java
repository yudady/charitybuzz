package com.charitybuzz.dao.impl;

import javax.inject.Inject;
import javax.sql.DataSource;

import org.springframework.stereotype.Repository;

import com.charitybuzz.dao.CategoryDao;
import com.charitybuzz.domain.Category;

@Repository("categoryJdbcDao")
public class CategoryDaoImpl extends BaseDaoImpl<Category> implements
		CategoryDao {

	/**
	 * 注入DataSource
	 * 
	 * @param dataSource
	 */
	@Inject
	public CategoryDaoImpl(DataSource dataSource) {
		setDataSource(dataSource);
	}

	@Override
	public Class<Category> getClazz() {
		return Category.class;
	}

	@Override
	public String getTableName() {
		return "t_category";
	}

	@Override
	public int insert(Category category) {
		String sql = " ";
		return super.insert(sql, category);
	}

	@Override
	public int update(Category category) {
		String sql = " ";
		return super.update(sql, category);
	}

}

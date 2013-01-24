package com.charitybuzz.dao.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;
import javax.sql.DataSource;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.simple.ParameterizedBeanPropertyRowMapper;
import org.springframework.stereotype.Repository;

import com.charitybuzz.dao.SubCategoryDao;
import com.charitybuzz.domain.SubCategory;

@Repository("subCategoryJdbcDao")
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

	@Override
	public String getTableName() {
		return "subCategory";
	}

	@Override
	public int insert(SubCategory catalogItem) {
		String sql = " ";
		return super.insert(sql, catalogItem);
	}

	@Override
	public int update(SubCategory catalogItem) {
		String sql = " ";
		return super.update(sql, catalogItem);
	}

	@Override
	public List<SubCategory> findByCategoryId(Long id) {
		String sql = "select * from " + getTableName()
				+ " where CATEGORYID=:categoryId";
		BeanPropertyRowMapper<SubCategory> rm = ParameterizedBeanPropertyRowMapper
				.newInstance(getClazz());
		Map<String, Object> args = new HashMap<String, Object>();
		args.put("categoryId", id);
		return this.getSimpleJdbcTemplate().query(sql, rm, args);

	}

}

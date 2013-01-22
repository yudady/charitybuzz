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

import com.charitybuzz.dao.CatalogItemDao;
import com.charitybuzz.domain.CatalogItem;

@Repository("catalogItemJdbcDao")
public class CatalogItemDaoImpl extends BaseDaoImpl<CatalogItem> implements
		CatalogItemDao {
	/** logger. */
	private Logger log = LoggerFactory.getLogger(this.getClass());
	/**
	 * 注入DataSource
	 * 
	 * @param dataSource
	 */
	@Inject
	public CatalogItemDaoImpl(DataSource dataSource) {
		setDataSource(dataSource);
	}

	@Override
	public Class<CatalogItem> getClazz() {
		return CatalogItem.class;
	}

	@Override
	public String getTableName() {
		return "t_catalog_item";
	}

	@Override
	public int insert(CatalogItem catalogItem) {
		String sql = " ";
		return super.insert(sql, catalogItem);
	}

	@Override
	public int update(CatalogItem catalogItem) {
		String sql = " ";
		return super.update(sql, catalogItem);
	}

	@Override
	public List<CatalogItem> findByCategoryId(Long id) {
		log.debug("[LOG][CategoryId]" + id);
		String sql = "select * from " + getTableName()
				+ " where CATEGORYID=:categoryId";
		BeanPropertyRowMapper<CatalogItem> rm = ParameterizedBeanPropertyRowMapper
				.newInstance(getClazz());
		Map<String, Object> args = new HashMap<String, Object>();
		args.put("categoryId", id);
		return this.getSimpleJdbcTemplate().query(sql, rm, args);

	}

}

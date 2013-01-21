package com.charitybuzz.dao.impl;

import javax.inject.Inject;
import javax.sql.DataSource;

import org.springframework.stereotype.Repository;

import com.charitybuzz.dao.CatalogItemDao;
import com.charitybuzz.domain.CatalogItem;

@Repository("catalogItemJdbcDao")
public class CatalogItemDaoImpl extends BaseDaoImpl<CatalogItem> implements
		CatalogItemDao {

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
		return "t_catalogitem";
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

}

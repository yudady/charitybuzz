package com.charitybuzz.dao.impl;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;
import javax.sql.DataSource;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.simple.ParameterizedBeanPropertyRowMapper;
import org.springframework.stereotype.Repository;

import com.charitybuzz.dao.ItemDao;
import com.charitybuzz.domain.Item;

@Repository
public class ItemDaoImpl extends BaseDaoImpl<Item> implements ItemDao {

	/**
	 * 注入DataSource
	 * 
	 * @param dataSource
	 */
	@Inject
	public ItemDaoImpl(DataSource dataSource) {
		setDataSource(dataSource);
	}

	@Override
	public Class<Item> getClazz() {
		return Item.class;
	}


	@Override
	public List<Item> findByCategoryId(Long categoryId) {
		String sql = "select * from " + getTableName()
				+ " where status = 1 and CATEGORYID=:categoryId";
		BeanPropertyRowMapper<Item> rowMapper = ParameterizedBeanPropertyRowMapper
				.newInstance(getClazz());
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("categoryId", categoryId);
		return this.getNamedParameterJdbcTemplate().query(sql, paramMap,
				rowMapper);

	}

	@Override
	public List<Item> findBySubCategoryId(Long subcategoryId) {
		String sql = "SELECT b.* FROM subcategory_item a, item b WHERE b.status = 1 and b.ID = a.itemid AND a.SUBCATALOGITEMID = :id ";
		BeanPropertyRowMapper<Item> rowMapper = ParameterizedBeanPropertyRowMapper
				.newInstance(getClazz());
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("id", subcategoryId);
		return this.getNamedParameterJdbcTemplate().query(sql, paramMap,
				rowMapper);

	}

	@Override
	public List<Item> findEndBiddingByLotclose(Date date) {
		String sql = "SELECT A.* FROM item A WHERE status = 1 and (a.lotclose - :lotclose ) <= 0 ";
		BeanPropertyRowMapper<Item> rowMapper = ParameterizedBeanPropertyRowMapper
				.newInstance(getClazz());
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("lotclose", new java.sql.Date(date.getTime()));
		return this.getNamedParameterJdbcTemplate().query(sql, paramMap,
				rowMapper);

	}

}

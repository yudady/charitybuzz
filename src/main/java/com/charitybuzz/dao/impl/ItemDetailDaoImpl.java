package com.charitybuzz.dao.impl;

import java.util.HashMap;
import java.util.Map;

import javax.inject.Inject;
import javax.sql.DataSource;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.stereotype.Repository;

import com.charitybuzz.dao.ItemDetailDao;
import com.charitybuzz.domain.ItemDetail;

@Repository
public class ItemDetailDaoImpl extends BaseDaoImpl<ItemDetail> implements ItemDetailDao {

	/**
	 * 注入DataSource
	 * 
	 * @param dataSource
	 */
	@Inject
	public ItemDetailDaoImpl(DataSource dataSource) {
		setDataSource(dataSource);
	}

	@Override
	public Class<ItemDetail> getClazz() {
		return ItemDetail.class;
	}

	@Override
	public String getTableName() {
		return "itemdetail";
	}

	@Override
	public int insert(ItemDetail item) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(ItemDetail item) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public ItemDetail findItemDetailByItemId(Long itemId) {
		String sql = "SELECT * FROM " + getTableName() + " WHERE itemId = ?";
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("itemId", itemId);
		return this.getSimpleJdbcTemplate().queryForObject(sql,
				new BeanPropertyRowMapper<ItemDetail>(getClazz()), itemId);
	}

}

package com.charitybuzz.dao.impl;

import java.util.HashMap;
import java.util.Map;

import javax.inject.Inject;
import javax.sql.DataSource;

import org.springframework.stereotype.Repository;

import com.charitybuzz.dao.WatchingDao;
import com.charitybuzz.domain.Watching;

@Repository
public class WatchingDaoImpl extends BaseDaoImpl<Watching> implements
		WatchingDao {

	/**
	 * 注入DataSource
	 * 
	 * @param dataSource
	 */
	@Inject
	public WatchingDaoImpl(DataSource dataSource) {
		setDataSource(dataSource);
	}

	@Override
	public Class<Watching> getClazz() {
		return Watching.class;
	}

	@Override
	public int deleteByBidderIdItemId(Long bidderId, Long itemId) {
		String sql = " delete from " + getTableName()
				+ " where bidderId = :bidderId and itemId = :itemId ";

		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("bidderId", bidderId);
		paramMap.put("itemId", itemId);
		return this.getNamedParameterJdbcTemplate().update(sql, paramMap);
	}

	@Override
	public Watching findByBidderIdItemId(Long bidderId, Long itemId) {
		String sql = "SELECT * FROM " + getTableName()
				+ " WHERE bidderId = ? and itemId = ? ";

		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("bidderId", bidderId);
		paramMap.put("itemId", itemId);
		return this.getNamedParameterJdbcTemplate().queryForObject(sql,
				paramMap, Watching.class);

	}

}

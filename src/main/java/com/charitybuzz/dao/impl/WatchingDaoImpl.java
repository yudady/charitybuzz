package com.charitybuzz.dao.impl;

import java.util.HashMap;
import java.util.Map;

import javax.inject.Inject;
import javax.sql.DataSource;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.stereotype.Repository;

import com.charitybuzz.dao.WatchingDao;
import com.charitybuzz.domain.Watching;

@Repository
public class WatchingDaoImpl extends BaseDaoImpl<Watching>
		implements WatchingDao {

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
	public int insert(Watching watching) {
		String sql = "INSERT INTO "
				+ getTableName()
				+ " (id,BIDDERID,ITEMID) VALUES (Seq_watching.NEXTVAL, :bidderId,:itemId) ";
		return super.insert(sql, watching);
	}

	@Override
	public int update(Watching watching) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int insert(Long bidderId, Long itemId) {
		Watching w = new Watching();
		w.setBidderId(bidderId);
		w.setItemId(itemId);
		return this.insert(w);
	}

	@Override
	public int deleteByBidderIdItemId(Long bidderId, Long itemId) {
		String sql = " delete from " + getTableName()
				+ " where bidderId = :bidderId and itemId = :itemId ";

		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("bidderId", bidderId);
		paramMap.put("itemId", itemId);
		return this.getSimpleJdbcTemplate().getNamedParameterJdbcOperations()
				.update(sql, paramMap);
	}

	@Override
	public Watching findByBidderIdItemId(Long bidderId, Long itemId) {
		String sql = "SELECT * FROM " + getTableName() + " WHERE bidderId = ? and itemId = ? ";
		return this.getSimpleJdbcTemplate().queryForObject(sql,
				new BeanPropertyRowMapper<Watching>(getClazz()), bidderId,itemId);
	}


}

package com.charitybuzz.dao.impl;

import javax.inject.Inject;
import javax.sql.DataSource;

import org.springframework.stereotype.Repository;

import com.charitybuzz.dao.BidlogDao;
import com.charitybuzz.domain.Bidlog;

@Repository("bidlogJdbcDao")
public class BidlogDaoImpl extends BaseDaoImpl<Bidlog>
		implements BidlogDao {

	/**
	 * 注入DataSource
	 * 
	 * @param dataSource
	 */
	@Inject
	public BidlogDaoImpl(DataSource dataSource) {
		setDataSource(dataSource);
	}

	@Override
	public Class<Bidlog> getClazz() {
		return Bidlog.class;
	}

	@Override
	public String getTableName() {
		return "bidlog";
	}

	@Override
	public int insert(Bidlog itemHistory) {
		String sql = "";
		return super.insert(sql, itemHistory);
	}

	@Override
	public int update(Bidlog itemHistory) {
		String sql = " ";
		return super.update(sql, itemHistory);
	}

}

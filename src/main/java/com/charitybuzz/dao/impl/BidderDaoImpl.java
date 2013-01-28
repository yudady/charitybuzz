package com.charitybuzz.dao.impl;

import javax.inject.Inject;
import javax.sql.DataSource;

import org.springframework.stereotype.Repository;

import com.charitybuzz.dao.BidderDao;
import com.charitybuzz.domain.Bidder;

@Repository
public class BidderDaoImpl extends BaseDaoImpl<Bidder> implements BidderDao {

	/**
	 * 注入DataSource
	 * 
	 * @param dataSource
	 */
	@Inject
	public BidderDaoImpl(DataSource dataSource) {
		setDataSource(dataSource);
	}

	@Override
	public Class<Bidder> getClazz() {
		return Bidder.class;
	}

}

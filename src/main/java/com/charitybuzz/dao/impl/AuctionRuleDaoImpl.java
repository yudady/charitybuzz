package com.charitybuzz.dao.impl;

import javax.inject.Inject;
import javax.sql.DataSource;

import org.springframework.stereotype.Repository;

import com.charitybuzz.dao.AuctionRuleDao;
import com.charitybuzz.domain.AuctionRule;

@Repository
public class AuctionRuleDaoImpl extends BaseDaoImpl<AuctionRule> implements
		AuctionRuleDao {

	/**
	 * 注入DataSource
	 * 
	 * @param dataSource
	 */
	@Inject
	public AuctionRuleDaoImpl(DataSource dataSource) {
		setDataSource(dataSource);
	}

	@Override
	public Class<AuctionRule> getClazz() {
		return AuctionRule.class;
	}

}

package com.charitybuzz.dao.impl;

import javax.inject.Inject;
import javax.sql.DataSource;

import org.springframework.stereotype.Repository;

import com.charitybuzz.dao.AuctionRuleDetailDao;
import com.charitybuzz.domain.AuctionRuleDetail;

@Repository
public class AuctionRuleDetailDaoImpl extends BaseDaoImpl<AuctionRuleDetail>
		implements AuctionRuleDetailDao {

	/**
	 * 注入DataSource
	 * 
	 * @param dataSource
	 */
	@Inject
	public AuctionRuleDetailDaoImpl(DataSource dataSource) {
		setDataSource(dataSource);
	}

	@Override
	public Class<AuctionRuleDetail> getClazz() {
		return AuctionRuleDetail.class;
	}


	@Override
	public int insert(AuctionRuleDetail t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(AuctionRuleDetail t) {
		// TODO Auto-generated method stub
		return 0;
	}





}

package com.charitybuzz.dao.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;
import javax.sql.DataSource;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.simple.ParameterizedBeanPropertyRowMapper;
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

	@Override
	public List<AuctionRuleDetail> findByAuctionRuleId(Long auctionRuleId) {
		String sql = "select * from " + getTableName()
				+ " where auctionRuleId=:auctionRuleId";
		BeanPropertyRowMapper<AuctionRuleDetail> rm = ParameterizedBeanPropertyRowMapper
				.newInstance(getClazz());
		Map<String, Object> args = new HashMap<String, Object>();
		args.put("auctionRuleId", auctionRuleId);
		return this.getSimpleJdbcTemplate().query(sql, rm, args);
	}





}

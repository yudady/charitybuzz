package com.charitybuzz.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.charitybuzz.dao.AuctionRuleDao;
import com.charitybuzz.domain.AuctionRule;
import com.charitybuzz.service.AuctionRuleService;

@Service
public class AuctionRuleServiceImpl implements AuctionRuleService {

	@Resource
	private AuctionRuleDao auctionRuleDao;
	
	@Override
	public AuctionRule findById(Long auctionRuleId) {
		return auctionRuleDao.findById(auctionRuleId);
	}


}

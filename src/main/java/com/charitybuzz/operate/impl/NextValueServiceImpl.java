package com.charitybuzz.operate.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.charitybuzz.domain.AuctionRule;
import com.charitybuzz.domain.AuctionRuleDetail;
import com.charitybuzz.operate.NextValueService;
import com.charitybuzz.service.AuctionRuleDetailService;
import com.charitybuzz.service.AuctionRuleService;

@Service
public class NextValueServiceImpl implements NextValueService {

	@Resource
	private AuctionRuleService auctionRuleService;
	@Resource
	private AuctionRuleDetailService auctionRuleDetailService;

	@Override
	public Double findMinNextBid(Long auctionRuleId,
			Double currentBid) {

		AuctionRule auctionRule = auctionRuleService.findById(auctionRuleId);
		auctionRule.setCurrentBid(currentBid);
		List<AuctionRuleDetail> auctionRuleDetails = auctionRuleDetailService.findByAuctionRuleId(auctionRule.getId());
		auctionRule.setAuctionRuleDetails(auctionRuleDetails);
		return auctionRule.getNextValue();
		
	}
	

}

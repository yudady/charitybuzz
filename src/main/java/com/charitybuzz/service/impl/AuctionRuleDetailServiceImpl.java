package com.charitybuzz.service.impl;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.charitybuzz.dao.AuctionRuleDetailDao;
import com.charitybuzz.domain.AuctionRuleDetail;
import com.charitybuzz.service.AuctionRuleDetailService;

@Service
public class AuctionRuleDetailServiceImpl implements AuctionRuleDetailService {

	@Resource
	private AuctionRuleDetailDao auctionRuleDetailDao;

	@Override
	public List<AuctionRuleDetail> findByAuctionRuleId(Long id) {

		List<AuctionRuleDetail> auctionRuleDetails = auctionRuleDetailDao
				.findListByColumn("auctionRuleId", id);
		if (auctionRuleDetails.size() > 0) {
			return auctionRuleDetails;
		}
		return new ArrayList<AuctionRuleDetail>();
	}

}

package com.charitybuzz.service;

import java.util.List;

import com.charitybuzz.domain.AuctionRuleDetail;


public interface AuctionRuleDetailService {

	public List<AuctionRuleDetail> findByAuctionRuleId(Long id);

}

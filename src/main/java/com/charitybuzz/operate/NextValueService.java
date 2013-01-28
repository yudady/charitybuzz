package com.charitybuzz.operate;



public interface NextValueService {

	public Double findMinNextBid(Long auctionRuleId,
			Double currentBid);
}

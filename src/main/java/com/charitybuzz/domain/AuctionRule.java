package com.charitybuzz.domain;

import java.util.List;

/**
 * 規則
 * 
 * @author Administrator
 * 
 */
public class AuctionRule {

	private Long id;

	private List<AuctionRuleDetail> BiddingDetails;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public List<AuctionRuleDetail> getBiddingDetails() {
		return BiddingDetails;
	}

	public void setBiddingDetails(List<AuctionRuleDetail> biddingDetails) {
		BiddingDetails = biddingDetails;
	}

}

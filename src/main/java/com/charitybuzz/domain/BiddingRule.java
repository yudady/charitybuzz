package com.charitybuzz.domain;

import java.util.List;

/**
 * 規則
 * 
 * @author Administrator
 * 
 */
public class BiddingRule {

	private Long id;

	private List<BiddingDetail> BiddingDetails;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public List<BiddingDetail> getBiddingDetails() {
		return BiddingDetails;
	}

	public void setBiddingDetails(List<BiddingDetail> biddingDetails) {
		BiddingDetails = biddingDetails;
	}

}

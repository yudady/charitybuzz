package com.charitybuzz.domain;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang.builder.ReflectionToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

/**
 * 規則明細
 * 
 * <pre>
 * Max Bid
 * This item supports Max Bidding! The bid you enter will 
 * automatically be a Max Bid. If your Max Bid is higher than 
 * the next Bid Increment, the bid will only be raised to the 
 * next Bid Increment. If someone else bids on this item for an 
 * amount less than your Max Bid, then you will automatically 
 * beat them and your bid will be increased to the Bid 
 * Increment necessary to beat them 
 * (or increased to your Max Bid itself, if that's lower).
 * 
 * Bid Increment
 * To keep bidding competitive and interesting, 
 * you are required to increase the bid by an amount comparable to the 
 * current bid itself. Here's the guide:
 * 
 * Current Bid Amount						Bid Increment
 * 250 or less								25
 * 250 - 500								50
 * 500 - 1000								100
 * 1000 - 5000								250
 * 5000 - 10000								500
 * 10000 - 25000							1000
 * 25000 - 50000							2500
 * 50000 - 10000000							5000
 * </pre>
 * 
 * @author Administrator
 * 
 */
public class AuctionRule {

	private Long id;
	private String name;
	private String maxBidDesc;
	private String maxBidIncrementDesc;

	// =================================

	private Double currentBid;
	private Double nextValue;

	private List<AuctionRuleDetail> auctionRuleDetails;

	private List<Double> amountValues = new ArrayList<Double>();
	private List<Double> incrementValues = new ArrayList<Double>();

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMaxBidDesc() {
		return maxBidDesc;
	}

	public void setMaxBidDesc(String maxBidDesc) {
		this.maxBidDesc = maxBidDesc;
	}

	public String getMaxBidIncrementDesc() {
		return maxBidIncrementDesc;
	}

	public void setMaxBidIncrementDesc(String maxBidIncrementDesc) {
		this.maxBidIncrementDesc = maxBidIncrementDesc;
	}

	// =========================================
	Double getCurrentBid() {
		return currentBid;
	}

	public void setCurrentBid(Double currentBid) {
		this.currentBid = currentBid;
	}

	public Double getNextValue() {
		this.getBidLeast();
		return this.nextValue;
	}

	void setNextValue(Double nextValue) {
		this.nextValue = nextValue;
	}

	List<AuctionRuleDetail> getAuctionRuleDetails() {
		return auctionRuleDetails;
	}

	public void setAuctionRuleDetails(List<AuctionRuleDetail> auctionRuleDetails) {
		this.auctionRuleDetails = auctionRuleDetails;
		for (int i = 0; i < auctionRuleDetails.size(); i++) {
			AuctionRuleDetail ard = auctionRuleDetails.get(i);
			amountValues.add(ard.getAmountValue());
			incrementValues.add(ard.getIncrementValue());
		}
	}

	/**
	 * @param currentBid
	 * @return
	 */
	public void getBidLeast() {

		for (int i = 0; i < amountValues.size(); i++) {
			if (currentBid < amountValues.get(i)) {
				this.nextValue = currentBid + incrementValues.get(i);
				return;
			}
		}
	}
	@Override
	public String toString() {
		return ReflectionToStringBuilder.toString(this,
				ToStringStyle.SIMPLE_STYLE);
	}
}

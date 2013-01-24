package com.charitybuzz.domain;

/**
 * 
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
public class AuctionRuleDetail {

	private Long id;
	private Long biddingRuleId;
	private double minValue;
	private double maxValue;
	private double incrementValue;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getBiddingRuleId() {
		return biddingRuleId;
	}

	public void setBiddingRuleId(Long biddingRuleId) {
		this.biddingRuleId = biddingRuleId;
	}

	public double getMinValue() {
		return minValue;
	}

	public void setMinValue(double minValue) {
		this.minValue = minValue;
	}

	public double getMaxValue() {
		return maxValue;
	}

	public void setMaxValue(double maxValue) {
		this.maxValue = maxValue;
	}

	public double getIncrementValue() {
		return incrementValue;
	}

	public void setIncrementValue(double incrementValue) {
		this.incrementValue = incrementValue;
	}

}

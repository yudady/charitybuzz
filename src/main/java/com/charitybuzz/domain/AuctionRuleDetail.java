package com.charitybuzz.domain;

import org.apache.commons.lang.builder.ReflectionToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

/**
 * 
 * @author Administrator
 * 
 */
public class AuctionRuleDetail {

	private Long id;
	private Long auctionRule;
	private double amountValue;
	private double incrementValue;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getAuctionRule() {
		return auctionRule;
	}

	public void setAuctionRule(Long auctionRule) {
		this.auctionRule = auctionRule;
	}

	public double getAmountValue() {
		return amountValue;
	}

	public void setAmountValue(double amountValue) {
		this.amountValue = amountValue;
	}

	public double getIncrementValue() {
		return incrementValue;
	}

	public void setIncrementValue(double incrementValue) {
		this.incrementValue = incrementValue;
	}
	@Override
	public String toString() {
		return ReflectionToStringBuilder.toString(this,
				ToStringStyle.SIMPLE_STYLE);
	}
}

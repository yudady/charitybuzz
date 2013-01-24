package com.charitybuzz.domain;

import java.util.Date;

/**
 * 商品投標的歷史紀錄
 * 
 * @author Administrator
 * 
 */
public class Bidlog {

	/**
	 * bid歷史紀錄id
	 */
	private Long id;
	/**
	 * Bidder
	 */
	private Bidder bidder;
	/**
	 * 價格
	 */
	private Double amount;
	/**
	 * 時間
	 */
	private Date bidTime;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Bidder getBidder() {
		return bidder;
	}

	public void setBidder(Bidder bidder) {
		this.bidder = bidder;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public Date getBidTime() {
		return bidTime;
	}

	public void setBidTime(Date bidTime) {
		this.bidTime = bidTime;
	}

}

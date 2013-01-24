package com.charitybuzz.domain;

import java.util.Date;

/**
 * 商品投標的歷史紀錄
 * 
 * @author Administrator
 * 
 */
public class ArticleHistory {

	private Long id;
	private Bidder bidder;
	private Double amount;
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

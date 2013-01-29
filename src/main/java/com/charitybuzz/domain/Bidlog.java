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
	 * 競標者id
	 */
	private Long bidderId;
	/**
	 * 商品id
	 */
	private Long itemId;
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

	public Long getBidderId() {
		return bidderId;
	}

	public void setBidderId(Long bidderId) {
		this.bidderId = bidderId;
	}

	public Long getItemId() {
		return itemId;
	}

	public void setItemId(Long itemId) {
		this.itemId = itemId;
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

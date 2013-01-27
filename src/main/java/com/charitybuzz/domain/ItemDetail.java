package com.charitybuzz.domain;

import org.apache.commons.lang.builder.ReflectionToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

/**
 * 商品明細
 * 
 * @author Administrator
 * 
 */
public class ItemDetail {
	/**
	 * ID Lot Number:
	 */
	private Long id;
	/**
	 * parentId
	 */
	private Long itemId;

	/**
	 * LOTDETAILS訊息
	 */
	private String lotDetails;
	/**
	 * LEGALTERMS訊息
	 */
	private String legalTerms;
	/**
	 * SHIPPING訊息
	 */
	private String shipping;

	/**
	 * 當前贏家id winningBidderId
	 */
	private Long winningBidderId;

	/**
	 * Bidding_Rule_ID 使用哪個id來當規則
	 */
	private int auctionRuleId;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getItemId() {
		return itemId;
	}

	public void setItemId(Long itemId) {
		this.itemId = itemId;
	}

	public String getLotDetails() {
		return lotDetails;
	}

	public void setLotDetails(String lotDetails) {
		this.lotDetails = lotDetails;
	}

	public String getLegalTerms() {
		return legalTerms;
	}

	public void setLegalTerms(String legalTerms) {
		this.legalTerms = legalTerms;
	}

	public String getShipping() {
		return shipping;
	}

	public void setShipping(String shipping) {
		this.shipping = shipping;
	}

	public Long getWinningBidderId() {
		return winningBidderId;
	}

	public void setWinningBidderId(Long winningBidderId) {
		this.winningBidderId = winningBidderId;
	}

	public int getAuctionRuleId() {
		return auctionRuleId;
	}

	public void setAuctionRuleId(int auctionRuleId) {
		this.auctionRuleId = auctionRuleId;
	}

	@Override
	public String toString() {
		return ReflectionToStringBuilder.toString(this,
				ToStringStyle.SIMPLE_STYLE);
	}

}

package com.charitybuzz.domain;

import org.apache.commons.lang.builder.ReflectionToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

/**
 * 商品
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
	private Long articleId;

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
	 * 當前贏家id USER_ID
	 */
	private Long userId;

	/**
	 * Bidding_Rule_ID 使用哪個id來當規則
	 */
	private int biddingRuleId;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getArticleId() {
		return articleId;
	}

	public void setArticleId(Long articleId) {
		this.articleId = articleId;
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

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public int getBiddingRuleId() {
		return biddingRuleId;
	}

	public void setBiddingRuleId(int biddingRuleId) {
		this.biddingRuleId = biddingRuleId;
	}

	@Override
	public String toString() {
		return ReflectionToStringBuilder.toString(this,
				ToStringStyle.SIMPLE_STYLE);
	}

}

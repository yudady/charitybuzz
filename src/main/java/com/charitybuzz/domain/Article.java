package com.charitybuzz.domain;

import java.util.Date;
import java.util.List;

import org.apache.commons.lang.builder.ReflectionToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

/**
 * 商品
 * 
 * @author Administrator
 * 
 */
public class Article {
	/**
	 * ID Lot Number:
	 */
	private Long id;
	/**
	 * 第一級目錄id
	 */
	private Long categoryId;
	/**
	 * 商品訊息
	 */
	private String title;

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
	 * CURRENTBID 當前標價 Current Bid: $2,250
	 */
	private Double currentBid;
	/**
	 * 商品 開始日期 STARTDATE
	 */
	private Date startDate;
	/**
	 * Lot Closes 商品結束日期 ENDDATE
	 */
	private Date endDate;

	/**
	 * 當前贏家id USER_ID
	 */
	private Long userId;

	/**
	 * ESTIMATED_VALUE 直購價 Estimated Value: $9,500
	 */
	private Double estimatedValue;

	/**
	 * Bidding_Rule_ID 使用哪個id來當規則
	 */
	private int biddingRuleId;
	
	/**
	 * 下次最小標價 Minimum Next Bid: $2,500
	 */
	private Double minNextBid;

	/**
	 * 有多個2級目錄
	 */
	private List<CatalogItem> catalogItems;
	/**
	 * 歷史紀錄
	 */
	private List<ArticleHistory> articleHistories;
	/**
	 * (6 bids)umber of Bids: 2 已經有幾標 commodityHistories.size()
	 */
	private int commodityHistorySize;

	public Article() {
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(Long categoryId) {
		this.categoryId = categoryId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
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

	public Double getCurrentBid() {
		return currentBid;
	}

	public void setCurrentBid(Double currentBid) {
		this.currentBid = currentBid;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public Double getEstimatedValue() {
		return estimatedValue;
	}

	public void setEstimatedValue(Double estimatedValue) {
		this.estimatedValue = estimatedValue;
	}

	public int getBiddingRuleId() {
		return biddingRuleId;
	}

	public void setBiddingRuleId(int biddingRuleId) {
		this.biddingRuleId = biddingRuleId;
	}

	public Double getMinNextBid() {
		return minNextBid;
	}

	public void setMinNextBid(Double minNextBid) {
		this.minNextBid = minNextBid;
	}

	public List<CatalogItem> getCatalogItems() {
		return catalogItems;
	}

	public void setCatalogItems(List<CatalogItem> catalogItems) {
		this.catalogItems = catalogItems;
	}

	public List<ArticleHistory> getArticleHistories() {
		return articleHistories;
	}

	public void setArticleHistories(List<ArticleHistory> articleHistories) {
		this.articleHistories = articleHistories;
	}

	public int getCommodityHistorySize() {
		return commodityHistorySize;
	}

	public void setCommodityHistorySize(int commodityHistorySize) {
		this.commodityHistorySize = commodityHistorySize;
	}

	@Override
	public String toString() {
		return ReflectionToStringBuilder.toString(this,
				ToStringStyle.SIMPLE_STYLE);
	}
}

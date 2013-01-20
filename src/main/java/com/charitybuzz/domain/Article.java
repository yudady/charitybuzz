package com.charitybuzz.domain;

import java.util.Date;
import java.util.List;

/**
 * 商品
 * 
 * @author Administrator
 * 
 */
public class Article {

	/**
	 * Lot Number:
	 */
	private Long id;

	private String lotDetails;
	private String legalTerms;
	private String shipping;

	/**
	 * Current Bid: $2,250
	 */
	private Double currentBid;
	/**
	 * 開始日期
	 */
	private Date startDate;
	/**
	 * Lot Closes 結速日期
	 */
	private Date endDate;

	/**
	 * 當前贏家
	 */
	private User winning;

	/**
	 * 直購價 Estimated Value: $9,500
	 */
	private Double estimatedValue;

	/**
	 * Minimum Next Bid: $2,500
	 */
	private BidLevel nextBid;
	private int bidLevelValue;

	/**
	 * 有多個2級目錄
	 */
	private List<CatalogItem> catalogItems;
	/**
	 * 歷史紀錄 Number of Bids: 2
	 */
	private List<ArticleHistory> commodityHistories;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

	public User getWinning() {
		return winning;
	}

	public void setWinning(User winning) {
		this.winning = winning;
	}

	public Double getEstimatedValue() {
		return estimatedValue;
	}

	public void setEstimatedValue(Double estimatedValue) {
		this.estimatedValue = estimatedValue;
	}

	public BidLevel getNextBid() {
		return nextBid;
	}

	public void setNextBid(BidLevel nextBid) {
		this.nextBid = nextBid;
	}

	public List<CatalogItem> getCatalogItems() {
		return catalogItems;
	}

	public void setCatalogItems(List<CatalogItem> catalogItems) {
		this.catalogItems = catalogItems;
	}

	public List<ArticleHistory> getCommodityHistories() {
		return commodityHistories;
	}

	public void setCommodityHistories(List<ArticleHistory> commodityHistories) {
		this.commodityHistories = commodityHistories;
	}

}

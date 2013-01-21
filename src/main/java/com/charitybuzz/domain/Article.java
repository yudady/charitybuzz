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
	 * Lot Number:
	 */
	// ID
	private Long id;
	/**
	 * 第一級目錄
	 */
	private Long categoryId;
	// LOTDETAILS
	private String lotDetails;
	// LEGALTERMS
	private String legalTerms;
	// SHIPPING
	private String shipping;

	/**
	 * Current Bid: $2,250
	 */
	// CURRENTBID
	private Double currentBid;
	/**
	 * 開始日期
	 */
	// STARTDATE
	private Date startDate;
	/**
	 * Lot Closes 結速日期
	 */
	// ENDDATE
	private Date endDate;

	/**
	 * 當前贏家
	 */
	// USERID
	private Long userId;

	/**
	 * 直購價 Estimated Value: $9,500
	 */
	// ESTIMATEDVALUE
	private Double estimatedValue;

	/**
	 * Minimum Next Bid: $2,500
	 */
	// BIDLEVELID
	private BidLevel nextBid;
	// NEXTBID
	private int bidLevelValue;

	/**
	 * 有多個2級目錄
	 */
	private List<CatalogItem> catalogItems;
	/**
	 * 歷史紀錄 Number of Bids: 2
	 */
	private List<ArticleHistory> commodityHistories;

	public Article() {
	}

	public Article(Long id, Long categoryId, String lotDetails,
			String legalTerms, String shipping, Double currentBid,
			Date startDate, Date endDate, Long userId, Double estimatedValue) {
		super();
		this.id = id;
		this.categoryId = categoryId;
		this.lotDetails = lotDetails;
		this.legalTerms = legalTerms;
		this.shipping = shipping;
		this.currentBid = currentBid;
		this.startDate = startDate;
		this.endDate = endDate;
		this.userId = userId;
		this.estimatedValue = estimatedValue;
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

	public BidLevel getNextBid() {
		return nextBid;
	}

	public void setNextBid(BidLevel nextBid) {
		this.nextBid = nextBid;
	}

	public int getBidLevelValue() {
		return bidLevelValue;
	}

	public void setBidLevelValue(int bidLevelValue) {
		this.bidLevelValue = bidLevelValue;
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

	@Override
	public String toString() {
		return ReflectionToStringBuilder.toString(this,
				ToStringStyle.SIMPLE_STYLE);
	}
}

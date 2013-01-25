package com.charitybuzz.domain;

import java.util.Calendar;
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
public class Item {

	private Long id;

	/**
	 * ID Lot Number:
	 */
	private Long lotNumber;

	/**
	 * 第一級目錄id
	 */
	private Long categoryId;
	/**
	 * 商品訊息
	 */
	private String title;

	/**
	 * CURRENTBID 當前標價 Current Bid: $2,250
	 */
	private Double currentBid;
	/**
	 * (6 bids)umber of Bids:
	 */
	private int numberBids;
	/**
	 * 商品 開始日期 lotStart
	 */
	private Date lotStart;
	/**
	 * Lot Closes 商品結束日期 lotClose
	 */
	private Date lotClose;

	/**
	 * ESTIMATED_VALUE 估計價值 Estimated Value: $9,500
	 */
	private Double estimatedValue;

	/**
	 * 下次最小標價 Minimum Next Bid: $2,500
	 */
	private Double minNextBid;

	/**
	 * 主要圖片路徑
	 */
	private String mainPictureLocation;
	/**
	 * 是否結標
	 */
	private boolean isEnd;

	// =======關聯資料===以下內容沒有資料庫column==========
	/**
	 * 有多個2級目錄
	 */
	private List<SubCategory> catalogItems;
	/**
	 * 歷史紀錄
	 */
	private List<Bidlog> bidlogs;
	/**
	 * 圖片
	 */
	private List<Picture> pictures;

	private Long difDay;

	// ====================================================

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getLotNumber() {
		return lotNumber;
	}

	public void setLotNumber(Long lotNumber) {
		this.lotNumber = lotNumber;
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

	public Double getCurrentBid() {
		return currentBid;
	}

	public void setCurrentBid(Double currentBid) {
		this.currentBid = currentBid;
	}

	public int getNumberBids() {
		return numberBids;
	}

	public Date getLotStart() {
		return lotStart;
	}

	public void setLotStart(Date lotStart) {
		this.lotStart = lotStart;
	}

	public Date getLotClose() {
		return lotClose;
	}

	public void setLotClose(Date lotClose) {
		this.lotClose = lotClose;
	}

	public Double getEstimatedValue() {
		return estimatedValue;
	}

	public void setEstimatedValue(Double estimatedValue) {
		this.estimatedValue = estimatedValue;
	}

	public Double getMinNextBid() {
		return minNextBid;
	}

	public void setMinNextBid(Double minNextBid) {
		this.minNextBid = minNextBid;
	}

	public String getMainPictureLocation() {
		return mainPictureLocation;
	}

	public void setMainPictureLocation(String mainPictureLocation) {
		this.mainPictureLocation = mainPictureLocation;
	}

	public boolean isEnd() {
		return isEnd;
	}

	public void setEnd(boolean isEnd) {
		this.isEnd = isEnd;
	}

	public List<SubCategory> getCatalogItems() {
		return catalogItems;
	}

	public void setCatalogItems(List<SubCategory> catalogItems) {
		this.catalogItems = catalogItems;
	}

	public List<Bidlog> getBidlogs() {
		return bidlogs;
	}

	public void setBidlogs(List<Bidlog> bidlogs) {
		this.bidlogs = bidlogs;
	}

	public List<Picture> getPictures() {
		return pictures;
	}

	public void setPictures(List<Picture> pictures) {
		this.pictures = pictures;
	}

	public Long getDifDay() {
		
		if(this.getLotClose() == null){
			return null;
		}
		long diff = this.getLotClose().getTime() - new Date().getTime() ;
		return diff / (1000 * 60 * 60 * 24);
	}

	@Override
	public String toString() {
		return ReflectionToStringBuilder.toString(this,
				ToStringStyle.SIMPLE_STYLE);
	}
}

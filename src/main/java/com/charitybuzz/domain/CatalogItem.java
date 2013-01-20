package com.charitybuzz.domain;

import java.util.Date;
import java.util.List;

/**
 * 第二級目錄
 * 
 * @author Administrator
 * 
 */
public class CatalogItem {

	private Long id;
	/**
	 * 第一級目錄
	 */
	private Long categoryId;
	private String name;
	private String descript;

	/**
	 * 全部商品
	 */
	private List<Article> commodities;
	/**
	 * 底下有幾個數量
	 */
	private int count;

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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescript() {
		return descript;
	}

	public void setDescript(String descript) {
		this.descript = descript;
	}

	public List<Article> getCommodities() {
		return commodities;
	}

	public void setCommodities(List<Article> commodities) {
		this.commodities = commodities;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

}
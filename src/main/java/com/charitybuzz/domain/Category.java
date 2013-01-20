package com.charitybuzz.domain;

import java.util.List;

/**
 * 第一級目錄
 * 
 * @author Administrator
 * 
 */
public class Category {
	private Long id;
	/**
	 * 分類種類
	 */
	private String name;
	/**
	 * 第二級目錄
	 */
	private List<CatalogItem> catalogItems;
	/**
	 * 全部商品
	 */
	private List<Article> commodities;
	/**
	 * 底下有幾個數量
	 */
	private int count;

	public Category() {
	}

	public Category(String name, int count) {
		this.name = name;
		this.count = count;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<CatalogItem> getCatalogItems() {
		return catalogItems;
	}

	public void setCatalogItems(List<CatalogItem> catalogItems) {
		this.catalogItems = catalogItems;
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

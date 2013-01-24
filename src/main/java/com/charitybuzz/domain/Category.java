package com.charitybuzz.domain;

import java.util.List;

import org.apache.commons.lang.builder.ReflectionToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

/**
 * 第一級目錄
 * 
 * @author Administrator
 * 
 */
public class Category {

	/**
	 * 第一級目錄id
	 */
	private Long id;
	/**
	 * 第一級目錄名稱分類種類
	 */
	private String name;

	// 關聯=================================
	/**
	 * 第二級目錄
	 */
	private List<SubCategory> catalogItems;
	/**
	 * 全部商品
	 */
	private List<Item> commodities;
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

	public List<SubCategory> getCatalogItems() {
		return catalogItems;
	}

	public void setCatalogItems(List<SubCategory> catalogItems) {
		this.catalogItems = catalogItems;
	}

	public List<Item> getCommodities() {
		return commodities;
	}

	public void setCommodities(List<Item> commodities) {
		this.commodities = commodities;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	@Override
	public String toString() {
		return ReflectionToStringBuilder.toString(this,
				ToStringStyle.SIMPLE_STYLE);
	}
}

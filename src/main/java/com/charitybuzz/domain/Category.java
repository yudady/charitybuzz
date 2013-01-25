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
	private List<SubCategory> subCategories;
	/**
	 * 全部商品
	 */
	private List<Item> items;
	/**
	 * 底下有幾個商品數量
	 */
	private int count;

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

	public List<SubCategory> getSubCategories() {
		return subCategories;
	}

	public void setSubCategories(List<SubCategory> subCategories) {
		this.subCategories = subCategories;
	}

	public List<Item> getItems() {
		return items;
	}

	public void setItems(List<Item> items) {
		this.items = items;
		this.count = items.size();
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

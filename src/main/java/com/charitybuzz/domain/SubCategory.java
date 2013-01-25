package com.charitybuzz.domain;

import java.util.List;

import org.apache.commons.lang.builder.ReflectionToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

/**
 * 第二級目錄
 * 
 * @author Administrator
 * 
 */
public class SubCategory {

	/**
	 * 第二級目錄id
	 */
	private Long id;
	/**
	 * 第一級目錄id
	 */
	private Long categoryId;
	/**
	 * 第二級目錄名稱
	 */
	private String name;
	/**
	 * 第二級目錄描述
	 */
	private String descript;

	/**
	 * 全部商品
	 */
	private List<Item> items;
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

	public List<Item> getitems() {
		return items;
	}

	public void setitems(List<Item> items) {
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

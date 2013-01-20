package com.charitybuzz.domain.sidebar;
/**
 * 第一級目錄
 * @author Administrator
 *
 */
public class Category {

	private String title;
	private int count;

	public Category() {
	}

	public Category(String title, int count) {
		this.title = title;
		this.count = count;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

}

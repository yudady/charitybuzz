package com.charitybuzz.domain.sidebar;

public class Headline {

	private String title;
	private int count;

	public Headline() {
	}

	public Headline(String title, int count) {
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

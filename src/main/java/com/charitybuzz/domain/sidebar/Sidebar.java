package com.charitybuzz.domain.sidebar;

import java.util.ArrayList;
import java.util.List;

public class Sidebar {

	private List<Headline> headlines = new ArrayList<Headline>();

	public Sidebar() {
	}
	
	public List<Headline> getHeadlines() {
		return headlines;
	}
	public void setHeadlines(List<Headline> headlines) {
		this.headlines = headlines;
	}
	public void add(Headline headline) {
		headlines.add(headline);
	}
	
}

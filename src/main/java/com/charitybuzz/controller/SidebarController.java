package com.charitybuzz.controller;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.charitybuzz.domain.sidebar.Category;

@Controller
@RequestMapping("/sidebar")
public class SidebarController {
	/** logger. */
	Logger log = LoggerFactory.getLogger(this.getClass());

	@RequestMapping()
	public @ResponseBody
	List<Category> getSidebar() {
		log.debug("[LOG]getSidebar");
		
		List<Category> categories = new ArrayList<Category>();
		categories.add(new Category("Celebrity", 27));
		categories.add(new Category("Entertainment", 41));
		categories.add(new Category("Music", 31));
		categories.add(new Category("Sports", 39));
		categories.add(new Category("Fashion", 16));
		categories.add(new Category("Business Experiences", 13));
		return categories;
	}

}

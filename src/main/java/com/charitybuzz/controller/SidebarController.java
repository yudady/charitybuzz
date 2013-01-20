package com.charitybuzz.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.charitybuzz.domain.sidebar.Headline;
import com.charitybuzz.domain.sidebar.Sidebar;

@Controller
@RequestMapping("/sidebar")
public class SidebarController {
	/** logger. */
	Logger log = LoggerFactory.getLogger(this.getClass());

	@RequestMapping()
	public @ResponseBody
	Sidebar getSidebar() {
		log.debug("[LOG]getSidebar");
		Sidebar sidebar = new Sidebar();
		sidebar.add(new Headline("Celebrity", 27));
		sidebar.add(new Headline("Entertainment", 41));
		sidebar.add(new Headline("Music", 31));
		sidebar.add(new Headline("Travel", 20));
		sidebar.add(new Headline("Sports", 39));
		sidebar.add(new Headline("Fashion", 16));
		sidebar.add(new Headline("Business Experiences", 13));
		return sidebar;
	}

}

package com.charitybuzz.controller;

import java.util.List;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.charitybuzz.domain.Category;
import com.charitybuzz.operate.SidebarService;

@Controller
@RequestMapping("/sidebar")
public class SidebarController {
	/** logger. */
	private Logger log = LoggerFactory.getLogger(this.getClass());

	@Resource
	private SidebarService sidebarService;

	@RequestMapping()
	public @ResponseBody List<Category> index() {
		log.debug("[sidebar]");
		return sidebarService.getSidebar();
	}

}

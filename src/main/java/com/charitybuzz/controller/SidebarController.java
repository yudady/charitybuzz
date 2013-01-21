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

	@Resource(name = "sidebarService")
	private SidebarService sidebarService;

	// TODO fix (del it 開發用)
	List<Category> categories;

	@RequestMapping()
	public @ResponseBody
	List<Category> getSidebar() {
		// TODO fix (del it 開發用)
		{
			log.debug("[LOG]getSidebar");
			if (log.isDebugEnabled()) {
				if (null == categories) {
					categories = sidebarService.getSidebar();
				}
				return categories;
			}
		}

		return sidebarService.getSidebar();
	}

}

package com.charitybuzz.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

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
	public ModelAndView bidLogin(HttpServletRequest request, ModelAndView mav) {
		log.debug("[login][biderLogin]");
		mav.setViewName("sidebar");
		List<Category> categories = sidebarService.getSidebar();
		mav.addObject("categories", categories);
		return mav;
	}
}

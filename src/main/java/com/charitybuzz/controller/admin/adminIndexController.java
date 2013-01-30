package com.charitybuzz.controller.admin;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/admin")
public class adminIndexController {
	/** logger. */
	private Logger log = LoggerFactory.getLogger(this.getClass());

	@RequestMapping(method = RequestMethod.GET)
	public String index(HttpServletRequest request, ModelAndView mav) {
		log.debug("[login][adminIndex]");
		return "adminIndex";
	}

	@RequestMapping(value = "/adminCategory", method = RequestMethod.GET)
	public String category(HttpServletRequest request, ModelAndView mav) {
		log.debug("[login][adminCategory]");
		return "adminCategory";
	}
	@RequestMapping(value = "/adminSubcategory", method = RequestMethod.GET)
	public String subcategory(HttpServletRequest request, ModelAndView mav) {
		log.debug("[login][adminSubcategory]");
		return "adminSubcategory";
	}
	@RequestMapping(value = "/adminItem", method = RequestMethod.GET)
	public String item(HttpServletRequest request, ModelAndView mav) {
		log.debug("[login][adminItem]");
		return "adminItem";
	}
	@RequestMapping(value = "/adminAuctionRule", method = RequestMethod.GET)
	public String adminAuctionRule(HttpServletRequest request, ModelAndView mav) {
		log.debug("[login][adminAuctionRule]");
		return "adminAuctionRule";
	}

}

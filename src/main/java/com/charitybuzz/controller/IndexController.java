package com.charitybuzz.controller;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.charitybuzz.service.BidderService;

@Controller
@RequestMapping("/")
public class IndexController {
	/** logger. */
	private Logger log = LoggerFactory.getLogger(this.getClass());

	@Resource
	private BidderService bidderService;

	
	
	@RequestMapping
	public String index() {
		log.debug("index");
		return "index";
	}
	@RequestMapping(method = RequestMethod.GET)
	public String all() {
		log.debug("index get");
		return "index";
	}

}

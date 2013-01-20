package com.charitybuzz.controller;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.charitybuzz.service.UserService;

@Controller
@RequestMapping("/")
public class IndexController {
	/** logger. */
	private Logger log = LoggerFactory.getLogger(this.getClass());

	@Resource(name="userService")
	private UserService userService;

	
	
	@RequestMapping
	public String index() {
		log.debug("[LOG]index");
		return "index";
	}
	@RequestMapping(method = RequestMethod.GET)
	public String all() {
		log.debug("[LOG]index get");
		return "index";
	}

}

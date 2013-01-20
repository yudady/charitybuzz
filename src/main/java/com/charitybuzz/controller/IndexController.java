package com.charitybuzz.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class IndexController {
	/** logger. */
	Logger log = LoggerFactory.getLogger(this.getClass());

	@RequestMapping()
	public String index() {
		log.debug("[LOG]index");
		return "index";
	}

}

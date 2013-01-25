package com.charitybuzz.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/code404")
public class ErrorController {
	/** logger. */
	private Logger log = LoggerFactory.getLogger(this.getClass());
	
	@RequestMapping
	public String code404() {
		log.debug("code404");
		return "code404";
	}

}

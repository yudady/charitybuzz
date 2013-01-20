package com.charitybuzz.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/contact_us")
public class ContactUsController {
	/** logger. */
	Logger log = LoggerFactory.getLogger(this.getClass());

	@RequestMapping()
	public String contactUs() {
		log.debug("[LOG]contactUs");
		return "contactus";
	}

}

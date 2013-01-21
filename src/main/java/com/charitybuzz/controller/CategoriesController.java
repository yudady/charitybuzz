package com.charitybuzz.controller;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.charitybuzz.service.UserService;

@Controller
@RequestMapping("/categories")
public class CategoriesController {
	/** logger. */
	private Logger log = LoggerFactory.getLogger(this.getClass());

	@Resource(name="userService")
	private UserService userService;

	
	
	@RequestMapping(value="/{id}",method = RequestMethod.GET)
	public String index(@PathVariable Long id) {
		log.debug("[LOG][categories]" + id);
		return "categories";
	}

}

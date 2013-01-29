package com.charitybuzz.controller.login;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/loginPage")
public class LoginPageController {
	/** logger. */
	private Logger log = LoggerFactory.getLogger(this.getClass());

	@RequestMapping(method = RequestMethod.GET)
	public String index(HttpServletRequest request, ModelAndView mav) {
		log.debug("[LOG][loginPage]");
		return "loginPage";
	}


}

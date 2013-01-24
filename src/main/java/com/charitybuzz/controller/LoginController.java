package com.charitybuzz.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.charitybuzz.domain.Bidder;
import com.charitybuzz.service.BidderService;

@Controller
@RequestMapping("/login")
public class LoginController {
	/** logger. */
	private Logger log = LoggerFactory.getLogger(this.getClass());

	@Resource(name = "bidderService")
	private BidderService bidderService;

	@RequestMapping(method = RequestMethod.GET)
	public String index(HttpServletRequest request, HttpServletResponse response) {
		log.debug("[LOG][login][index]");
		return "login";
	}

	@RequestMapping(value = "/bidLogin", method = RequestMethod.GET)
	public String bidLogin(HttpServletRequest request,
			HttpServletResponse response) {
		log.debug("[LOG][login][bidLogin]");
		return "login";
	}

	@RequestMapping(value = "/iframe", method = RequestMethod.POST)
	public String login(HttpServletRequest request, HttpServletResponse response) {
		log.debug("[LOG][login][login]");
		String email = request.getParameter("email");
		String passWord = request.getParameter("passWord");
		Bidder user = bidderService.findByEmail(email);
		if (user.getPassWord().equalsIgnoreCase(passWord)) {
			request.getSession().setAttribute("user", user);
		}
		return "login";
	}

	@RequestMapping(value = "/logout", method = RequestMethod.POST)
	public String logout(HttpServletRequest request,
			HttpServletResponse response) {
		log.debug("[LOG][login][logout]");
		request.getSession().removeAttribute("user");
		return "login";
	}

}

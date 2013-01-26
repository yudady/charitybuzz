package com.charitybuzz.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.charitybuzz.domain.Bidder;
import com.charitybuzz.service.BidderService;

@Controller
@RequestMapping("/login")
public class LoginController {
	/** logger. */
	private Logger log = LoggerFactory.getLogger(this.getClass());

	@Resource
	private BidderService bidderService;

	@RequestMapping(method = RequestMethod.GET)
	public String index(HttpServletRequest request, ModelAndView mav) {
		log.debug("[login][index]");
		return "login";
	}

	/**
	 * @param request
	 * @param mav
	 * @return
	 */
	@RequestMapping(method = RequestMethod.POST)
	public @ResponseBody
	String login(HttpServletRequest request) {
		log.debug("[login]");
		String email = request.getParameter("email");
		String passWord = request.getParameter("passWord");

		Bidder bidder = bidderService.findByEmail(email);
		if (bidder == null) {
			return "bidder error";
		} else if (bidder.getPassWord().equalsIgnoreCase(passWord)) {
			request.getSession().setAttribute("bidder", bidder);
			return "ok";
		} else {
			log.warn("密碼錯誤");
			return "密碼錯誤";
		}

	}

	@RequestMapping(value = "/logout", method = RequestMethod.POST)
	public @ResponseBody
	String logout(HttpServletRequest request, HttpServletResponse response) {
		log.debug("[login][logout]");
		request.getSession().removeAttribute("bidder");
		return "logout";
	}

}

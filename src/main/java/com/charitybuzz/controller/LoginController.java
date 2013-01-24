package com.charitybuzz.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

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

	@RequestMapping(value = "/biderLogin", method = RequestMethod.GET)
	public String bidLogin(HttpServletRequest request,
			HttpServletResponse response) {
		log.debug("[LOG][login][biderLogin]");
		return "login";
	}

	/**
	 * iframe login
	 * @param request
	 * @param mav
	 * @return
	 */
	@RequestMapping(value = "/iframe", method = RequestMethod.POST)
	public ModelAndView login(HttpServletRequest request, ModelAndView mav) {
		log.debug("[LOG][login][iframe]");
		String email = request.getParameter("email");
		String passWord = request.getParameter("passWord");

		Bidder bidder = bidderService.findByEmail(email);
		mav.setViewName("login");
		if (bidder == null) {
			mav.addObject("loginFail", "login error");
		} else if (bidder.getPassWord().equalsIgnoreCase(passWord)) {
			request.getSession().setAttribute("bidder", bidder);
		} else {
			mav.addObject("loginFail", "login error");
			log.warn("密碼錯誤");
		}

		return mav;

	}

	@RequestMapping(value = "/logout", method = RequestMethod.POST)
	public String logout(HttpServletRequest request,
			HttpServletResponse response) {
		log.debug("[LOG][login][logout]");
		request.getSession().removeAttribute("bidder");
		return "login";
	}

}

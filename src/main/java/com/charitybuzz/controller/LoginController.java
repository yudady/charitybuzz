package com.charitybuzz.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.charitybuzz.domain.User;
import com.charitybuzz.service.UserService;

@Controller
@RequestMapping("/login")
public class LoginController {
	/** logger. */
	private Logger log = LoggerFactory.getLogger(this.getClass());
	
	@Resource(name = "userService")
	private UserService userService;

	@RequestMapping(method = RequestMethod.GET)
	public String index(HttpServletRequest request,HttpServletResponse response) {
		log.debug("[LOG][login][index]");
		return "login";
	}
	@RequestMapping(method = RequestMethod.POST)
	public String login(HttpServletRequest request,HttpServletResponse response) {
		log.debug("[LOG][login][login]");
		String email = request.getParameter("email");
		String passWord = request.getParameter("passWord");
		User user = userService.findByEmail(email);
		if(user.getPassWord().equalsIgnoreCase(passWord)){
			request.getSession().setAttribute("user", user);
		}
		return "login";
	}
	@RequestMapping(value = "/logout" ,method = RequestMethod.POST)
	public String logout(HttpServletRequest request,HttpServletResponse response) {
		log.debug("[LOG][login][logout]");
		request.getSession().removeAttribute("user");
		return "login";
	}

}
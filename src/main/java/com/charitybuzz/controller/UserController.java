package com.charitybuzz.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;

import com.charitybuzz.service.UserService;

@Controller
public class UserController {
	
	
	@Resource(name="userService")
	private UserService userService;

}

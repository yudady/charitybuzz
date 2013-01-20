package com.charitybuzz.controller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloController {

	//@RequestMapping(value={"/","/hello"})
	public String hello(int id,Map<String,Object> map) {
		System.out.println(id);
		System.out.println("hello");
		map.put("hello", "world");
		return "hello";
	}
	
	@RequestMapping(value="/say")
	public String say(@RequestParam int id,Model model) {
		System.out.println("say");
		model.addAttribute("hello", "value");
		//使用Object的类型作为key,String-->string
		model.addAttribute("ok");
		return "hello";
	}
	
	@RequestMapping("/req")
	public String req(HttpServletRequest req) {
		System.out.println(req.getParameter("username"));
		return "hello";
	}
	
	
}

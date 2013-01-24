package com.charitybuzz.controller;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.charitybuzz.domain.Item;
import com.charitybuzz.service.ArticleService;
import com.charitybuzz.service.PictureService;

@Controller
@RequestMapping("/watch")
public class WatchController {
	/** logger. */
	private Logger log = LoggerFactory.getLogger(this.getClass());
	/**
	 * 全部商品
	 */
	@Resource(name = "articleService")
	private ArticleService articleService;
	/**
	 * 商品圖片
	 */
	@Resource(name = "pictureService")
	private PictureService pictureService;

	@RequestMapping(value = "/{articleId}", method = RequestMethod.GET)
	public String index() {
		//ajax
		return "bid";
	}
//	@RequestMapping(value = "/{articleId}", method = RequestMethod.GET)
//	public String index(@PathVariable Long articleId, Model model) {
//		log.debug("[LOG][articleId]=" + articleId);
//		Article article = articleService.findById(articleId);
//		log.debug("[LOG][article]" + article);
//		model.addAttribute("article", article);
//		return "article";
//	}

}

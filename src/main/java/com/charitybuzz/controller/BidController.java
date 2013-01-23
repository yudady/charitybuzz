package com.charitybuzz.controller;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.charitybuzz.controller.form.ArticleForm;
import com.charitybuzz.service.ArticleService;
import com.charitybuzz.service.PictureService;

@Controller
@RequestMapping("/bid")
public class BidController {
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

	@RequestMapping()
	public @ResponseBody
	String index(ArticleForm form) {
		log.debug("[LOG][articleId]" + form.getArticleId());
		log.debug("[LOG][amount]" + form.getAmount());
		
		articleService.findById(form.getArticleId());
		
		
		return "bid1111111111111111";
	}
//	@RequestMapping()
//	public @ResponseBody
//	String index(HttpServletRequest request, HttpServletResponse response) {
//		String articleId = request.getParameter("articleId");
//		String amount = request.getParameter("amount");
//		log.debug("[LOG][bid_id]" + articleId);
//		log.debug("[LOG][bid_amount]" + amount);
//		
//		articleService.findById(new Long(articleId));
//		
//		
//		return "bid1111111111111111";
//	}

}

package com.charitybuzz.controller;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.charitybuzz.controller.form.ArticleForm;
import com.charitybuzz.controller.msg.ReturnMsg;
import com.charitybuzz.domain.Article;
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
	ReturnMsg index(ArticleForm form){
		log.debug("[LOG][articleId]" + form.getArticleId());
		log.debug("[LOG][currentBid]" + form.getCurrentBid());

		Article article = articleService.findById(form.getArticleId());
		if (article.getMinNextBid() <= form.getCurrentBid()) {
			articleService.updateCurrentBidById(form.getArticleId(),form.getCurrentBid());
			return new ReturnMsg("success");
		}
		return new ReturnMsg("fail", 1);
	}

}

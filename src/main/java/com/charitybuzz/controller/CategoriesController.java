package com.charitybuzz.controller;

import java.util.List;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.charitybuzz.domain.Item;
import com.charitybuzz.domain.Picture;
import com.charitybuzz.service.ArticleService;
import com.charitybuzz.service.CategoryService;
import com.charitybuzz.service.PictureService;

@Controller
@RequestMapping("/categories")
public class CategoriesController {
	/** logger. */
	private Logger log = LoggerFactory.getLogger(this.getClass());

	/**
	 * 第一級目錄
	 */
	@Resource(name = "categoryService")
	private CategoryService categoryService;
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

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public String index(@PathVariable Long id, Model model) {
		log.debug("[LOG][categories][id]=" + id);

		// Category category = categoryService.findById(id);
		/**
		 * 全部商品
		 */
		List<Item> articles = articleService.findByCategoryId(id);

		for (Item article : articles) {

			Long articleId = article.getId();
			List<Picture> pictures = pictureService
					.findPictureByArticleId(articleId);
			article.setPictures(pictures);
			log.debug("[LOG][pic]" + article.getMainPictureLocation());
		}
		model.addAttribute("articles", articles);

		log.debug(articles.toString());
		return "categories";
	}

}

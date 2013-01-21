package com.charitybuzz.controller;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.charitybuzz.domain.Article;
import com.charitybuzz.domain.Category;
import com.charitybuzz.service.ArticleService;
import com.charitybuzz.service.CategoryService;

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

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public String index(@PathVariable Long id, Model model) {
		log.debug("[LOG][categories][id]=" + id);

		//Category category = categoryService.findById(id);
		/**
		 * 全部商品
		 */
		List<Article> articles = articleService.findByCategoryId(id);
		
		model.addAttribute("articles", articles);
		

		log.debug(articles.toString());
		return "categories";
	}

}

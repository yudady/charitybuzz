package com.charitybuzz.operate.impl;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.charitybuzz.domain.Article;
import com.charitybuzz.domain.CatalogItem;
import com.charitybuzz.domain.Category;
import com.charitybuzz.operate.SidebarService;
import com.charitybuzz.service.ArticleService;
import com.charitybuzz.service.CatalogItemService;
import com.charitybuzz.service.CategoryService;

@Service("sidebarService")
public class SidebarServiceImpl implements SidebarService {
	/** logger. */
	private Logger log = LoggerFactory.getLogger(this.getClass());

	/**
	 * 第一級目錄
	 */
	@Resource(name = "categoryService")
	private CategoryService categoryService;
	/**
	 * 第二級目錄
	 */
	@Resource(name = "catalogItemService")
	private CatalogItemService catalogItemService;
	/**
	 * 全部商品
	 */
	@Resource(name = "articleService")
	private ArticleService articleService;

	@Override
	public List<Category> getSidebar() {

		List<Category> categories = categoryService.findAll();

		for (int i = 0; i < categories.size(); i++) {
			Category category = categories.get(i);
			Long categoryId = category.getId();
			log.debug("[LOG][category][Name]" + category.getName());
			;
			/**
			 * 第二級目錄
			 */
			List<CatalogItem> catalogItems = catalogItemService
					.findItensByCategoryId(categoryId);
			category.setCatalogItems(catalogItems);

			/**
			 * 全部商品
			 */
			List<Article> articles = articleService
					.findByCategoryId(categoryId);
			category.setCount(articles.size());

		}
		return categories;
	}

}

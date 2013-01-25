package com.charitybuzz.operate.impl;

import java.util.List;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.charitybuzz.domain.Item;
import com.charitybuzz.domain.SubCategory;
import com.charitybuzz.domain.Category;
import com.charitybuzz.operate.SidebarService;
import com.charitybuzz.service.ItemService;
import com.charitybuzz.service.SubCategoryService;
import com.charitybuzz.service.CategoryService;

@Service
public class SidebarServiceImpl implements SidebarService {

	/** logger. */
	private Logger log = LoggerFactory.getLogger(this.getClass());
	
	/**
	 * 第一級目錄
	 */
	@Resource
	private CategoryService categoryService;
	/**
	 * 第二級目錄
	 */
	@Resource
	private SubCategoryService subCategoryService;
	/**
	 * 全部商品
	 */
	@Resource
	private ItemService itemService;

	@Override
	public List<Category> getSidebar() {

		List<Category> categories = categoryService.findAll();

		for (int i = 0; i < categories.size(); i++) {
			Category category = categories.get(i);
			Long categoryId = category.getId();
			/**
			 * 第二級目錄
			 */
			List<SubCategory> subCategories = subCategoryService
					.findItensByCategoryId(categoryId);
			System.out.println("[LOG]"+subCategories.size());
			category.setSubCategories(subCategories);
			/**
			 * 第一級目錄全部商品
			 */
			List<Item> items = itemService.findByCategoryId(categoryId);
			category.setItems(items);

		}
		return categories;
	}

}

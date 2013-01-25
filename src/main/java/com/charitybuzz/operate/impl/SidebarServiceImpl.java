package com.charitybuzz.operate.impl;

import java.util.List;

import javax.annotation.Resource;

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
			category.setSubCategories(subCategories);

			/**
			 * 全部商品
			 */
			List<Item> items = itemService
					.findByCategoryId(categoryId);
			category.setCount(items.size());

		}
		return categories;
	}

}

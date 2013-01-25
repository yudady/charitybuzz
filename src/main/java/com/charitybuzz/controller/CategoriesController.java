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
import com.charitybuzz.service.ItemService;
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
	@Resource
	private CategoryService categoryService;
	/**
	 * 全部商品
	 */
	@Resource
	private ItemService itemService;
	/**
	 * 商品圖片
	 */
	@Resource
	private PictureService pictureService;

	/**
	 * categories/2
	 * @param id
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public String fir(@PathVariable Long id, Model model) {
		log.debug("[categories][id]=" + id);

		// Category category = categoryService.findById(id);
		/**
		 * 全部商品
		 */
		List<Item> items = itemService.findByCategoryId(id);

		for (Item item : items) {

			Long itemId = item.getId();
			List<Picture> pictures = pictureService
					.findPictureByitemId(itemId);
			item.setPictures(pictures);
			log.debug("[pic]" + item.getMainPictureLocation());
		}
		model.addAttribute("items", items);

		log.debug(items.toString());
		return "items";
	}
	
	/**
	 * categories/2/subcategories/14
	 * @param categoryId
	 * @param subcategoryId
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "/{categoryId}/subcategories/{subcategoryId}", method = RequestMethod.GET)
	public String sec(@PathVariable Long categoryId, @PathVariable Long subcategoryId,Model model) {
		log.debug("[categories][id]=" + categoryId);
		
		// Category category = categoryService.findById(id);
		/**
		 * 全部商品
		 */
		List<Item> items = itemService.findByCategoryId(categoryId);
		
		for (Item item : items) {
			
			Long itemId = item.getId();
			List<Picture> pictures = pictureService
					.findPictureByitemId(itemId);
			item.setPictures(pictures);
			log.debug("[pic]" + item.getMainPictureLocation());
		}
		model.addAttribute("items", items);
		
		log.debug(items.toString());
		return "items";
	}
	
}

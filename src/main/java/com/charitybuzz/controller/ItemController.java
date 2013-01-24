package com.charitybuzz.controller;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.charitybuzz.domain.Item;
import com.charitybuzz.domain.ItemDetail;
import com.charitybuzz.service.ItemDetailService;
import com.charitybuzz.service.ItemService;
import com.charitybuzz.service.PictureService;

@Controller
@RequestMapping("/item")
public class ItemController {
	/** logger. */
	private Logger log = LoggerFactory.getLogger(this.getClass());
	/**
	 * 全部商品
	 */
	@Resource(name = "itemService")
	private ItemService itemService;

	@Resource(name = "ItemDetailService")
	private ItemDetailService itemDetailService;

	/**
	 * 商品圖片
	 */
	@Resource(name = "pictureService")
	private PictureService pictureService;

	@RequestMapping(value = "/{itemId}", method = RequestMethod.GET)
	public ModelAndView index(@PathVariable Long itemId, ModelAndView mav) {
		log.debug("[LOG][itemId]=" + itemId);
//TODO fix jsp
		Item item = itemService.findById(itemId);
		mav.setViewName("item");
		if (item == null) {
			log.warn("商品不存在");
			return mav;
		}
		mav.addObject("item", item);

		ItemDetail itemDetail = itemDetailService.findByItemId(itemId);
		if (itemDetail == null) {
			log.warn("商品明細不存在");
			return mav;
		}
		mav.addObject("itemDetail", itemDetail);

		return mav;
	}

}

package com.charitybuzz.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.charitybuzz.domain.Bidder;
import com.charitybuzz.domain.Item;
import com.charitybuzz.domain.ItemDetail;
import com.charitybuzz.domain.Picture;
import com.charitybuzz.service.ItemDetailService;
import com.charitybuzz.service.ItemService;
import com.charitybuzz.service.PictureService;
import com.charitybuzz.service.WatchingService;

@Controller
@RequestMapping("/item")
public class ItemController {
	/** logger. */
	private Logger log = LoggerFactory.getLogger(this.getClass());
	/**
	 * 全部商品
	 */
	@Resource
	private ItemService itemService;

	@Resource
	private ItemDetailService itemDetailService;
	
	@Resource
	private WatchingService watchingService;

	/**
	 * 商品圖片
	 */
	@Resource
	private PictureService pictureService;

	@RequestMapping(value = "/{itemId}", method = RequestMethod.GET)
	public ModelAndView index(@PathVariable Long itemId,
			HttpServletRequest request, ModelAndView mav) {
		log.debug("[itemId]=" + itemId);
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

		List<Picture> pictures = pictureService.findByitemId(itemId);
		if (pictures == null) {
			log.warn("多張圖片不存在");
			return mav;
		}
		item.setPictures(pictures);
		if(request.getSession() != null && request.getSession().getAttribute("bidder") != null){
			Bidder bidder = (Bidder) request.getSession().getAttribute("bidder");
			if (bidder != null) {
				boolean isWatching = watchingService.isWatch(bidder.getId() , itemId);
				mav.addObject("isWatching", isWatching);
			}
		}
		return mav;
	}

}

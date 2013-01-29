package com.charitybuzz.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.charitybuzz.service.ItemDetailService;
import com.charitybuzz.service.ItemService;
import com.charitybuzz.service.PictureService;
import com.charitybuzz.service.WatchingService;

@Controller
@RequestMapping("/item")
public class BidlogController {
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

	@RequestMapping(value = "/{itemId}/bidlog", method = RequestMethod.GET)
	public ModelAndView bidderlog(@PathVariable Long itemId,
			HttpSession session, ModelAndView mav) {
		log.debug("[itemId]/bidlog=" + itemId);
		mav.setViewName("bidlog");
		return mav;
	}

}

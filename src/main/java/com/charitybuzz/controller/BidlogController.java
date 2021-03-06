package com.charitybuzz.controller;

import java.util.List;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.charitybuzz.domain.Bidlog;
import com.charitybuzz.service.BidlogService;

@Controller
@RequestMapping("/item")

public class BidlogController {
	/** logger. */
	private Logger log = LoggerFactory.getLogger(this.getClass());
	/**
	 * 商品log
	 */
	@Resource
	private BidlogService bidlogService;

	@RequestMapping(value = "/{itemId}/bidlog", method = RequestMethod.GET)
	public ModelAndView bidderlog(@PathVariable Long itemId) {
		log.debug("[LOG][itemId][bidlog]=" + itemId);

		ModelAndView mav = new ModelAndView("bidlog");
		List<Bidlog> bidlogs = bidlogService.findByItemId(itemId);
		log.debug("[LOG]" + bidlogs.size());
		mav.addObject("bidlogs", bidlogs);
		return mav;
	}


}

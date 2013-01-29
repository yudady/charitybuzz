package com.charitybuzz.controller;

import java.util.List;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.HttpSessionRequiredException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.charitybuzz.domain.Bidder;
import com.charitybuzz.domain.Bidlog;
import com.charitybuzz.service.BidlogService;

@Controller
@RequestMapping("/item")
@SessionAttributes("bidder")
public class BidlogController {
	/** logger. */
	private Logger log = LoggerFactory.getLogger(this.getClass());
	/**
	 * 全部商品
	 */
	@Resource
	private BidlogService bidlogService;

	@RequestMapping(value = "/{itemId}/bidlog", method = RequestMethod.GET)
	public ModelAndView bidderlog(@PathVariable Long itemId,
			@ModelAttribute("bidder") Bidder bidder) {
		log.debug("[LOG][itemId]/bidlog=" + itemId);
		log.debug("[LOG][itemId]/bidder=" + bidder);

		ModelAndView mav = new ModelAndView("bidlog");
		// TODO
		List<Bidlog> bidlogs = bidlogService.findByBidderIdItemId(bidder.getId(),
				itemId);
		log.debug("[LOG]" + bidlogs.size());
		mav.addObject("bidlogs", bidlogs);
		return mav;
	}

	@ExceptionHandler({ HttpSessionRequiredException.class })
	public ModelAndView handleException(HttpSessionRequiredException ex) {
		log.warn("沒有登入");
		return new ModelAndView("redirect:/login");
	}
}

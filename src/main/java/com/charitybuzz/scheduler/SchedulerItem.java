package com.charitybuzz.scheduler;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.transaction.annotation.Transactional;

import com.charitybuzz.service.BidderService;
import com.charitybuzz.service.ItemDetailService;
import com.charitybuzz.service.ItemService;

public class SchedulerItem {

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
	private BidderService bidderService;

	@Transactional
	public void endBidding() {
		log.debug("[LOG]endBidding");
//		List<Item> items = itemService.findEndBiddingByLotclose();
//		for (Item item : items) {
//			log.debug("[LOG][item]" + item);
//			// 把商品更新為結標
//			itemService.endBidding(item.getId());
//
//			// 通知得標者 : winning bidder
//			ItemDetail itemDetail = itemDetailService
//					.findByItemId(item.getId());
//
//			log.debug("[LOG]" + itemDetail.getWinningBidderId());
//			Bidder bidder = bidderService.findById(itemDetail
//					.getWinningBidderId());
//
//			log.debug("[LOG][winning bidder]" + bidder);
//		}
	}

}

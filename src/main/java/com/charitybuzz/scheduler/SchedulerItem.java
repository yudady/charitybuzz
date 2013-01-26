package com.charitybuzz.scheduler;

import java.util.List;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.transaction.annotation.Transactional;

import com.charitybuzz.domain.Item;
import com.charitybuzz.service.ItemService;

public class SchedulerItem {

	/** logger. */
	private Logger log = LoggerFactory.getLogger(this.getClass());

	/**
	 * 全部商品
	 */
	@Resource
	private ItemService itemService;

	public void sayTenSec() {
		log.debug("[LOG]sayTenSec");
	}

	public void say5Sec() {
		log.debug("[LOG]say5Sec");
	}

	public void say1Min() {
		log.debug("[LOG]say1Min");
	}

	@Transactional
	public void findEndBiddingByLotclose() {
		log.debug("[LOG]findEndBiddingByLotclose");
		List<Item> items = itemService.findEndBiddingByLotclose();
		for (Item item : items) {
			log.debug("[LOG][item]" + item);
			
		}
	}

}

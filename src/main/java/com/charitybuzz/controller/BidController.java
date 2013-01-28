package com.charitybuzz.controller;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.charitybuzz.controller.form.ItemForm;
import com.charitybuzz.controller.msg.ReturnMsg;
import com.charitybuzz.domain.Item;
import com.charitybuzz.domain.ItemDetail;
import com.charitybuzz.operate.NextValueService;
import com.charitybuzz.service.ItemDetailService;
import com.charitybuzz.service.ItemService;
import com.charitybuzz.service.PictureService;

@Controller
@RequestMapping("/bid")
public class BidController {
	/** logger. */
	private Logger log = LoggerFactory.getLogger(this.getClass());
	/**
	 * 全部商品
	 */
	@Resource
	private ItemService itemService;
	@Resource
	private ItemDetailService itemDetailService;
	/**
	 * 商品圖片
	 */
	@Resource
	private PictureService pictureService;
	
	@Resource
	private NextValueService nextValueService;
	
	@RequestMapping()
	public @ResponseBody
	ReturnMsg index(ItemForm form){
		log.debug("[LOG][itemId]" + form.getItemId());
		log.debug("[LOG][currentBid]" + form.getCurrentBid());
		Item item = itemService.findById(form.getItemId());
		if (item.getMinNextBid() <= form.getCurrentBid()) {
			
			ItemDetail itemDetail = itemDetailService.findByItemId(item.getId());
			Double minNextBid = nextValueService.findMinNextBid(itemDetail.getAuctionRuleId(),
					form.getCurrentBid());
			itemService.updateCurrentBidMinNextBidById(form.getItemId(),form.getCurrentBid(),minNextBid);
			
			
			return new ReturnMsg("success");
		}
		log.debug("[LOG][item.getMinNextBid()]" + item.getMinNextBid());
		return new ReturnMsg("fail", 1);
	}

}

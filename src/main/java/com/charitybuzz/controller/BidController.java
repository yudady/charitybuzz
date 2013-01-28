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
	/**
	 * 商品圖片
	 */
	@Resource
	private PictureService pictureService;
	
	@RequestMapping()
	public @ResponseBody
	ReturnMsg index(ItemForm form){
		log.debug("[itemId]" + form.getItemId());
		log.debug("[currentBid]" + form.getCurrentBid());
//TODO fix item need reload
		Item item = itemService.findById(form.getItemId());
		if (item.getMinNextBid() <= form.getCurrentBid()) {
			itemService.updateCurrentBidById(form.getItemId(),form.getCurrentBid());
			return new ReturnMsg("success");
		}
		return new ReturnMsg("fail", 1);
	}

}

package com.charitybuzz.controller.dwr;

import javax.annotation.Resource;

import org.directwebremoting.annotations.RemoteMethod;
import org.directwebremoting.annotations.RemoteProxy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;

import com.charitybuzz.service.WatchingService;

@Controller
@RemoteProxy(name = "watch")
@Transactional
public class WatchController {

	/** logger. */
	private Logger log = LoggerFactory.getLogger(this.getClass());

	@Resource
	private WatchingService watchingService;

	@RemoteMethod
	public String item(Long itemId, Long bidderId, String watchStatus) {
		log.debug("[watch]" + itemId);
		log.debug("[watch]" + bidderId);
		log.debug("[watch]" + watchStatus);
		if ("1".equals(watchStatus)) {
			watchingService.addBidderWaching(bidderId , itemId);
		} else {
			watchingService.delBidderWaching(bidderId , itemId);
		}
		return "watch itemId=" + itemId + " bidderId=" + bidderId
				+ " watchStatus=" + watchStatus;
	}

}

package com.charitybuzz.controller.dwr;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.directwebremoting.WebContextFactory;
import org.directwebremoting.annotations.RemoteMethod;
import org.directwebremoting.annotations.RemoteProxy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;

import com.charitybuzz.domain.Bidder;
import com.charitybuzz.service.WatchingService;

@Controller
@RemoteProxy(name = "watch")
public class WatchController {

	/** logger. */
	private Logger log = LoggerFactory.getLogger(this.getClass());

	@Resource
	private WatchingService watchingService;

	@RemoteMethod
	public String item(Long itemId, String watchStatus) {
		HttpSession session = WebContextFactory.get().getSession();
		Bidder bidder = (Bidder) session.getAttribute("bidder");
		
		log.debug("[watch][itemId]=" + itemId + "[watchStatus]=" + watchStatus
				+ "[bidder]=" + bidder);
		
		
		if ("1".equals(watchStatus)) {
			watchingService.addBidderWaching(bidder.getId(), itemId);
		} else {
			watchingService.delBidderWaching(bidder.getId(), itemId);
		}
		return "watch itemId=" + itemId + " bidderId=" + bidder.getId()
				+ " watchStatus=" + watchStatus;
	}

}

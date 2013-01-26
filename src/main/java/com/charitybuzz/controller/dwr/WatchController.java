package com.charitybuzz.controller.dwr;

import org.directwebremoting.annotations.RemoteMethod;
import org.directwebremoting.annotations.RemoteProxy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;

@Controller
@RemoteProxy(name="watch")
@Transactional
public class WatchController {
	
	/** logger. */
	private Logger log = LoggerFactory.getLogger(this.getClass());

	
	@RemoteMethod
	public String item(int itemId) {
		log.debug("[watch]" + itemId);
		
		
		return "watch" + itemId;
	}

}

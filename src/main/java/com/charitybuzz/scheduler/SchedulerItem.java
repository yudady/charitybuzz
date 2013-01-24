package com.charitybuzz.scheduler;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SchedulerItem {

	/** logger. */
	private Logger log = LoggerFactory.getLogger(this.getClass());
	
	public void sayTenSec() {
		log.debug("[LOG]sayTenSec");
	}
	public void say5Sec() {
		log.debug("[LOG]say5Sec");
	}

	public void say1Min() {
		log.debug("[LOG]say1Min");
	}

}

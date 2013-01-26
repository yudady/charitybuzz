package com.charitybuzz.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.charitybuzz.dao.WatchingDao;
import com.charitybuzz.service.WatchingService;

@Service
public class WatchingServiceImpl implements WatchingService {

	
	@Resource
	private WatchingDao watchingDao;
	
	@Override
	public int addBidderWaching(Long bidderId, Long itemId) {
		return watchingDao.insert(bidderId, itemId);
	}

	@Override
	public int delBidderWaching(Long bidderId, Long itemId) {
		return watchingDao.deleteByBidderIdItemId(bidderId, itemId);
	}


}

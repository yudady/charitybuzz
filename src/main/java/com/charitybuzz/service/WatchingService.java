package com.charitybuzz.service;


public interface WatchingService {

	int addBidderWaching(Long bidderId, Long itemId);

	int delBidderWaching(Long bidderId, Long itemId);

}

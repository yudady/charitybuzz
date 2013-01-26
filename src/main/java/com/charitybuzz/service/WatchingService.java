package com.charitybuzz.service;


public interface WatchingService {

	public int addBidderWaching(Long bidderId, Long itemId);

	public int delBidderWaching(Long bidderId, Long itemId);

	public boolean isWatch(Long id, Long itemId);

}

package com.charitybuzz.service;

import java.util.List;

import com.charitybuzz.domain.Bidlog;


public interface BidlogService {

	public List<Bidlog> findByBidderIdItemId(Long bidderId, Long itemId);

	public List<Bidlog> findByItemId(Long itemId);

}

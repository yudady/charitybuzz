package com.charitybuzz.dao;

import com.charitybuzz.domain.Watching;

public interface WatchingDao extends BaseDao<Watching> {

	public int deleteByBidderIdItemId(Long bidderId, Long itemId);

	public Watching findByBidderIdItemId(Long bidderId, Long itemId);

}

package com.charitybuzz.dao;

import com.charitybuzz.domain.Watching;

public interface WatchingDao extends BaseDao<Watching> {

	public int insert(Long bidderId, Long itemId);

	public int deleteByBidderIdItemId(Long bidderId, Long itemId);

}

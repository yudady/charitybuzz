package com.charitybuzz.service;

import java.util.List;

import com.charitybuzz.domain.Item;

public interface ItemService {

	public List<Item> findByCategoryId(Long id);

	public Item findById(Long itemId);

	public int updateCurrentBidById(Long itemId, Double currentBid);

}

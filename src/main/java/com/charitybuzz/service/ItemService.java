package com.charitybuzz.service;

import java.util.List;

import com.charitybuzz.domain.Item;

public interface ItemService {

	public List<Item> findByCategoryId(Long categoryId);

	public Item findById(Long itemId);

	public int updateCurrentBidById(Long itemId, Double currentBid);

	public List<Item> findBySubCategoryId(Long subcategoryId);

	/**
	 * 找出需要結帳的商品
	 * @return Item
	 */
	public List<Item> findEndBiddingByLotclose();

	/**
	 * 結標
	 * @param id
	 * @return
	 */
	public int endBidding(Long id);
}

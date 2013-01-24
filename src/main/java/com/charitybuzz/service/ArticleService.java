package com.charitybuzz.service;

import java.util.List;

import com.charitybuzz.domain.Item;

public interface ArticleService {

	public List<Item> findByCategoryId(Long id);

	public Item findById(Long articleId);

	public int updateCurrentBidById(Long articleId, Double currentBid);

}

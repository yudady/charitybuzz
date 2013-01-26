package com.charitybuzz.dao;

import java.util.Date;
import java.util.List;

import com.charitybuzz.domain.Item;

public interface ItemDao extends BaseDao<Item> {

	public List<Item> findByCategoryId(Long categoryId);

	public List<Item> findBySubCategoryId(Long subcategoryId);

	public List<Item> findEndBiddingByLotclose(Date date);

}

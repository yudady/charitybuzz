package com.charitybuzz.dao;

import java.util.List;

import com.charitybuzz.domain.Item;

public interface ItemDao extends BaseDao<Item> {

	public List<Item> findByCategoryId(Long categoryId);

	public List<Item> findBySubCategoryId(Long subcategoryId);

}

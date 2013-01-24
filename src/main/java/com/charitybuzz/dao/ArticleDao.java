package com.charitybuzz.dao;

import java.util.List;

import com.charitybuzz.domain.Item;

public interface ArticleDao extends BaseDao<Item> {

	public List<Item> findByCategoryId(Long id);

}

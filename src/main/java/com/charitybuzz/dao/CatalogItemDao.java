package com.charitybuzz.dao;

import java.util.List;

import com.charitybuzz.domain.CatalogItem;

public interface CatalogItemDao extends BaseDao<CatalogItem> {

	List<CatalogItem> findByCategoryId(Long id);

}

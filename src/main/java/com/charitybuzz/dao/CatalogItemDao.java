package com.charitybuzz.dao;

import java.util.List;

import com.charitybuzz.domain.SubCategory;

public interface CatalogItemDao extends BaseDao<SubCategory> {

	List<SubCategory> findByCategoryId(Long id);

}

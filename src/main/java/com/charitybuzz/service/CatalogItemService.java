package com.charitybuzz.service;

import java.util.List;

import com.charitybuzz.domain.SubCategory;

public interface CatalogItemService {

	public List<SubCategory> findItensByCategoryId(Long id);

}

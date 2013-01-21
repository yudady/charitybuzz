package com.charitybuzz.service;

import java.util.List;

import com.charitybuzz.domain.CatalogItem;

public interface CatalogItemService {

	public List<CatalogItem> findItensByCategoryId(Long id);

}

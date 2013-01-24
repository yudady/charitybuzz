package com.charitybuzz.service.impl;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.charitybuzz.dao.SubCategoryDao;
import com.charitybuzz.domain.SubCategory;
import com.charitybuzz.service.SubCategoryService;

@Service("catalogItemService")
public class SubCategoryServiceImpl implements SubCategoryService {
	@Resource(name = "catalogItemJdbcDao")
	private SubCategoryDao catalogItemDao;

	@Override
	public List<SubCategory> findItensByCategoryId(Long id) {
		List<SubCategory> catalogItems = catalogItemDao.findByCategoryId(id);
		if (catalogItems.size() > 0) {
			return catalogItems;
		}
		return new ArrayList<SubCategory>();
	}

}

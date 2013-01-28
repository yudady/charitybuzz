package com.charitybuzz.service.impl;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.charitybuzz.dao.SubCategoryDao;
import com.charitybuzz.domain.SubCategory;
import com.charitybuzz.service.SubCategoryService;

@Service
public class SubCategoryServiceImpl implements SubCategoryService {
	
	@Resource
	private SubCategoryDao subCategoryDao;

	@Override
	public List<SubCategory> findItensByCategoryId(Long categoryId) {
		List<SubCategory> catalogItems = subCategoryDao.findListByColumn("categoryId", categoryId);
		if (catalogItems.size() > 0) {
			return catalogItems;
		}
		return new ArrayList<SubCategory>();
	}

}

package com.charitybuzz.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.charitybuzz.dao.CategoryDao;
import com.charitybuzz.domain.Category;
import com.charitybuzz.service.CategoryService;

@Service("categoryService")
public class CategoryServiceImpl implements CategoryService {
	@Resource(name = "categoryJdbcDao")
	private CategoryDao categoryDao;

	@Override
	public List<Category> findAll() {
		return categoryDao.findAll();
	}

	@Override
	public Category findById(Long id) {
		return categoryDao.findById(id);
	}

}

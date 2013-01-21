package com.charitybuzz.service;

import java.util.List;

import com.charitybuzz.domain.Category;

public interface CategoryService {

	public List<Category> findAll();

	public Category findById(Long id);

}

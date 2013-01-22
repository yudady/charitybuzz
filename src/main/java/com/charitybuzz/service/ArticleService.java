package com.charitybuzz.service;

import java.util.List;

import com.charitybuzz.domain.Article;

public interface ArticleService {

	public List<Article> findByCategoryId(Long id);

	public Article findById(Long articleId);

}

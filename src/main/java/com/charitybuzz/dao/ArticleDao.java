package com.charitybuzz.dao;

import java.util.List;

import com.charitybuzz.domain.Article;

public interface ArticleDao {
	
	public int insert(Article article);
	
	public int update(Article article);
	
	public int delete(Long articleId);
	
	public Article findById(Long articleId);

	public List<Article> findAll();
	
	public int findTotalCount();

}

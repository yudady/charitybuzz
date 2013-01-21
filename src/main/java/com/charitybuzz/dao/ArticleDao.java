package com.charitybuzz.dao;

import java.util.List;

import com.charitybuzz.domain.Article;

public interface ArticleDao extends BaseDao<Article> {

	public List<Article> findByCategoryId(Long id);

}

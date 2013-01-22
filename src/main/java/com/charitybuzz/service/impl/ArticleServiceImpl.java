package com.charitybuzz.service.impl;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.charitybuzz.dao.ArticleDao;
import com.charitybuzz.domain.Article;
import com.charitybuzz.service.ArticleService;

@Service("articleService")
public class ArticleServiceImpl implements ArticleService {
	/** logger. */
	private Logger log = LoggerFactory.getLogger(this.getClass());
	/**
	 * 
	 */
	@Resource(name = "articleJdbcDao")
	private ArticleDao articleDao;

	@Override
	public List<Article> findByCategoryId(Long id) {
		log.debug("[LOG][ArticleServiceImpl]findByCategoryId" + id);
		List<Article> articles = articleDao.findByCategoryId(id);
		if (articles.size() > 0) {
			return articles;
		}
		return new ArrayList<Article>();
	}

	@Override
	public Article findById(Long articleId) {
		return articleDao.findById(articleId);
	}

}

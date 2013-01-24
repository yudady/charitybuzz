package com.charitybuzz.service.impl;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.charitybuzz.dao.ArticleDao;
import com.charitybuzz.domain.Item;
import com.charitybuzz.service.ArticleService;

@Service("articleService")
@Transactional
public class ArticleServiceImpl implements ArticleService {
	@Resource(name = "articleJdbcDao")
	private ArticleDao articleDao;

	@Override
	public List<Item> findByCategoryId(Long id) {
		List<Item> articles = articleDao.findByCategoryId(id);
		if (articles.size() > 0) {
			return articles;
		}
		return new ArrayList<Item>();
	}

	@Override
	public Item findById(Long articleId) {
		return articleDao.findById(articleId);
	}

	@Override
	public int updateCurrentBidById(Long articleId, Double currentBid) {
		return articleDao.updateNameById("currentBid", articleId, currentBid);
	}

}

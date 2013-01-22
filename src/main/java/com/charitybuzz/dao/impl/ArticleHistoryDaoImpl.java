package com.charitybuzz.dao.impl;

import javax.inject.Inject;
import javax.sql.DataSource;

import org.springframework.stereotype.Repository;

import com.charitybuzz.dao.ArticleHistoryDao;
import com.charitybuzz.domain.ArticleHistory;

@Repository("articleHistoryJdbcDao")
public class ArticleHistoryDaoImpl extends BaseDaoImpl<ArticleHistory>
		implements ArticleHistoryDao {

	/**
	 * 注入DataSource
	 * 
	 * @param dataSource
	 */
	@Inject
	public ArticleHistoryDaoImpl(DataSource dataSource) {
		setDataSource(dataSource);
	}

	@Override
	public Class<ArticleHistory> getClazz() {
		return ArticleHistory.class;
	}

	@Override
	public String getTableName() {
		return "t_article_history";
	}

	@Override
	public int insert(ArticleHistory articleHistory) {
		String sql = "";
		return super.insert(sql, articleHistory);
	}

	@Override
	public int update(ArticleHistory articleHistory) {
		String sql = " ";
		return super.update(sql, articleHistory);
	}

}

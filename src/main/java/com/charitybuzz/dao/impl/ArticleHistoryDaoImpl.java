package com.charitybuzz.dao.impl;

import javax.inject.Inject;
import javax.sql.DataSource;

import org.springframework.stereotype.Repository;

import com.charitybuzz.dao.ArticleHistoryDao;
import com.charitybuzz.domain.Bidlog;

@Repository("articleHistoryJdbcDao")
public class ArticleHistoryDaoImpl extends BaseDaoImpl<Bidlog>
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
	public Class<Bidlog> getClazz() {
		return Bidlog.class;
	}

	@Override
	public String getTableName() {
		return "t_article_history";
	}

	@Override
	public int insert(Bidlog articleHistory) {
		String sql = "";
		return super.insert(sql, articleHistory);
	}

	@Override
	public int update(Bidlog articleHistory) {
		String sql = " ";
		return super.update(sql, articleHistory);
	}

}

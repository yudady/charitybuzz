package com.charitybuzz.dao.impl;

import javax.inject.Inject;
import javax.sql.DataSource;

import org.springframework.stereotype.Repository;

import com.charitybuzz.dao.ArticleDao;
import com.charitybuzz.domain.Article;

@Repository("articleJdbcDao")
public class ArticleDaoImpl extends BaseDaoImpl<Article> implements ArticleDao {

	/**
	 * 注入DataSource
	 * 
	 * @param dataSource
	 */
	@Inject
	public ArticleDaoImpl(DataSource dataSource) {
		setDataSource(dataSource);
	}

	@Override
	public Class<Article> getClazz() {
		return Article.class;
	}
	@Override
	public String getTableName() {
		return "t_article";
	}
	@Override
	public int insert(Article article) {
		String sql = "INSERT INTO t_article (ID,LOTDETAILS,LEGALTERMS,SHIPPING,CURRENTBID,STARTDATE,ENDDATE,USERID,ESTIMATEDVALUE) "
				+ " VALUES (:id, :lotDetails, :legalTerms, :shipping, :currentBid, :startDate, :endDate , :userId, :estimatedValue) ";
		return super.insert(sql, article);
	}

	@Override
	public int update(Article article) {
		String sql = " UPDATE T_ARTICLE SET LOTDETAILS=:lotDetails, LEGALTERMS=:legalTerms,"
				+ "SHIPPING=:shipping,CURRENTBID=:currentBid,STARTDATE=:startDate,ENDDATE=:endDate,"
				+ "USERID=:userId,ESTIMATEDVALUE=:estimatedValue WHERE ID=:id ";
		return super.update(sql, article);
	}


}

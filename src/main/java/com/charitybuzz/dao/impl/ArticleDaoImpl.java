package com.charitybuzz.dao.impl;

import java.util.List;

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
	public int insert(Article article) {
		String sql = "INSERT INTO t_article (ID,LOTDETAILS,LEGALTERMS,SHIPPING,CURRENTBID,STARTDATE,ENDDATE,USERID,ESTIMATEDVALUE) "
				+ " VALUES (:id, :lotDetails, :legalTerms, :shipping, :currentBid, :startDate, :endDate , :userId, :estimatedValue) ";
		return super.insert(sql, article);
	}

	@Override
	public int update(Article article) {
		String sql = " UPDATE T_ARTICLE SET LOTDETAILS=:LOTDETAILS, LEGALTERMS=:LEGALTERMS,"
				+ "SHIPPING=:SHIPPING,CURRENTBID=:CURRENTBID,STARTDATE=:STARTDATE,ENDDATE=:ENDDATE,"
				+ "USERID=:USERID,ESTIMATEDVALUE=:ESTIMATEDVALUE,BIDLEVELID=:BIDLEVELID,NEXTBID=:NEXTBID WHERE ID=:ID ";
		return super.update(sql, article);
	}

	@Override
	public int delete(Long articleId) {
		String sql = "delete from t_article where id=:id";
		return super.delete(sql, articleId);
	}

	@Override
	public Article findById(Long articleId) {
		String sql = "SELECT * FROM t_article WHERE ID = ?";
		return super.findById(sql, articleId);
	}

	@Override
	public List<Article> findAll() {
		String sql = "select * from t_article";
		return super.findAll(sql);
	}

	@Override
	public int findTotalCount() {
		String sql = " select count(id) from t_article ";
		return super.findTotalCount(sql);
	}

}

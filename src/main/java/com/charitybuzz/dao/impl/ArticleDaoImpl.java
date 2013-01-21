package com.charitybuzz.dao.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;
import javax.sql.DataSource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.simple.ParameterizedBeanPropertyRowMapper;
import org.springframework.stereotype.Repository;

import com.charitybuzz.dao.ArticleDao;
import com.charitybuzz.domain.Article;

@Repository("articleJdbcDao")
public class ArticleDaoImpl extends BaseDaoImpl<Article> implements ArticleDao {
	/** logger. */
	private Logger log = LoggerFactory.getLogger(this.getClass());

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

	@Override
	public List<Article> findByCategoryId(Long id) {
		log.debug("[LOG][CategoryId]" + id);
		String sql = "select * from " + getTableName()
				+ " where CATEGORYID=:categoryId";
		BeanPropertyRowMapper<Article> rm = ParameterizedBeanPropertyRowMapper
				.newInstance(getClazz());
		Map<String, Object> args = new HashMap<String, Object>();
		args.put("categoryId", id);
		return this.getSimpleJdbcTemplate().query(sql, rm, args);
	}

}

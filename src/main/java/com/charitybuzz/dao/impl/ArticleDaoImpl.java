package com.charitybuzz.dao.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;
import javax.sql.DataSource;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.simple.ParameterizedBeanPropertyRowMapper;
import org.springframework.stereotype.Repository;

import com.charitybuzz.dao.ArticleDao;
import com.charitybuzz.domain.Item;

@Repository("articleJdbcDao")
public class ArticleDaoImpl extends BaseDaoImpl<Item> implements ArticleDao {

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
	public Class<Item> getClazz() {
		return Item.class;
	}

	@Override
	public String getTableName() {
		return "t_article";
	}

	@Override
	public int insert(Item article) {
		String sql = "INSERT INTO t_article (ID,LOTDETAILS,LEGALTERMS,SHIPPING,CURRENTBID,STARTDATE,ENDDATE,USERID,ESTIMATEDVALUE) "
				+ " VALUES (:id, :lotDetails, :legalTerms, :shipping, :currentBid, :startDate, :endDate , :userId, :estimatedValue) ";
		return super.insert(sql, article);
	}

	@Override
	public int update(Item article) {
		String sql = " UPDATE t_article SET LOTDETAILS=:lotDetails, LEGALTERMS=:legalTerms,"
				+ "SHIPPING=:shipping,CURRENTBID=:currentBid,STARTDATE=:startDate,ENDDATE=:endDate,"
				+ "USERID=:userId,ESTIMATEDVALUE=:estimatedValue WHERE ID=:id ";
		return super.update(sql, article);
	}

	@Override
	public List<Item> findByCategoryId(Long id) {
		String sql = "select * from " + getTableName()
				+ " where CATEGORYID=:categoryId";
		BeanPropertyRowMapper<Item> rm = ParameterizedBeanPropertyRowMapper
				.newInstance(getClazz());
		Map<String, Object> args = new HashMap<String, Object>();
		args.put("categoryId", id);
		return this.getSimpleJdbcTemplate().query(sql, rm, args);
	}

}

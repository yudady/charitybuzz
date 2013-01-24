package com.charitybuzz.dao.impl;

import java.util.HashMap;
import java.util.Map;

import javax.inject.Inject;
import javax.sql.DataSource;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.simple.ParameterizedBeanPropertyRowMapper;
import org.springframework.stereotype.Repository;

import com.charitybuzz.dao.BidderDao;
import com.charitybuzz.domain.Bidder;

@Repository("bidderJdbcDao")
public class BidderDaoImpl extends BaseDaoImpl<Bidder> implements BidderDao {

	/**
	 * 注入DataSource
	 * 
	 * @param dataSource
	 */
	@Inject
	public BidderDaoImpl(DataSource dataSource) {
		setDataSource(dataSource);
	}

	@Override
	public Class<Bidder> getClazz() {
		return Bidder.class;
	}

	@Override
	public String getTableName() {
		return " t_user ";
	}

	@Override
	public int insert(Bidder user) {
		String sql = "INSERT INTO t_user (id,firstName,lastName,screenName,passWord,email,promoCode) "
				+ " VALUES (:id, :firstName, :lastName, :screenName, :passWord, :email, :promoCode) ";
		return super.insert(sql, user);

	}

	@Override
	public int update(Bidder user) {
		String sql = " update t_user set firstName=:firstName, lastName=:lastName, "
				+ "screenName=:screenName, passWord=:passWord, email=:email, "
				+ "promoCode=:promoCode where id=:id ";
		return super.update(sql, user);

	}

	@Override
	public Bidder findByEmail(String email) {
		String sql = "select * from " + getTableName() + " where email=:email";
		BeanPropertyRowMapper<Bidder> rm = ParameterizedBeanPropertyRowMapper
				.newInstance(getClazz());
		Map<String, Object> args = new HashMap<String, Object>();
		args.put("email", email);
		return this.getSimpleJdbcTemplate().queryForObject(sql, rm, args);
	}

}

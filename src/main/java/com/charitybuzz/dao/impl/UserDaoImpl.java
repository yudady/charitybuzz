package com.charitybuzz.dao.impl;

import javax.inject.Inject;
import javax.sql.DataSource;

import org.springframework.stereotype.Repository;

import com.charitybuzz.dao.UserDao;
import com.charitybuzz.domain.User;

@Repository("userJdbcDao")
public class UserDaoImpl extends BaseDaoImpl<User> implements UserDao {

	/**
	 * 注入DataSource
	 * 
	 * @param dataSource
	 */
	@Inject
	public UserDaoImpl(DataSource dataSource) {
		setDataSource(dataSource);
	}

	@Override
	public Class<User> getClazz() {
		return User.class;
	}

	@Override
	public String getTableName() {
		return "t_user";
	}

	@Override
	public int insert(User user) {
		String sql = "INSERT INTO T_USER (ID,FIRSTNAME,LASTNAME,SCREENNAME,PASSWORD,EMAIL,PROMOCODE) "
				+ " VALUES (:id, :firstName, :lastName, :screenName, :passWord, :email, :promoCode) ";
		return super.insert(sql, user);

	}

	@Override
	public int update(User user) {
		String sql = " update T_USER set FIRSTNAME=:firstName, LASTNAME=:lastName, "
				+ "SCREENNAME=:screenName, PASSWORD=:passWord, EMAIL=:email, "
				+ "PROMOCODE=:promoCode where ID=:id ";
		return super.update(sql, user);

	}

}

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
		return " t_user ";
	}

	@Override
	public int insert(User user) {
		String sql = "INSERT INTO t_user (id,firstName,lastName,screenName,passWord,email,promoCode) "
				+ " VALUES (:id, :firstName, :lastName, :screenName, :passWord, :email, :promoCode) ";
		return super.insert(sql, user);

	}

	@Override
	public int update(User user) {
		String sql = " update t_user set firstName=:firstName, lastName=:lastName, "
				+ "screenName=:screenName, passWord=:passWord, email=:email, "
				+ "promoCode=:promoCode where id=:id ";
		return super.update(sql, user);

	}

}

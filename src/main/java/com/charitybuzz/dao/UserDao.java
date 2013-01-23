package com.charitybuzz.dao;

import com.charitybuzz.domain.User;

public interface UserDao extends BaseDao<User> {

	User findByEmail(String email);

}

package com.charitybuzz.dao;

import com.charitybuzz.domain.Bidder;

public interface UserDao extends BaseDao<Bidder> {

	Bidder findByEmail(String email);

}

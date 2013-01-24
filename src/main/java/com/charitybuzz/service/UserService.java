package com.charitybuzz.service;

import java.util.List;

import com.charitybuzz.domain.Bidder;

public interface UserService {
	
	public List<Bidder> findAll();

	public Bidder findByEmail(String email);

}

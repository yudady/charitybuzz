package com.charitybuzz.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.charitybuzz.dao.BidderDao;
import com.charitybuzz.domain.Bidder;
import com.charitybuzz.service.BidderService;

@Service("bidderService")
public class BidderServiceImpl implements BidderService {

	@Resource(name = "bidderJdbcDao")
	private BidderDao bidderDao;

	public List<Bidder> findAll() {
		return bidderDao.findAll();
	}

	@Override
	public Bidder findByEmail(String email) {
		return bidderDao.findByEmail(email);
	};

}

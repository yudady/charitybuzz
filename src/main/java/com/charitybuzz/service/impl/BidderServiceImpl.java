package com.charitybuzz.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import com.charitybuzz.dao.BidderDao;
import com.charitybuzz.domain.Bidder;
import com.charitybuzz.service.BidderService;

@Service
public class BidderServiceImpl implements BidderService {
	/** logger. */
	private Logger log = LoggerFactory.getLogger(this.getClass());

	@Resource
	private BidderDao bidderDao;

	public List<Bidder> findAll() {
		return bidderDao.findAll();
	}

	@Override
	public Bidder findByEmail(String email) {
		Bidder binder = null;
		try {
			binder = bidderDao.findByEmail(email);
		} catch (EmptyResultDataAccessException t) {
			log.warn("投標者不存在", t);
		}
		return binder;
	}

	@Override
	public Bidder findById(Long bidderId) {
		Bidder binder = null;
		try {
			binder = bidderDao.findById(bidderId);
		} catch (EmptyResultDataAccessException t) {
			log.warn("投標者不存在", t);
		}
		return binder;
	};

}

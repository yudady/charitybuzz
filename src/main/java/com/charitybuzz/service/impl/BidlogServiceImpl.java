package com.charitybuzz.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.charitybuzz.dao.BidlogDao;
import com.charitybuzz.domain.Bidlog;
import com.charitybuzz.service.BidlogService;

@Service
public class BidlogServiceImpl implements BidlogService {

	@Resource
	private BidlogDao bidlogDao;

	@Override
	public List<Bidlog> findByBidderIdItemId(Long bidderId, Long itemId) {
		return bidlogDao.findListByColumns(
				new String[] { "bidderId", "itemId" }, new Object[] { bidderId,
						itemId });
	}

	@Override
	public List<Bidlog> findByItemId(Long itemId) {
		return bidlogDao.findListByColumns(new String[] { "itemId" },
				new Object[] { itemId });

	}

}

package com.charitybuzz.service.impl;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import com.charitybuzz.dao.ItemDao;
import com.charitybuzz.domain.Item;
import com.charitybuzz.service.ItemService;

@Service
public class ItemServiceImpl implements ItemService {

	/** logger. */
	private Logger log = LoggerFactory.getLogger(this.getClass());

	@Resource
	private ItemDao itemDao;

	@Override
	public List<Item> findByCategoryId(Long id) {
		List<Item> items = itemDao.findByCategoryId(id);
		if (items.size() > 0) {
			return items;
		}
		return new ArrayList<Item>();
	}

	@Override
	public Item findById(Long itemId) {
		
		Item item = null;
		try {
			item = itemDao.findById(itemId);
		} catch (EmptyResultDataAccessException t) {
			log.warn("商品不存在", t);
		}
		
		return item;
	}

	@Override
	public int updateCurrentBidById(Long itemId, Double currentBid) {
		return itemDao.updateNameById("currentBid", itemId, currentBid);
	}

}

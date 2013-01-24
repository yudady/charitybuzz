package com.charitybuzz.service.impl;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.charitybuzz.dao.ItemDao;
import com.charitybuzz.domain.Item;
import com.charitybuzz.service.ItemService;

@Service("itemService")
@Transactional
public class ItemServiceImpl implements ItemService {
	@Resource(name = "itemJdbcDao")
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
		return itemDao.findById(itemId);
	}

	@Override
	public int updateCurrentBidById(Long itemId, Double currentBid) {
		return itemDao.updateNameById("currentBid", itemId, currentBid);
	}

}

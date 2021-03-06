package com.charitybuzz.service.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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
	@Transactional
	public int updateCurrentBidById(Long itemId, Double currentBid) {
		return itemDao.updateNamesById(new String[]{"currentBid"}, itemId, new Object[]{currentBid});
	}

	@Override
	public List<Item> findByCategoryId(Long categoryId) {
		List<Item> items = itemDao.findByCategoryId(categoryId);
		if (items.size() > 0) {
			return items;
		}
		return new ArrayList<Item>();
	}

	@Override
	public List<Item> findBySubCategoryId(Long subcategoryId) {
		List<Item> items = itemDao.findBySubCategoryId(subcategoryId);
		if (items.size() > 0) {
			return items;
		}
		return new ArrayList<Item>();
	}

	@Override
	public List<Item> findEndBiddingByLotclose() {
		List<Item> items = itemDao.findEndBiddingByLotclose(new Date());
		if (items.size() > 0) {
			return items;
		}
		log.info("需要結帳的商品不存在");
		return new ArrayList<Item>();
	}

	@Override
	public int endBidding(Long id) {
		// 把商品更新為結標
		return itemDao.updateNamesById(new String[]{"status"}, id, new Object[]{0});
	}

	@Override
	public int updateCurrentBidMinNextBidById(Long itemId, Double currentBid,
			Double minNextBid) {
		return itemDao
				.updateNamesById(new String[] { "currentBid", "minNextBid" },
						itemId, new Object[] { currentBid, minNextBid });
	}

}

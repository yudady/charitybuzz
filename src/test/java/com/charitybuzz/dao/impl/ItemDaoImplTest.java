package com.charitybuzz.dao.impl;

import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import com.charitybuzz.dao.ItemDao;
import com.charitybuzz.dao.ItemDetailDao;
import com.charitybuzz.domain.Item;
import com.charitybuzz.domain.ItemDetail;

@Transactional
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:/com/charitybuzz/dao/impl/applicationContext.xml" })
public class ItemDaoImplTest {

	private Logger log = LoggerFactory.getLogger(this.getClass());

	@Resource
	private ItemDao itemDao;
	@Resource
	private ItemDetailDao itemDetailDao;

	@Test
	public void findTotalCount() {
		log.debug("[LOG]" + itemDao.findTotalCount());
	}

	@Test
	public void findAll() {
		List<Item> domains = itemDao.findAll();
		for (int i = 0; i < domains.size(); i++) {
			log.debug("[LOG]" + domains.get(i));
		}
	}

	@Test
	@Rollback(true)
	public void insert() {
		Item domain = new Item();
		domain.setId(100L);
		// 2L, 1L,"lotDetails", "legalTerms","shipping", 1d, new Date(), new
		// Date(), 1L, 100d
		log.debug("[LOG]" + itemDao.insert(domain));
	}

	@Test
	@Rollback(true)
	public void update() {
		Item domain = new Item();
		domain.setId(2L);
		log.debug("[LOG]" + itemDao.update(domain));
	}

	@Test
	@Rollback(true)
	public void delete() {
		log.debug("[LOG]" + itemDao.delete(1L));
	}

	@Test
	public void findByUserId() {
		Item u = itemDao.findById(1L);
		log.debug("[LOG]" + u);
	}

	@Test
	@Rollback(true)
	public void endBidding() {
		List<Item> items = itemDao.findEndBiddingByLotclose(new Date());
		for (Item item : items) {
			log.debug("[LOG]" + item);
			//把商品更新為結標
			itemDao.updateNameById("status", item.getId(), 0);
			ItemDetail itemDetail = itemDetailDao.findByItemId(item.getId());
			//winning bidder
			log.debug("[LOG]" + itemDetail.getWinningBidderId());
		}
	}
	
	
	@Test
	@Rollback(false)
	public void noEndBidding() {
		List<Item> items = itemDao.findAll();
		for (Item item : items) {
			log.debug("[LOG]" + item);
			//把商品更新為未結標
			itemDao.updateNameById("status", item.getId(), 1);
			ItemDetail itemDetail = itemDetailDao.findByItemId(item.getId());
			//winning bidder
			log.debug("[LOG]" + itemDetail.getWinningBidderId());
		}
	}

}

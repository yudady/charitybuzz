package com.charitybuzz.service.impl;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import com.charitybuzz.dao.ItemDetailDao;
import com.charitybuzz.domain.ItemDetail;
import com.charitybuzz.service.ItemDetailService;

@Service("itemDetailService")
public class ItemDetailServiceImpl implements ItemDetailService {

	/** logger. */
	private Logger log = LoggerFactory.getLogger(this.getClass());

	@Resource(name = "itemDetailJdbcDao")
	private ItemDetailDao itemDetailDao;

	@Override
	public ItemDetail findByItemId(Long itemId) {

		ItemDetail itemDetail = null;
		try {
			itemDetail = itemDetailDao.findItemDetailByItemId(itemId);
		} catch (EmptyResultDataAccessException t) {
			log.warn("商品明細不存在", t);
		}

		return itemDetail;

	}

}

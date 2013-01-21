package com.charitybuzz.service.impl;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.charitybuzz.dao.CatalogItemDao;
import com.charitybuzz.domain.CatalogItem;
import com.charitybuzz.service.CatalogItemService;

@Service("catalogItemService")
public class CatalogItemServiceImpl implements CatalogItemService {
	/** logger. */
	private Logger log = LoggerFactory.getLogger(this.getClass());
	/**
	 * 
	 */
	@Resource(name = "catalogItemJdbcDao")
	private CatalogItemDao catalogItemDao;
	
	
	@Override
	public List<CatalogItem> findItensByCategoryId(Long id) {
		log.debug("[LOG]findItensByCategoryId" + id);
		List<CatalogItem> catalogItems = catalogItemDao.findByCategoryId(id);
		if(catalogItems.size() > 0){
			return catalogItems;
		}
		return new ArrayList<CatalogItem>();
	}


}

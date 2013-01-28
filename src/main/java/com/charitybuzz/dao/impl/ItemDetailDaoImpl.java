package com.charitybuzz.dao.impl;

import java.util.List;

import javax.inject.Inject;
import javax.sql.DataSource;

import org.springframework.stereotype.Repository;

import com.charitybuzz.dao.ItemDetailDao;
import com.charitybuzz.domain.ItemDetail;

@Repository
public class ItemDetailDaoImpl extends BaseDaoImpl<ItemDetail> implements
		ItemDetailDao {

	/**
	 * 注入DataSource
	 * 
	 * @param dataSource
	 */
	@Inject
	public ItemDetailDaoImpl(DataSource dataSource) {
		setDataSource(dataSource);
	}

	@Override
	public Class<ItemDetail> getClazz() {
		return ItemDetail.class;
	}

	@Override
	public ItemDetail findByItemId(Long itemId) {
		List<ItemDetail> itemDetails = this.findListByColumn("itemId", itemId);
		if(itemDetails.size() > 0){
			return itemDetails.get(0);
		}
		return null;

	}

}

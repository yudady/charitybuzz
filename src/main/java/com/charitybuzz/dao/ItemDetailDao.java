package com.charitybuzz.dao;

import com.charitybuzz.domain.ItemDetail;

public interface ItemDetailDao extends BaseDao<ItemDetail> {

	public ItemDetail findByItemId(Long itemId);

}

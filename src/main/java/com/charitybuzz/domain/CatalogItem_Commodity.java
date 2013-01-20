package com.charitybuzz.domain;

import java.util.Date;
import java.util.List;

/**
 * 中間表
 * @author Administrator
 *
 */
public class CatalogItem_Commodity {

	private Long id;
	/**
	 * 有哪些商品
	 */
	private List<Article> commodities;

	/**
	 * 有多個2級目錄
	 */
	private List<CatalogItem> catalogItems;


 

}

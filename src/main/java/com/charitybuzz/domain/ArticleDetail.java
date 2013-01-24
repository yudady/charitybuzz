package com.charitybuzz.domain;

import java.util.Date;
import java.util.List;

import org.apache.commons.lang.builder.ReflectionToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

/**
 * 商品
 * 
 * @author Administrator
 * 
 */
public class ArticleDetail {
	/**
	 * ID Lot Number:
	 */
	private Long id;
	/**
	 * 第一級目錄id
	 */
	private Long articleId;

	/**
	 * LOTDETAILS訊息
	 */
	private String lotDetails;
	/**
	 * LEGALTERMS訊息
	 */
	private String legalTerms;
	/**
	 * SHIPPING訊息
	 */
	private String shipping;

	
	
	
	@Override
	public String toString() {
		return ReflectionToStringBuilder.toString(this,
				ToStringStyle.SIMPLE_STYLE);
	}

}

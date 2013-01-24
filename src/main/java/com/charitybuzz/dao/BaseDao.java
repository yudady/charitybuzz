package com.charitybuzz.dao;

import java.util.List;

public interface BaseDao<T> {
	
	public int insert(T item);
	
	public int update(T item);
	
	public int updateNameById(String column, Long id, Object obj);
	
	public int updateNamesById(String[] columns, Long id, Object[] objs);
	
	public int delete(Long id);
	
	public T findById(Long id);

	public List<T> findAll();
	
	public int findTotalCount();

}

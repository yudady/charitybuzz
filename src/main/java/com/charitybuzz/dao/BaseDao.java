package com.charitybuzz.dao;

import java.util.List;

public interface BaseDao<T> {
	
	public int insert(String[] columns,Object[] objs);
	
	public int updateNamesById(String[] columns, Long id, Object[] objs);
	
	public int delete(Long id);
	
	public T findById(Long id);

	public List<T> findAll();
	
	public int findTotalCount();
	
	public T findByColumns(String[] columns, Object[] objs);

	public List<T> findListByColumn(String nameId,Long id);
	
	public List<T> findListByColumns(String[] nameId,Object[] objs);
}

package com.mr.site.DAO;

import java.util.List;

/**
 * 基本的DAO
 * @author gaohailong
 *
 * @param <T>
 */
public interface DAO<T> {
	/**
	 * 插入一个数据
	 * @param sql
	 * @param objects
	 * @return 返回id
	 */
	long insert(String sql, Object... objects);
	
	/**
	 * 插入一个数据
	 * @param sql
	 * @param objects
	 */
	void insertNoReturn(String sql, Object... objects);
	
	/**
	 * 更改一个数据
	 * @param sql
	 * @param objects
	 */
	void update(String sql, Object... objects);
	
	/**
	 * 查询一个对象
	 * @param sql
	 * @param args
	 * @return 实体类对象
	 */
	T query(String sql, Object... args);
	
	/**
	 * 删除一个数据
	 * @param sql
	 * @param objects
	 */
	void delete(String sql,Object...objects);
	
	/**
	 * 查询一个集合
	 * @param sql
	 * @param args
	 * @return 返回一个集合对象
	 */
	List<T> queryForList(String sql, Object... args);
}

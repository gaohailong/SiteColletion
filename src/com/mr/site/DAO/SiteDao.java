package com.mr.site.DAO;

import java.util.List;

import com.mr.site.bean.Site;

public interface SiteDao {
	/**
	 * 通过分类获取所有的值
	 * 
	 * @return
	 */
	List<Site> getAllName(int categeory);

	/**
	 * 获取所有的值
	 * 
	 * @return
	 */
	List<Site> getAllName();
	
	/**
	 * 设置点击次数
	 */
	
	void counterAdd(int id);
}

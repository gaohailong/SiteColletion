package com.mr.site.service;

import java.util.List;

import com.mr.site.bean.Site;

public interface ISiteService {
	/**
	 * 获取每个分类下的网址
	 * 
	 * @param id
	 * @return 集合分类名
	 */
	List<Site> getSiteData(int id);

	/**
	 * 获取所有的网址
	 * 
	 * @param id
	 * @return 集合分类名
	 */
	List<Site> getSiteData();

	/**
	 * 点击量+1
	 * 
	 * @param id
	 */
	void setCounter(int id);
	
	/**
	 * 添加网址
	 * 
	 * @param id
	 */
	void addSite(String name, String link, String categeory);
}

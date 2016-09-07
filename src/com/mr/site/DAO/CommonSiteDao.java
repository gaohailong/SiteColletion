package com.mr.site.DAO;

import java.util.List;

import com.mr.site.bean.Site;

/**
 * 获取常用网址
 * @author Administrator
 *
 */
public interface CommonSiteDao{
	
	/**
	 * 获取常用的网址
	 * @return
	 */
	List<Site> getCommonSite();
}

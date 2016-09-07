package com.mr.site.service;

import java.util.List;

import com.mr.site.bean.Site;


public interface ICommonSiteService {
	/**
	 * 获取常用网址分类
	 * 
	 * @return
	 */
	List<Site> getCommonSite();
}

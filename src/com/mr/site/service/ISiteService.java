package com.mr.site.service;

import java.util.List;

public interface ISiteService {
	/**
	 * 获取每个分类下的网址的名字
	 * 
	 * @param id
	 * @return 集合分类名
	 */
	List<String> getSiteNameData(int id);
}

package com.mr.site.DAO;

import java.util.List;

import com.mr.site.bean.Site;

public interface SiteDao {
	/**
	 * 获取所有的name
	 * @return
	 */
	 List<Site> getAllName(int categeory);
}

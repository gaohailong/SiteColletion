package com.mr.site.DAO.impl;

import java.util.List;

import com.mr.site.DAO.CollectionTypeDao;
import com.mr.site.DAO.CommonSiteDao;
import com.mr.site.bean.CollectionType;
import com.mr.site.bean.Site;

/**
 * 获取常用的网址
 * 
 * @author Administrator
 *
 */
public class CommonSiteDaoImpl extends BaseDao<Site>implements CommonSiteDao {

	/**
	 * 获取常用的网址
	 */
	@Override
	public List<Site> getCommonSite() {
		String sql = "select * from site order by frequency desc limit 10;";
		return queryForList(sql);
	}

}

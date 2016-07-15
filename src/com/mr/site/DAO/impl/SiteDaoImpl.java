package com.mr.site.DAO.impl;

import java.util.List;

import com.mr.site.DAO.SiteDao;
import com.mr.site.bean.Site;

public class SiteDaoImpl extends BaseDao<Site> implements SiteDao{

	@Override
	public List<Site> getAllName(int id) {
		String sql = "select name from site where categeory = ?";
		return queryForList(sql, id);
	}
	
}

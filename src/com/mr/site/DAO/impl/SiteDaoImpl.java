package com.mr.site.DAO.impl;

import java.util.List;

import com.mr.site.DAO.SiteDao;
import com.mr.site.bean.CollectionType;
import com.mr.site.bean.Site;

public class SiteDaoImpl extends BaseDao<Site> implements SiteDao {

	@Override
	public List<Site> getAllName(int id) {
		String sql = "select * from site where categeory = ?";
		return queryForList(sql, id);
	}

	@Override
	public List<Site> getAllName() {
		String sql = "select * from site";
		return queryForList(sql);
	}

	@Override
	public void counterAdd(int id) {
		String sql = "update site set frequency=(frequency+1) where id=?";
		update(sql, id);
	}

	@Override
	public void addSite(String name, String link, int categeory) {
		String sql = "insert into site (name,link,categeory) values ( ?, ?, ?)";
		insertNoReturn(sql, name, link, categeory);
	}
	
}

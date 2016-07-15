package com.mr.site.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.mr.site.DAO.SiteDao;
import com.mr.site.DAO.impl.SiteDaoImpl;
import com.mr.site.bean.Site;
import com.mr.site.service.ISiteService;

public class SiteService implements ISiteService {
	private SiteDao siteDao = new SiteDaoImpl();

	@Override
	public List<String> getSiteNameData(int id) {
		List<Site> sites = siteDao.getAllName(id);
		List<String> siteName = new ArrayList<String>();
		for (Site site : sites) {
			String name = site.getName();
			siteName.add(name);
		}
		return siteName;
	}
}

package com.mr.site.service.impl;

import java.util.List;

import com.mr.site.DAO.SiteDao;
import com.mr.site.DAO.impl.SiteDaoImpl;
import com.mr.site.bean.Site;
import com.mr.site.service.ISiteService;

public class SiteService implements ISiteService {
	private SiteDao siteDao = new SiteDaoImpl();

	@Override
	public List<Site> getSiteData(int id) {
		List<Site> sites = siteDao.getAllName(id);
		/*
		 * List<String> siteName = new ArrayList<String>(); for (Site site :
		 * sites) { String name = site.getName(); siteName.add(name); }
		 */
		return sites;
	}

	@Override
	public List<Site> getSiteData() {
		List<Site> sites = siteDao.getAllName();
		return sites;
	}

	@Override
	public void setCounter(int id) {
		siteDao.counterAdd(id);
	}

	@Override
	public void addSite(String name, String link, String categeory) {
		try {
			int categeoryNum = Integer.valueOf(categeory);
			siteDao.addSite(name, link, categeoryNum);
		} catch (NumberFormatException e) {
			e.printStackTrace();
		}
	}

}

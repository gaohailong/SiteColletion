package com.mr.site.test;


import java.util.List;

import org.junit.Test;

import com.mr.site.DAO.SiteDao;
import com.mr.site.DAO.impl.SiteDaoImpl;
import com.mr.site.bean.Site;

public class SiteServiceTest {
	private SiteDao siteDao = new SiteDaoImpl();

	@Test
	public void testGetName() {
		List<Site> sites = siteDao.getAllName(1);
//		List<String> siteName = new ArrayList<String>();
		for (Site site : sites) {
			String name = site.getName();
			System.out.println(name);
		}
	}

}

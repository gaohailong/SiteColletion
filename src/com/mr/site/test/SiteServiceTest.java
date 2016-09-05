package com.mr.site.test;

import java.util.List;

import org.junit.Test;

import com.mr.site.DAO.SiteDao;
import com.mr.site.DAO.impl.SiteDaoImpl;
import com.mr.site.bean.Site;

public class SiteServiceTest {
	private SiteDao siteDao = new SiteDaoImpl();

	@Test
	public void testGetDataById() {
		List<Site> sites = siteDao.getAllName(1);
		for (Site site : sites) {
			System.out.println(site.toString());
		}
	}

	@Test
	public void testGetData() {
		List<Site> sites = siteDao.getAllName();
		for(int i=0;i<sites.size();i++){
			System.out.println(sites.get(i).toString());
		}
	}
	
	

}

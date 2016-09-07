package com.mr.site.service.impl;

import java.util.List;

import com.mr.site.DAO.CommonSiteDao;
import com.mr.site.DAO.impl.CommonSiteDaoImpl;
import com.mr.site.bean.Site;
import com.mr.site.service.ICommonSiteService;

public class CommonSiteService implements ICommonSiteService{
	
	private CommonSiteDao commonSiteDao=new CommonSiteDaoImpl();
	
	@Override
	public List<Site> getCommonSite() {
		return commonSiteDao.getCommonSite();
	}

}

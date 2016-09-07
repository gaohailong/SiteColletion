package com.mr.site.test;

import org.junit.Test;

import com.mr.site.service.ICommonSiteService;
import com.mr.site.service.impl.CommonSiteService;

public class CommonSiteServiceTest {
	
	private ICommonSiteService commonSiteService=new CommonSiteService();
	
	@Test
	public void testGetCommonSite(){
		System.out.println(commonSiteService.getCommonSite().get(0).getId());
		System.out.println(commonSiteService.getCommonSite().size());
	}
	
}

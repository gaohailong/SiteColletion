package com.mr.site.test;

import org.junit.Test;

import com.mr.site.service.ICollectionTypeService;
import com.mr.site.service.impl.CollectionTypeService;

public class CollectionTypeTest {
	private ICollectionTypeService service=new CollectionTypeService();
	@Test
	public void testGetAllType(){
		System.out.println(service.getAllType().size()); 
		System.out.println(service.getAllType().get(1).getId()); 
	}
}

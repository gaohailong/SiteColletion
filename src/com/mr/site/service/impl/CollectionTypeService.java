package com.mr.site.service.impl;

import java.util.List;

import com.mr.site.DAO.CollectionTypeDao;
import com.mr.site.DAO.impl.CollectionTypeDaoImpl;
import com.mr.site.bean.CollectionType;
import com.mr.site.service.ICollectionTypeService;

public class CollectionTypeService implements ICollectionTypeService {
	private CollectionTypeDao collection = new CollectionTypeDaoImpl();
	
	/**
	 * 获取所有的分类信息
	 */
	@Override
	public List<CollectionType> getAllType() {
		return collection.getCollectType();
	}

}

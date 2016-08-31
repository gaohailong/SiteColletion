package com.mr.site.service;

import java.util.List;

import com.mr.site.bean.CollectionType;

/**
 * 获取分类的service
 * 
 * @author gaohailong
 *
 */
public interface ICollectionTypeService {
	/**
	 * 获取收藏分类
	 * 
	 * @return
	 */
	List<CollectionType> getAllType();
}

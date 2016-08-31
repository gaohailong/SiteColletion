package com.mr.site.DAO;

import java.util.List;

import com.mr.site.bean.CollectionType;
/**
 * 获取收藏的分类
 * @author gaohailong
 *
 */
public interface CollectionTypeDao {
	/**
	 * 获得收藏分类
	 */
	List<CollectionType> getCollectType();
}

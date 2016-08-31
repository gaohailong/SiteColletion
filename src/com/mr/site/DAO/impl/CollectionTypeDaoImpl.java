package com.mr.site.DAO.impl;

import java.util.List;

import com.mr.site.DAO.CollectionTypeDao;
import com.mr.site.bean.CollectionType;

/**
 * 获取收藏的分类
 * 
 * @author gaohailong
 *
 */
public class CollectionTypeDaoImpl extends BaseDao<CollectionType> implements CollectionTypeDao {

	@Override
	public List<CollectionType> getCollectType() {
		String sql = "select * from subject_categeory";
		return queryForList(sql);
	}
	
}

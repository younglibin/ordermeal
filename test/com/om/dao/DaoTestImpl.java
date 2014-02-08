package com.om.dao;

import java.util.List;

import com.om.common.dao.AbstarctDao;


public class DaoTestImpl  implements DaoTest {
	private AbstarctDao abstarctDao;
	public int getCount(String sql){
		return abstarctDao.selectCount(sql);
	}
	public void setAbstarctDao(AbstarctDao abstarctDao) {
		this.abstarctDao = abstarctDao;
	}
	@Override
	public List getPageList(String sql,int min,int max) {
		// TODO Auto-generated method stub
		return abstarctDao.queryForList(sql, min, max);
	}
	
	
}

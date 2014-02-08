package com.om.service;

import java.util.List;

import com.om.dao.DaoTest;

public class TestServiceImpl implements TestService {
	private DaoTest testDao;
	public void setTestDao(DaoTest testDao) {
		this.testDao = testDao;
	}

	@Override
	public int getCount(String sql) {
		// TODO Auto-generated method stub
		return testDao.getCount(sql);
	}
	


	@Override
	public List getPageList(String sql,int min,int max) {
		// TODO Auto-generated method stub
		return testDao.getPageList(sql, min, max);
	}

}

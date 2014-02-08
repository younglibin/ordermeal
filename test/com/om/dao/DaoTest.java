package com.om.dao;

import java.util.List;

public interface DaoTest {
	public int getCount(String sql);
	public List getPageList(String sql,int min,int max);
}

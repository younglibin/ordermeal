package com.om.service;

import java.util.List;

public interface TestService {
	public int getCount(String sql);
	public List getPageList(String sql,int min,int max);
}

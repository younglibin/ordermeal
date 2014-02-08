package com.om.common.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

import com.ibatis.sqlmap.client.SqlMapClient;

public class AbstractDaoImpl extends SqlMapClientDaoSupport implements AbstarctDao {
 
	@Autowired
	public  void setSqlMapClientForAutowire(SqlMapClient sqlMapClient){
		super.setSqlMapClient(sqlMapClient);
	}

//	private SqlMapClientTemplate sqlMapClientTemplate = this.getSqlMapClientTemplate();
	@Override
	public int selectCount(String sql) {
		return this.selectCount(sql, null);
	}
	
	public int selectCount(String sql,Object parpams ) {
		Object obj = this.getSqlMapClientTemplate().queryForObject(sql, parpams);
		if(null != obj){
			return Integer.valueOf(obj.toString());
		}else{
			return 0;
		}
	}

	@Override
	public int delete(String sql) {
		// TODO Auto-generated method stub
		return this.delete(sql,null);
	}

	@Override
	public int delete(String sql, Object params) {
		// TODO Auto-generated method stub
		return this.getSqlMapClientTemplate().delete(sql, params);
	}

	@Override
	public Object insert(String sql) {
		// TODO Auto-generated method stub
		return this.insert(sql, null);
	}

	@Override
	public Object insert(String sql, Object params) {
		// TODO Auto-generated method stub
		return this.getSqlMapClientTemplate().insert(sql, params);
	}

	@Override
	public List queryForList(String sql) {
		// TODO Auto-generated method stub
		return this.queryForList(sql,null);
	}

	@Override
	public List queryForList(String sql, int min, int max) {
		// TODO Auto-generated method stub
		return this.queryForList(sql,null, min, max);
	}

	@Override
	public List queryForList(String sql, Object params) {
		// TODO Auto-generated method stub
		return this.getSqlMapClientTemplate().queryForList(sql, params);
	}

	@Override
	public List queryForList(String sql, Object params, int min, int max) {
		// TODO Auto-generated method stub
		return this.getSqlMapClientTemplate().queryForList(sql, params, min,max);
	}

	@Override
	public Object queryForObject(String sql) {
		// TODO Auto-generated method stub
		return this.queryForObject(sql,null);
	}

	@Override
	public Object queryForObject(String sql, Object params) {
		// TODO Auto-generated method stub
		return this.getSqlMapClientTemplate().queryForObject(sql, params);
	}

	@Override
	public int update(String sql) {
		// TODO Auto-generated method stub
		return this.update(sql, null);
	}

	@Override
	public int update(String sql, Object params) {
		// TODO Auto-generated method stub
		return this.getSqlMapClientTemplate().update(sql, params);
	}
	
}

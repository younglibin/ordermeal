package com.om.common.dao;

import java.util.List;

/**
 * 公共的 数据库操作 包含，数据的CRUD 操作，不包含具体业务
  * @ClassName: AbstarctDao  
  * @Description: TODO 
  * @author: libin 
  * @date:Nov 2, 2012 10:46:33 AM
 */
public interface AbstarctDao {
	/**
	 * 根据sql 返回查询的条数
	  * @Title: selectCount  
	  * @Description: TODO 
	  * @param sql
	  * @return 
	  * @return int 
	  * @author: libin  
	  * @date:Nov 5, 2012 6:32:49 PM 
	  * @throws
	 */
	public int selectCount(String sql);
	/**
	 *  执行带参数的查询
	  * @Title: selectCount  
	  * @Description: TODO 
	  * @param sql
	  * @param parpams
	  * @return 
	  * @return int 
	  * @author: libin  
	  * @date:Nov 5, 2012 6:33:12 PM 
	  * @throws
	 */
	public int selectCount(String sql,Object parpams );
	
	/**
	 * 执行删除语句
	  * @Title: delete  
	  * @Description: TODO 
	  * @param sql
	  * @return 
	  * @return int 
	  * @author: libin  
	  * @date:Nov 5, 2012 6:41:26 PM 
	  * @throws
	 */
	public int delete(String sql);
	/**
	 *  执行带参数的删除语句
	  * @Title: delete  
	  * @Description: TODO 
	  * @param sql
	  * @param params
	  * @return 
	  * @return int 
	  * @author: libin  
	  * @date:Nov 5, 2012 6:41:54 PM 
	  * @throws
	 */
	public int delete(String sql ,Object params);
	
	/**
	 * 执行插入语句
	  * @Title: insert  
	  * @Description: TODO 
	  * @param sql
	  * @return 
	  * @return Object 
	  * @author: libin  
	  * @date:Nov 5, 2012 6:42:10 PM 
	  * @throws
	 */
	public Object insert(String sql);
	/**
	 *  执行带参数插入语句
	  * @Title: insert  
	  * @Description: TODO 
	  * @param sql
	  * @param params
	  * @return 
	  * @return Object 
	  * @author: libin  
	  * @date:Nov 5, 2012 6:42:28 PM 
	  * @throws
	 */
	public Object insert(String sql,Object params);
	
	/**
	 * 执行查询语句
	  * @Title: queryForList  
	  * @Description: TODO 
	  * @param sql
	  * @return 
	  * @return List 
	  * @author: libin  
	  * @date:Nov 5, 2012 6:43:11 PM 
	  * @throws
	 */
	public List queryForList(String sql);
	
	
	/**
	 * 执行分页查询
	  * @Title: queryForList  
	  * @Description: TODO 
	  * @param sql
	  * @param min 开始条数
	  * @param max 最大条数
	  * @return 
	  * @return List 
	  * @author: libin  
	  * @date:Nov 5, 2012 6:45:15 PM 
	  * @throws
	 */
	public List queryForList(String sql,int min,int max);
	/**
	 * 执行带参数的查询语句
	  * @Title: queryForList  
	  * @Description: TODO 
	  * @param sql
	  * @param params
	  * @return 
	  * @return List 
	  * @author: libin  
	  * @date:Nov 5, 2012 6:43:43 PM 
	  * @throws
	 */
	public List queryForList(String sql,Object params);
	
	
	/**
	 * 执行带参数的分页查询查询语句
	  * @Title: queryForList  
	  * @Description: TODO 
	  * @param sql
	  * @param params
	  * @return 
	  * @return List 
	  * @author: libin  
	  * @date:Nov 5, 2012 6:43:43 PM 
	  * @throws
	 */
	public List queryForList(String sql,Object params,int min,int max);
	
	/**
	 * 执行返回一个对象的sql
	  * @Title: queryForObject  
	  * @Description: TODO 
	  * @param sql
	  * @return 
	  * @return Object 
	  * @author: libin  
	  * @date:Nov 5, 2012 6:47:38 PM 
	  * @throws
	 */
	public Object queryForObject(String sql);
	/**
	 * 执行带参数返回一个对象的sql
	  * @Title: queryForObject  
	  * @Description: TODO 
	  * @param sql
	  * @return 
	  * @return Object 
	  * @author: libin  
	  * @date:Nov 5, 2012 6:47:38 PM 
	  * @throws
	 */
	public Object queryForObject(String sql,Object params);
	/**
	 * 执行更新语句
	  * @Title: update  
	  * @Description: TODO 
	  * @param sql
	  * @return 
	  * @return int 
	  * @author: libin  
	  * @date:Nov 5, 2012 6:49:17 PM 
	  * @throws
	 */
	public int update(String sql);
	/**
	 * 执行带参数更新语句
	  * @Title: update  
	  * @Description: TODO 
	  * @param sql
	  * @return 
	  * @return int 
	  * @author: libin  
	  * @date:Nov 5, 2012 6:49:17 PM 
	  * @throws
	 */
	public int update(String sql,Object params);
}

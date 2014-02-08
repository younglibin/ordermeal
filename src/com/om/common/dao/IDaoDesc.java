package com.om.common.dao;

/**
 * 所有使用sql 的配置的名称
  * @ClassName: IDaoDesc  
  * @Description: TODO 
  * @author: libin 
  * @date:Nov 2, 2012 11:01:19 AM
 */
public abstract class IDaoDesc {
	/**
	 * 测试查询
	 */
	public static final String SELECT_TEST_COUNT="test.select_test_count";
	/**
	 * 测试查询
	 */
	public static final String SELECT_TEST_LIST="test.select_test_list";
	/**
	 * 查询学生信息
	 */
	public static final String GET_STUDENT_BYID="get_student_byId";
	/**
	 * 插入学生信息
	 */
	public static final String INSERT_STUDENT="insert_student";
	
}

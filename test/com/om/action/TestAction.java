package com.om.action;
import com.om.common.CommonAction;
import com.om.common.dao.IDaoDesc;
import com.om.service.TestService;


/**
 * struts test
  * @ClassName: TestAction  
  * @Description: TODO 
  * @author: libin 
  * @date:Nov 1, 2012 1:54:23 PM
 */
public class TestAction extends CommonAction {
	/**  
	  * @Fields: serialVersionUID 
	  * @Todo: TODO 
	  * @author: libin  
	  * @date:Nov 1, 2012 2:58:44 PM 
	  */ 
	private static final long serialVersionUID = 1L;

	private TestService testService;
	public String testMethod(){
		log.info("log  日志 测试通过");
		System.out.println("action  test  .......");
		log.info("测试 spring 注入 Dao  start");
		int count  = testService.getCount(IDaoDesc.SELECT_TEST_COUNT);
		log.info("查询返回值："+count);
		log.info("测试 spring 注入 Dao  end");
		return SUCCESS;
	}
	public void setTestService(TestService testService) {
		this.testService = testService;
	}
	
	
}

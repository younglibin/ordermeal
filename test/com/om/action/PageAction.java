package com.om.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.om.common.CommonAction;
import com.om.common.dao.IDaoDesc;
import com.om.common.page.util.Page;
import com.om.common.page.util.PageHelper;
import com.om.common.util.PropPage;
import com.om.po.MyTestPo;
import com.om.service.TestService;

public class PageAction extends CommonAction {
	private TestService testService;
	
	private List<MyTestPo> tesList  ;
	
	public void setTestService(TestService testService) {
		this.testService = testService;
	}

	public String querPage(){
		HttpServletRequest request = ServletActionContext.getRequest();
		int count = this.testService.getCount(IDaoDesc.SELECT_TEST_COUNT);
		Page page = PageHelper.getPage(request, count,PropPage.PAGE_NUM );
		tesList = this.testService.getPageList(IDaoDesc.SELECT_TEST_LIST, page.getFirstResult()-1, page.getPageListNum());
		return this.SUCCESS;
	}

	public List<MyTestPo> getTesList() {
		return tesList;
	}

	public void setTesList(List<MyTestPo> tesList) {
		this.tesList = tesList;
	}
	
	
}

package com.om.common;

import java.io.Serializable;

import org.apache.log4j.Logger;

import com.opensymphony.xwork2.ActionSupport;

/**
 *项目公共使用action  所有action 都需要继承 该类 。该类如果需要修改 和 框架负责人联系
  * @ClassName: CommonAction  
  * @Description: TODO 
  * @author: libin 
  * @date:Nov 1, 2012 1:59:00 PM
 */
public class CommonAction extends ActionSupport implements Serializable {
	protected final Logger log = Logger.getLogger(CommonAction.class);
}

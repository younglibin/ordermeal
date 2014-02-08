package com.om.common.util;

import org.apache.commons.lang3.StringUtils;
import org.apache.log4j.PropertyConfigurator;

import com.om.common.page.util.PageConfiger;

/**
 * 读取配置文件每页展示的数量
  * @ClassName: PropertiesValue  
  * @Description: TODO 
  * @author: libin 
  * @date:Nov 6, 2012 3:52:26 PM
 */
public class PropPage extends ConfigurableConstants {
	static{
		init("/page/page.properties");
		PropertyConfigurator.configure(p);
	}
	
	public static final int PAGE_NUM=getInitProperty(PageConfiger.PAGE_LIST_NUM);
	protected static int getInitProperty(String key) {
		int re=0;
		String prop = p.getProperty(key, "0");
		if(StringUtils.isNotEmpty(prop)){
			re = Integer.valueOf(prop);
		}
		return re;
	}
}

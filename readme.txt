UTF-8

开发环境搭建：
1.环境：meEclipse6.5 及以上兼容版
2.JDK：jdk1.6.0_22  及以上兼容版
3.项目编码：UTF-8 （右键：properties --> resource -->text file  encode）
4.项目编译JVM：6.0（properties -->java Compiler -- JDK Compliance -->COmpiler compliance lever --> 6.0）
5.服务器：tomcat
		下载 tomcat6.0.35
			 在   conf/web.xml文件中将  listings  的值  改为 true
			 在		conf/server.xml 动态配置 项目发布
			 
			    <Host  ...........>
			 		<Context path="/orderMeal" 
			 		docBase="D:/***/WebRoot" reloadable="true" debug="0"/>
			 		
			   </Host>
6.将项目中 的 批量删除jar包.bat 按照说明  修改 ，启动tomcat之前 ，执行该文件，该文件 是 ，删除  tomcat和项目中冲突的包 ！
   这里注意修改  tomcat配置文件路径和项目名称
   
 项目搭建过程：  
项目名称：order Meal   订餐
项目结构：
	src：项目后台源码
	web：项目使用的action类
	res：项目配置文件
			dev：项目配置文件
				spring：spring相关配置文件
				strtus：struts配置文件
				ibatis：ibatis配置文件
			property：固定配置文件（需要添加文件，和项目架构负责人联系）；
		
	WebRoot:web服务结构
		page:页面相关(每个模块创建一个 文件夹)
		css   样式
		images    图片
		js		js
		如果饮用第三方 页面插件，尽量放在 WebRoot根目录，具体情况，用时在一起商量
		
		如果是 新加入的 js 或者css 尽量在 header.jsp中 添加 
		
		所有页面尽量使用  header 和 footer 
		
		
启动tomcat 项目可以正常访问：
 项目发布完毕。
 
 配置 struts2 spring2  ibatis
 
 
 struts   http://struts.apache.org/   struts2.3.4.1
 spring  http://www.springsource.org/download    srping  3.1.3
 ibatis  2.3.0.677
 
 1.配置struts  
 	添加jar包 测试通过（详细过程 注意事项  ）
 2. 添加spring 支持
 	添加jar包，测试通过
 3. 添加log4j支持：
 	添加 jar 。配置文件，测试通过
 	
 4. 添加mySql数据库支持
 		 使用 spring datasource 管理  数据库连接（后期可能会改为 使用jndi方式）
 	添加  mysql 数据库连接包
 	如果是自己安装的数据库，注意修改数据库 链接配置信息
5.添加ibatis  支持 
 	添加jar 包
 	
 	测试通过
6.添加 header.jsp  统一头文件 和 页面使用的 项目项目根路径
7.修改 log4j.properties 文件 ，打印  sql到日志信息
8.添加ant脚本：
		build.xml
			目的 ：使用ant脚本  可以使 不同的开发环境 下，快速把项目搭建起来，并且详细的维护 项目的中使用的jar包之类
			
			使用 ant脚本编译完之后 将生成的 war 文件 放在tomcat  webapps  目录下 ，即可运行 项目 
			
			
			测试通过 ！
9.添加后台DAO接口		
			封装  ibatis提供的接口，使业务接口调用更加面向接口

10.添加 分页标签
			封装分页标签，后期可能会考虑将分页部分代码 独立出来，单独成jar包
			链接数据库做分页查询
			
			测试通过！
						
11.	添加用户权限  
							
			
		

	
 	
 
 	
 
		
		
	
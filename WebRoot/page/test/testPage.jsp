<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ include file="/page/common/header.jsp"%>
<html>
 	<body>
   	<table align="center">
   		<thead>
   			<tr>
   				<th>编号
   				</th>
   				<th>
   				ID
   				</th>
   				<th>
   				NAME
   				</th>
   			</tr>
   		</thead>
   		<tbody>
   			<s:iterator value="tesList" status="rowstatus" id="it">
   			<tr>
   				<td>${rowstatus.index+1}</td>
   				<td><s:property value="id" /></td>
   				<td><s:property value="name" /></td>
   			</tr>
   			</s:iterator>
   		</tbody>
   	</table>
<!-- 分页Div -->
<div  align="center">
<%@ include file="/WEB-INF/inc/page.inc"%>
</div> 
<%@ include file="/page/common/footer.jsp"%>
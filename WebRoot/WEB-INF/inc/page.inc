<%--
  功能描述 ：分页标签
 
--%>
<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="page" uri="/page-tag"%>
<script type="text/javascript" src="${path}/js/page/page.js"></script>

<!----------------分页页脚---------------->
 <div id="pageFoot">
   <table cellpadding="0" cellspacing="0">
      <tr>
	    <td height="20" width="100" align="center">
		   第<page:currentPageNum />/<page:pageCount />页&nbsp;&nbsp;
	    </td>
	    <td height="20" width="20" align="center">
		    <page:isNotFirstPage>
				<img src="${path}/images/page/img/pageButton06.gif" width="10" height="12" style="cursor:hand;" onclick="javascript:fGotoPage('<page:firstPageURI/>')"/>
		    </page:isNotFirstPage>
		    <page:isFirstPage><img src="${path}/images/page/img/pageButton01.gif" width="10" height="12" /></page:isFirstPage>
	    </td>
        <td width="20" align="center">
            <page:isNotFirstPage>
				<img src="${path}/images/page/img/pageButton09.gif" width="6" height="11" style="cursor:hand;" onclick="javascript:fGotoPage('<page:previousPageURI/>')"/>
		    </page:isNotFirstPage>
		    <page:isFirstPage><img src="${path}/images/page/img/pageButton02.gif" width="6" height="11" /></page:isFirstPage>
        </td>
        
        <td width="20" align="center"><img src="${path}/images/page/img/pageButton03.gif" width="2" height="13" /></td>
        <td width="20" align="center">
            <page:selectPage /> 
        </td>
        <td width="20" align="center"><img src="${path}/images/page/img/pageButton03.gif" width="2" height="13" /></td>
        
        <td width="20" align="center">
	        <page:isNotLastPage>
			    <img src="${path}/images/page/img/pageButton04.gif" width="6" height="11" style="cursor:hand;" onclick="javascript:fGotoPage('<page:nextPageURI/>')"/>
		    </page:isNotLastPage>
		    <page:isLastPage><img src="${path}/images/page/img/pageButton08.gif" width="6" height="11" /></page:isLastPage>
        </td>
        <td width="20" align="center">
            <page:isNotLastPage>
			    <img src="${path}/images/page/img/pageButton05.gif" width="10" height="12" style="cursor:hand;" onclick="javascript:fGotoPage('<page:lastPageURI/>')"/>
		    </page:isNotLastPage>
		    <page:isLastPage><img src="${path}/images/page/img/pageButton07.gif" width="10" height="12" /></page:isLastPage>
        </td>
        <td width="120" align="center">&nbsp;共<page:listCount/>条记录</td>
      </tr>
   </table>
 </div>
<script type="text/javascript">
<!--
//改变窗口大小时，重新设置footDiv的位置
window.onresize=function(){
    var footDiv = document.getElementById("pageFoot");
	if(document.documentElement.scrollHeight>document.documentElement.clientHeight){
		footDiv.style.position='static';
	}else{
		footDiv.style.position='absolute';
	}
}
//重载窗口时，重新设置footDiv的位置
var footDiv = document.getElementById("pageFoot");
	if(document.documentElement.scrollHeight>document.documentElement.clientHeight){
		footDiv.style.position='static';
	}else{
		footDiv.style.position='absolute';
	}
//-->
</script>
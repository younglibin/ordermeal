/**
 * 分页所用到的js
*/

//得到无参数的URL
function getUrlNoParam(url)
{
	if(!url||url.length==0)
	{
		return "";
	}
	var idx=url.indexOf('?');
	if(idx==-1)
	{
		return url;
	}
	return url.substring(0,idx);
}

//得到URL的参数对
function getUrlParams(url)
{
	var params=new Array();
	if(!url||url.length==0)
	{
		return params;
	}
	var idx=url.indexOf('?');
	if(idx==-1)
	{
		return params;
	}
	url=url.substr(idx+1);
	var nameValues=url.split('&');
	for(var i=0;i<nameValues.length;i++)
	{
		var nameValue=nameValues[i];
		if(nameValue&&nameValue.length>0)
		{
			var idxEq=nameValue.indexOf('=');
			if(idxEq>-1)
			{
				params.push({name:nameValue.substr(0,idxEq),value:nameValue.substr(idxEq+1)});
			}
		}
	}
	return params;
}

//将URLGET请求转化为POST请求,自定义标签的时候 绑定该方法
function fGotoPage(url)
{
	var oForm=document.createElement("FORM");
	oForm.setAttribute("action",getUrlNoParam(url));
	oForm.setAttribute("method","post");
	var params=getUrlParams(url);
	for(var i=0;i<params.length;i++)
	{
		var oInput=document.createElement("INPUT");
		oInput.setAttribute("type","hidden");
		oInput.setAttribute("name",params[i].name);
		oInput.setAttribute("value",params[i].value);
		oForm.appendChild(oInput);
	}
	document.body.appendChild(oForm);
	oForm.submit();
}

//   导航条右边的   +  或  -  操作对应的js

function display(table_id){ 
 for(i=0;i<6;i++)
	{
	 if(i==table_id)
 { var list=document.getElementById("table"+i);
  var imageId = document.getElementById("mark"+i);
	}
	}
	
if(list.style.display=="none")
{ 
  list.style.display="block" ; 
  var imgSrc = "<img src='"+getUrl('/default/img/reduce_cut.gif')+"' width='15' height='15' border='0'>";
  imageId.innerHTML = imgSrc;
 }
	else
	{ 
  list.style.display="none" ;
  var imgSrc = "<img src='"+getUrl('/default/img/display_add.gif')+"' width='15' height='15' border='0'>";
  imageId.innerHTML = imgSrc;
 } 
}

/**
 * 去掉指定表单中所有文本框内的首尾空格、双引号和单引号
 * @param fm
 * @return
 */
function fnTrimForm(fm){
	var obj = null;
	for(var i=0; i<fm.elements.length; i++){
		obj = fm.elements[i];
		if(obj.type == "text"){
			obj.value = obj.value.trim();
			obj.value = obj.value.replace(/["']/g , '');
		}
	}
	
	//禁用掉页面上的提交按钮，防止重复提交
	if(fm.name == "searchForm"){
		fnEnableAllSubmitButton(document , true);
	}
	
	return true;
}


//隐藏子视图区
function shut() {
	
    top.mainFrame.sonFrame.cols = "0,*";
    var imageId = document.getElementById("image");
    var imgSrc = "<a href=" + "javascript:show();" + "><img src='"+getUrl('/default/img/open.gif')+"' name='open' width='15' height='15' border='0' id='leftImage'" + "></a>";
    imageId.innerHTML = imgSrc;
}

//显示子视图区
function show() {
    top.mainFrame.sonFrame.cols = "178,*";
    var imageId = document.getElementById("image");
    var imgSrc = "<a href=" + "javascript:shut();" + "><img src='"+getUrl('/default/img/close.gif')+"' name='close' width='15' height='15' border='0' id='leftImage'" + "></a>";
    imageId.innerHTML = imgSrc;
}
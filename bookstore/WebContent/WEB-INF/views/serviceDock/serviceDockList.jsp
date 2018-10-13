<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"  isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="zh-cn">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no" />
<meta name="renderer" content="webkit">
<title></title>
<link rel="stylesheet" href="${pageContext.request.contextPath }/css/pintuer.css">
<link rel="stylesheet" href="${pageContext.request.contextPath }/css/admin.css">
<link rel="stylesheet" href="${pageContext.request.contextPath }/css/jquery.editable-select.min.css">
<script src="${pageContext.request.contextPath }/js/jquery.js"></script>
<script src="${pageContext.request.contextPath }/js/pintuer.js"></script>
<!-- 可输入下拉框 --> 
 <script src="${pageContext.request.contextPath }/js/jquery.editable-select.min.js"></script>
<script type="text/javascript">
//搜索
$(function(){
	 /* alert("asdfghjhnbvcx");  */
	$("#searchArticleForm").off();
	$("#searchArticleForm").on("submit",function(){
		var key=$(this).find("select[name=key]").val();
		
		var val1=$(this).find("select[name=val]").val();
		var val2=$(this).find("input[name=val]").val();
		/* alert(key+","+val);  */
		if(val1==null)
			{
			$(".panel").load("${pageContext.request.contextPath }/serviceDock/searchLists",{
				key:key,
				val:val2
			});
			}
		else{
			$(".panel").load("${pageContext.request.contextPath }/serviceDock/searchLists",{
				key:key,
				val:val1
			});
		}
		
		//阻止表单默认行为 （提交）
		return false;
	});
	
});
function btnChange(){
		var childs=new Array();
		var departname=new Array();
		
		<c:forEach items="${dpNameList }" var="item">
		/* alert("${item}"); */
		departname.push("${item}");
		/* alert("${item}"); */
		</c:forEach>
		var parentEle=document.getElementById("parent");	
   
	 /*   alert("进入了change方法"); */
	 var childEle=document.getElementById("child");
	childEle.innerHTML="";//每次进来先清空子搜索列表
	/* alert("进入了"+parentEle.innerHTML) */;
	var parentValue=parentEle.options[parentEle.selectedIndex].value;
	/* alert("进入了123"+parentValue); */
	var ddl=document.getElementById("child");
	switch(parentValue){
	case "service":
		ddl.style.display="inline-block";
		$("#inputsearch").hide();
	     childs=['技badvearvwa','设备报修','日常运维'];
		break;
	case"department":
		ddl.style.display="inline-block";
		$("#inputsearch").hide();
		childs=departname;
		break;
	default:
	   ddl.style.display="none";
	    $("#inputsearch").show();
	    $("#inputsearch").style.display="inline-block";
		
	}
	 
	   for(var i=0;i<childs.length;i++){
		   /* alert("for"); */
           var option=document.createElement('option'); //先创建option
           
           var textNode=document.createTextNode(childs[i]); //再把城市名作为子节点填入，也可用innerHTML
           childEle.appendChild(option);
           option.text = childs[i];
        
       } 
}
</script>

</head>
<body>
  <div class="panel admin-panel">
    <div class="panel-head"></div>
   <form role="search" id="searchArticleForm" method="post" action="${pageContext.request.contextPath }/serviceDock/searchLists">
    <div class="padding border-bottom ">
      <ul class="search" style="padding-left:10px;">
      
          <li>
            <select  id="parent" onchange="btn01Change()" name="key" class="input" style="width:200px; line-height:17px;">
              <option value="">请选择分类</option> 
              <option value="service">业务类型</option>
              <option value="department">部门</option>
              <option value="address">地点</option>
              <option value="uptime">提交时间</option>
             <!--  <option value="keyword">关键字筛选</option> -->
            </select>
          </li>
        <li>
         <select id="child" name="val" class="input"  >
          <option value="">请下拉选择</option> 
         </select>
          <input id="inputsearch" type="text" placeholder="请输入搜索关键字" name="val" style="font-size:14px;padding:10px;border:solid 1px #ddd;border-radius:3px;width:250px; line-height:17px;display: none;" />
          <input type="submit" class="button border-main icon-search" value="查询" />
          </li>
      </ul>
    </div>
</form>
    <div>
 
    <div id="divtable">
    <table class="table table-hover text-center" style="margin: 0 auto;align:center;margin-top: 10px;">
      <tr>
        <th style="text-align:left; padding-left:20px;">序号</th>
        <th>联系人</th>
        <th>业务类型</th>
        <th>设备名称</th>
        <th>部门</th>
        <th>具体地点</th>
        <th>提交时间</th>
        <th>完成时间</th>
        <th>进度</th>
        <th>处理人</th>
        <th>操作</th>
      </tr>
      <c:forEach items="${tsList }" var="t" varStatus="a">
        <tr>
        <!--   <td style="text-align:left; padding-left:20px;"><input type="checkbox" name="id[]" value="" />
           1</td> -->
           <td id="ts">${a.index+1}</td>
          <td>${tsUser[a.index]}</td>
          <td>技术支持</td>
          <td></td>
          <td>${t.techsupportDepartment}</td>
          <td>${t.techsupportLocation}</td>
          <td>${t.techsupportUptime}</td>
          <c:if test="${! empty  t.techsupportEndtime}">
          <td>${t.techsupportEndtime}</td>
          </c:if>
          <c:if test="${empty t.techsupportEndtime }">
          <td></td>
          </c:if>
          <td>${tsStatus[a.index]}</td>
          <td>${tsManager[a.index]}</td>
          <td><a href="#########">编辑</a></td>
        </tr>
         </c:forEach> 
   		<c:forEach items="${rpList }" var="r" varStatus="c" >
        <tr>
        <!--   <td style="text-align:left; padding-left:20px;"><input type="checkbox" name="id[]" value="" />
           1</td> -->
           <td id="rp">${(c.index+1)+(tsLen)}</td>
          <td>${rpUser[c.index]}</td>
          <td>设备报修</td>
          <td>${r.repairDevicename}</td>
          <td>${r.repairDepartment}</td>
          <td>${r.repairLocation}</td>
          <td>${r.repairUptime}</td>
          <c:if test="${!empty r.repairEndtime }">
          <td>${r.repairEndtime}</td></c:if>
          <c:if test="${empty r.repairEndtime }">
          <td></td></c:if>
          <td>${rpStatus[c.index]}</td>
          <td>${rpManager[c.index]}</td>
          <td><a href="#########">编辑</a></td>
        </tr>
       </c:forEach> 
   		 <c:forEach items="${mtList }" var="m"  varStatus="b">
        <tr>
          <td id="mt">${(b.index+1)+(tsLen)+(rpLen)}
          </td>
          <td>${mtUser[b.index]}</td>
          <td>日常运维</td>
          <td>${m.maintenanceDevicename}</td>
          <td>${m.maintenanceDepartment}</td>
          <td>${m.maintenanceLocation}</td>
          <td>${m.maintenanceUptime}</td>
          <c:if test="${!empty m.maintenanceEndtime}">
          <td>${m.maintenanceEndtime}</td></c:if>
          <c:if test="${empty m.maintenanceEndtime}">
          <td></td>
          </c:if>
          <td>${mtStatus[b.index]}</td>
          <td>${mtManager[b.index]}</td>
          <td><a href="#########">编辑</a></td>
        </tr>
       </c:forEach> 
   		</table>
   		
   		
   		<%-- <c:if test="${! empty rpList}">
    <div>
    
    <table class="table table-hover text-center" style="margin: 0 auto;align:center;margin-top: -10px;">
      <tr>
        <th>序号</th>
        <th >联系人</th>
        <th>相关照片</th>
        <th>设备名称</th>
        <th>部门</th>
        <th>具体地点</th>
       <!--  <th>故障描述</th> -->
        <th>提交时间</th>
        <th >完成时间</th>
        <th>进度</th>
        <th>处理人</th>
      </tr>
      <c:forEach items="${rpList }" var="s" varStatus="a">
        <tr>
        <!--   <td style="text-align:left; padding-left:20px;"><input type="checkbox" name="id[]" value="" />
           1</td> -->
           <td>${a.index+1}</td>
          <td>${s.userId}</td>
          <td width="10%"><img src="${s.repairPicture }" alt="" width="70" height="50" /></td>
          <td>${s.repairDevicename}</td>
          <td>${s.repairDepartment}</td>
          <td>${s.repairLocation}</td>
          <td>${s.repairDescribe}</td>
          <td>${s.repairUptime}</td>
          <c:if test="${!empty s.repairEndtime }">
          <td>${s.repairEndtime}</td></c:if>
          <c:if test="${empty s.repairEndtime }">
          <td></td></c:if>
          <td>${rpStatus[a.index]}</td>
          <td>${rpManager[a.index]}</td>
        </tr>
       </c:forEach> 
   		</table>
   		</div>
   		</c:if>
   		
   	<div>	
   	<c:if test="${!empty mtList}">
    
    <p style="margin-left: 19px;margin-top: 4px;font-size: 14px;">3. 日常运维</p>
   
    <table class="table table-hover text-center" style="margin: 0 auto;align:center;margin-top: -10px;">
      <tr>
        <th>序号</th>
        <th>联系人</th>
        <th>相关照片</th>
        <th>设备名称</th>
        <th>部门</th>
        <th>具体地点</th>
       <!--  <th>维护描述</th> -->
        <th>提交时间</th>
        <th>完成时间</th>
        <th>进度</th>
        <th>处理人</th>
      </tr>
      <c:forEach items="${mtList }" var="s" varStatus="a">
        <tr>
        <!--   <td style="text-align:left; padding-left:20px;"><input type="checkbox" name="id[]" value="" />
           1</td> -->
          <td>${a.index+1}</td>
          <td>${s.userId}</td>
          <td width="10%"><img src="${s.maintenancePicture }" alt="" width="70" height="50" /></td>
          <td>${s.maintenanceDevicename}</td>
          <td>${s.maintenanceDepartment}</td>
          <td>${s.maintenanceLocation}</td>
          <td>${s.maintenanceDescribe}</td>
          <td>${s.maintenanceUptime}</td>
          <c:if test="${!empty s.maintenanceEndtime}">
          <td>${s.maintenanceEndtime}</td></c:if>
          <c:if test="${empty s.maintenanceEndtime}">
          <td></td></c:if>
          <td>${mtStatus[a.index]}</td>
          <td>${mtManager[a.index]}</td>
        </tr>
       </c:forEach> 
   		</table>
   		</c:if>
   		</div>--%>
   		
   		</div> 
   		<div>
      <table class="table table-hover text-center">
      <tr>
        <td colspan="8"><div class="pagelist"> <a href="">上一页</a> <span class="current">1</span><a href="">2</a><a href="">3</a><a href="">下一页</a><a href="">尾页</a> </div></td>
      </tr>
    </table>
    </div>
  </div>
  </div>
<!-- </form> -->
<script type="text/javascript">

//搜索
function changesearch(){	 
	
}

//单个删除
function del(id,mid,iscid){
	if(confirm("您确定要删除吗?")){
		
	}
}

//全选
$("#checkall").click(function(){ 
  $("input[name='id[]']").each(function(){
	  if (this.checked) {
		  this.checked = false;
	  }
	  else {
		  this.checked = true;
	  }
  });
})

//批量删除
function DelSelect(){
	var Checkbox=false;
	 $("input[name='id[]']").each(function(){
	  if (this.checked==true) {		
		Checkbox=true;	
	  }
	});
	if (Checkbox){
		var t=confirm("您确认要删除选中的内容吗？");
		if (t==false) return false;		
		$("#listform").submit();		
	}
	else{
		alert("请选择您要删除的内容!");
		return false;
	}
}

//批量排序
function sorts(){
	var Checkbox=false;
	 $("input[name='id[]']").each(function(){
	  if (this.checked==true) {		
		Checkbox=true;	
	  }
	});
	if (Checkbox){	
		
		$("#listform").submit();		
	}
	else{
		alert("请选择要操作的内容!");
		return false;
	}
}


//批量首页显示
function changeishome(o){
	var Checkbox=false;
	 $("input[name='id[]']").each(function(){
	  if (this.checked==true) {		
		Checkbox=true;	
	  }
	});
	if (Checkbox){
		
		$("#listform").submit();	
	}
	else{
		alert("请选择要操作的内容!");		
	
		return false;
	}
}

//批量推荐
function changeisvouch(o){
	var Checkbox=false;
	 $("input[name='id[]']").each(function(){
	  if (this.checked==true) {		
		Checkbox=true;	
	  }
	});
	if (Checkbox){
		
		
		$("#listform").submit();	
	}
	else{
		alert("请选择要操作的内容!");	
		
		return false;
	}
}

//批量置顶
function changeistop(o){
	var Checkbox=false;
	 $("input[name='id[]']").each(function(){
	  if (this.checked==true) {		
		Checkbox=true;	
	  }
	});
	if (Checkbox){		
		
		$("#listform").submit();	
	}
	else{
		alert("请选择要操作的内容!");		
	
		return false;
	}
}


//批量移动
function changecate(o){
	var Checkbox=false;
	 $("input[name='id[]']").each(function(){
	  if (this.checked==true) {		
		Checkbox=true;	
	  }
	});
	if (Checkbox){		
		
		$("#listform").submit();		
	}
	else{
		alert("请选择要操作的内容!");
		
		return false;
	}
}

//批量复制
function changecopy(o){
	var Checkbox=false;
	 $("input[name='id[]']").each(function(){
	  if (this.checked==true) {		
		Checkbox=true;	
	  }
	});
	if (Checkbox){	
		var i = 0;
	    $("input[name='id[]']").each(function(){
	  		if (this.checked==true) {
				i++;
			}		
	    });
		if(i>1){ 
	    	alert("只能选择一条信息!");
			$(o).find("option:first").prop("selected","selected");
		}else{
		
			$("#listform").submit();		
		}	
	}
	else{
		alert("请选择要复制的内容!");
		$(o).find("option:first").prop("selected","selected");
		return false;
	}
}

</script>
</body>
</html>
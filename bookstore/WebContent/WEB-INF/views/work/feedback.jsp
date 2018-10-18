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
<link rel="stylesheet" href="${pageContext.request.contextPath }/bootstrap-3.3.0/css/bootstrap.css">
<link rel="stylesheet" href="${pageContext.request.contextPath }/bootstrap-3.3.0/css/bootstrap.min.css">
<link rel="stylesheet" href="${pageContext.request.contextPath }/bootstrap-3.3.0/css/bootstrap-theme.css">
<link rel="stylesheet" href="${pageContext.request.contextPath }/bootstrap-3.3.0/css/bootstrap-theme.min.css">

<script src="${pageContext.request.contextPath }/js/jquery.js"></script>
<script src="${pageContext.request.contextPath }/js/pintuer.js"></script>
<script type="text/javascript">
//搜索
$(function(){
	/* alert("asdfghjhnbvcx"); */
	$("#searchArticleForm").off();
	$("#searchArticleForm").on("submit",function(){
		var key=$(this).find("select[name=key]").val();
		var val=$(this).find("input[name=val]").val();
		/* alert(key+","+val); */
		
		$(".panel").load("${pageContext.request.contextPath }/businessFeedback/showUnfinishedList",{
			key:key,
			val:val
		});
		//阻止表单默认行为 （提交）
		return false;
	});
});
</script>
</head>
<body>
<%-- <form method="post" action="${pageContext.request.contextPath }/serviceDock/searchLists" id="listform"> --%>
  <div class="panel admin-panel">
    <div class="panel-head"><strong class="icon-reorder"> 内容列表</strong> <a href="" style="float:right; display:none;">添加字段</a></div>
   <form role="search" id="searchArticleForm">
    <div class="padding border-bottom ">
      <ul class="search" style="padding-left:10px;">
      
       <!--  <if condition="$iscid eq 1"> -->
          <li>
            <select name="key" class="input" style="width:200px; line-height:17px;">
              <option value="">请选择分类</option> 
              <option value="service">业务类型(技术支持，设备报修，日常运维)</option>
              <option value="department">部门</option>
              <option value="address">地点</option>
              <option value="uptime">提交时间</option>
             <!--  <option value="keyword">关键字筛选</option> -->
            </select>
          </li>
       <!--  </if> -->
        <li>
          <input type="text" placeholder="请输入搜索关键字" name="val" class="input" style="width:250px; line-height:17px;display:inline-block" />
          <!-- <a href="javascript:void(0)" class="button border-main icon-search" onclick="changesearch()" > 搜索</a> -->
          <input type="submit" class="button border-main icon-search" value="查询" />
          </li>
      </ul>
    </div>
</form>
    <div>
    <c:if test="${! empty tsList}">
    <div >
    <p style="margin-left: 19px;margin-top: 4px;font-size: 14px;">1. 技术支持</p>
    
    <table class="table table-hover text-center" style="margin: 0 auto;align:center;margin-top: -10px;">
      <tr>
        <th style="text-align:left; padding-left:20px;">序号</th>
        <th>技术支持编号</th>
        <th>联系人</th>
        <th>相关照片</th>
        <th>部门</th>
        <th>具体地点</th>
       <!--  <th>需求描述</th> -->
        <th>提交时间</th>
        <th>完成时间</th>
        <th>进度</th>
        <th>处理人</th>
        <th>修改进度,设置处理人</th>
      </tr>
      <c:forEach items="${tsList }" var="s" varStatus="a">
        <tr>
        <!--   <td style="text-align:left; padding-left:20px;"><input type="checkbox" name="id[]" value="" />
           1</td> -->
          <td>${a.index+1}</td>
          <td><input type="hidden" name="techsupportId" value="${s.techsupportId}"></td>
          <td>${s.userId}</td>
          <td width="10%"><img src="<%-- ${s.techsupportPicture } --%>" alt="" width="70" height="50" /></td>
          <td>${s.techsupportDepartment}</td>
          <td>${s.techsupportLocation}</td>
         <%--  <td> ${s.techsupportDescribe}</td> --%>
          <td>${s.techsupportUptime}</td>
          <c:if test="${! empty  s.techsupportEndtime}">
          <td>${s.techsupportEndtime}</td>
          </c:if>
          <c:if test="${empty s.techsupportEndtime }">
          <td></td>
          </c:if>
          
          
          <td>${tsStatus[a.index]}</td>
          <td>${tsManager[a.index]}</td>
          <td>
          	<a class="btn btn-info" href="${pageContext.request.contextPath }/businessFeedback/toUpdateStatus?techsupportId=${s.techsupportId}" role="button">修改</a>
          </td>
        </tr>
       </c:forEach> 
   		</table>
   		</div>
   		</c:if>
   		
   		<c:if test="${! empty rpList}">
    <div>
    <p style="margin-left: 19px;margin-top: 4px;font-size: 14px;">2. 设备报修</p>
    
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
          <td width="10%"><img src="<%-- ${s.repairPicture } --%>" alt="" width="70" height="50" /></td>
          <td>${s.repairDevicename}</td>
          <td>${s.repairDepartment}</td>
          <td>${s.repairLocation}</td>
          <%-- <td>${s.repairDescribe}</td> --%>
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
          <td width="10%"><img src="<%-- ${s.maintenancePicture } --%>" alt="" width="70" height="50" /></td>
          <td>${s.maintenanceDevicename}</td>
          <td>${s.maintenanceDepartment}</td>
          <td>${s.maintenanceLocation}</td>
        <%--   <td>${s.maintenanceDescribe}</td> --%>
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
   		</div>
   		
   		</div>
   		<div>
      <table class="table table-hover text-center">
      <tr>
        <td colspan="8"><div class="pagelist"> <a href="">上一页</a> <span class="current">1</span><a href="">2</a><a href="">3</a><a href="">下一页</a><a href="">尾页</a> </div></td>
      </tr>
    </table>
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
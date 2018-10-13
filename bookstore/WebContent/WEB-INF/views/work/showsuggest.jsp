<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title></title>
<link rel="stylesheet" href="css/pintuer.css">
<link rel="stylesheet" href="css/admin.css">
<script src="js/jquery.js"></script>
<script src="js/pintuer.js"></script>
<script type="text/javascript" src="js/jquery-1.7.2.js"></script>
</head>
<body>
<form method="post" action="${pageContext.request.contextPath }/suggest/batchdelete">
  <div class="panel admin-panel">
    <div class="panel-head"><strong class="icon-reorder"> 留言管理</strong></div>
    <div class="padding border-bottom">
      <ul class="search">
        <li>
          <button type="button"  class="button border-green" id="checkall"><span class="icon-check"></span> 全选</button>
          <button type="submit" class="button border-red" onclick="return DelSelect();"><span class="icon-trash-o"></span> 批量删除</button>
       	  <span style="color: red;">${msg}</span>
        </li>
      </ul>
    </div>
    <table class="table table-hover text-center">
      <tr>
        <th width="80">序号</th>
        <th>姓名</th>  
        <th>部门</th>  
        <th>电话</th>  
        <th>主题</th>
        <th width="25%">内容</th>
         <th >留言时间</th>
        <th>操作</th>       
      </tr>      
      <c:forEach items="${suggests}" var="item" varStatus="a">
        <tr>
           <td><input type="checkbox" name="suggestId" value="${item.suggestId}" /> ${a.index+1}</td>
          <td>${user[a.index]}</td>
          <td>${ulist[a.index].userDepartment}</td>
          <td>${ulist[a.index].userTelephone}</td>
           <td>${item.suggestTitle}</td>         
          <td>${item.suggestContent}</td>
          <td>${item.suggestTime}</td>
          <td><div class="button-group"> <a class="button border-red" href="javascript:if(confirm('确实要删除该内容吗?'))location='${pageContext.request.contextPath }/suggest/delete?suggestId=${item.suggestId}'"><span class="icon-trash-o"></span> 删除</a> </div></td>
        </tr>
        </c:forEach>
      <!-- <tr>
        <td colspan="8"><div class="pagelist"> <a href="">上一页</a> <span class="current">1</span><a href="">2</a><a href="">3</a><a href="">下一页</a><a href="">尾页</a> </div></td>
      </tr> -->
    </table>
  </div>
</form>
<script type="text/javascript">

function del(id){
	if(confirm("您确定要删除吗?")){
		
	}
}

$("#checkall").click(function(){ 
  $("input[name='suggestId']").each(function(){
	  if (this.checked) {
		  this.checked = false;
	  }
	  else {
		  this.checked = true;
	  }
  });
});

function DelSelect(){
	var Checkbox=false;
	 $("input[name='suggestId']").each(function(){
	  if (this.checked==true) {		
		Checkbox=true;	
	  }
	});
	if (Checkbox){
		var t=confirm("您确认要删除选中的内容吗？");
		if (t==false) return false; 		
	}
	else{
		alert("请选择您要删除的内容!");
		return false;
	}
}

</script>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"  pageEncoding="UTF-8"%>
<%@taglib  prefix="c"  uri="http://java.sun.com/jsp/jstl/core"%>>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="${pageContext.request.contextPath}/css/pintuer.css">
<link rel="stylesheet" href="${pageContext.request.contextPath}/css/admin.css">
<script src="${pageContext.request.contextPath}/js/jquery.js"></script>
<script src="${pageContext.request.contextPath}/js/pintuer.js"></script>
<title>微信用户列表</title>
<script type="text/javascript">
		

</script>
</head>
<body>
				
	<div class="panel admin-panel">
		<div class="panel-head">
			<strong class="icon-reorder">微信用户列表</strong>
			<!-- <span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; </span>
			根据用户输入内容，自动提醒出相应部门
			<select style="height: 34px; border: 4px,solid ,black; " id="userDepartment"   onchange="putValueToInput">
			<option value="default">--请选择--</option>
            <option value="jixie">机械工程系</option>
            <option value="dianzi">电子系</option>
            <option value="zidong">自动化系</option>
            <option value="huagong">化工系</option>
            <option value="jisuanji">计算机工程系</option>
            <option value="huanjing">环境与安全工程系</option>
			</select> -->
		</div>
		<%-- <div class="padding border-bottom">
			<button type="button" class="button border-yellow"
				onclick="window.location.href='${pageContext.request.contextPath}/manager/toadd'">
				<span class="icon-plus-square-o"></span> 添加内容
			</button>
		</div> --%>
					<table class="table table-hover text-center">
						<tr>
							<th width="10%">序号</th>
							<th width="10%">姓名</th>
							<th width="18%">电话</th>
							<th width="17%">部门</th>
							<th width="12%">共享类别</th>
							<th width="33%">反馈信息共享</th>
						</tr>
					</table>
		<c:forEach items="${userList}" var="item" varStatus="a">
				<form method="post" action="${pageContext.request.contextPath }/">
					<table class="table table-hover text-center">
					<tr>
							<th width="10%"></th>
							<th width="10%"></th>
							<th width="18%"></th>
							<th width="17%"></th>
							<th width="12%"></th>
							<th width="33%"></th>
						</tr>
				<tr>
					<td style="font-size: 13px">${a.index+1}</td>
					<td style="font-size: 13px">${item.userName }</td>
					<td style="font-size: 13px">${item.userTelephone }</td>
					<td style="font-size: 13px">${item.userDepartment }</td>
					<td style="font-size: 13px">${item.shareType.shareType }</td>
					<%-- <c:if test="${item.managerTyp eq '0'}">
						<td>管理员用户</td>
					</c:if>
					<c:if test="${item.managerTyp eq '1'}">
						<td>普通用户</td>
					</c:if> --%>
					
					<%-- <td><input type="password" value="${item.managerPassword }" style="border-left:0px;border-top:0px;border-right:0px;border-bottom:1px;text-align: center;background-color: white;"  readonly="readonly"/></td> --%>
					<td>
						<div class="button-group">
							<a class="button border-main" 
							href="${pageContext.request.contextPath}/pc_user/setShareType?userId=${item.userId}&userShareType=2"> 
							<span class="icon-edit"></span>本部
							</a> 
							<%-- <a class="button border-main" 
							href="${pageContext.request.contextPath}/pc_user/setShareType?userId=${item.userId}&userShareType=3">
						 	<span class="icon-edit"></span>全校
							</a> --%>
							<a class="button border-red" 
							href="javascript:if(confirm('确实要取消共享吗?'))location='${pageContext.request.contextPath}/pc_user/setShareType?userId=${item.userId}&userShareType= 1 '"> 
							<%-- href="javascript:if(confirm('确实要删除该内容吗?'))location='${ pageContext.request.contextPath }/handle/withdraw?techsupportId= ${item.techsupportId }&userId= ${userId }'  --%>
							<span class="icon-trash-o"></span>取消共享
							</a>
						</div>
					</td>
				</tr>
				</table>
			</form>
		</c:forEach>
	</div>	
</body>
</html>
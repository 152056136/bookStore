<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport"	content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no" />
<meta name="renderer" content="webkit">
<link rel="stylesheet" href="${pageContext.request.contextPath}/css/pintuer.css">
<link rel="stylesheet" href="${pageContext.request.contextPath}/css/admin.css">
<script src="${pageContext.request.contextPath}/js/jquery.js"></script>
<script src="${pageContext.request.contextPath}/js/pintuer.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>管理员列表</title>
</head>
<body>
	<div class="panel admin-panel">
		<div class="panel-head">
			<strong class="icon-reorder">管理员列表</strong>
		</div>
		<div class="padding border-bottom">
			<button type="button" class="button border-yellow"
				onclick="window.location.href='${pageContext.request.contextPath}/manager/toadd'">
				<span class="icon-plus-square-o"></span> 添加内容
			</button>
		</div>
		<table class="table table-hover text-center">
			<tr>
				<th width="10%">序号</th>
				<th width="20%">姓名</th>
				<th width="15%">电话</th>
				<th width="20%">职责</th>
				<th width="10%">类型</th>
				<th width="10%">密码</th>
				<th width="15%">操作</th>
			</tr>

			<c:forEach items="${record}" var="item" varStatus="a">
				<tr>
					<td>${a.index+1}</td>
					<td>${item.managerName }</td>
					<td>${item.managerTelephone }</td>
					<td>${item.managerDuty }</td>
					
					<c:if test="${item.managerTyp eq '0'}">
						<td>管理员用户</td>
					</c:if>
					<c:if test="${item.managerTyp eq '1'}">
						<td>普通用户</td>
					</c:if>
					<td><input type="password" value="${item.managerPassword }" style="border-left:0px;border-top:0px;border-right:0px;border-bottom:1px;text-align: center;background-color: white;"  readonly="readonly"/></td>
					<td>
						<div class="button-group">
							<a class="button border-main" 
							href="${pageContext.request.contextPath }/manager/loadmanagerinfor?managerId=${item.managerId}"> 
							<span class="icon-edit"></span>修改
							</a> <a class="button border-red" 
							href="javascript:if(confirm('确实要删除该内容吗?'))location='${pageContext.request.contextPath }/manager/delete?managerId=${item.managerId}'"
							> <span class="icon-trash-o"></span>删除
							</a>
						</div>
					</td>
				</tr>
			</c:forEach>


		</table>
	</div>
</body>
</html>
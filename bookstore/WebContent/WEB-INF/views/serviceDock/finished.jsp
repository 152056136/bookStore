<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="zh-cn">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport"
	content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no" />
<meta name="renderer" content="webkit">
<title></title>
<link rel="stylesheet"
	href="${pageContext.request.contextPath }/css/pintuer.css">
<link rel="stylesheet"
	href="${pageContext.request.contextPath }/css/admin.css">
<link rel="stylesheet"
	href="${pageContext.request.contextPath }/bootstrap-3.3.0/css/bootstrap.css">
<link rel="stylesheet"
	href="${pageContext.request.contextPath }/bootstrap-3.3.0/css/bootstrap.min.css">
<link rel="stylesheet"
	href="${pageContext.request.contextPath }/bootstrap-3.3.0/css/bootstrap-theme.css">
<link rel="stylesheet"
	href="${pageContext.request.contextPath }/bootstrap-3.3.0/css/bootstrap-theme.min.css">

<script src="${pageContext.request.contextPath }/js/jquery.js"></script>
<script src="${pageContext.request.contextPath }/js/pintuer.js"></script>
<!-- 可输入下拉框 --> 
 <script src="${pageContext.request.contextPath }/js/jquery.editable-select.min.js"></script>
</head>
<body>
	<%-- <form method="post" action="${pageContext.request.contextPath }/serviceDock/searchLists" id="listform"> --%>
	<div class="panel admin-panel">
		<div class="panel-head">
		 </div>
   <!-- <form role="search" id="searchArticleForm">
    <div class="padding border-bottom ">
      <ul class="search" style="padding-left:10px;">
      
          <li>
            <select  id="parent" onchange='btnChange();' name="key" class="input" style="width:200px; line-height:17px;">
              <option value="">请选择分类</option> 
              <option value="service">业务类型</option>
              <option value="department">部门</option>
              <option value="address">地点</option>
              <option value="uptime">提交时间</option>
              <option value="keyword">关键字筛选</option>
            </select>
          </li>
        <li>
         <select id="child" type="text" name="val" class="input" style="width:250px;line-height:17px;display:inline-block;" >
          <option value="">请下拉选择</option> 
         </select>
          <input id="inputsearch" type="text" placeholder="请输入搜索关键字" name="val" style="font-size:14px;padding:10px;border:solid 1px #ddd;border-radius:3px;width:250px; line-height:17px;display: none;" />
          <input type="submit" style="width: 60px;" class="button border-main icon-search" value="查询" />
          </li>
      </ul>
    </div>
</form> -->

		<div id="divtable">
			<table class="table table-hover text-center"
				style="margin: 0 auto; align: center; margin-top: 10px;">
				<tr>
					<th style="text-align: left; padding-left: 20px;">序号</th>
					<th><input type="hidden" 技术支持编号></th>
					<th>联系人</th>
					<th>业务类型</th>
					<th>设备名称</th>
					<th>部门</th>
					<th>具体地点</th>
					<th>查看详情</th>
					<th>提交时间</th>
					<th>进度</th>
					<th>处理人</th>
				</tr>
				<c:forEach items="${tsList }" var="s" varStatus="a">
					<tr>
						<td>${a.index+1}</td>
						<td><input type="hidden" name="techsupportId"
							value="${s.techsupportId}"></td>
						<td>${tsUser[a.index].userName}</td>
						<td>${tsType[a.index]}</td>
						<td>${s.techsupportDevicename}</td>
						<td>${s.techsupportDepartment}</td>
						<td>${s.techsupportLocation}</td>
						<%--  <td> ${s.techsupportDescribe}</td> --%>
						<td><a
								href="${pageContext.request.contextPath }/load/picture?pName=${s.techsupportPicture}&&note=${s.techsupportDescribe }&&phone=${tsUser[a.index].userTelephone}">点击查看</a></td>
						
						
						<td>${s.techsupportEndtime}</td>
						<td>已完成</td>
						<td>${tsManagerList[a.index]}</td>
					</tr>
				</c:forEach>
				
			</table>
		</div>
	</div>
</body>
</html>
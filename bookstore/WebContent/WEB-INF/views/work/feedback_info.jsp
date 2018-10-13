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
    
    <title>My JSP 'feedback_info.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
<link rel="stylesheet"
	href="${pageContext.request.contextPath }/css/pintuer.css">
<link rel="stylesheet"
	href="${pageContext.request.contextPath }/css/admin.css">
  </head>
  
  <body>
  <div class="panel admin-panel">
		<div class="panel-head"></div>
  
  <form method="post" class="form-x" action="${pageContext.request.contextPath }/feedback/addinfo"> 
  
  <div class="form-group">
  <c:if test="${!empty teachIdList }"> 
  <c:forEach items="${teachIdList }" var="s">
  <input type="hidden" name="techsupportId" value="${s}">
  </c:forEach>
   </c:if> 
	<c:if test="${!empty rpIdList }">
	<c:forEach items="${rpIdList }" var="s"> 
  <input type="hidden" name="repairId" value="${s}">
  </c:forEach>
	</c:if>	
			 <c:if test="${!empty mtIdList }">
	<c:forEach items="${mtIdList }" var="s">
  <input type="hidden" name="maintenanceId" value="${s}">
  </c:forEach>
	</c:if>	
        <div class="label">
          <label>描述：</label>
        </div>
        <div class="field">
          <textarea class="input" name="note" style=" height:90px;"></textarea>
          <div class="tips"></div>
        </div>
      </div>
      <div class="field">
          <button class="button bg-main icon-check-square-o" type="submit"> 提交</button>
        </div>
        </form>
   
      </div>
  </body>
</html>

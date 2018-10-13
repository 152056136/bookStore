<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport"
	content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no" />
<meta name="renderer" content="webkit">
<title></title>
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/css/pintuer.css">
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/css/admin.css">
<script src="${pageContext.request.contextPath}/js/jquery.js"></script>
<script src="${pageContext.request.contextPath}/js/pintuer.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>登记</title>
</head>
<body>

	<div class="panel admin-panel">
		<div class="panel-head">
			<strong><span class="icon-key"></span> 修改信息</strong>
		</div>
		<div class="body-content">
			<form method="post" class="form-x"
				action="${pageContext.request.contextPath }/manager/update">
				<c:if test="${!empty managernews}">
					<div class="form-group">
						<!-- <div class="label">
							<label for="sitename">管理员ID</label>
						</div> -->
						<div class="field">
							<div class="field">
								<input type="hidden" class="input w50" id="mpass"
									name="managerId" value="${managernews.managerId}" size="50">
							</div>
						</div>
					</div>
					<div class="form-group">
						<div class="label">
							<label for="sitename">管理员名：</label>
						</div>
						<div class="field">
							<div class="field">
								<input type="text" class="input w50" id="mpass"
									name="managerName" value="${managernews.managerName}" size="50"
									placeholder="请输入管理员帐号" data-validate="required:请输入管理员姓名" />
							</div>
						</div>
					</div>
					<div class="form-group">
						<div class="label">
							<label for="sitename">新密码：</label>
						</div>
						<div class="field">
							<input type="password" class="input w50" name="managerPassword"
								value="${managernews.managerPassword}" size="50"
								placeholder="请输入新密码"
								data-validate="required:请输入新密码,length#>=5:新密码不能小于5位" />
						</div>
					</div>
					<div class="form-group">
						<div class="label">
							<label for="sitename">电话号码：</label>
						</div>
						<div class="field">
							<input type="text" class="input w50" id="mpass"
								value="${managernews.managerTelephone}" name="managerTelephone"
								size="50" placeholder="请输入电话号码"
								data-validate="required:电话号码不许为空" />
						</div>
					</div>
					<div class="form-group">
						<div class="label">
							<label for="sitename">职责：</label>
						</div>
						<div class="field">
							<input type="text" class="input w50" name="managerDuty" size="50"
								value="${managernews.managerDuty}" placeholder="请输入工作范畴"
								data-validate="required:工作范畴不许为空" />
						</div>
					</div>
					<div class="form-group">
						<div class="label">
							<label for="sitename">类型：</label>
						</div>
						<div class="field">
						<c:if test="${managernews.managerTyp eq '0'}">
						<select name="managerTyp" class="input" style="width:200px; line-height:15px;">
		              <option value="0">管理员用户</option> 
		              <option value="1">普通用户</option>
		              
		            </select>
					</c:if>
					<c:if test="${managernews.managerTyp eq '1'}">
						<select name="managerTyp" class="input" style="width:200px; line-height:15px;">
		              
		              <option value="1">普通用户</option>
		              <option value="0">管理员用户</option> 
		            </select>
					</c:if>
							
						</div>
					</div>
					<div class="form-group">
						<div class="label">
							<label></label>
						</div>
						<div class="field">
							<button class="button bg-main icon-check-square-o" type="submit">
								提交</button>
							<button class="button bg-main icon-check-square-o" type="submit"
								onclick="window.location.href='${pageContext.request.contextPath}/manager/load'">>
								返回</button>
						</div>
					</div>
				</c:if>
			</form>
		</div>
	</div>

</body>
</html>
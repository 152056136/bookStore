<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
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
<script type="text/javascript">  
    $(function(){  
        function getObjectURL(file){    
            var url=null;     
            if(window.createObjectURL!=undefined){ // basic    
                url=window.createObjectURL(file);    
            }else if(window.URL!=undefined){ // mozilla(firefox)    
                url=window.URL.createObjectURL(file);    
            } else if(window.webkitURL!=undefined){ // webkit or chrome    
                url=window.webkitURL.createObjectURL(file);    
            }    
            return url;  
        }    
        $("#file_1").change(function(){
            var objUrl=getObjectURL(this.files[0]);  
            var size=this.files[0].size; 
            if(size>1*1024*1024){
            	alert("图片大小不能超过1MB,请重新选择");
            }
            else{    
                 if(objUrl){   
                        $("#img_1").attr("src",objUrl);  
                    }    
            }     
        });  
    })  
</script>
</head>
<body>
	<div class="panel admin-panel">
		<div class="panel-head" id="add">
			<strong><span class="icon-pencil-square-o"></span>发布新消息</strong>
		</div>
		<div class="body-content">
			<form method="post" class="form-x" enctype="multipart/form-data"
				action="${pageContext.request.contextPath }/shownews/addnews">
				<div class="form-group">
					<div class="label">
						<label>标题：</label>
					</div>
					<div class="field">
						<input type="text" class="input w50" value="" name="title"
							data-validate="required:请输入标题" />
						<div class="tips"></div>
					</div>
				</div>
				<div class="form-group">
					<div class="label">
						<label>图片：</label>
					</div>
					<!--   <div class="field">
          <input type="text" id="url1" name="pic" class="input tips" style="width:25%; float:left;"  value=""  data-toggle="hover" data-place="right" data-image="" />
          <input type="button" class="button bg-blue margin-left" id="file_1" type="file" name="file" onchange="fileshow1()">
          <div class="tipss">图片尺寸：500*500</div>
        </div> -->
					<div class="pic col-lg-4 col-md-4 col-sm-4 col-xs-4"
						style="margin-top: 20px;">
						<img id="img_1" src="" style="border: 1px solid #ccc; width: 500px;height: 300px;"/>
						 <a href="javascript:;" class="file">浏览上传
						  <input id="file_1" type="file" name="file" value="123" data onchange="fileshow1()">
						</a>
					</div>
				</div>

				<div class="form-group">
					<div class="label">
						<label>描述：</label>
					</div>
					<div class="field"> 
			          <script src="js/laydate/laydate.js"></script>
			          <textarea class="input" name="description" class="laydate-icon input w50" data-validate="required:描述不能为空" style="padding:10px!important; height:auto!important;border:1px solid #ddd!important;"  style="height: 90px;"></textarea>
			          <div class="tips"></div>
			        </div>
				</div>
				<div class="form-group">
					<div class="label">
						<label>内容：</label>
					</div>
					<div class="field"> 
			          <script src="js/laydate/laydate.js"></script>
			          <textarea class="input" name="content" class="laydate-icon input w50" data-validate="required:请填写内容" style="padding:10px!important; height:auto!important;border:1px solid #ddd!important;"  style="height: 90px;"></textarea>
			          <div class="tips"></div>
			        </div>
				</div>

				<div class="clear"></div>
				<div class="form-group">
					<div class="label">
						<label></label>
					</div>
					<div class="field">
						<button class="button bg-main icon-check-square-o" type="submit">
							提交</button>
					</div>
				</div>
			</form>
		</div>
	</div>

</body>
</html>
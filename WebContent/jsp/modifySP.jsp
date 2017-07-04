<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href="<%=request.getContextPath()%>/css/bootstrap.css" rel="stylesheet" type="text/css"/>
<script type="text/javascript" src="<%=request.getContextPath()%>/js/jquery-3.2.1.js"></script>
<script type="text/javascript" src="<%=request.getContextPath()%>/js/bootstrap.min.js"></script>
<link href="<%=request.getContextPath()%>/css/templatemo_style.css" rel="stylesheet" type="text/css">
<script src="<%=request.getContextPath()%>/js/modifySP.js" type="text/javascript"></script>
<title>预知愿——个人中心</title>
<style>
tr td{
border:20px solid rgba(0,0,0,0);
}
</style>
</head>
<body>
<div class="container">
	<div class="row clearfix">
		<div class="col-md-12 column">
		    <div><jsp:include page="/jsp/userInfoNav.jsp"/></div>
		    <div style="margin:0 auto;width:100%" class="text-center">			
			<h1 class="text-center" style="margin-top:50px;font-size:30px">
				修改密保问题
			</h1>
			<form>
			<table style="margin:0 auto;margin-top:20px" >
			<tbody>
			   <tr>
			   <td><h4>密码</h4></td>
			   <td><input type="password" id="op" class="form-control"/></td>
			   <td>			
			   <span id="op_info" style="color:red">不能为空</span>
			   </td>
			   </tr>
			   <tr>
			   <td><h4>新的密保问题</h4></td>
			   <td>
			   <select id="sp" class="form-control">
			   <option value="1">你的母亲名字是</option>
			   </select>
			   </td>
			   </tr>
			   <tr>
			   <td><h4>密保答案</h4></td>
			   <td><input type="text" id="sa" placeholder="1-20个字符"
			    class="form-control" maxlength="20"/></td>
			   <td>			
			   <span id="sa_info" style="color:red">不能为空</span>
			   </td>
			   </tr>
			   <tr>
			   <td colspan="3">
                   <button type="button" id="btnM" style="margin-right:100px"
                   class="btn  btn-lg btn-info">确认</button>                        
                    <button type="reset" class="btn  btn-lg btn-info">重置</button>
               </td>     
			   </tr>
			</tbody>
			</table>
			</form>
			</div>
		</div>
    </div>
</div>
</body>
</html>
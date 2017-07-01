<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<jsp:include page="up.jsp" />
<!DOCTYPE html>
<html lang="en">

<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta http-equiv="X-UA-Compatible" content="ie=edge">
<title>${topic.topicName }</title>
<link href="../css/bootstrap.min.css" rel="stylesheet">
<link href="../font-awesome-4.7.0/css/font-awesome.css" rel="stylesheet">
<link href="../css/topic.css" rel="stylesheet">
<script src="../js/jquery.min.js"></script>
<script>
$(document).ready(function(){
	
	var id = "${sessionScope.id}";
	if(id==""){
		var flw='<button type="button" class="btn btn-primary"'
			+'style="font-size: 16px;"><span  class=" glyphicon glyphicon-plus" '
			+'onclick="followTopic()">关注</span></button>';
		
            $("#followTopic").html(flw);
		return false;
	}else{
		
		//查询用户是否关注了该话题
		
		var topicId=$("#topicId").val();
	    var userId=id;
	    var follow = new Object();
	    follow.followedId = topicId;
	    follow.followUserId = userId;
	    follow.followType = 2;
	    var info = JSON.stringify(follow);
		$.ajax({
	        type: "POST",
	        contentType:'application/json',
	        url: "/yzwish/topic/checkFollow",
	        data:info,
	        success: function(data, status) {
	            if (data == "error") {
	                var flw='<button type="button" class="btn btn-primary"'
					+'style="font-size: 16px;"><span  class=" glyphicon glyphicon-plus" '
					+'onclick="followTopic()">关注</span></button>';
				
	                $("#followTopic").html(flw);
	            }else{
	            	var followItem='<button type="button" class="btn" disabled style="font-size: 16px;">'
					+'<span class="fa fa-check">已关注</span></button>';
	            	$("#followTopic").html(followItem);
	            	
	            }
	        },
	        error: function() {
	            alert("查询出错");
	        }
	    });
	}
		
		
        
	
	
});
</script>
</head>

<body>
	<div class="container" style="margin-top:0">
		<div class="row clearfix">
			<div class="col-md-12 column topic-detail-banner">
				<img src="${topic.topicBanner }" alt="banner" height="280" />
			</div>
		</div>
		<div class="row clearfix">
			<div class="col-md-4 column ">
				<div class="topic-avatar">
					<img src="${topic.topicAvatar }" width="150" height="150" />
				</div>
				<span id="topicName" class="topic-name">${topic.topicName }</span>
			</div>
			<div id="followTopic" class="follow-topic col-md-2 column">
				
			</div>
			<div class="col-md-3 column" style="height: 50px; line-height: 50px;">
				关注量：<span id="follow-number">${topic.followNumber }</span>
				<button type="button" class="btn btn-small"
					style="margin-left: 50px;">举报</button>
			</div>
			<div class="col-md-3 column" style="height: 50px; line-height: 50px;">
			<form action="/yzwish/topic/searchQuestion" method="POST"
				onsubmit="return checkSearch()">
				<input type="text"  name="thisTopicId" value="${topic.topicId }"
					style="visibility: hidden" /> 
				<input id="searchWord" name="searchWord" type="search" placeholder="搜索问题"
					style="display: inline-block; border: 1px solid #999; width: 200px; height: 30px; line-height: 30px" />
				<button type="submit" class="btn btn-primary">
					<span class=" glyphicon glyphicon-search"></span>
				</button>
				</form>
			</div>
		</div>
		<c:choose>
			<c:when test="${quesList == '[]' }">
				<div class="row clearfix"
					style="text-align: center; color: #69ca42; height: 200px; line-height: 200px">
					<h3>暂未有人向该话题提问哦~试试发帖吧~</h3>
				</div>
			</c:when>
			<c:otherwise>


				<div class="ques-list">
					<ul id="ques-list-ul">
						<c:forEach var="question" items="${requestScope.quesList }">

							<li>
								<div class="row clearfix">
									<div class="col-md-8 column">
									<span class="answer-count">${question.answerCount }</span>
										<a href="/yzwish/topic/showQA?questionId=${question.questionId }" target="_blank" style="margin-left:50px">${question.quesTitle }</a>
									</div>
									<div class="col-md-2 column">
										<span> <i class=" glyphicon glyphicon-user"></i> <span>
												<a href="#" target="_blank">${question.userId }</a>
										</span>
										</span>
									</div>
									<div class="col-md-2 column">
										<span> ${question.lastAnswerTime } </span>
									</div>
								</div>
							</li>
						</c:forEach>
					</ul>
				</div>
			</c:otherwise>
		</c:choose>
		<div class="post-new-ques">
			<form action="/yzwish/topic/createQuestion" method="POST"
				onsubmit="return createQuestion()">
				<input type="text" id="topicId" name="topicId" value="${topic.topicId }"
					style="visibility: hidden" /> 
				<input id="userId" type="text" name="userId"
					value="${sessionScope.id }" style="visibility: hidden" />

				<div class="row clearfix">
					<div class="col-md-12 column">
						<i class="fa fa-edit fa-large" style="color: #ff6500"></i> <span>发表新帖</span>
					</div>
				</div>
				<div class="row clearfix">
					<div class="col-md-12 column">
						<input id="questionTitle" name="quesTitle" type="text"
							placeholder="请填写标题" />
						<p id="quesTitleHint" style="color: red"></p>
					</div>
				</div>
				<div class="row clearfix">
					<div class="col-md-12 column">
						<textarea id="questionContent" name="quesContent"></textarea>
						<p id="quesContHint" style="color: red"></p>
					</div>
					<div class="col-md-12 column">
						<button type="submit" class="btn btn-primary" style="float: right">发表</button>
					</div>
				</div>
			</form>
		</div>
	</div>

	<script src="../js/bootstrap.min.js"></script>
	<script src="../js/topic.js"></script>
</body>

</html>
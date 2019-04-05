<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>userInfo</title>
<meta name="viewport"
	content="width=device-width,initial-scale=1,user-scalable=no">
<link rel="stylesheet"
	href="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/css/bootstrap.min.css">
<script type="text/javascript"
	src="${pageContext.request.contextPath }/static/js/myAjax.js"
	charset="utf-8"></script>

<script type="text/javascript">
<!--
	//判断是否登录成功
	var tipMessage = "${requestScope.tipMessage }";
	if (tipMessage != "") {
		alert(tipMessage);
		
	}
	function change1(obj1, obj2) {
		if (obj1 == 'over') {
			//console.log(obj2);

			obj2.style.cursor = "pointer";

		}
		if (obj1 == 'out') {

		}

	}
	
	//定时刷新list列表
	setInterval(function() {
		  $("#list").load(location.href+" #list>*","");
		}, 5000);

	-->
</script>
</head>
<body>
	<div class="container">
		<div class="row">
			<div class="col-md-12">Hello,${sessionScope.user.username }&nbsp;&nbsp;<button onclick="location.href='./logout.action'" class="btn btn-danger">注销</button></div>

		</div>
		<div class="row">
			<div class="col-md-2">
				<ul id="list">
					<li>好友列表</li>

					<c:forEach items="${onlineuserList }" var="onlineuser">


						<li class="list-unstyled" style="color: red"
							onmouseover="change1('over',this)"
							onmouseout="change1('out',this)" id="${onlineuser.id }"
							onclick="location.href='./goChat.action?id=${onlineuser.id }'" >${onlineuser.username }</li>
					</c:forEach>
					<c:forEach items="${notonlineuserList }" var="notonlineuser">
						<li class="list-unstyled" onmouseover="change1('over',this)"
							onmouseout="change1('out',this)" onclick="location.href='./goChat.action?id=${notonlineuser.id }'" id="${notonlineuser.id }">${notonlineuser.username }</li>


					</c:forEach>

				</ul>



			</div>
			

		</div>
		




	</div>

     
	<script src="http://apps.bdimg.com/libs/jquery/2.1.4/jquery.min.js"></script>


	<!-- 最新的 Bootstrap 核心 JavaScript 文件 -->
	<script
		src="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/js/bootstrap.min.js"></script>
</body>
</html>